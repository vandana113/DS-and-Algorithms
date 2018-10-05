package Lecture6;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// PD(5);
				// PI(5);
				// PDISkip(5);
				// System.out.println(fact(5));
				//System.out.println(power(3,3));

				int[] arr = { 6, 5, 8, 8, 5, 6 };
				// System.out.println(isSorted(arr, 0));
				// System.out.println(contains(arr, 0, 19));
				// System.out.println(firstIndex(arr, 0, 8));
				// System.out.println(lastIndex(arr, 0, 8));
				
				//printIncDec(5);
				//patt2(5,5,1);
				patt3(5,1,5);
				//pascal(5,0,0,1);
				//System.out.println(ntriangle(1));
				System.out.println(isPalindrome(arr,0,arr.length-1));
				

			}

			public static void PD(int num) {
				if (num == 0) {
					return;
				}
				System.out.println(num);
				PD(num - 1);
			}

			public static void PI(int num) {
				if (num == 0) {
					return;
				}
				PI(num - 1);
				System.out.println(num);
			}

			public static void PDISkip(int num) {
				if (num == 0) {
					return;
				}

				if (num % 2 != 0) {
					System.out.println(num);
				}
				PDISkip(num - 1);
				if (num % 2 == 0) {
					System.out.println(num);
				}
			}

			public static int fact(int num) {
				if (num == 0) {
					return 1;
				}
				int fnm1 = fact(num - 1);
				int fn = num * fnm1;
				return fn;
			}

			public static int power(int x, int n) {
				if (n == 1) {
					return x;
				}
				int pnm1 = power(x, n - 1);
				int pn = x * pnm1;
				return pn;
			}
			public static void printIncDec(int N) {
				if(N==0) {
					System.out.println(N);
					return;
				}
				if(N%2!=0)
					System.out.println(N);
				printIncDec(N-1);
				if(N%2==0)
					System.out.println(N);
			}
			public static void patt2(int N,int i,int j) {
				if(i==0) {
					return;
				}
				if(j<=i) {
					System.out.print("*\t");
					patt2(N,i,j+1);
				}
				if(j>i) {
					System.out.println();
					patt2(N,i-1,1);
				}
			}
			public static void patt3(int N,int i,int j) {//patt2 in different way
				if(i>N) {
					System.out.println("Pattern 3");
					return;
				}
				if(j<=0) {
					System.out.println();
					patt3(N,i+1,N-i);
					//return;
				}
				if(j>0) {
			    	System.out.print("*\t");
				    patt3(N,i,j-1);
				}
			}
			public static void pascal(int N,int i,int j,int val) {
				if(i>=N) {
					return;
				}
				if(j<=i) {
					System.out.print(val + "\t");
					val = val*(i-j)/(j+1);
					pascal(N,i,j+1,val);
				}
				if(j>i) {
					System.out.println();
					pascal(N,i+1,0,1);
				}
			}
			public static int ntriangle(int n) {
				if(n==1)
					return 1;
				int val = n + ntriangle(n-1);
				return val;
			}
			public static boolean isPalindrome(int[] arr ,int si,int li) {
				if(li<si)
					return true;
				if(arr[si]==arr[li]) {
					return isPalindrome(arr,si+1,li-1);
				}
				else 
					return false;
			}
			public static void inverse(int[] arr,int si){
		        if(si>=arr.length){
		            return;
		        }
		        int temp  = arr[si];
		        inverse(arr,si+1);
		        arr[temp] = si; 
		    }
			 public static void bubblesrt(int[] arr,int si,int li){
			        if(li==0){
			            return;
			        }
			        if(si<li){
			             if(arr[si]>arr[si+1])
			             {
			                int temp = arr[si];
			                arr[si] = arr[si+1]; 
			                arr[si+1] = temp;
			             }
			             bubblesrt(arr,si+1,li);
			        }
			        else if(si==li){
			            bubblesrt(arr,0,li-1);
			        }
		     }
			 public static void reverse(int[] arr,int si,int li){
			        if(li<si){
			            return;
			        }
			        int temp  = arr[si];
			        arr[si] = arr[li];
			        arr[li] = temp;
			        reverse(arr,si+1,li-1);
			    }
			 
}
