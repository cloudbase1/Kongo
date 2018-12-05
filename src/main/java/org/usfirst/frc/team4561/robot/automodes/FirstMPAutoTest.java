package org.usfirst.frc.team4561.robot.automodes;

// EAP import org.usfirst.frc.team4561.robot.Robot;

import org.usfirst.frc.team4561.robot.commands.RunTrajectory;
//import org.usfirst.frc.team4561.robot.commands.RunTrajectoryOnboard;
//import org.usfirst.frc.team4561.robot.commands.WaitUntilOnboardTrajectoryFinished;
//import org.usfirst.frc.team4561.robot.commands.WaitUntilPositionPercentOnboard;
import org.usfirst.frc.team4561.trajectories.MotionProfileRunner;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class FirstMPAutoTest extends CommandGroup {
	public FirstMPAutoTest() {
		double delay = 1;// TBD EAP HArd code for now Robot.oi.getDashboardDelaySlider();
        addSequential(new WaitCommand(delay));
        // EAP RunTrajectory sinks the MPR and talon states
		System.out.println("Calling RunTrajectory and Passing TestTrajectory");
		addSequential(new RunTrajectory(MotionProfileRunner.TrajectorySelect.TestTrajectory
				));
	}
}

