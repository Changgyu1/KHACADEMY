package com.kh.mvc.person.cl.PersonMain;

import com.kh.mvc.person.co.PersonController.PersonController;
import com.kh.mvc.person.mo.PersonModel.PersonModel;
import com.kh.mvc.person.vo.PersonView.PersonView;

public class PersonMain {

	public static void main(String[] args) {
		
		//�� ��ü ����
		PersonModel permodel = new PersonModel("�谳��",4,"���ڱ�");
		//�� ��ü ����
		PersonView perview = new PersonView();
		//��Ʈ�ѷ� ��ü ���� �� �� �� ����
		PersonController contro = new PersonController(permodel, perview);
		//�л� ������ ������Ʈ�ؼ� ���
		contro.updata();
		//�л� ���� ������Ʈ
		contro.setName("");
		contro.setAge(999);
		contro.setHobby("õ������");
		contro.setisVaild();
		
		System.out.println("");
		//������Ʈ �� �л� ���� ��� 
		contro.updata();
	}

}
