package com.tnsif.synchronization;

public class T extends Thread {
	Example e;
	T(Example e){
		this.e=e;
	}
	public void run() {
		e.display();
	}
}
