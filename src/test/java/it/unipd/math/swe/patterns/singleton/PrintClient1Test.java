package it.unipd.math.swe.patterns.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
public class PrintClient1Test {
    @Test
    public void printShouldQueueANewPrintJob() throws Exception {
        // The main problem of the Singleton pattern is that it tends to hide dependencies.
        // We know that inside a PrintClient1 instance a call to the Singleton is made.
        // With this design, we cannot replace this instance with a mock, making impossible
        // to develop unit tests for the client.
        final int result = new PrintClient1().print();
        assertThat(result).isEqualTo(0);
    }
}