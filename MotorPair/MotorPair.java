package MotorPair;
import Motor.Motor;
public class MotorPair{
    Motor left,right;
    public MotorPair(Motor leftMotor,Motor rightMotor){
        left = new Motor("A", false);
        right = new Motor("B", false);
    }
    

    public void tankDrive(double leftspeed,double rightspeed){
        left.set(leftspeed);
        right.set(rightspeed);
    }
    public void stopAll(){
        left.stop();
        right.stop();
    }

}

