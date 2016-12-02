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
    	talonLeftFront = new CANTalon(20);
    	talonLeftRear = new CANTalon(21);
    	talonRightFront = new CANTalon(22);
    	talonRightRear = new CANTalon(23);
    	accel = new BuiltInAccelerometer();
    	talonRightFront.setInverted(true);
    	talonRightRear.setInverted(true);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public void drive(Joystick joy){
    	//henry wtf is this its gonna destroy the transmission Xd \/ \/
    	talonLeftFront.set(joy.getY() + joy.getX());
    	talonLeftRear.set(joy.getY() + joy.getX());
    	talonRightFront.set(joy.getY() - joy.getX());
    	talonRightRear.set(joy.getY() - joy.getX());
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