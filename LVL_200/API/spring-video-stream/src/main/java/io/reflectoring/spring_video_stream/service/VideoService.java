package io.reflectoring.spring_video_stream.service;

import io.reflectoring.spring_video_stream.model.Video;
import io.reflectoring.spring_video_stream.repository.VideoRepository;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class VideoService {

    private final VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public List<Video> getAllVideos() {
        return videoRepository.getAllVideos();
    }

    public Video getVideoByName(String name) {
        return videoRepository.getVideoByName(name);
    }

    public Path getVideoPath(String name) throws IOException {
        Video video = getVideoByName(name);
        if (video == null) {
            throw new IOException("Video not found");
        }
        return Paths.get(video.getPath());
    }
}
