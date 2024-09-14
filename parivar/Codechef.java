package parivar;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0){
		    
		    int sahiAnswers = 0;
		    for (int i = 0;i < 3 ;i++ ){
		        sahiAnswers = sahiAnswers + sc.nextInt();
		    } 
		   // int galatAnswer = 3 - sahiAnswers;
		  //  int a1 = sc.nextInt();
		  //  int b1 = sc.nextInt();
		  //  int c1 = sc.nextInt();
		    int heroAnswers = 0;
		    for (int i = 0;i < 3 ;i++ ){
		        heroAnswers = heroAnswers + sc.nextInt();
		    } 
		    // int heroAnswersgalat = 3 - heroAnswers ;
		    
		    if (heroAnswers == sahiAnswers){
		        System.out.println("Pass");	
		        } 
		        else{
		            System.out.println("Fail");
		        }
		    
		    
		  //  int a2 = sc.nextInt();
		  //  int b2 = sc.nextInt();
		  //  int c2 = sc.nextInt();
		    
		    
		    
		    
		}
	}
}
