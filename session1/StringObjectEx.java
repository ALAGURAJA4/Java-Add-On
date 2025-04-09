package session1;

public class StringObjectEx {
	public static void main (String [] args)
	{
		String s1= new String("Hello");
		String s2 = new String ("Hello");
		String s3 = new String ("World");
		
		System.out.println("Before Modifying s1:" +(s1==s2));
		
		String s4 = s1+s3;
		s1=s1+s3;
		
		System.out.println("The data stored in s4:" +s4);
		System.out.println("After Modifying s1:" +s1);
	}

}
