package com.kh.abstractSample.Animal;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Dog animal = new Dog("������", "�п�");
		animal.displayName();
		animal.makeSound();
		//1. cat �����
		//cat ct = new cat("�����");
		/*Cat cat = new Cat("�����", "�Ͽ�");
		cat.displayName();
		cat.makeSound();*/
		Cat[] cat = new Cat[2];
		cat[0] = new Cat("�����", "�߿�");
		cat[1] = new Cat("����", "����");
		cat[0].displayName();
		cat[0].makeSound();
		cat[1].displayName();
		cat[1].makeSound();
		
		
		//2. ��ü�迭�� animal �����ؼ� ����ϱ�  /  �������� Ȱ���� ��ü �ٷ��
		//Animal[] animal = new Animal[2];
	}

}
