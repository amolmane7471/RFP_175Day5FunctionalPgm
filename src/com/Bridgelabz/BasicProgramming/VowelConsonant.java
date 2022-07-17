package com.Bridgelabz.BasicProgramming;
import java.util.Scanner;
public class VowelConsonant {

    public static void main(String[] args) {
    char ch;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Any Char:");
     ch=sc.next().charAt(0);
     sc.close();
        if(ch == 'a'||ch=='A'|| ch == 'e' ||ch=='E'|| ch == 'i'||ch=='I'|| ch == 'o'||ch=='O'|| ch == 'u'||ch=='U' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}