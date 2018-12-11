package it.unipd.math.swe.patterns.proxy;

import java.util.Collections;

public class WordProcessor {
    public static void main(String ... args) {
        // We do not want that the creation of a Document leads to
        // the loading of heavy files on the disk.
        final Document document =
                new Document(
                        Collections.singletonList(
                                new VideoProxy("/c/tmp/video.mp4")
                        )
                );
        document.show();
    }
}
