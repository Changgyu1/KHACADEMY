package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path+"해달.jpg";
		
		
		int width = 1024; // 가로 길이
		int hight = 1024; // 세로 길이
		//폴더 생성 경로 지정
		String folderPath = "C:\\Users\\user1\\Desktop\\해해달";
		String outputImg = folderPath+"\\초절정귀요미.png";
		//폴더 만들기
		File folder = new File(folderPath);
		// 존재하는지 확인
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = bufImg.getScaledInstance(width, hight, Image.SCALE_SMOOTH);

			BufferedImage bufResizeImg = new BufferedImage(width, hight, BufferedImage.TYPE_INT_RGB);
			
			bufResizeImg.getGraphics().drawImage(resizeImg,0 ,0, null);
			
			ImageIO.write(bufResizeImg, "jpg" , new File(outputImg));
			System.out.println("이미지 리사이즈 완료");
		} catch (Exception e) {
			System.out.println("이미지 리사이즈 중 오류 발생 : " + e.getMessage());
			
		}
		
		
		
	}

}