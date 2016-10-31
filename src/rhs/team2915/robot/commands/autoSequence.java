package rhs.team2915.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class autoSequence extends CommandGroup {
    
    public  autoSequence() {
        addSequential(new Drive(3, 0.4, 0.4));
    }
}
