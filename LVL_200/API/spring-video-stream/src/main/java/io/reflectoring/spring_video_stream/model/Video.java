package io.reflectoring.spring_video_stream.model;

public class Video {
    private String name;
    private String path;

    public Video(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
}