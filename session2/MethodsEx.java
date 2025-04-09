package session2;

public class MethodsEx {
	/**
	 * definition
	 * -->A method is a block of code (or) collection of statements of statements, (or) a set of code grouped together to perform 
	 * certain task or operation.
	 * 
	 * Uses:
	 * -->to achieve code re-usability.
	 * -->to write a method once and use it many times.
	 * -->provide easy modification and readability.
	 * -->the method is executed only when we call or invoke it.
	 * 
	 * two types of method:
	 * 1.user-defined method
	 * 2.in-built method
	 * 
	 * syntax:
	 * {
	 *    //method body
	 *    }
	 *    public int sum(int a, int b)--->method header
	 *    public-->Access specifier
	 *    int--->Return type 
	 *    sum--->method name
	 *    (int a, int b)--->Parameter list
	 *    sum(int a, int b)-->Method
	 *    
	 *    Note:
	 *    -->if value not passed means its called argument.
	 *    -->if value passed for the argument means it is called parameters.
	 *    
	 *    
	 */

	String name;
	int rollno;
	
	void display() { //Non-parameterized method or default
		System.out.println("<<<<<-----Default Method----->>>>>");
		System.out.println("Name :"+name);
		System.out.println("Roll-No :"+rollno);
	}
	void print (String name , int rollno) //parameterized method
	{
		System.out.println("<<<<----Parameterized Method---->>>>");
		System.out.println("Name :"+name);
		System.out.println("Roll-No :"+rollno);
		}
	
public static void main(String [] args) {
	MethodsEx me = new MethodsEx();
	me.display();
	me.print("Nithin", 07);
}

	
}
