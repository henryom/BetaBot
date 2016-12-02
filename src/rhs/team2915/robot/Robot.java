
package rhs.team2915.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import rhs.team2915.robot.commands.*;
import rhs.team2915.robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file iExampleCommandn the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final Chassis chassis = new Chassis();
	public static final AuxMotorZero auxMotorZero = new AuxMotorZero();
	public static final AuxMotorOne auxMotorOne = new AuxMotorOne();
	public static OI oi;
	public static final Command autonomousCommand = new autoSequence();


    public void robotInit() {
    	oi = new OI();
    }
    
    /** Modes: */
    /** DISABLED */
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
	
	 /** AUTONOMOUS */
    public void autonomousInit() {
    	if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /** TELEOP */
    public void teleopInit() {
    	System.out.println("Teleop Enabled ***");
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}
