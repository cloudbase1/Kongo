package org.usfirst.frc.team4561.robot.automodes;

import edu.wpi.first.wpilibj.command.CommandGroup;
//import edu.wpi.first.wpilibj.command.WaitCommand;
//import org.usfirst.frc.team4561.robot.Robot;
import org.usfirst.frc.team4561.robot.commands.DriveMagic;
//import org.usfirst.frc.team4561.robot.*;
/**
 * This auto mode drives straight for a given distance.
 * This is the simplest auto mode and is used to debug
 * and test the motion magic mode.
 * 
 */
public class AutoDriveStraight extends CommandGroup {
	//double delay = Robot.oi.getDashboardDSlider();
	
	public AutoDriveStraight() {
		// DriveMagic uses meters as input for left and right motors
		// DriveMagic(leftMeters,RightMeters);
		addSequential(new DriveMagic(1, 1));
		
	}
}