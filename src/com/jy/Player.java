package com.jy;

public abstract class Player {
	// ����
	protected String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	// ����
	public abstract void attach();

	// ����
	public abstract void defense();
}
