package com.mindgate.pojo;

public class Time {
	private int hours;
	private int minutes;
	
	
	public void setTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public void showTime() {
		System.out.println("hours::"+hours+"minutes::"+minutes);
	}
	
	public Time sum(Time time) {

		Time t = new Time();
		
		int totalHours = this.hours + t.hours;
		int totalMinutes = this.minutes + t.minutes;

		t.setTime(totalHours, totalMinutes);

		
		return t;
	}
	
	

}
