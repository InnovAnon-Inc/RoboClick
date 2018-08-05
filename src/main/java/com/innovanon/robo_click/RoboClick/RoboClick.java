/**
 * 
 */
package com.innovanon.robo_click;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 * @author gouldbergstein
 *
 */
public class RoboClick {

	/**
	 * @param args
	 * @throws AWTException
	 */
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot robot = new Robot();

		while (true) {
			robot.delay(1000 * 30);
			System.out.println("press button");
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(500);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			System.out.println("release button");
		}
	}

}
