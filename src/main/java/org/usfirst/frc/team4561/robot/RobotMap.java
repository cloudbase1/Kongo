/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4561.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */


public class RobotMap {
	/* EAP The following parameters are used to control various aspects of the robot. */
    /* In the past the students tended to put these parameters in various files  like */
	/* the drive train. In the future all tunable parameters should be located here for*/
	/* easy control. */

	// EAP Used by drive train to limit the max speed of the motors. 
	public static final double  MAX_MOTOR_POWER = 0.50;
	
	//Joystick Ports
	public static final int LEFT_JOYSTICK_PORT = 0;
	public static final int RIGHT_JOYSTICK_PORT = 1;
	
	//Buttons

	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
	//Left Motor Ports  EAP Port side motor
	public static final int LEFT_MOTOR_PORT = 7; // TBD
	
	//Right Motor Ports  EAP Starboard side motor
	public static final int RIGHT_MOTOR_PORT = 8;

		
	//Drive Mode 
	public static final int ARCADE_DRIVE = 1;
	public static final int TANK_DRIVE = 0;
	public static int DRIVE_MODE = 1; // 1 is arcade drive, 0 is tank drive
	
	//PID variable
		public static boolean DRIVETRAIN_PID = true;

   // Variables used to tune velocity PID
  // For Kongo max speed is 6840 u/100ms
  // This means max speed 12v is at Velocity set in u/100ms = 6840
  // Max RPM for Kongo is 12 volts @ 
	public static final 	boolean TUNE_VEL_PID = false;
	// Make 3000 the max speed to give Batt and motor some overhead and safety
	public static final double TUNE_VEL_SPEED = -3000; // neg = forward
	
	
	
	// Debug variables
	public static final boolean MASTER_DEBUG = true;
	@SuppressWarnings("unused")
	public static final boolean DRIVETRAIN_DEBUG = true || MASTER_DEBUG;

// EAP There should be an explanation as to how  the drive train circumference is measured.
// This is most likely the circumference of the robot as it pivots on one wheel. This would
// mean, at least for Kongo, the wheel base diameter X pi This should also state units.
	public static final double DRIVETRAIN_CIRCUMFERENCE = 88;//TODO EAP Change for Kongo
	public static final double CONTROLLER_DEADZONE = 0.1;
	
//  Automode constraints
	public static final double TIME_STEP = 0.05; // sec
	// TODO EAP these parameters up to MAX_JERK need to be adjusted for Kongo
	public static final double WHEELBASE_WIDTH_SWITCH = 2.55;//2.25; // 2.8;// 3.3;//3.1; //7; // ft: 1.865 for Delta (fudged fo 2.95), 1.375 for Kongo, 1.865 for Janderson
	public static final double WHEELBASE_WIDTH_SCALE = 2.55;//2.7;
	public static final double MAX_VELOCITY = 2; //ft/sec: 15.9 for Delta (decreased to 13.9) in speed gear
	public static final double MAX_ACCELERATION = 1; // ft/s/s: 6 for Delta
	public static final double MAX_JERK = 60.0; // ft/s/s/s

	// EAP note right side is 
	public static final boolean LEFT_SIDE_INVERTED = true; 
	public static final boolean RIGHT_SIDE_INVERTED = false; 
	public static final boolean LEFT_SIDE_SENSOR_PHASE_REVERSED = false;
	public static final boolean RIGHT_SIDE_SENSOR_PHASE_REVERSED = true;
	
	public static final double RIGHT_JOYSTICK_DEAD_ZONE = 0.25;
	public static final double LEFT_JOYSTICK_DEAD_ZONE = 0.25;
	public static final double RIGHT_JOYSTICK_REDUCTION = 0.25;
	public static final double LEFT_JOYSTICK_REDUCTION = 0.25;

	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// Settings for motor controllers
	public static final int DRIVETRAIN_PEAK_CURRENT = 40;
	
	// Drivetrain PID settings
	// EAP Good no load PID settings for now. Fine tune more as 
	// I get positional PID working. 
	// TODO EAP We may want to make each side separate
	public static double DRIVETRAIN_KP = 0.3;
	public static double DRIVETRAIN_KI = 0.05;
	public static double DRIVETRAIN_KD = 0.03;
	public static double DRIVETRAIN_KF = 0.149;
	// EAP Integral Zone The motor control profile contains Integral Zone (I Zone), 
	// which (when nonzero), is the maximum error where Integral Accumulation will occur
	// during a closed-loop Mode. If the Closed-loop error is outside of the I Zone,
	// “I Accum” is automatically cleared. This can prevent total instability due to 
	// integral windup, particularly when tweaking gains.
	// The units are in the same units as the selected feedback device 
	//(Quadrature Encoder, Analog Potentiometer, Analog Encoder, and EncRise).
	public static int DRIVETRAIN_IZONE = 50;
	// EAP All speeds will be set as a % of an absolute MAX_SPEED
	// in order to set both int fields and double fields we use the Double Class
	// rather than just a variable double. This way we can convert it as needed.
	public static Double MAX_SPEED = 3000.0;
	// Set motion cruise velocity in RPM must be an int
	public static Double MOTION_CRUISE_VELOCITY = MAX_SPEED * 0.5;
	// In Arcade mode we may need to swap the direction of zRotation
	// if the robot spins opposite the joystick x direction
	public static final boolean INVERT_ZROTATION = true;
	
	public static boolean BLOCK_JOYSTICK_INPUT = false;
	
	// Used for MotionProfileOnboardRunner
	// TODO EAP All these parameters need adjusting for Kongo
		public static final double WHEEL_DIAMETER = 5; //inches: 5 for Delta, 6 for Kongo, 3.5 for Janderson
		public static final double WHEEL_CIRCUMFERENCE = WHEEL_DIAMETER * Math.PI;
		public static final int UNITS_PER_REVOLUTION = (int)((RobotMap.UNITS_PER_10_FEET / 10.0 * (WHEEL_CIRCUMFERENCE / 12.0)) * 1.0); //encoder ticks: 7659 for Delta, 8192 for Kongo, 3700 for Janderson
		public static final double UNITS_PER_10_ROBOT_REVOLUTIONS = 410000; // 410000 for Delta, 274700 for Janderson (currently unused), using WHEELBASE_WIDTH instead
		public static final double UNITS_PER_10_FEET = 59500; // 59500 for Delta, 40500 for Janderson
		public static final double MAX_UNITS_PER_100MS = 2500 * 1.505; // 9900 for Delta, 4011 for Janderson, 6450 for Kongo
		public static final double MAX_UNITS_PER_SECOND = MAX_UNITS_PER_100MS * 10;
		public static final double MAX_REVOLUTIONS_PER_SECOND = MAX_UNITS_PER_SECOND / UNITS_PER_REVOLUTION;
		public static final double MAX_INCHES_PER_SECOND = MAX_REVOLUTIONS_PER_SECOND * WHEEL_DIAMETER * Math.PI;
		public static final double MAX_FEET_PER_SECOND = MAX_INCHES_PER_SECOND / 12;
		
		public static final double ONBOARD_ENCODER_MULTIPLIER = 1;
	
}
