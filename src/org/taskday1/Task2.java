package org.taskday1;

public class Task2 {
	public void alphabets() {
		String s="engine";
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			char c=s.charAt(i);
			if 
			( c=='a' || c=='e' || c=='i' || c=='o'  || c=='u')
			{
				vowels++;
			}
			else if (c>='a' && c<='z')
			{
				consonants++;
			}
		}
		System.out.println("number of vowels is : "+vowels);
		System.out.println("number of consonants is : "+consonants);
	}

	public static void main(String[] args) {
		Task2 x=new Task2();
		x.alphabets();
	}
}
