package com.kh.fileIO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImgRotate {

	public static void main(String[] args) {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "Cute2.png";
		String outputImg = path + "rotateCute.png";
		
		// �̹����� �ε�
		try {
			BufferedImage originImg = ImageIO.read(new File(inputImg));
			
			//�̹����� 90�� �ð� ���� ȸ��!
			BufferedImage rotateImg = rotateImage(originImg, 270);
			
			//ȸ���� �̹��� ����
			ImageIO.write(rotateImg, "jpg", new File(outputImg));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// �̹����� �־��� ������ ȸ���ϴ� �޼���
	public static BufferedImage rotateImage(BufferedImage originImg, double degrees) {
		double radians = Math.toRadians(degrees);
		double sin = Math.abs(Math.sin(radians));
		double cos = Math.abs(Math.cos(radians));
		
		int width = originImg.getWidth();
		int height = originImg.getHeight();
		
		//���ο� �̹��� ���� ������ �� ũ��
		int newWidth = (int) Math.floor(width * cos + height * sin);
		int newHeight = (int) Math.floor(height * cos + width * sin);
		
		BufferedImage rotateImg = new BufferedImage(newWidth,newHeight,originImg.getType());
		Graphics2D g2d = rotateImg.createGraphics();
		g2d.translate((newWidth - width) / 2, (newHeight - height) / 2);
		g2d.rotate(radians, width / 2, height / 2);
		g2d.drawRenderedImage(originImg, null);
		g2d.dispose();
		
		return rotateImg;
	}

}
