package it.unipd.math.swe.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * The classic implementation of Singleton pattern, as it was explained by the GoF in
 * their book, Design Patterns. Due to its laziness, this implementation suffers of a
 * race condition. Despite of this, this implementation is extendable by subclassing,
 * lazy, but not thread-safe and serializable.
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class LazyPrinterSpooler {

    private static LazyPrinterSpooler INSTANCE;

    private final List<String> queue;

    private LazyPrinterSpooler() {
        this.queue = new ArrayList<>();
    }

    public static LazyPrinterSpooler getInstance() {
        // Lazy initialization, but also not thread-safe
        if (INSTANCE == null) {
            INSTANCE = new LazyPrinterSpooler();
        }
        return INSTANCE;
    }

    public void queue(String id) {
        queue.add(id);
    }

}
