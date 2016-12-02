package rhs.team2915.robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AuxMotorZero extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Jaguar auxZero;
	
	public AuxMotorZero(){
		auxZero = new Jaguar(0);
	}

	public void set(double speed){
		auxZero.set(speed);
	}
	
	
	
	protected void initDefaultCommand() {

		
	}
	
	
  
}

