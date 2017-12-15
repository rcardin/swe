/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2015 - 2017 Riccardo Cardin
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package it.unipd.math.swe.patterns.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds the values of a set of stocks. It represents the Subject
 * in the Observer pattern.
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class StocksState extends Subject {

    private final Map<String, Double> values;

    public StocksState() {
        values = new HashMap<>();
        values.put("AAPL", 130.0D);
        values.put("GOOGL", 125.0D);
    }

    @Override
    public Map<String, Double> getState() {
        return values;
    }

    /**
     * Changes the {@code value} of the stock called {@code name}, or add it to
     * the set if not present.
     *
     * @param name Name of the stock
     * @param value New value of the stock
     */
    public void updateStockValue(String name, Double value) {
        values.put(name, value);
        notifyObservers();
    }
}
