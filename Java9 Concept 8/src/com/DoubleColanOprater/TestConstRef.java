package com.DoubleColanOprater;
 class TestConstRef{
	
	public static void main(String[] args) {
		Intref intref = ConstructorRefrence::new;
		ConstructorRefrence c=intref.get();
	}
} 