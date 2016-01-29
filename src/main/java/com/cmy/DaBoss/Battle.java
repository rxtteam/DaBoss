package com.cmy.DaBoss;

public class Battle {
//	Player player;
	Boss boss;
	public Battle (Boss boss){
		this.boss = boss;
	}
	private final int turn = 10;
	
 
	public synchronized boolean fight( Player player){
		int damageToBoss = player.getAck() - this.boss.getDef() ;
		if (damageToBoss < 0 ){
			damageToBoss = 1;
		}
		System.out.println("战斗开始--玩家:"+player.getName()+"  对战boos:"+this.boss.getName());
		
		for (int i = 0 ; i < this.turn ; i++){
			 if(this.boss.getHp() - damageToBoss > 0 ){
				 this.boss.setHp((this.boss.getHp() - damageToBoss));
				 System.out.println("第"+(i+1)+"回合:"+"玩家 "+player.getName()+"发动攻击,"+"boss "+this.boss.getName()+"收到"+ damageToBoss+"点伤害,"+"还剩下"+this.boss.getHp()+"点血");
			 }else{
				 this.boss.setHp(0);
				 System.out.println("战斗结束--玩家:"+player.getName()+"胜利对战boos:"+this.boss.getName()+"被消灭");
				 notifyAll();
				 return true;
			 }
		}
		System.out.println("战斗结束--玩家:"+player.getName()+"  对战boos:"+boss.getName());
		notifyAll();
		return false;
	}
}
