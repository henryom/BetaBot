package rhs.team2915.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import rhs.team2915.robot.Robot;

/**
 *
 */
public class MoveAuxOne extends Command {

	double mSpeed;
	
    public MoveAuxOne(double speed) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.auxMotorOne);
        mSpeed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.auxMotorOne.set(mSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
