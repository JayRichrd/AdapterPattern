package com.jy;

public abstract class Player {
	// ĞÕÃû
	protected String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	// ½ø¹¥
	public abstract void attach();

	// ·ÀÊØ
	public abstract void defense();
}
