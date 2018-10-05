package CodeChef;
/*import java.util.*;

class Solution{
	public static boolean isPrime(int num){
		if(num==1)
			return false;
		if(num==2)
			return true;
		if(num%2==0)
			return false;
		for(int i=3;i*i<=num;i+=2){
			if(num%i==0)return false;
		}
		return true;
	}
	public static int fm(int[] arr){
		Arrays.sort(arr);
		int i=0;
		while(i<arr.length){
			int num = arr[i];
			//if(num<0)num*=-1;
			if(isPrime(num)) {
				return num;
			}
			i++;
		}
		return -1;
	}
	public static void main(String args[]){
		int t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		int N;
		int[] res = new int[t];
		int j=0;
		int hasOne = 0;
		while(j<t){
			hasOne = 0;
			N = in.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++){
				arr[i]= in.nextInt();
				if(arr[i]==1) {
					hasOne = 1;
				}
			}
			if(hasOne==1)
				res[j]=fm(arr);
			else
				res[j]=-1;
			j++;
		}
		for(int i=0;i<t;i++) {
			System.out.println(res[i]);
		}
	}
} 
/*
2
3
1 2 3
4
5 5 5 2
*/

import java.util.*;
import java.math.BigInteger;
class Solution{
	public static int remOf(int n1,int n2) {
		int rem;
		BigInteger val = new BigInteger("1");
		val = (BigInteger.valueOf(n1)).multiply(BigInteger.valueOf(n2));
		rem = (val.remainder(BigInteger.valueOf(3))).intValue();
		return rem;
	}
	public static void main(String args[]){
		int t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		int[] res = new int[t];
		int j=0;
		while(j<t) {
			int n = in.nextInt();
			int m = in.nextInt();
			res[j]=remOf(n,m);
			j++;
		}
		for(int i=0;i<t;i++) {
			System.out.println(res[i]);
		}
	}
} 
