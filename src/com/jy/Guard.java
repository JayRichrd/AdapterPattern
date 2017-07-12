package com.jy;

public class Guard extends Player {

	public Guard(String name) {
		super(name);
	}

	@Override
	public void attach() {
		System.out.println("guard " + this.name + " attach");
	}

	@Override
	public void defense() {
		System.out.println("guard " + this.name + " defense");
	}

}
