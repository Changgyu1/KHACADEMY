package com.kh.mvc.circle.mo.CircleClient;

import com.kh.mvc.circle.mo.CircleController.CircleController;
import com.kh.mvc.circle.mo.CircleModel.CircleModel;
import com.kh.mvc.circle.mo.CircleView.CircleView;

public class CircleClient {

	public static void main(String[] args) {
		//�� ��ü ����
		CircleModel model = new CircleModel(1,7.7);
		//�� ��ü ����
		CircleView view = new CircleView();
		//��Ʈ�ѷ� ��ü ���� �� �� �� ����
		CircleController contro = new CircleController(model, view);
		//�л� ������ ������Ʈ�ؼ� ���
		contro.updata();
		//�л� ���� ������Ʈ
		contro.setNumber(7);
		contro.setPI(6.73);
		//������Ʈ �� �л� ���� ��� 
		contro.updata();
		

	}

}
