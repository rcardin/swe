package it.unipd.math.swe.patterns.proxy;

/**
 * The class create lazily a real video. The information are read into
 * memory only when someone asks to reproduce the video.
 */
public class VideoProxy implements Video {

    private final String filePath;
    private RealVideo video;

    public VideoProxy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void reproduce() {
        byte[] bytes = null; // Using file path, retrieve the byte array from the filesystem
        this.video = new RealVideo(bytes);
        this.video.reproduce();
    }
}
