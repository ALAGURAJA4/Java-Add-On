package session1;

import java.util.Arrays;

public class StringMethodEx {
	public static void main (String [] args)
	{
		String s1 = "Java Developer";
		String s2 = new String("Java Developer");
		String s3 = s2.intern();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//2.concat
		String s4 = "Java";
		String s5 = "Concat";
		String s6 = s4.concat(s5);
		System.out.println(s6);
		
		//3.Length
		
		String name = "Nithin";
		int len = name.length();
		System.out.println(len);
		
		//4.Equals
		//5.EqualsIgnoreCase
		String username = "Nithin";
		String password = "Nithin@123";
		
		if (username.equalsIgnoreCase("Nithin") &&  password.equalsIgnoreCase("Nithin@123"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Incorrect Login");
		}
		
		//6.Lowercase
		
		String st = "Nithin";
		System.out.println(st.toLowerCase());
		
		//7.ToUpperCase
		String str = "Nithin";
		System.out.println(str.toUpperCase());
		
		//8.charAt
		String str1 = "Program";
		char res = str1.charAt(3);
		System.out.println(res);
		
		//9.getChars
		
		String str2 = new String("Welcome to java program");
		char[] ch1 = new char[7];
		str2.getChars(11, 15, ch1, 0);
		System.out.println(ch1);
		
		//10.toCharArray()
		String str3 = "JAVA PROGRAMMING";
		char[] ch2 = str3.toCharArray();
		System.out.println(Arrays.toString(ch2));
		for(char c1: ch2)
		{
		System.out.println(c1);	
		}
		
		//11.subString()
		String str4 = "Hello World";
		
		System.out.println(str4.substring(6));
		System.out.println(str4.substring(0 , 5));
		
		//12.split()
		String code1 = "Object Oriented Programming language";
		String[] str5 = code1.split("\\s");
		for(String data1:str5)
		{
			System.out.println(data1);
		}
		
		
		//13.Join()
		String para = String.join("","Nith","in");
		System.out.println(para);
		
		
		//14.Trim
		String trim1 = "              Nithin S";
		System.out.println(trim1.trim());
		
	
	
		//15.Compare
		String str6 ="Hello";
		String str7= "Hello";
		int res2 = str6.compareTo(str7);
		System.out.println(res2);
		
		
	}
}
