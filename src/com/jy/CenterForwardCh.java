package com.jy;

public class CenterForwardCh {
	private String name;

	public CenterForwardCh(String name) {
		this.name = name;
	}

	public CenterForwardCh() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void jingong() {
		System.out.println("中国中锋 " + this.name + " 进攻");
	}

	public void fangshou() {
		System.out.println("中国中锋 " + this.name + " 防守");
	}

}
