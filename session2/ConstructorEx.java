package session2;

public class ConstructorEx {

		/**
		 * Definition
		 * -->constructor as method has class-name.
		 * -->Constructor is a block of code similar to method.
		 * 
		 * Usage:
		 * -->It is called when the instance of the class is created
		 * -->At the time of calling constructor, memory for the object is allocated 
		 * in the memory.
		 * -->Every time an object is created using new() keyword, at least one constructor is called.
		 * 
		 * 2.types of constructors
		 * 1.Non-parameterized constructor (non-arguements)
		 * 2.parameterized constructor (with arguments)
		 * 
		 */
	ConstructorEx(){
		System.out.println("Default Constructor");
	}
	
	
	public ConstructorEx(String name,int age) {
		System.out.println("Parameterized constructor");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
		
	}
	
	public static void main (String[]args) {
		ConstructorEx ce=new ConstructorEx();
		ConstructorEx ce1=new ConstructorEx("Nithin",21);
		
	}

}