// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc157.FRC2018.subsystems;

//import java.text.DecimalFormat ; 

//import org.usfirst.frc157.FRC2018.Robot;
import org.usfirst.frc157.FRC2018.RobotMap;
import org.usfirst.frc157.FRC2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.interfaces.Accelerometer;
//import org.usfirst.frc157.FRC2018.OI;

import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.NeutralMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
//import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
//import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Encoder;
//import edu.wpi.first.wpilibj.PIDSourceType;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Lift extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    //public static final String direction = null;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DigitalInput extensionTopLimit = RobotMap.stageTopLimit;
    private final DigitalInput extensionBottomLimit = RobotMap.stageBottomLimit;
    private final WPI_TalonSRX extensionMotor = RobotMap.stageTalon;
    private final DigitalInput platformTopLimit = RobotMap.platformTopLimit;
    private final DigitalInput platformBottomLimit = RobotMap.platformBottomLimit;
    

    private final WPI_TalonSRX platformMotor = RobotMap.platformTalon;
    private final Encoder platformQuad = RobotMap.platformQuad;
    private final Encoder extensionQuad = RobotMap.stageQuad;
    
    public void resetPlatEncoder()
    {
        platformQuad.reset();
    }
    public void resetStageEncoder()
    {
        extensionQuad.reset();
    }
    /**
     * @return the extensionTopLimit
     */
    public boolean getExtensionTopLimit()
    {
        return extensionTopLimit.get();
    }
    /**
     * @return the extensionBottomLimit
     */
    public boolean getExtensionBottomLimit()
    {
        return extensionBottomLimit.get();
    }
    /**
     * @return the platformTopLimit
     */
    public boolean getPlatformTopLimit()
    {
        return platformTopLimit.get();
    }
    /**
     * @return the platformBottomLimit
     */
    public boolean getPlatformBottomLimit()
    {
        return platformBottomLimit.get();
    }
    
    public static enum direction 
    {
        UP,
        DOWN,
    }
    public static enum quad
    {
        PLATFORM,
        STAGE
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    @Override
    public void initDefaultCommand()
    {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        platformMotor.set(ControlMode.PercentOutput, 0.0);

        extensionMotor.set(ControlMode.PercentOutput, 0.0);
        setDefaultCommand(new DriveLiftWithSticks());
        /*driveRight1.setNeutralMode(NeutralMode.Brake);
        driveRight2.setNeutralMode(NeutralMode.Brake);
        driveLeft1.setNeutralMode(NeutralMode.Brake);
        driveLeft2.setNeutralMode(NeutralMode.Brake);*/
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void movePlat(double speed)
    {
        if (speed > 0)
        {
            if (!platformTopLimit.get())
            {
                platformMotor.set(speed);
            }
            else
            {
                stopPlat();
            }
        }
        else
        {
            if (!platformBottomLimit.get())
            {
                platformMotor.set(speed);
            }
            else
            {
                stopPlat();
            }
        }
    }
    public void setPlat(double speed) {
        platformMotor.set(speed);
    }
    public void setStage(double speed) {
        extensionMotor.set(speed);
    }
    public void moveStage(double speed)
    {
        if (speed < 0)
        {
            if (!extensionTopLimit.get())
            {
                extensionMotor.set(speed);
            }
            else
            {
                stopPlat();
            }
        }
        else
        {
            if (!extensionBottomLimit.get())
            {
                extensionMotor.set(speed);
            }
            else
            {
                stopPlat();
            }
        }
    }
    public void stopPlat()
    {
        //System.out.println("moving plat down");
        if (!platformBottomLimit.get())
        {
            platformMotor.set(0.15);
        }
        else
        {
            platformMotor.set(0);
        }


    }
    public void stopStage()
    {
        if (!extensionBottomLimit.get())
        {
            extensionMotor.set(-0.15);
        }
        else
        {
            extensionMotor.set(0);
        }
        
    }
    public void move(direction dir, double speed)
    {
       switch (dir)
       {
           case UP:
//               if (!platformTopLimit.get())
//               {
//                   //System.out.println("moving plat up");
//                   platformMotor.set(speed);
//               }
//               else
//               {
//                   //System.out.println("moving plat down");
//                   stopPlat();
//               }
//               if (!extensionTopLimit.get())
//               {
//                   extensionMotor.set(-speed);
//               }
//               else
//               {
//                   stopStage();
//               }
               if (!extensionTopLimit.get())
               {
                   if (platformTopLimit.get())
                   {
                       extensionMotor.set(-speed);
                       platformMotor.set(0);
                   }
                   else
                   {
                       platformMotor.set(speed);
                       extensionMotor.set(0);
                   }
               }
               else
               {
                   stop();
               }
               break;
           case DOWN:
               if (!platformBottomLimit.get())
               {
                   if (extensionBottomLimit.get())
                   {
                       platformMotor.set(speed);
                       extensionMotor.set(0);
                   }
                   else
                   {
                       extensionMotor.set(-speed);
                       platformMotor.set(0);
                   }
               }
               else
               {
                   stop();
               }
               break;
       }
    }
    public void stop()
    {
        //System.out.println("moving plat down");
        stopPlat();
        stopStage();
    }
    public double getEncoder(quad encoder)
    {
        double retVal = 0;
        switch (encoder)
        {
            case PLATFORM:
                retVal = getPlatEncoder();
                break;
            case STAGE:
                retVal = getStageEncoder();
                break;
        }
        return retVal;
    }
    public double getPlatEncoder()
    {
        return platformQuad.getDistance();
    }
    public double getStageEncoder()
    {
        return extensionQuad.getDistance();
    }
    public String debugPrint()
    {
        return "Platform Encoder: "+getPlatEncoder() + "\nStage Encoder: "+getStageEncoder();
    }
    
    @Override
    public void periodic()
    {
        // Put code here to be run every loop
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}
