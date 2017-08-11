package com.oocl.tengkh.sample;
/*
 * Sample Extends Thread
 * 
Sample output:
Hello 0
Hello 0
Hello 1
Hello 1
Hello 2
Hello 2
Hello 3
Hello 3
Hello 4
Hello 4
Hello 5
Hello 5
Hello 6
Hello 6
Hello 7
Hello 7
Hello 8
Hello 8
Hello 9
Hello 9

 * */
public class Sample1_Extend_Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		runner run1 = new runner();
		runner run2 = new runner();
		run1.start();
		run2.start();

	}

}

class runner extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}