package org.taskday2;

public class Task2b {
	static void splitString(String s)
	{
		StringBuffer a = new StringBuffer();
		StringBuffer n = new StringBuffer();
		for (int i=0; i<s.length(); i++)
		{
			if (Character.isDigit(s.charAt(i)))
				a.append(s.charAt(i));
			else if(Character.isAlphabetic(s.charAt(i)))
				n.append(s.charAt(i));
		}
		System.out.println(a);
		System.out.println(n);
	}
	public static void main(String args[])
	{
		String s = "1s5h45iv1a";
		splitString(s);
	}
}

