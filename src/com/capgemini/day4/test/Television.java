package com.capgemini.day4.test;

public class Television {
	int volume;
	int channel;
	int currentChannel;
	int currentVolume;
	static String onState="on";
	static String offState="off";
	boolean turn;
	public Television() {}
    public Television(int volume,int channel,boolean turn)
    {
    	this.volume=volume;
    	this.channel=channel;
    	this.turn=turn;
    }
    public static String stateTest(String state) 
    {
    	
    	if(state.equals(onState))
    	{
		return "yes on";
    	}
    	else if(state.equals(offState))
    	{
    	return "yes off";
    	}
    	else
    	{
    		return "wrong input";
    	}
	}
    public int increaseVolume()
    {
    	volume=volume+1;
    	return volume;
    }
    public int decreaseVolume()
    {
    	volume=volume-1;
    	return volume;
    }
    public static int changeChannel(int channelNo)
    {
    	return channelNo;
    }
	
	public static String checkPower(boolean powerbutton) {
		if(powerbutton==true)
		{
			return "on";
		}
		else
		{
			return "off";
		}
	}
	public int currentVolume() {
		return volume;
	}
    
}
