package com.jy;

public class Forward extends Player {

	public Forward(String name) {
		super(name);
	}

	@Override
	public void attach() {
		System.out.println("forward " + this.name + " attach");
	}

	@Override
	public void defense() {
		System.out.println("forward " + this.name + " defense");
	}

}
