package model;

public class MarshmallowMonster
{
	// === Data Members === \\
	//ALWAYS private
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//Default values are 0 (#s), null (objects), or false (booleans)
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		//'this.' belongs to the class
		//parameters belong to the curly braces
	}
	
	public String toString()
	{
		String description = "My monster's name is " + name + "." + "It has " + legCount + " legs, and the scary thing it says is: Боже мой!";
		
		return description;
	}
	
}
