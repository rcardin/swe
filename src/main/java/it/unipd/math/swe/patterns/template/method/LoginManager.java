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
package it.unipd.math.swe.patterns.template.method;

/**
 * Defines the algorithm skeleton for log in process.
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public abstract class LoginManager {
    /**
     * This is the template method. It defines the abstract algorithm and leaves to abstract
     * primitive operation to define the actual behaviour of each single algorithm step.
     * @param username A username
     * @param password Username password
     * @return Something that stores user information
     */
    public User login(String username, String password) {
        validateInput(username, password);
        // A hook is a method that gives a default behaviour inside the algorithm, which can be
        // override by abstract class extensions
        postValidationOpHook(username, password);
        authenticate(username, password);
        return authorizeHook(username);
    }

    /**
     * This hook gives an empty behaviour. So, it is a convenient way to
     * leave some extension point for future implementation (do not abuse it!)
     * @param username
     * @param password
     */
    private void postValidationOpHook(String username, String password) {

    }

    protected User authorizeHook(String username) {
        // Retrieves roles from database
        return null;
    }

    /**
     * This is call a primitive operation. The actual behaviour is defined in
     * actual classes that extends from LoginManager
     * @param username
     * @param password
     */
    protected abstract void authenticate(String username, String password);

    protected abstract void validateInput(String username, String password);
}
