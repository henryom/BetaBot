package rhs.team2915.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import rhs.team2915.robot.commands.MoveAuxOne;
import rhs.team2915.robot.commands.MoveAuxZero;
import edu.wpi.first.wpilibj.Joystick;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    Joystick joystickOne = new Joystick(0);
    // Button button = new JoystickButton(stick, buttonNumber);
   
    
    public OI(){
    	JoystickButton auxZeroUp = new JoystickButton(joystickOne, 6);
   	    JoystickButton auxZeroDown = new JoystickButton(joystickOne, 7);
        JoystickButton auxOneUp = new JoystickButton(joystickOne, 11);
    	JoystickButton auxOneDown = new JoystickButton(joystickOne, 10);
    	
    	auxZeroUp.whenPressed(new MoveAuxZero(0.2));	
    	auxZeroUp.whenReleased(new MoveAuxZero(0));
    	auxZeroDown.whenPressed(new MoveAuxZero(-0.2));
    	auxZeroDown.whenReleased(new MoveAuxZero(0));
    	
    	auxOneUp.whenPressed(new MoveAuxOne(0.2));	
    	auxOneUp.whenReleased(new MoveAuxOne(0));
    	auxOneDown.whenPressed(new MoveAuxOne(-0.2));
    	auxOneDown.whenReleased(new MoveAuxOne(0));
    }
        
    
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public Joystick getJoystick(){
    	return joystickOne;
    }
}

