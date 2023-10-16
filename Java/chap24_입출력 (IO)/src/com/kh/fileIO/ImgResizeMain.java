package com.kh.fileIO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImgResizeMain {

	public static void main(String[] args) {
		// ���� �̹��� ���� ��� �����ϰ� �̹��� ���������� ���� ��� ����
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path+"Cute2.png";
		String outputImg = path+"VeryCute.png";
		
		// ���������� �̹��� ũ�� ����
		int width = 450; // ���� ����
		int hight = 100; // ���� ����
		

		try {
			// ���� �̹����� �о����
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			// ���ο� ũ��� �̹��� ��������
			Image resizeImg = bufImg.getScaledInstance(width, hight, Image.SCALE_SMOOTH);
			
			// BufferedImage ��ȯ
			BufferedImage bufResizeImg = new BufferedImage(width, hight, BufferedImage.TYPE_INT_RGB);
			
			bufResizeImg.getGraphics().drawImage(resizeImg,0 ,0, null);
			
			// ��������� �̹����� ���Ϸ� ����
			ImageIO.write(bufResizeImg, "jpg" , new File(outputImg));
			System.out.println("�̹��� �������� �Ϸ�");
		} catch (Exception e) {
			System.out.println("�̹��� �������� �� ���� �߻� : " + e.getMessage());
			
		}
		
		
		
	}

}
