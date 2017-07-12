package com.jy;

public class Adapter extends Player {
	private CenterForwardCh centerForwardCh = new CenterForwardCh();

	public Adapter(String name) {
		super(name);
		centerForwardCh.setName(name);
	}

	@Override
	public void attach() {
		// 委托方式调用
		centerForwardCh.jingong();
	}

	@Override
	public void defense() {
		// 委托方式调用
		centerForwardCh.fangshou();
	}

}
