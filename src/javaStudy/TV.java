package javaStudy;

public interface TV {

	public int MIN_VALUE = 0;
	public int MAX_VALUE = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
	
}
