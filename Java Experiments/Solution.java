import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
       String s= sc.next();
int length = s.length();
     int   n=fact(length);
       // System.out.println(n);
        String ana[] = new String[n];
 ana[0]=s;
int count=1;
        char temp;
       int j=-1,k=0; 
        for(int i=1;i<n;)
            { 
            j++;
            ana[i]=ana[0];
            for(k=j;(k+1)!=j;k++)
           { if(k>=length)
             k=k%length;
            if(i>=n)
                break;
             temp = ana[i].charAt(k);
            if(k==0)
                ana[i] = ana[i].charAt((k+1)) + s.substring((k+1));
                else
                
                ana[i] = ana[i].substring(0,k) + ana[i].charAt((k+1)) + s.substring((k+1));
                ana[i] = ana[i].substring(0,(k+1)) + temp + s.substring((k+1) + 1) ;
                i++;
            if(yes(ana[i],i,ana))
                 count++;
                 
            }}
            
       System.out.println(count);
    }
    public static boolean yes(String val, int x, String ana[])
        { 
    
    for(int i=0;i<x;i++)
        if(val==ana[i])
               return false;
    return true;    
    }
    public static int fact(int len)
        {
        if(len>0)
            return len * fact(len-1);
        else
            return 1;
    }
}