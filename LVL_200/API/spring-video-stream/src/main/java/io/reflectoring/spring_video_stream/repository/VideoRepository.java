package io.reflectoring.spring_video_stream.repository;

import io.reflectoring.spring_video_stream.model.Video;
import java.util.List;

public interface VideoRepository {
    List<Video> getAllVideos();
    Video getVideoByName(String name);
}

