package com.bridgelabz.designpattern.singletonpattern;

import com.bridgelabz.designpattern.singletonpattern.EagerInitializedSingleton;

public class MainEagerInitializedSingleton {

	public static void main(String[] args) {
		EagerInitializedSingleton eagerInitialized=EagerInitializedSingleton.getInstance();
		System.out.println(eagerInitialized);
		EagerInitializedSingleton eagerInitialized1=EagerInitializedSingleton.getInstance();
		System.out.println(eagerInitialized1);
	}

}
