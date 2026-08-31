import java.util.ArrayList; 
  
public class Lesson2 { 
    public static void main(String[] args) { 
        for (int i = 0; i <= 5; i++) { 
            System.out.println("Countdown: " + (5 - i)); 
        } 
  
        double[] sensorReadings = {1.2, 1.5, 1.4, 1.8, 1.1}; 
        double total = 0; 
        for (double reading : sensorReadings) { 
            total += reading; 
        } 
        double average = total / sensorReadings.length; 
        System.out.println("Average distance: " + average); 
  
        System.out.println("180 degrees = " + degreesToRadians(180) + " radians"); 
    } 
  
    public static double degreesToRadians(double degrees) { 
        return degrees * Math.PI / 180.0; 
    } 

} 