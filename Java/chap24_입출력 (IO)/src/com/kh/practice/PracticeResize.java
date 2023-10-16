package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path+"�ش�.jpg";
		
		
		int width = 1024; // ���� ����
		int hight = 1024; // ���� ����
		//���� ���� ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop\\���ش�";
		String outputImg = folderPath+"\\�������Ϳ��.png";
		//���� �����
		File folder = new File(folderPath);
		// �����ϴ��� Ȯ��
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = bufImg.getScaledInstance(width, hight, Image.SCALE_SMOOTH);

			BufferedImage bufResizeImg = new BufferedImage(width, hight, BufferedImage.TYPE_INT_RGB);
			
			bufResizeImg.getGraphics().drawImage(resizeImg,0 ,0, null);
			
			ImageIO.write(bufResizeImg, "jpg" , new File(outputImg));
			System.out.println("�̹��� �������� �Ϸ�");
		} catch (Exception e) {
			System.out.println("�̹��� �������� �� ���� �߻� : " + e.getMessage());
			
		}
		
		
		
	}

}