package test;
import java.awt.*;

/**
 * Created by hollisti on 2019-04-22.
 */
public class Car {
    //
    //Data types:
    //int: integer
    //String: capitalized since it's an object
    //Color: needs an import file java.awt.*;
    //boolean: T or F
    //

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    public Car (double inputAverageMPG,
                String inputLicensePlate,
                Color inputPaintColor,
                boolean inputAreTailLightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;
    }

}
