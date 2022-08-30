package com.mindgate.pojo;

public class B extends A {
	public B() {
		System.out.println("def cons of b");
	}
	public B(int x){
		super(x);
		
		System.out.println("parametrised cons of b");
	}

}
