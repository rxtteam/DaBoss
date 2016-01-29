package com.cmy.DaBoss;

public class Player extends Actor implements Runnable {
	private Battle battle;

	public Player(Battle battle) {
		this.battle = battle;
	}

	public void run() {
		try {
			while (true) {
				if (this.battle.fight(this) == true) {
					System.out.println("战斗结束");
					break;
				}

				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
