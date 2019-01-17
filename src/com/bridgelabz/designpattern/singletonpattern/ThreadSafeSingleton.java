package com.bridgelabz.designpattern.singletonpattern;

public class ThreadSafeSingleton {
	
	 private ThreadSafeSingleton(){}
	 
    private static ThreadSafeSingleton instance;
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }


public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}
}