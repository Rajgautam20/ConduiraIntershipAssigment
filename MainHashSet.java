// Q:- Write a java program to store group of integer and order of insertion does not matter and store only unique element

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    //Creating HashSet and adding elements 
	    HashSet<Integer> set = new HashSet<>();
	    set.add(100);
	    set.add(20);
	    set.add(70);
	    
	    //trying to add duplicate elements
	    set.add(100);
	    set.add(100);
	    set.add(70);
	    
	    //Traversing elements and displaying
	    for(Integer x : set){
	        System.out.print(x+" ");
	    }
	    
	}
}