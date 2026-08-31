package MotorPair;
import Motor.Motor;
public class LimitedMotor extends Motor{ 
    private String name; 
    private double speed; // -1.0 to 1.0 
    private boolean inverted; 
    public void set(double setSpeed) {
        if(setSpeed>= 0.5 )this.speed = 0.5;
        if(setSpeed <= -0.5)this.speed = -0.5;
        //this.speed = inverted ? -setSpeed : setSpeed;
        this.speed = inverted ? -speed : speed; 
        System.out.println(name + " set to " + this.speed); 
    } 
}