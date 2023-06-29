package com.util.packages;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, Integer> population = new TreeMap<>();
        population.put("India", 1380004385);
        population.put("USA", 331002651);
        population.put("China", 1439323776);
        
        System.out.println(population);
	}

}
