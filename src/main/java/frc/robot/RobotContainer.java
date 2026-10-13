// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.IndicatorSubsystem;
import frc.robot.AlertSubSystem;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */

 

 
public class RobotContainer {
    private final IndicatorSubsystem m_indicator = new IndicatorSubsystem(); 
    private final DriveSubsystem m_drive = new DriveSubsystem();
    private final CommandXboxController m_driverController = new CommandXboxController(0); 
    private final AlertSubSystem InstantiatedAlertSubSystemUsedByX_Button = new AlertSubSystem();
    private final AlertSubSystem InstantiatedAlertSubSystemUsedByY_Button = new AlertSubSystem();


    public RobotContainer(){
        configureBindings();
    }

    private void configureBindings() { 
        // Command xAlert = InstantiatedAlertSubSystemUsedByX_Button.alertCommand("X button");
        // m_driverController.x().onTrue(xAlert);
        // Command yAlert = InstantiatedAlertSubSystemUsedByY_Button.alertCommand("y button");
        // m_driverController.y().onTrue(yAlert);

        // m_driverController.a().onTrue( 
        // Commands.runOnce(() -> m_indicator.setLight(true), m_indicator)
        // ); 
        // m_driverController.b().onTrue( 
        // Commands.runOnce(() -> m_indicator.setLight(false), m_indicator)
        // ); 

        //
        
        // Command aDrive = InstantiatedDriveSubSystemUsedByA_Button.DriveCommand("A button");
        m_driverController.a().onTrue( 
        Commands.runOnce(() -> m_drive.arcadeDrive(0.3, 0)));
    }
}