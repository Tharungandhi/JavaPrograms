package com.bridgelabz.util;


	public class  Stack
	{
	    private static int maxSize;
	    private static long[] stackArray;
	    private static int top;

	    //for size 
	    public  Stack(int s)
	    {
	    maxSize = s;
	    stackArray = new long[maxSize];
	    top = -1;
	    }
	    //for push  
	    public static void push(long j)
	    {
	    stackArray[++top] = j;
	    }
	    //for pop  
	    public static long pop()
	    {
	    return stackArray[top--];
	    }
	    //for peek  
	    public static long peek()
	    {
	    return stackArray[top];
	    }
	    //to check whether stack is empty      
	    public static boolean isEmpty()
	    {
	    return (top == -1);
	    }
	    //to check whether stack is full      
	    public static boolean isFull()
	    {
	    return (top == maxSize - 1);
	}
		public boolean size() {
			// TODO Auto-generated method stub
			return (top==maxSize);
		}

	}


