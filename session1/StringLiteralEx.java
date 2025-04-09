package session1;

public class StringLiteralEx {
public static void main (String[] args)
{
	String s1 ="Hello"; 
	String s2 = "Hello";
	String s3 ="world";
	String s4 = s1+s3;
	s1 = s1+s3;
	
	System.out.println(s1==s2);
	
	System.out.println("The data stored in s4:"+s4);
	System.out.println("The data stored in s1:"+s1);
}
}
