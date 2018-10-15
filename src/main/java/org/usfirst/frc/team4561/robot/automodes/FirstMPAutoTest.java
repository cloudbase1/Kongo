package org.usfirst.frc.team4561.robot.automodes;

import org.usfirst.frc.team4561.robot.Robot;

import org.usfirst.frc.team4561.robot.commands.RunTrajectory;
import org.usfirst.frc.team4561.robot.commands.RunTrajectoryOnboard;
import org.usfirst.frc.team4561.robot.commands.WaitUntilOnboardTrajectoryFinished;
import org.usfirst.frc.team4561.robot.commands.WaitUntilPositionPercentOnboard;
import org.usfirst.frc.team4561.trajectories.MotionProfileRunner;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class FirstMPAutoTest extends CommandGroup {
	public FirstMPAutoTest() {
		double delay = Robot.oi.getDashboardDelaySlider();
        addSequential(new WaitCommand(delay));
        // EAP RunTrajectory is passed the desired path by 
        // the MotionProfileRunner. TrajectorySelect is a method inside the 
        // enum TrajectorySelect inside the Class MotionProfileRunner. MotionProfileRunner
        // is kind of a bad name since it does not "RUN" anything. It is simply
        // a class that holds the enum and methods for the trajectory. The running
        // of the path is actually done by the RunTracjectory command.
       
		addSequential(new RunTrajectory(MotionProfileRunner.TrajectorySelect.TestTrajectory
				));
	}
}

