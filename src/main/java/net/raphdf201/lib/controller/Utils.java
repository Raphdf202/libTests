package net.raphdf201.lib.controller;

import net.raphdf201.lib.Constants;

/**
 * Controller utilities class like deadzone remover
 */
public class Utils {
    /**
     * A method to counter joystick drift by returning 0 if the value is below a certain level
     * @param value the value of your joystick, below 1
     * @return the original value or 0 if its below {@link net.raphdf201.lib.Constants#controllerDeadzone}
     */
    public double removeDeadzone(double value) {
        if (value < Constants.controllerDeadzone) {
            return 0;
        }
        return value;
    }

    /**
     * A method to counter joystick drift by returning 0 if the value is below a certain level
     * @param value the value of your joystick, below 1
     * @param deadzone the deadzone value
     * @return the original value or 0 if it's below the deadzone
     */
    public double removeDeadzone(double value, double deadzone) {
        if (value < deadzone) {
            return 0;
        }
        return value;
    }
}
