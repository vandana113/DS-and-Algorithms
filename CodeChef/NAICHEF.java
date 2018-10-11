/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
		static double prob(HashMap<Integer,Integer> dice,int a,int b,int n){
		double sum=1;
		if(dice.containsKey(a)){
			sum=sum*(double)((double)dice.get(a)/(double)n);
			if(dice.containsKey(b)){
				sum=sum*(double)((double)dice.get(b)/(double)n);
			}
			else
				return 0;
		}
		else 
			return 0;
		return sum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=0;
		if(s.hasNextInt())
		t=s.nextInt();
		for(int i=0;i<t;i++){
			int n=s.nextInt();
			int a=s.nextInt();
			int b=s.nextInt();
			HashMap<Integer,Integer> dice=new HashMap<>();
			for(int j=0;j<n;j++){
				int no=s.nextInt();
				if(dice.containsKey(no)){
					int val=dice.get(no);
					dice.put(no, val+1);
				}
				else
					dice.put(no, 1);
			}
			
			double result=prob(dice,a,b,n);
			System.out.println(String.format("%.10f", result));
		}
	}
	
}
