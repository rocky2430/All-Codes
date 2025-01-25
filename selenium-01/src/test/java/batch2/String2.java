package batch2;

import java.util.Scanner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class String2 {
	@BeforeTest
	public void befor() {
		System.out.println("Good Morning Rahul");
	}
	@AfterTest
	public void after() {
		System.out.println("This Methods are Completed");
	}
	@Test
	    public void CharArray() {
	        String s ="this is java class";
	        char ch[]=s.toCharArray();
	        for(int i=0;i<ch.length;i++) {
	        	System.out.println(ch[i]);
	        }
	    }
	 @Test
	    public void Words() {
	       String s ="this is java class";
	       String s1[]=s.split(" ");
	       System.out.println(s1.length);
	       
	    }
	 @Test
	    public void palindrome() {
	       String s = "this is java class";
	       String s1 = "";
	       
	       for(int i=0;i<s.length();i++) {
	    	   s1 = s.charAt(i)+s1;
	       }
	       System.out.println(s1);
	       if(s1.equals(s)) {
	    	   System.out.println("palindrome");
	       }
	       else {
	    	   System.out.println("not paindrome");
	       }
	    }
	 @Test
	 public void vowels() {
		 String s = "this is java class";
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				 System.out.println(s.charAt(i));
			 }
		 }
	 }
	 @Test
	 public void frequency() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the character");
		 char ch = sc.next().charAt(0);
		 String s ="this is java class";
		 int count=0;
		 for(int i=0;i<s.length();i++) {
			 if(ch==s.charAt(i)) {
				 count++;
			 }
		 }
		 System.out.println("Character : "+count);
	 }
	 @Test
	 public void FirstWord() {
		 String s ="this is java class";
		 String s1[]=s.split(" ");
		 String s2="";
		 String s3="";
		 for(int i=0;i<s1.length;i++) {
			 s2=s1[i];
			 for(int j=0;j<s2.length();j++) {
				 if(j==0) {
					 s3=s3+(char)(s2.charAt(j)-32);
				 }
				 else {
					 s3=s3+s2.charAt(j);
				 }
			 }
			 if(i<s1.length-1) {
				 s3=s3+" ";
			 }
		 }
		 System.out.println(s3);
	 }
	 @Test
	 public void reverseInPlace() {
		 String s ="this is java class";
		 String s1[]=s.split(" ");
		 String s2;
		 String s3="";
		 for(int i=0;i<s1.length;i++) {
			 s2="";
			 for(int j=0;j<s1[i].length();j++) {
				 s2=s1[i].charAt(j)+s2;
			 }
			 s3=s3+s2;
			 if(i<s1.length-1) {
				 s3=s3+" ";
			 }
		 }
		 System.out.println(s3);
	 }
}
