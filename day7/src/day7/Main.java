package day7;

import java.beans.FeatureDescriptor;

/*
 * To show Stack Error 
 * */

public class Main {

	public static void main(String[] args) {
		function divide = new function();
		System.out.println(divide.Divider(9, 0));
		System.out.println(divide.additon(100000, 200000));
		
		
	}

}
//x = first number
//y = second number

class function{
	public int Divider(int x, int y) {
		return (int)(x/(double)y);
	}
	
	public int additon(int x, int y) {
		return y==0 ? x : additon(++x, --y);
	}
}
