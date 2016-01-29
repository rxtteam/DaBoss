package com.cmy.DaBoss;

public abstract class Actor {
	private String name;
	private Integer hp;
	private Integer ack;
	private Integer def;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getAck() {
		return ack;
	}
	public void setAck(Integer ack) {
		this.ack = ack;
	}
	public Integer getDef() {
		return def;
	}
	public void setDef(Integer def) {
		this.def = def;
	}
}
