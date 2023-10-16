package com.kh.gettersetter.goodExam;

import com.kh.gettersetter.goodExam.GoodPlayer;

public class GoodPlayer {

	private String name; // 캐릭터이름
	private int health; // 체력
	private int attackPower; // 데미지

	public void setName(String name) { // 이름이 변경되면 저장될 set
		this.name = name;
	}

	// 검증하는 valid
	public void isValidName() { // 캐릭터이름에 공백이 없는지 검증!
		if (this.name == "") {
			//System.out.println("이름을 넣지 않았습니다.");
			this.name = "No name";
		}
	}

	public String getName() { // 캐릭터이름을 반환
		return name;
	}

	public void setHealth(int health) { // 체력이 변경되면 저장될 set
		this.health = health;
	}

	public void isValidHealth() { // 체력이 0이하인지 검증!
		if (this.health <= 0) {
			this.health = 0;
		}
	}

	public int getHealth() { // 체력을 반환
		return health;
	}

	public void setAttackPower(int attackPower) { // 공격력이 변경되면 저장될 set
		this.attackPower = attackPower;
	}

	public void isValidAttackPower() { // 공격력이 0이하인지 검증!
		if (attackPower <= 0) {
			this.attackPower = 0;
		}
	}

	public int getAttackPower() { // 공격력을 반환
		return attackPower;
	}

	// 출력메소드 작성
	public void display() {
		System.out.println("캐릭터 정보 : " + this.name);
		System.out.println("체 력 정보 : " + this.health);
		System.out.println("공격력 정보 : " + this.attackPower);

	}
	
}

