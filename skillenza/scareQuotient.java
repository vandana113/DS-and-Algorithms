package skillenza;
import java.util.*;
public class scareQuotient {
	public static void main(String args[]){
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    int i=1;
	    while(i<=t){
	        scareQuo();
	        i++;
	    }
	}
	public static void scareQuo(){
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] choco = new int[n];
	    for(int i=0;i<n;i++){
	        choco[i] = s.nextInt();
	    }
	    int[] res = new int[n];
	    int j,count;
	    for(int i=0;i<n;i++)
	    {
	        j=i;
	        count=0;
	        while(j>=0&&choco[j]<=choco[i]){
	            count++;
	            j--;
	        }
	        res[i] = count;
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(res[i]);
	    }
	     System.out.println("");
	}

}
