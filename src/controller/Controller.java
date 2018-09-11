package controller;

import model.MarshmallowMonster;

public class Controller
{
	//Data Members
	private MarshmallowMonster myMonster;
	
	//Constructors
	public Controller()
	{
		//Job 1: Init data members!
		myMonster = new MarshmallowMonster("Ivan Ivanov Ivanovich", 2.0, 2, false, 2);
	}
	
	//Methods
	public void start()
	{
		System.out.println(myMonster);
	}
}
