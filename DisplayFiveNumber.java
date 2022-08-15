// Q.1 :- Write a java program to store group of integer.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    //Creating HashSet
	    HashSet<Integer> s = new HashSet<>();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    //taking 5 integer number input from user 
	    for(int i=0;i<5;i++){
	        System.out.println("Enter a number : ");
	        int x=sc.nextInt();
	        s.add(x);
	    }
	    
	    //Traversing elements and displaying elements
	    for(Integer x : s){
	        System.out.print(x+" ");
	    }
	    
	}
}
