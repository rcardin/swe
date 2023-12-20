package it.unipd.math.swe.patterns.proxy;

import java.util.List;

/**
 * A document class can contain only videos, by now ;)
 */
public class Document {
    private final List<Video> videos;

    public Document(List<Video> videos) {
        this.videos = videos;
    }

    public void show() {
        System.out.println("Showing the document");
        videos.forEach(Video::reproduce);
    }
}
