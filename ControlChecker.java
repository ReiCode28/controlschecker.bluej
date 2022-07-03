 


/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 11:02 AM
 */
public class ControlChecker {
    /**
     * Write a method that returns "more heat!"
     * if `roomTemperature` is less than `70`,
     * else returns "less heat!"
     */
    public String getThermostatControls(int roomTemperature) {

        if (roomTemperature < 70) {
            return "more heat!";
        } else {
            return "less heat!";
        }


    }


    /**
     * Write a method that returns "refuel"
     * if `fuelLevel` is less than 0.08
     * else returns "burn fuel"
     */
    public String getFuelControls(double fuelLevel) {

        String a = "";

        if (fuelLevel < 0.08) {
            a = "refuel";
        } else {
            a = "burn fuel";
        }
        return a;
    }

    /**
     * Write a method that returns "start fireplace!"
     * if `outsideTemperature` is less than `50` and
     * `insideTemperature`  is less than `60`
     * else returns "stop fireplace!"
     */
    public String getFireplaceControls(int outsideTemperature, int insideTemperature) {

        if (outsideTemperature < 50 && insideTemperature < 60) {
            return "start fireplace!";
        } else {
            return "stop fireplace!";
        }

    }
}

