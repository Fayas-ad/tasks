package org.taskday2;

public class Task2 {
	public static void reverse(char s[]) {
		int r = s.length - 1;
		int l = 0;
		while (l < r)
		{
			if (!Character.isAlphabetic(s[l]))
				l++;
			else if(!Character.isAlphabetic(s[r]))
				r--;
			else
			{
				char c = s[l];
				s[l] = s[r];
				s[r] = c;
				l++;
				r--;
			}
		}
	}
	public static void main(String[] args) {
		String s="1s5h45iv1a";
		char[] charArray = s.toCharArray();

		System.out.println("Input string: " + s);
		reverse(charArray);
		String revStr = new String(charArray);
		System.out.println("Output string: " + revStr);
	}
}

