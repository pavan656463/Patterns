package io.reflectoring.spring_video_stream.repository;

import io.reflectoring.spring_video_stream.model.Video;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Arrays;

@Repository
public class VideoRepositoryImpl implements VideoRepository {

    private final List<Video> videos = Arrays.asList(
            new Video("Sample Video", "C:\\Users\\pavan.k\\Desktop\\Db Project\\media\\sample.mp4")
    );

    @Override
    public List<Video> getAllVideos() {
        return videos;
    }

    @Override
    public Video getVideoByName(String name) {
        return videos.stream()
                .filter(video -> video.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
