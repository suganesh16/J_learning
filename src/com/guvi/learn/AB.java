package com.guvi.learn;

//To access a package, we need to use import statement.
//import packagename with no change in directory structure
//import a specific class from a package
import guvi.learning.AA;

//to import all the classes and interfaces in the package, use * with the package name.
//It wont import the subpackages inside this package
import guvi.learning.*;

import guvi.learning.subpack.*;

public class AB {

	public static void main(String[] args) {

		AA obj =new AA();
		obj.msg();
		
		BB obj1=new BB();
		obj1.msg1();
		
		
		//using a fully qualified name instead of importing the package
		guvi.learning.AA obj2 =new guvi.learning.AA();
		obj2.msg();
	
		
		//Accessing the subpackage
				SubPackageEx obj3 =new SubPackageEx();
				obj3.msg3();
				

	}

}
