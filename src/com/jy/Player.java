package com.jy;

public abstract class Player {
	// 姓名
	protected String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	// 进攻
	public abstract void attach();

	// 防守
	public abstract void defense();
}
