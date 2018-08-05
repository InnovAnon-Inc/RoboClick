/**
 * 
 */
package com.innovanon.robo_click.RoboClick;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

import com.innovanon.simon.Simon.RandomUtil;

/**
 * @author gouldbergstein
 *
 */
public class RandRoboClick extends RoboClick {

	//private Random random;
	private RandomUtil util;
	private int delay_before_press_range;
	private int delay_before_release_range;

	
	/**
	 * @param robot
	 * @param delay_before_press
	 * @param delay_before_release
	 */
	public RandRoboClick(Robot robot, int delay_before_press, int delay_before_release, Random random,int delay_before_press_range,int delay_before_release_range) {
		super(robot, delay_before_press, delay_before_release);
		//this.random = random;
		this.util = new RandomUtil(random);
		this.delay_before_release_range=delay_before_release_range;
		this.delay_before_press_range=delay_before_press_range;
	}

	/**
	 * @throws AWTException
	 */
	public RandRoboClick(Random random,int delay_before_press_range,int delay_before_release_range) throws AWTException {
		//this.random = random;
		this.util = new RandomUtil(random);
		this.delay_before_release_range=delay_before_release_range;
		this.delay_before_press_range=delay_before_press_range;
	}

	public RandRoboClick() throws AWTException {
		this(new Robot (), 30*1000, 100, new Random(), 10*1000, 900);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.robo_click.RoboClick.RoboClick#doClick()
	 */
	@Override
	public void doClick() {
		int delay_before_press = getDelayBeforePress();
		int delay_before_release = getDelayBeforeRelease();
		super.doClick(delay_before_press, delay_before_release);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.robo_click.RoboClick.RoboClick#getDelayBeforePress()
	 */
	@Override
	public int getDelayBeforePress() {
		int delay_before_press = super.getDelayBeforePress();
		return util.randomRange (delay_before_press, delay_before_press + delay_before_press_range);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.robo_click.RoboClick.RoboClick#getDelayBeforeRelease()
	 */
	@Override
	public int getDelayBeforeRelease() {
		int delay_before_release = super.getDelayBeforeRelease();
		return util.randomRange(delay_before_release, delay_before_release+delay_before_release_range);
	}

}
