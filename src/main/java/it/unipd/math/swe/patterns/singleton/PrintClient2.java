package it.unipd.math.swe.patterns.singleton;

/**
 * Please, insert description here.
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class PrintClient2 {
    public void print() {
        EagerPrinterSpooler.getInstance().queue("id2");
    }
}
