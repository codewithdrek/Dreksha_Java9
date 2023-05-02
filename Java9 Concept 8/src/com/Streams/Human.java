package com.Streams;

public class Human  implements Comparable<Human>{

	String name;
	int id;

	public Human(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Human o) {
		
		if(this.name != o.getName()){
			return -1;
		}
		else if (this.name == o.getName()) {
			return 1;
		}
		return 0;
	}

}
