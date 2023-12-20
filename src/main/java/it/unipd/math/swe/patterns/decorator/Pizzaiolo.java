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
package it.unipd.math.swe.patterns.decorator;


import java.util.List;

/**
 * Makes pizzas
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class Pizzaiolo {
    public static void main(String[] args) {
        Pizza viennese = new LoggedPizza(new WurstelPizza(new TomatoPizza(new TomatoPizza(new MozzarellaCheesePizza(new BasePizza())))));
        Pizza margherita = new TomatoPizza(new MozzarellaCheesePizza(new BasePizza()));
        Pizza whitePizza = new MozzarellaCheesePizza(new BasePizza());
        System.out.println("Viennese pizza ingredients: " + mkString(viennese.ingredients()));
        System.out.println("Margherita pizza ingredients: " + mkString(margherita.ingredients()));
        System.out.println("White pizza ingredients: " + mkString(whitePizza.ingredients()));
    }

    private static String mkString(List<String> list) {
        return list.stream().reduce((s, s2) -> s + ", " + s2).get().toString();
    }
}
