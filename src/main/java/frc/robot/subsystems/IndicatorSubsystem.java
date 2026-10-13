package frc.robot.subsystems; 

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard; 
import edu.wpi.first.wpilibj2.command.SubsystemBase; 
public class IndicatorSubsystem extends SubsystemBase { 
    private boolean m_lightOn = false; 
    public void setLight(boolean on) { 
        m_lightOn = on; 
        SmartDashboard.putBoolean("Indicator Light", m_lightOn); 
    } 
    public boolean isLightOn() { 
        return m_lightOn; 
    } 

} 

