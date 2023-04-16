package com.DefaultInInterface;

public class Theory {
//DM never equal to Concrete method
	//default implementation provide gives us 
	//without affecting the all implementation classes 
	
	//iska kya matlan ki 
	//agar interface me ek m1 () hai them class A and Class B jisne Implments kiyahai Mere interface ko ,
	//by default M1 method will ask to overrise that

//Default method ka concept hai bina diturb kiye aa jao 
	
	//so if take m2 () in my interface me that CLass A and B error aane lagege for m2 () overridrn 
	// hense we we make default  void m2() and {body} , Class A and B will not disturbe

//none of the class ask for Default method overriden , if Default keyword is not der
	//then we have to implment it n CLASS A and B
	// if we are not satisfied with default methos implkememtaion haply we can provide our own implementation
}

 //from 1.9 happly we can use default keyword in front of any methos in interface vwhich will not distrube our all implemetation class