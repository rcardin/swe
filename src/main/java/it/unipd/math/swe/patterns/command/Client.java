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
package it.unipd.math.swe.patterns.command;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The class that wants to operate on a light through remote control.
 *
 * @author Riccardo Cardin
 * @version 0.1
 * @since 0.1
 */
public class Client {
    public static void main(String[] args) {
        final Light light = new Light();
        final SwitchOnCommand switchOnCommand = new SwitchOnCommand(light);
        final SwitchOffCommand switchOffCommand = new SwitchOffCommand(light);
        final RemoteControl remoteControl = new RemoteControl();

        // The client can interact with many objects only using a single interface,
        // the method pressButton.

        // Switch on the light
        remoteControl.pressButton(switchOnCommand);
        // Switch off the light
        remoteControl.pressButton(switchOffCommand);

    final SwitchOnRadioCommand switchOnRadioCommand = new SwitchOnRadioCommand(new Radio());
        final SexyEnvironmentCommand sexyEnvironmentCommand =
                new SexyEnvironmentCommand(Arrays.asList(switchOffCommand, switchOnRadioCommand));
        remoteControl.pressButton(sexyEnvironmentCommand);
    }
}
