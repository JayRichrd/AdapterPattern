package com.jy;

public class Adapter extends Player {
	private CenterForwardCh centerForwardCh = new CenterForwardCh();

	public Adapter(String name) {
		super(name);
		centerForwardCh.setName(name);
	}

	@Override
	public void attach() {
		// ί�з�ʽ����
		centerForwardCh.jingong();
	}

	@Override
	public void defense() {
		// ί�з�ʽ����
		centerForwardCh.fangshou();
	}

}
