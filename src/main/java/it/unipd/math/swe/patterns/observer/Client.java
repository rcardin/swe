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

/**
 * A client that wires up all the dependencies.
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class Client {
    public static void main(String[] args) {
        StocksState subject = new StocksState();
        PrinterObserver observer = new PrinterObserver(subject);
        // Another type of Observer
        Observer observer1 = new Observer() {
            @Override
            public void update() {
                System.out.println("HOOORAY!");
            }
        };
        // Registering observers to subject
        subject.addObserver(observer);
        subject.addObserver(observer1);

        subject.updateStockValue("AAPL", 2.30D);
        subject.notifyObservers();
    }
}
