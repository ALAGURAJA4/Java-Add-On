package session2;

public class CopyConstructorEx {

	
	/**
	 * --> There is no copy constructor in Java.
	 * --> However,We can copy the values from one object to another object like copy constructor in c++
	 * 
	 */
	
	private String name;
	private int age;
	
	public CopyConstructorEx(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public CopyConstructorEx(CopyConstructorEx other)
	{
		this.name = other.name;
		this.age =other.age;
		
	}
	
	public void dispalyInfo()
	{
		System.out.println("Name: "+name+","+"Age:" +age);
	}
	
	public static void main(String []args)
	{
		CopyConstructorEx org = new CopyConstructorEx("Nithin",21);
		CopyConstructorEx cpy = new CopyConstructorEx(org);
		
		System.out.println("OG Data");
		org.dispalyInfo();
		
		System.out.println("Copied Data");
		cpy.dispalyInfo();
		
		
	}
}
