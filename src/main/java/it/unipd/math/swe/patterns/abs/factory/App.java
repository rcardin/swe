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
package it.unipd.math.swe.patterns.abs.factory;

/**
 * A UI application that must use graphic widgets relative to a
 * selected operating system
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class App {
    public static void main(String[] args) {
        UIFactory uiFactory = selectUI(args[0]);
        final Window window = uiFactory.buildWindow();
        final Button button = uiFactory.buildButton();
        final Slider slider = uiFactory.buildSlider();
        window.show();
        button.show();
        slider.show();
    }

    private static UIFactory selectUI(String arg) {
        // Using an input parameter, a factory for a particular
        // operating system is selected
        UIFactory uiFactory;
        final String so = arg;
        if ("macos".equals(so)) {
            uiFactory = new MacOsUIFactory();
        } else if ("win".equals(so)) {
            uiFactory = new Windows95UIFactory();
        } else {
            throw new NullPointerException("SO must be specified");
        }
        return uiFactory;
    }
}
