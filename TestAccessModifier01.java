package com.AccessModifier01;

import com.AccessModifiers.AccessModifiers;

public class TestAccessModifier01 extends AccessModifiers {

	public static void main(String[] args) {
		
         AccessModifiers objAccessModifiers = new AccessModifiers();
	     objAccessModifiers.printCollegename();
		
	     TestAccessModifier01 objAccessModifier01 = new TestAccessModifier01();
		 
	     objAccessModifier01.strbatch = "Jan 2022";   //Accessing Public Variable
		 objAccessModifier01.printBatchName();
		 
		 objAccessModifiers.printBatchName();
		 
		 
		
	}

}
