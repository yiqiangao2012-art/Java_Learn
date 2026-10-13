// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot {

  private Command m_autonomousCommand;

  private final RobotContainer m_robotContainer;

  private int m_loopCount = 0;                 

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  public Robot() {
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.
    m_robotContainer = new RobotContainer();
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();
    m_loopCount++; 
    if (m_loopCount % 50 == 0) { 
      System.out.println("Heartbeat, loop " + m_loopCount);
      if(RobotState.isTeleop() && RobotState.isEnabled()){
        System.out.println("Teleop");
        SmartDashboard.putString("Mode","Teleop");
      }
      else if(RobotState.isAutonomous()){
        System.out.println("Autonomous");
        SmartDashboard.putString("Mode","Autonomous");
      }
      else if(RobotState.isDisabled()){
        System.out.println("Disabled");
        SmartDashboard.putString("Mode","Disabled");
      }
      else if(RobotState.isTest()){
        System.out.println("Test");
        SmartDashboard.putString("Mode","Test");
      }
      else{
        System.out.println("Disconnected");
        SmartDashboard.putString("Mode","Disconnected");
      }
    }
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }
  private boolean m_turboMode = false;
  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
      double rawY = m_driverController.getLeftY(); 
      double y = MathUtil.applyDeadband(rawY, 0.05); 
      SmartDashboard.putNumber("Left Stick Y", y); 
      if (m_driverController.getHID().getAButton()) { 
      // System.out.println("A button pressed!"); 
      double left_stick_Y = m_driverController.getLeftY();
      double right_stick_X = m_driverController.getRightX();
      double left_trigger = m_driverController.getLeftTriggerAxis();
      double right_trigger = m_driverController.getRightTriggerAxis();
      boolean turboNow = right_trigger > 0.5;
      System.out.println(right_trigger);
      if(left_stick_Y <= 0.05){
        left_stick_Y = 0;
      }
      if(right_stick_X <= 0.05){
        right_stick_X = 0;
      }
      if(turboNow != m_turboMode){
        m_turboMode = turboNow;
        if(m_turboMode){
          System.out.println("Turbo mode ON");
        }
        else{
          System.out.println("Turbo mode OFF");
        }
      }
    }
  }


  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}

  // In Robot.java 
private final CommandXboxController m_driverController = new CommandXboxController(0); 
}

