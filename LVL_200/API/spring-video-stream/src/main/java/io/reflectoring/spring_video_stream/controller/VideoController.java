package io.reflectoring.spring_video_stream.controller;

import io.reflectoring.spring_video_stream.model.Video;
import io.reflectoring.spring_video_stream.service.VideoService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllVideos() {
        List<String> videoNames = videoService.getAllVideos()
                .stream().map(Video::getName)
                .toList();
        return ResponseEntity.ok(videoNames);

    }

    @GetMapping("/{name}")
    public ResponseEntity<Resource> streamVideo(@PathVariable String name) throws IOException {
        Path path = videoService.getVideoPath(name);
        Resource video = new UrlResource(path.toUri());

        if (!video.exists()) {
            return ResponseEntity.notFound().build();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf("video/mp4"));

        return new ResponseEntity<>(video, headers, HttpStatus.OK);
    }
}
