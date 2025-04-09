package session1;

public class StringBuilderEx {
	/**
	 * definition
	 * -->A method is a block of code (or) collection of statements of statements, (or) a set of code grouped together to perform 
	 * certain task or operation.
	 * 
	 * Uses:
	 * -->to achieve code reusability.
	 * -->to write a method once and use it many times.
	 * -->provide easy modification and readability`.
	 * -->the method is executed only when we call or invoke it.
	 * 
	 * two types of method:
	 * 1.user-defined method
	 * 2.in-built method or standard method or pre-defined method
	 * 
	 * syntax: user-defined method 
	 * public int sum(int a , int b)
	 * {
	 *    //method body
	 *    }
	 *    public int sum(inta intb)--->method header
	 *    public-->Access specifier
	 *    int--->Return type 
	 *    sum--->method name
	 *    (int a, intb)--->Parameter list
	 *    sum(int a, int b)-->Method 
	 *    
	 *    note:
	 *  -->if value not passed means its called arguement.
	 *  -->if the value passed for the arguement means it is called parameters.
	 *   
	 */
	
	
	String name; //variable declaration
	int rollno;
	
	void display() {   //non-parameterized method
		System.out.println("<----Default method---->");
		System.out.println("Name:"+name);
    System.out.println("Roll-no:"+rollno);
    
	
	}
	void print(String name, int rollno) {     //parameterized method
		System.out.println("<----Paramaterized method---->");
		System.out.println("Name:"+name);
		System.out.println("Roll-no:"+rollno);
		
	}
	
	
	public static void main (String[]args) {
		StringBuilderEx me=new StringBuilderEx();
		me.display();
		me.print("Nithin", 1234);
		
	}

}