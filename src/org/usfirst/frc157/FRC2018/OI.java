// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc157.FRC2018;

import org.usfirst.frc157.FRC2018.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
//import org.usfirst.frc157.FRC2018.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

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


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton k1;
    public JoystickButton k2;
    public JoystickButton k3;
    public JoystickButton k4;
    public JoystickButton l2;
    public JoystickButton r2;
    public JoystickButton l1;
    public JoystickButton r1;
    public JoystickButton sE;
    public JoystickButton sT;
    public JoystickButton k11;
    public JoystickButton k12;
    public Joystick opBox;
    public Joystick attackL;
    public Joystick attackR;
    public Joystick gamePad;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static final int R2 = 3;
    public static final int L2 = 2;
    public static final int LYStick = 1;
    public static final int RYStick = 5;
    public static final int RxStick = 4;
    public static final int JoyY = 1;
    public static final int Ratk = 1;
    public static final int Latk = 1;
    public static final int LatkPot = 2;
    public static final int RatkPot = 2;
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        gamePad = new Joystick(3);
        
        attackR = new Joystick(2);
        
        attackL = new Joystick(0);
        
        opBox = new Joystick(1);
        
        k12 = new JoystickButton(opBox, 12);
        k12.whileHeld(new empty());
        k11 = new JoystickButton(opBox, 11);
        k11.whileHeld(new empty());
        sT = new JoystickButton(opBox, 10);
        sT.whenPressed(new Debug());
        sE = new JoystickButton(opBox, 9);
        sE.whileHeld(new grabberMove(true));
        r1 = new JoystickButton(opBox, 8);
        r1.whileHeld(new grabberMove(false));
        l1 = new JoystickButton(opBox, 7);
        l1.whenPressed(new MoveLiftToPos(6));
        r2 = new JoystickButton(opBox, 6);
        r2.whenPressed(new MoveLiftToPos(5));
        l2 = new JoystickButton(opBox, 5);
        l2.whenPressed(new MoveLiftToPos(4));
        k4 = new JoystickButton(opBox, 4);
        k4.whenPressed(new MoveLiftToPos(3));
        k3 = new JoystickButton(opBox, 3);
        k3.whenPressed(new MoveLiftToPos(2));
        k2 = new JoystickButton(opBox, 2);
        k2.whenPressed(new MoveLiftToPos(1));
        k1 = new JoystickButton(opBox, 1);
        k1.whenPressed(new MoveLiftToPos(0));


        // SmartDashboard Buttons
        SmartDashboard.putData("AuotoGroup", new AuotoGroup());
        SmartDashboard.putData("DriveWithSticks", new DriveWithSticks());
        SmartDashboard.putData("MoveLiftToPos1", new MoveLiftToPos(0));
        SmartDashboard.putData("MoveLiftToPos2", new MoveLiftToPos(1));
        SmartDashboard.putData("MoveLiftToPos3", new MoveLiftToPos(2));
        SmartDashboard.putData("MoveLiftToPos4", new MoveLiftToPos(3));
        SmartDashboard.putData("MoveLiftToPos5", new MoveLiftToPos(4));
        SmartDashboard.putData("MoveLiftToPos6", new MoveLiftToPos(5));
        SmartDashboard.putData("MoveLiftToPos7", new MoveLiftToPos(6));
        SmartDashboard.putData("grabberMoveIn", new grabberMove(true));
        SmartDashboard.putData("grabberMoveOut", new grabberMove(false));
        SmartDashboard.putData("DriveLiftWithSticks", new DriveLiftWithSticks());
        SmartDashboard.putData("empty", new empty());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getopBox() {
        return opBox;
    }

    public Joystick getattackL() {
        return attackL;
    }

    public Joystick getattackR() {
        return attackR;
    }

    public Joystick getgamePad() {
        return gamePad;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

