package rhs.team2915.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import rhs.team2915.robot.Robot;

/**
 *
 */
public class Drive extends Command {
	
	double leftSpeed = 0.4;
	double rightSpeed = 0.4;
	double timeToStopAt;

    public Drive(double time, double speedLeft, double speedRight) {
        requires(Robot.chassis);
        leftSpeed = speedLeft;
        rightSpeed = speedRight;
        timeToStopAt = Timer.getFPGATimestamp() + time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.setMotors(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (timeToStopAt <= Timer.getFPGATimestamp()){
    		return true;
    	}else{
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
