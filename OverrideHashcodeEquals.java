package com.Object;

class Tiger
{
	private String color;
	private String stripPattern;
	private int height;
	public Tiger(String color, String stripPattern, int height) {
		super();
		this.color = color;
		this.stripPattern = stripPattern;
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	
	public String getStripPattern() {
		return stripPattern;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override
	public boolean equals(Object object)
	{
		boolean result = false;
		if(object == null)
			return false;
		Tiger tiger = (Tiger)object;
		if(this.color == tiger.getColor() && this.stripPattern == tiger.getStripPattern() && this.height==tiger.getHeight())
			result = true;
		
		return result;
	}
	
	@Override
	public int hashCode()
	{
		int hash = 3;
		hash = 7 * hash + this.color.hashCode();
		hash = 7 * hash + this.stripPattern.hashCode();
		return hash;
	}
	
}
public class OverrideHashcodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Tiger bengaltiger1 = new Tiger("White","Dense",3);
		Tiger bengaltiger2 = new Tiger("White","Dense",3);
		Tiger siberiantiger = new Tiger("Yellow","Dense",2);
		
		System.out.println(bengaltiger1.equals(bengaltiger2));
		System.out.println("Bengal Tiger1 hashcode "+bengaltiger1.hashCode());
		System.out.println("Bengal Tiger1 hashcode "+siberiantiger.hashCode());	
		
	}

}
