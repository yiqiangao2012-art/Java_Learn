package frc.robot;


import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.IndicatorSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


public class AlertSubSystem {
    private String m_message = "No alerts";
    public void setMessage(String message) {
        m_message = message;
        SmartDashboard.putString("Alert", m_message);
    }
    public Command alertCommand(String message){
        return Commands.runOnce(() -> setMessage(message));
    }
}   