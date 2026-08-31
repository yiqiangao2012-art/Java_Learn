import MotorPair.MotorPair;
import Motor.Motor;
import MotorPair.LimitedMotor;
public class ABCD {
   public static void main(String[] args) {
    int a=10,b=10;
    Motor c =new Motor("A", false);
    Motor d =new Motor("B", false);
    MotorPair motor= new MotorPair(c,d);
    //leiming mingzi = new zhegehanshude constructor(canshu);
    
    motor.tankDrive(0.5,0.5);
    motor.tankDrive(-1.0,1.0);
    motor.stopAll();

    LimitedMotor motor2 = new LimitedMotor();
    motor2.set(1.0);

    }
}
