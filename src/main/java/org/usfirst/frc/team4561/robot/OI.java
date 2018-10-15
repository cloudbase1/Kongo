/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4561.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4561.robot.commands.*;
//import org.usfirst.frc.team4561.robot.triggers.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
/* EAP For Kongo we assume where there is one joystick we are using all left */
/* joystick variables and left is ignored.                                    */
public class OI {
	private static Joystick leftStick = new Joystick (RobotMap.LEFT_JOYSTICK_PORT);
	private static Joystick rightStick = new Joystick (RobotMap.RIGHT_JOYSTICK_PORT);
	
	//private static JoystickButton controllerIntakeLeft = new JoystickButton(controller, RobotMap.CONTROLLER_LEFT_INTAKE);
	//private static JoystickButton controllerIntakeRight = new JoystickButton(controller, RobotMap.CONTROLLER_RIGHT_INTAKE);
	
	
	public OI () {

		
	}
	public double getRightStickY() {
		
		double rightStickY = rightStick.getY(); 
		
		if (Math.abs(rightStick.getMagnitude()) < RobotMap.RIGHT_JOYSTICK_DEAD_ZONE) {
			rightStickY = 0;
		}
		
		 return rightStickY;
		
	}
	
	public double getRightStickX() {
		
		double rightStickX = rightStick.getX(); 
		
		// Dead zone management
		if (Math.abs(rightStick.getMagnitude()) < RobotMap.RIGHT_JOYSTICK_DEAD_ZONE) {
			rightStickX = 0;
		}
		
		return rightStickX;
		
	}

	public double getLeftStickY() {
		
		double leftStickY = leftStick.getY(); 
		
		// Dead zone management
		if (Math.abs(leftStick.getMagnitude()) < RobotMap.LEFT_JOYSTICK_DEAD_ZONE) {
			leftStickY = 0;
		}
		
		return leftStickY;
		
	}
	
	public double getLeftStickX() {	
		double leftStickX = leftStick.getX(); 
		
		// Dead zone management
				if (Math.abs(leftStick.getMagnitude()) < RobotMap.LEFT_JOYSTICK_DEAD_ZONE) {
					leftStickX = 0;
				}		
				
		return leftStickX;
		
	}
	

	public boolean getRightButton(int button){
		return rightStick.getRawButton(button);
	}
	
	public double getDashboardDelaySlider() {
		return SmartDashboard.getNumber("DB/Slider 1", 0);
	}
    public double getDashboardSlider3() {
        return SmartDashboard.getNumber("DB/Slider 3", 0);
    }


/// TODO EAP Is OI the proper place for these functions? Copies from 2018 OI
	/**
	 * Converts feet to encoder units.
	 * Uses {@value #WHEEL_DIAMETER}" for wheel diameter and {@value #UNITS_PER_REVOLUTION} for encoder units per revolution.
	 * @param feet
	 * @return encoder units
	 */
	public static double ft2Units(double feet) {
		feet *= 12; // inches
		feet /= RobotMap.WHEEL_DIAMETER * Math.PI; // revolutions
		feet *= RobotMap.UNITS_PER_REVOLUTION; // Units
		return feet;
	}

	/**
	 * Converts feet to encoder units.
	 * Uses {@value #WHEEL_DIAMETER}" for wheel diameter and {@value #UNITS_PER_REVOLUTION} for encoder units per revolution.
	 * @param feet
	 * @return encoder units
	 */
	public static double units2Ft(double units) {
		units /= RobotMap.UNITS_PER_REVOLUTION; // revolutions
		units *= RobotMap.WHEEL_DIAMETER * Math.PI; // inches
		units /= 12; // feet
		
		return units;
	}
	
	/**
	 * Converts feet per second to encoder units per 100 milliseconds.
	 * Uses {@value #WHEEL_DIAMETER}" for wheel diameter and {@value #UNITS_PER_REVOLUTION} for encoder units per revolution.
	 * @param fps feet per second
	 * @return encoder units per 100 milliseconds
	 */
	public static double fps2UnitsPerRev(double fps) {
		fps /= 10; // ft/100ms
		fps *= 12; // in/100ms
		fps /= RobotMap.WHEEL_DIAMETER * Math.PI; // revolutions/100ms
		fps *= RobotMap.UNITS_PER_REVOLUTION; // Units/100ms
		return fps;
	}
	

    
}
