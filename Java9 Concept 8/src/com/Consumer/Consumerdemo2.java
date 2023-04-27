package com.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;


 class Movie {
//step1
	int id;
	String hero;
	String heroien;
	public Movie(int id, String hero, String heroien) {
		this.id = id;
		this.hero = hero;
		this.heroien = heroien;
	}
}

//2 step 2
public class Consumerdemo2{
	public static void main(String[] args) {
		ArrayList<Movie> arrayList= new ArrayList<>();
		populate(arrayList);
		
		Consumer<Movie> c = n->{
			System.out.print(n.id+" ");
			System.out.print(n.hero+" ");
			System.out.print(n.heroien+" ");
			System.out.print(" ");
		       }; 
		       
		     //  c.accept(arrayList);//can run alone for loop
		       
		       for (Movie m : arrayList) {
		    	   c.accept(m);
				
			}
		//n is always type of <> pass in traingle
	    
	}

	//3step
	private static void populate(ArrayList<Movie> arrayList) {
		
		arrayList.add(new Movie(0, "boy1", "hj1"));
		arrayList.add(new Movie(2, "boy2", "hj2"));
		arrayList.add(new Movie(3, "boy3", "hj3"));
		arrayList.add(new Movie(4, "boy4", "hj4"));
		arrayList.add(new Movie(5, "boy5", "hj5"));
			
		
		
	}
	
	
}
