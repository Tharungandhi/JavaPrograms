package com.bridgelabz.designpattern.singletonpattern;

public class ThreadSafeSingletonMain {

	public static void main(String[] args) {
		System.out.println(ThreadSafeSingleton .getInstance());
      System.out.println(LazyInitializedSingleton.getInstance());
      System.out.println(ThreadSafeSingleton.getInstanceUsingDoubleLocking());
	}

}
