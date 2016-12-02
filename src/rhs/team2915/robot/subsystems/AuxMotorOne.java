package rhs.team2915.robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AuxMotorOne extends Subsystem {
	
	private Jaguar auxOne;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public AuxMotorOne(){
		auxOne = new Jaguar(1);
	}

    
    public void set(double speed){
    	auxOne.set(speed);
    }
    
    
    
	protected void initDefaultCommand() {
	
		
	}
}

