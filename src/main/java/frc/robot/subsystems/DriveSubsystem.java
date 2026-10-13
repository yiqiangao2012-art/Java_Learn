package frc.robot.subsystems; 

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase; 
import frc.robot.Constants.DriveConstants; 
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
  
public class DriveSubsystem extends SubsystemBase { 
    private final SparkMax m_leftLeader = new SparkMax(DriveConstants.kLeftLeaderPort, MotorType.kBrushed); 
    private final SparkMax m_leftFollower = new SparkMax(DriveConstants.kLeftFollowerPort,MotorType.kBrushed); 
    private final SparkMax m_rightLeader = new SparkMax(DriveConstants.kRightLeaderPort,MotorType.kBrushed); 
    private final SparkMax m_rightFollower = new SparkMax(DriveConstants.kRightFollowerPort,MotorType.kBrushed); 
    String m_message = "QAZ";
    private final DifferentialDrive m_drive = new DifferentialDrive( 
        (speed) -> { 
            m_leftLeader.set(speed); 
            m_leftFollower.set(speed); 
        }, 
        (speed) -> { 
            m_rightLeader.set(speed); 
            m_rightFollower.set(speed); 
        }); 
  
    public DriveSubsystem() { 
//m_rightLeader.setInverted(true); 
  //      m_rightFollower.setInverted(true); 
    } 
  
    public void arcadeDrive(double forward, double rotation) { 
        m_drive.arcadeDrive(forward, rotation); 
    } 
  
    public void stop() { 
        m_drive.stopMotor(); 
    } 
    public void setMessage(String message) {
        m_message = message;
        SmartDashboard.putString("Alert", m_message);
    }
    public Command DriveCommand(String message){
        return Commands.runOnce(() -> setMessage(message));
    }
} 