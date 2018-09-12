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
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		//'this.' belongs to the class
		//parameters belong to the curly braces
	}

	// Getters
	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	// Setters - All setters have a return type of void.
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legs)
	{
		this.legCount = legs;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	
	public String toString()
	{
		String description = "My monster's name is " + name + ". It has " + legCount + " legs, and the scary thing it says is: Боже мой!";
		
		return description;
	}
	
}
