package rhs.team2915.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Joystick;

import rhs.team2915.robot.commands.*;

/**
 *
 */
public class Chassis extends Subsystem {
    
    private CANTalon talonLeftFront, talonLeftRear;
    private CANTalon talonRightFront, talonRightRear;
    public BuiltInAccelerometer accel;
    
    public Chassis(){
    	talonLeftFront = new CANTalon(0);
    	talonLeftRear = new CANTalon(1);
    	talonRightFront = new CANTalon(2);
    	talonRightRear = new CANTalon(3);
    	accel = new BuiltInAccelerometer();
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public void drive(Joystick joy){
    	talonLeftFront.set(joy.getY() - joy.getZ());
    	talonLeftRear.set(joy.getY() - joy.getZ());
    	talonRightFront.set(joy.getY() + joy.getZ());
    	talonRightRear.set(joy.getY() + joy.getZ());
    }
    
    public void setMotors(double leftSpeed, double rightSpeed){
    	talonLeftFront.set(leftSpeed);
    	talonLeftRear.set(leftSpeed);
    	talonRightFront.set(rightSpeed);
    	talonRightRear.set(rightSpeed);
    }
    
    public void stop(){
    	talonLeftFront.set(0);
    	talonLeftRear.set(0);
    	talonRightFront.set(0);
    	talonRightRear.set(0);
    }
    
}