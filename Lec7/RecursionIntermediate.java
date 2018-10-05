package Lec7;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionIntermediate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the string ");
		  String str = s.next();
		  ArrayList<String> res = getSSS(str);
		  System.out.println(res);
	}
	
	public static int toInt(String str,int count)
	{
		if(str.length()==1)
		{
			return (int)str.charAt(0)-48;
		}
		int cc=((int)str.charAt(0))-48;
		int rec = toInt(str.substring(1),count-1);
		int num = (int)(cc*(Math.pow(10,count-1))) + rec;
		return num;
	}

	public static int sumNum(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int ci = (int)str.charAt(0)-48;
		int sum = ci + sumNum(str.substring(1));
		return sum;
		
	}
	
	//ADD * B/W CONSECUTIVE DUPLICATE CHARACTERS
	public static String AddStar(String str)
	{
		if(str.length()==1){
			return str;
		}
		String star = new String();
		star = "";
		if(str.charAt(0)==str.charAt(1)){
			star = str.substring(0,1)+"*";
			return star + AddStar(str.substring(1));
		}
		else{
		    	star = str.substring(0,1) + AddStar(str.substring(1));
                return star;	
		}
	}
	
	//REMOVE ALL CONSECUTIVE DUPLICATES FROM STRING
	 public static String rmDup(String str)
		{
			if(str.length()==1)
			{
				return str;
			}
			String nstr = new String();
			nstr="";
			if(str.charAt(0) == str.charAt(1))
			    nstr = rmDup(str.substring(1));
			else
				nstr = str.charAt(0) + rmDup(str.substring(1));
			return nstr;
		}
	
	//MOVE ALL X AT THE END
	public static String RX(String str,int count)
	{
		if(str.length()==0)
		{
			String base =new String();
			base = "";
			while(count>0)
			{
				base += "x";
				count--;
			}
			return base;
		}
		String ls=new String();
		ls="";
		if(str.charAt(0)=='X'||str.charAt(0)=='x')
		{
			return  RX(str.substring(1),count+1);
		}
		else
		{
			ls = str.substring(0,1);
			return ls + RX(str.substring(1),count);
		}
	}
	
	//(a)COUNT HI  (b)REMOVE HI  (c)REPLACCE HI WITH BYE
	
	public static int countHi(String str, int c) {
		if (str.length() == 1 || str.length() == 0) {
			return c;
		}
		if (str.substring(0,2).equals("hi")) 
				return countHi(str.substring(2),c+1);
		else
			return countHi(str.substring(1), c);
	}
	
	public static String rmHi(String str) {
		if (str.length() == 1 ||str.length() == 0) {
			return str;
		}
		String rs=new String();
		rs="";
		
		if (str.substring(0,2).equals("hi"))
				rs  =  rmHi(str.substring(2));
		else 
		     rs  = str.substring(0,1) +  rmHi(str.substring(1));
		return rs;
	}
	
	public static String replaceHi(String str) {
		if (str.length() == 1 ||str.length() == 0)
			return str;
			
		String rs=new String();
		rs="";
		if (str.substring(0,2).equals("hi")) 
			rs =  "bye" + replaceHi(str.substring(2));
	
		else
		    rs  = str.substring(0,1) +  replaceHi(str.substring(1));
		return rs;
	}
	
	//SAME AS ABOVE BUT DON'T CONSIDER "hit" ONLY "hi"
	/*	public static int countHi(String str, int count) {
		if (str.length() == 1) {
			return count;
		}
		if(str.substring(0,2).equals("hi")){
		    if(str.length()==2)
		        return countHi(str.substring(1),count+1);
		    else {
		        if(str.charAt(2)=='t')
		            return countHi(str.substring(2),count);
		        else 
		             return countHi(str.substring(2),count+1);
		    }
		        
		}
		else 
		     return countHi(str.substring(1),count);
	}
	public static String rmtHi(String str) {
		if (str.length() == 1) {
			return str;
		}
		String rs=new String();
		rs="";
		if(str.substring(0,2).equals("hi")){
		    if(str.length()==2){
		        return rs;
		    }
		    else {
		        if(str.charAt(2)=='t'){
                   rs = str.substring(0,2);
                   return (rs +  rmtHi(str.substring(2)));
		        }
		        else 
		             return rs + rmtHi(str.substring(2));
		    }
		        
		}
		else {
		     rs = rs + str.substring(0,1);
		     return rs + rmtHi(str.substring(1));
		}
		
	}
	public static String replaceHi(String str) {
	    if (str.length() == 1) {
			return str;
		}
		String rs=new String();
		rs="";
		if(str.substring(0,2).equals("hi")){
		    if(str.length()==2){
		        rs  = rs + "bye";
		        return rs;
		    }
		    else {
		        if(str.charAt(2)=='t'){
                   rs = str.substring(0,2);
                   return (rs +  replaceHi(str.substring(2)));
		        }
		        else 
		             rs = rs + "bye";
		             return rs + replaceHi(str.substring(2));
		    }
		        
		}
		else {
		     rs = str.substring(0,1);
		     return rs + replaceHi(str.substring(1));
		}
	    
	}*/
	
	// count Twins
	
	public static int countTwins(String str,int count)
	{
		if(str.length()<=2)
			return count;
		if(str.charAt(0)==str.charAt(2))
			return countTwins(str.substring(1),count+1);
		else
			return countTwins(str.substring(1),count);
	}
	
	//with considering overlap
	public static int AAA(String str,int count)
	{
		if(str.length()==2)
			return count;
		if(str.substring(0,3).equals("aaa"))
	        return AAA(str.substring(1),count+1);
		else 
		    return AAA(str.substring(1),count);

		
	}
	//without considering overlap
	public static int AAAwO(String str,int count)
	{
	    	if(str.length()<=2)
		    	return count;
		    if(str.substring(0,3).equals("aaa")){
	           if(str.length()==3)
	                 return (count+1);
	           else
	                return AAAwO(str.substring(3),count+1);
		    }
	    	else 
		        return AAAwO(str.substring(1),count); 
	}
	
	//Obedient String
	
	public static boolean obi(String str) {
		if (str.length()==0) 
			return true;
		if (str.charAt(0) != 'a')
			return false;
		else
		{
			if(str.length()<=2)
			    return obi(str.substring(1));  
		    else{
			    if(str.substring(1,3).equals("bb"))
				    return obi(str.substring(3));
				else 
				    return obi(str.substring(1));  
		    }
		}
	}
	
	//WHAT'S INSIDE PARANTHESIS
	
	public static String inPar(String str,int flag)
	{
		String res="";
		if(str.charAt(0)==')'){
		    return res;
		}
		if(str.charAt(0)=='('){
		    res = res + inPar(str.substring(1),1);
		    return res;
		}
		if(flag==1){
		    res = res + str.charAt(0) + inPar(str.substring(1),1);
		    return res;
		}
		else{
		    return inPar(str.substring(1),0);
		}
	}
	
	//CODES OF A STRING
	

	public static ArrayList<String> codeStr(String str) {
		if(str.length() == 0){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList<String> result = new ArrayList<>();
	
		ArrayList<String> first = codeStr(str.substring(1));
		int val1 =  Integer.parseInt(str.substring(0,1));
	
		ArrayList<String> second = new ArrayList<>();
		int val2 = 0;
	
		if(str.length() > 1){
			val2 = Integer.parseInt(str.substring(0, 2));
			if(val2 <= 26){
				second = codeStr(str.substring(2));
			}
		}
		
		for(int i = 0; i < first.size(); i++)
			result.add((char)(val1 + 96) + first.get(i));
	
		for(int i = 0; i < second.size(); i++)
			result.add((char)(val2 + 96) + second.get(i));
	
		return result;
	}
	/*OR
	   public static ArrayList<String> codeOf(String str){
        if(str.length()==0){
            ArrayList<String> base =new ArrayList<String>();
            base.add("");
            return base;
        }
       
        ArrayList<String> myRes = new ArrayList<String>();
        
        
        int val1 = Integer.parseInt(str.substring(0,1));
        ArrayList<String> rec1 = codeOf(str.substring(1));
        ArrayList<String> rec2 = new ArrayList<String>();
        int val2 = 0;
          
        for(int i=0;i<rec1.size();i++){
                 myRes.add((char)(val1 + 96) + rec1.get(i));
        }
        
        if(str.length()>1){
            val2 = Integer.parseInt(str.substring(0,2));
            if(val2<=26){
                 rec2 = codeOf(str.substring(2));
           }
           for(int i=0;i<rec2.size();i++){
                myRes.add((char)(val2 + 96) + rec2.get(i));
           }
        }
        return myRes;
    }*/
	
	//Special Subsequences geeksforgeeks
	
	public static ArrayList<String> getSSS(String str){
	    if(str.length()==0){
	        ArrayList<String> base = new  ArrayList<String>();
	        base.add("");
	        return base;
	    }
	    char cc = str.charAt(0);
	    String ros = str.substring(1);
	    ArrayList<String> rec = getSSS(ros);
	    ArrayList<String> myres = new ArrayList<String>();
	    myres.add(rec.get(0));
	    int flag =0;
	    while(flag<=2){
	        if(flag==0){
	            for(int j=0;j<rec.size();j++){
	                myres.add((char)(cc-32) + rec.get(j));
	            }
	        }
	        else if(flag==1){
	        	 for(int j=1;j<=(rec.size()-1)/2;j++){
	                 myres.add(rec.get(j));
	             }
	             for(int j=0;j<rec.size();j++){
	                 myres.add(cc + rec.get(j));
	             }
	        }
	        else if(flag==2){
	        	 for(int j=(rec.size()-1)/2+1;j<rec.size();j++){
	                 myres.add(rec.get(j));
	             }
	        }
	        flag++;
	    }
	    return myres;
	}

}
