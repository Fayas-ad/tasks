package org.taskday1;

public class Task1 {
	public void reminder() {
		int[] a = new int[]{7, 21 ,33 ,42 ,50}; 
		int b=2;
		int c= a[0]/b;
		int d= a[1]/b;
		int e= a[2]/b;
		int f= a[3]/b;
		int g= a[4]/b;
		int[] a1=new int [] {c,d,e,f,g};
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		System.out.println(a1[3]);
		System.out.println(a1[4]);
	}

	public static void main(String[] args) {
		Task1 x=new Task1();
		x.reminder();
	}

}
