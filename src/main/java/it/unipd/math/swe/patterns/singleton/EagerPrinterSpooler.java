package it.unipd.math.swe.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * This implementation of the Singleton overcomes the thread-safety simply initializing the
 * instance at loading time, using a private static reference. So, this implementation is
 * thread-safe, but not serializable.
 *
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class EagerPrinterSpooler {

    private static EagerPrinterSpooler INSTANCE = new EagerPrinterSpooler();

    private final List<String> queue;

    private EagerPrinterSpooler() {
        this.queue = new ArrayList<>();
    }

    public static EagerPrinterSpooler getInstance() {
        return INSTANCE;
    }

    public void queue(String id) {
        queue.add(id);
    }
}






