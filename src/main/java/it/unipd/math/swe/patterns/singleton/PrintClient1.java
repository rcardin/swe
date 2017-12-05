package it.unipd.math.swe.patterns.singleton;

/**
 * Please, insert description here.
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class PrintClient1 {
    public int print() {
        /*
         * Some beautiful code that does stuffs
         */
        try {
            EagerPrinterSpooler.getInstance().queue("id1");
        } catch (Exception e) {
            return 1;
        }
        return 0;
    }
}
