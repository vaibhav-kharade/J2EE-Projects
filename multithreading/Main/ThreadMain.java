package com.jspiders.multithreading.Main;

import com.jspiders.multithreading.threads.MyThread1;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread1 =new MyThread1();
		myThread1.start();
	}
}
