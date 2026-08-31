import java.util.ArrayList;

public class Lesson1{
    public static void main(String[] args) {
    int motorPort = 3;
    double batteryVoltage = 12.6;
    boolean robotEnabled = true;
    String allianceColor = "Blue";
    System.out.println(" Motor is on port " + motorPort);
    System.out.println("Battery voltage: " + batteryVoltage + "V");
    System.out.println("Alliance: " + allianceColor);
    if (batteryVoltage < 11.5) {
        System.out.println("WARNING: battery is critically low!");
    }
    else if(batteryVoltage < 12.0){
        System.out.println("Battery is okay,but charge soon.");
    }
    else{
        System.out.println("Battery is healthy.");
    }
    }
}

