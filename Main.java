//Q:- Write a java program to store group of integer and insertion order matters.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    //Creating ArrayList and adding value 
	    ArrayList<Integer> arr = new ArrayList<>();
	    arr.add(10);
	    arr.add(76);
	    arr.add(14);
	    arr.add(17);
	    arr.add(80);
	    arr.add(96);
	    
	    //Traversing elements and displaying elements
	    for(Integer x : arr){
	        System.out.print(x+" ");
	    }
	}
}