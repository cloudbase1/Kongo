package org.usfirst.frc.team4561.robot.automodes;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc.team4561.robot.Robot;
import org.usfirst.frc.team4561.robot.commands.DriveMagic;
import org.usfirst.frc.team4561.robot.*;
/**
 * This auto mode drives straight for a given distance.
 * This is the simplest auto mode and is used to debug
 * and test the motion magic mode.
 * 
 */
public class AutoDriveStraight extends CommandGroup {
	// TODO EAP MAke this an input for the desire distance rather than delay.
	// Make is a numerical input in inches or feet rather than a slider.
	//double delay = Robot.oi.getDashboardDSlider();
	
	public AutoDriveStraight() {
		// EAP DriveMagic uses inches as input for left and right motors
		// DriveMagic(leftInches,RightInches);
		addSequential(new DriveMagic(12, 12));
		
	}
}