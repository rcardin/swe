package it.unipd.math.swe.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * A Singleton implemented using Java Enums. This kind of implementation is available only
 * using a version of Java greater or equal to 5. This implementation is thread-safe and
 * serializable.
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public enum EnumPrinterSpooler {
    INSTANCE;

    private final List<String> queue = new ArrayList<>();

    public void queue(String id) {
        queue.add(id);
    }
}




