package Lec7;
import java.util.*;
public class IsBalanced {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = new String();
		str = s.next();
		StringBuilder res=new StringBuilder();
		System.out.println(isBal(str,""));
	}
	public static boolean isBal(String str,String exp)
	{
        	if(str.length()==0){
        	    if(exp.length()>0)
        	        return false;
        	    else 
        	        return true;
        	}
        	if(str.charAt(0)=='(' || str.charAt(0)=='{' || str.charAt(0)=='[' ){
        	    return isBal(str.substring(1),exp + str.charAt(0));
        	}
        	else if(str.charAt(0)==')' ){
        	    if(exp.charAt(exp.length()-1)=='('){
        	       int len = exp.length();
        	       return isBal(str.substring(1),exp.substring(0,len-1));
        	    }
        	    else 
        	        return false;
        	}
        	else if(str.charAt(0)=='}' ){
        	    if(exp.charAt(exp.length()-1)=='{'){
        	       int len = exp.length();
        	       return isBal(str.substring(1),exp.substring(0,len-1));
        	    }
        	    else 
        	        return false;
        	}
	        else if(str.charAt(0)==']' ){
        	    if(exp.charAt(exp.length()-1)=='['){
        	       int len = exp.length();
        	       return isBal(str.substring(1),exp.substring(0,len-1));
        	    }
        	    else 
        	        return false;
        	}
        	else
        	    return isBal(str.substring(1),exp);
	}

}

