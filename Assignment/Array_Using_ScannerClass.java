package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Using_ScannerClass 

{

	public static void main(String[] args)
	
	{
		
		int rollno[] = new int[3];
		Scanner s1 = new Scanner(System.in);
	
		
		for(int i = 0; i<3; i++) 
		
		{
			rollno[i] = s1.nextInt();
			
		}
		
		System.out.println(Arrays.toString(rollno));
	
	}

}
