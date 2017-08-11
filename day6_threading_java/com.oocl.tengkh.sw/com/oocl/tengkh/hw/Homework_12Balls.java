package com.oocl.tengkh.hw;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//HAPPY CASE

public class Homework_12Balls {
	public static void main(String[] args) {
		//Random rand = new Random();
		
		System.out.println("HAPPY CASE");
		
		//1st Test
		Integer[] groupOne = {0,0,0,0}; //{ rand.nextInt(1), rand.nextInt(1), rand.nextInt(1), rand.nextInt(1) }; // 1,2,3,4,
		Integer[] groupTwo = {0,0,0,0}; //{ rand.nextInt(1), rand.nextInt(1), rand.nextInt(1), rand.nextInt(1) }; // 5,6,7,8
		Integer[] groupThree = {0,0,1,0}; //{ rand.nextInt(1), rand.nextInt(1), rand.nextInt(1), 1 }; // 9,10,11,12
		
		System.out.println("\nWeight: 1 means heavy and 0 means light");
		System.out.println("\nGroup one: [1,2,3,4] balls and has a weight of " + Arrays.toString(groupOne) + " respectively");
		System.out.println("Group two: [5,6,7,8] balls and has a weight of " + Arrays.toString(groupTwo) + " respectively");
		System.out.println("Group three: [9,10,11,12] balls and has a weight of " + Arrays.toString(groupThree) + " respectively");
		
		boolean isBalance = weighBalls(groupOne, groupTwo);
		System.out.println("\n\n1st weigh: Group 1 [1,2,3,4]" + Arrays.toString(groupOne) + " == Group 2 [5,6,7,8]" + Arrays.toString(groupTwo) + " then balance is " + isBalance);
		System.out.println("Odd ball is within Group 3 [9,10,11,12]");
		isBalance = weighBalls(Arrays.copyOfRange(groupOne, 0, 3), Arrays.copyOfRange(groupThree, 0, 3)); 
		System.out.println("\n2nd weigh: Group 1 [1,2,3]" + Arrays.toString(Arrays.copyOfRange(groupOne, 0, 3)) + " < Group 3 [9,10,11]" + Arrays.toString(Arrays.copyOfRange(groupThree, 0, 3)) + ": Balance is " + isBalance);
		System.out.println("Odd ball is within Group 3's [9,10,11] therefore ball[12] is a light ball");
		isBalance = weighBalls(Arrays.copyOfRange(groupThree, 0, 1), Arrays.copyOfRange(groupThree, 1, 2));
		System.out.println("\n3rd weigh: Group 3's [9]" + Arrays.toString(Arrays.copyOfRange(groupOne, 0, 1)) + " == Group 3's [10]" + Arrays.toString(Arrays.copyOfRange(groupThree, 1, 2)) + ": Balance is " + isBalance);
		System.out.println("Ball [11] is the odd ball and has a weigh of " + Arrays.toString(Arrays.copyOfRange(groupThree, 2, 3)));
		

	}

	private static boolean weighBalls(Integer[] divOne, Integer[] divTwo) {
		boolean result = Arrays.equals(divOne, divTwo);
		//System.out.println(result);
		return result;

	}

}
