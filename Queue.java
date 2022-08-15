// Q:- Write a java program to store 6 integer and displaying elements.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    //Creating Queue of size 6 and adding elements
	    Queue<Integer> q = new LinkedList<Integer>();
	    q.add(100);
	    q.add(20);
	    q.add(70);
	    q.add(30);
	    q.add(10);
	    q.add(50);
	  
	    //Traversing elements and displaying
	    System.out.println("elements in the Queue are ");
	    for(Integer x : q){
	        System.out.print(x+" ");
	    }
	    
	    System.out.println("\n");
	    //removing two elements and displaying
	    System.out.println("elements that removed ");
	    System.out.print(q.remove()+" ");
	    System.out.println(q.remove()+"\n");
	    
	     //elements after removing 2 elements
	     System.out.println("after removing 2 elements ");
	     for(Integer x : q){
	        System.out.print(x+" ");
	    }
	    
	}
}