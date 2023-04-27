package com.Predicate;


public class PredicateTheory {

	// What is predicate?
	// perform some conditional check and return TRUE and FALSE(booelan value) based
	// on condition
	// use predicate to check some condition
	// check some boolean condition
	// boolean value function
	// fi can ref Lemda,use predi to ref the lemda exp

	// package in java.util.function package
	// one one method public boolean test()
	// return true and false
	// function same as predicate but function can return anything not only boolean
	// Declaration[protype]
	/*
	 * interface predicate<T>{
	 * 
	 * boolean test(T t); }
	 */

//java.util.function package present
	// receive/ take one arugent /type
	// return type boolean

	
	//3 ways
	
	
	//abstract method
	/*
	 * public boolean test(Integer I) {
	 *  if (I > 10) return true; 
	 *  else return false;
	 * }
	 */

	
	//Using Lemada EXp no method name,no access modifier,no return type 
	/*
	 * (Integer I)->{ if(I>10) {
	 *  return true; else return false; 
	 *  } };
	 */
	
	
	
	//Using predicate
	/*
	 * Predicate<Integer > p=I->I>10; sys(p.test(100))//true 
	 * sys(p.test(5))//false
	 */
}
