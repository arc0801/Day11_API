package com.arc.collection.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductMain {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer = new Computer();
		Notebook notebook = new Notebook();
		
		ArrayList<? extends Computer> ar = new ArrayList<Computer>();
		//Computer와 Computer를 상속받은 타입.
		ar.addAll(computer);
		
		
		
		/*
		//<Generic> -> Object
		ArrayList<Product> ar = new ArrayList<Product>();
		ar.add(tv);
		ar.add(computer);
		
		ArrayList<Product> ar2 = new ArrayList<Product>();
		
		//ArrayList<ArrayList<Product>> ar3 = new ArrayList<ArrayList<Product>>();
		
		HashMap<String, ArrayList<Product>> map = new HashMap<String, ArrayList<Product>>();
		*/
		
		
	}//main
}
