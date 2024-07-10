package org.prince.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

//	@Autowired-first it try to inject the dependency with "byType". If "byType" fails then it goes with "byName"
	
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	
	
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("Setter Injection called....");
//	}

//	public Human() {
//		System.out.println("Human.Human() Constructor called...");
//	}

	public void startPumping() {
		System.out.println("Start Pumping...");
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("You are dead!");
		}
	}

	@Override
	public String toString() {
		return "Human [heart=" + heart + "]";
	}

}
