package com.util.packages;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random random = new Random();
        int randomNumber = random.nextInt(8);
        
        System.out.println("Random number: " + randomNumber);
	}

}
