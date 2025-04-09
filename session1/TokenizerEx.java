package session1;

import java.util.StringTokenizer;

public class TokenizerEx {
	public static void main(String [] args)
	{
		StringTokenizer st= new StringTokenizer("Java is a high level language","");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
