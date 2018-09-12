package controller;

import model.MarshmallowMonster;
import java.util.Scanner;

public class Controller
{
	// Data Members
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	
	// Constructors
	public Controller()
	{
		//J ob 1: Init data members!
		myMonster = new MarshmallowMonster("Ivan Ivanov Ivanovich", 2.0, 2, false, 2);
		userMonster = new MarshmallowMonster();
	}
	
	// Methods
	public void start()
	{
		// myMonster
		System.out.println(myMonster);
		myMonster.setArmCount(9999);
		// instance.method
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
	
		userMonster();
	}
	
	public void userMonster()
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("What is your monster's name? ");
		String userMonsterName = inputScanner.nextLine();
		userMonster.setName(userMonsterName);
		System.out.println("Your monster's name is: " + userMonsterName);
		
		System.out.println("How many legs does your monster have?");
		Double userMonsterLegs = inputScanner.nextDouble();
		userMonster.setLegCount(userMonsterLegs);
		System.out.println("Your monster has " + userMonsterLegs + " legs.");
		
		System.out.println("How many eyes does your monster have?");
		
		System.out.println("Does your monster have nose?");
		
		System.out.println("How many arms does your monster have?");
		
		inputScanner.close();
	}
}
