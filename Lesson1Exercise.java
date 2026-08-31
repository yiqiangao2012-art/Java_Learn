import java.util.ArrayList;

public class Lesson1Exercise{
    public static void main(String[] args) {
        int motorPort = 3;
        double batteryVoltage = 10.8;
        int motorCurrentAmps = 20;
        boolean emergencyStopPressed = false;
        String allianceColor = "Blue";
        for(int i=0;i<=0;i++){
            if (emergencyStopPressed == true) {
                System.out.println("ROBOT DISABLED");
                break;
            }
            else if(batteryVoltage < 11.5 || motorCurrentAmps > 40){
                System.out.println("Battery is okay,but charge soon.");
            }
            else{
                System.out.println("All systems normal.");
            }
        }
    }
}

