package com.jy;

public class AdapterPattern {

	public static void main(String[] args) {

		Player forward = new Forward("Battier");
		forward.attach();

		Player guard = new Guard("McGrady");
		guard.defense();

		Player centerForward = new Adapter("姚明");
		centerForward.attach();
		centerForward.defense();
	}

}
