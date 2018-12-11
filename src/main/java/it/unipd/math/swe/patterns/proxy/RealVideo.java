package it.unipd.math.swe.patterns.proxy;

public class RealVideo {
    private final byte[] file;

    /**
     * To create a video we need to read the whole video file into memory at
     * creation time. We don't like it, because it is possible that the video
     * will be never played!
     *
     * @param file Information read from the disk (the video)
     */
    public RealVideo(byte[] file) {
        this.file = file;
        System.out.println("Loading the video (wtf, 4gb!!!)");
    }

    public void reproduce() {
        System.out.println("Reproducing video...");
    }
}
