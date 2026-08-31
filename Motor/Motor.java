package Motor;
public class Motor { 
    private String name; 
    private double speed; // -1.0 to 1.0 
    private boolean inverted; 
    
    public Motor(){};
    public Motor(String name, boolean inverted) { 
        this.name = name; 
        this.inverted = inverted; 
        this.speed = 0.0; 
    } 
  
    public void set(double speed) { 
        this.speed = inverted ? -speed : speed; 
        System.out.println(name + " set to " + this.speed); 
    } 
  
    public double get() { 
        return speed; 
    } 
  
    public void stop() { 
        set(0.0); 
    } 
}