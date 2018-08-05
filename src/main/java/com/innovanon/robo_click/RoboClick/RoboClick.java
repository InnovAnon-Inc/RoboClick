/**
 * 
 */
package com.innovanon.robo_click.RoboClick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 * @author gouldbergstein
 *
 */
public class RoboClick {
	private Robot robot;
	private int delayBeforePress;
	private int delayBeforeRelease;
	
	/**
	 * @return the delayBeforePress
	 */
	public int getDelayBeforePress() {
		return delayBeforePress;
	}
	/**
	 * @return the delayBeforeRelease
	 */
	public int getDelayBeforeRelease() {
		return delayBeforeRelease;
	}
	public RoboClick (Robot robot, int delay_before_press, int delay_before_release) {
		this.robot = robot;
		this.delayBeforePress=delay_before_press;
		this.delayBeforeRelease=delay_before_release;
	}
	public RoboClick () throws AWTException {
		this (new Robot (), 30 * 1000, 500); 
	}
	
	public void doClick (int delay_before_press, int delay_before_release) {
		System.out.printf("pressing  button in: %dms%n", delay_before_press);
		robot.delay(delay_before_press);
		//System.out.println("press button");
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		System.out.printf("releasing button in: %dms%n", delay_before_release);
		robot.delay(delay_before_release);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//System.out.println("release button");
	}

	public void doClick () {
		doClick (delayBeforePress, delayBeforeRelease);
	}
	public void doClicks () {
		while (true)
			doClick();
	}
}
