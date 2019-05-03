package com.csu.yjf.ppt.character.picture;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PictureManager {
	ImageIcon SunWuKong_Front1 = new ImageIcon("src/Images/�����/�������1.png");
	ImageIcon SunWuKong_Front2 = new ImageIcon("src/Images/�����/�������2.png");
	ImageIcon SunWuKong_Front3 = new ImageIcon("src/Images/�����/�������3.png");
	ImageIcon SunWuKong_Front4 = new ImageIcon("src/Images/�����/�������4.png");
	ArrayList<ImageIcon> SunWuKong_Front = new ArrayList<ImageIcon>();
	
	ImageIcon SunWuKong_Back1 = new ImageIcon("src/Images/�����/��պ�1.png");
	ImageIcon SunWuKong_Back2 = new ImageIcon("src/Images/�����/��պ�2.png");
	ImageIcon SunWuKong_Back3 = new ImageIcon("src/Images/�����/��պ�3.png");
	ImageIcon SunWuKong_Back4 = new ImageIcon("src/Images/�����/��պ�4.png");
	ArrayList<ImageIcon> SunWuKong_Back = new ArrayList<ImageIcon>();
	
	ImageIcon SunWuKong_Left1 = new ImageIcon("src/Images/�����/�����1.png");
	ImageIcon SunWuKong_Left2 = new ImageIcon("src/Images/�����/�����2.png");
	ImageIcon SunWuKong_Left3 = new ImageIcon("src/Images/�����/�����3.png");
	ImageIcon SunWuKong_Left4 = new ImageIcon("src/Images/�����/�����4.png");
	ArrayList<ImageIcon> SunWuKong_Left = new ArrayList<ImageIcon>();
	
	
	ImageIcon SunWuKong_Right1 = new ImageIcon("src/Images/�����/�����1.png");
	ImageIcon SunWuKong_Right2 = new ImageIcon("src/Images/�����/�����2.png");
	ImageIcon SunWuKong_Right3 = new ImageIcon("src/Images/�����/�����3.png");
	ImageIcon SunWuKong_Right4 = new ImageIcon("src/Images/�����/�����4.png");
	ArrayList<ImageIcon> SunWuKong_Right = new ArrayList<ImageIcon>();
	
	ImageIcon SunWuKong_Stop1 = new ImageIcon("src/Images/�����/��պ�1.png");
	ImageIcon SunWuKong_Stop2 = new ImageIcon("src/Images/�����/�������1.png");
	ImageIcon SunWuKong_Stop3 = new ImageIcon("src/Images/�����/�����1.png");
	ImageIcon SunWuKong_Stop4 = new ImageIcon("src/Images/�����/�����1.png");
	ArrayList<ImageIcon> SunWuKong_Stop = new ArrayList<ImageIcon>();

	
	
	public PictureManager() {
		SunWuKong_Front.add(SunWuKong_Front1);
		SunWuKong_Front.add(SunWuKong_Front2);
		SunWuKong_Front.add(SunWuKong_Front3);
		SunWuKong_Front.add(SunWuKong_Front4);
		
		SunWuKong_Back.add(SunWuKong_Back1);
		SunWuKong_Back.add(SunWuKong_Back2);
		SunWuKong_Back.add(SunWuKong_Back3);
		SunWuKong_Back.add(SunWuKong_Back4);
		
		SunWuKong_Left.add(SunWuKong_Left1);
		SunWuKong_Left.add(SunWuKong_Left2);
		SunWuKong_Left.add(SunWuKong_Left3);
		SunWuKong_Left.add(SunWuKong_Left4);
		
		SunWuKong_Right.add(SunWuKong_Right1);
		SunWuKong_Right.add(SunWuKong_Right2);
		SunWuKong_Right.add(SunWuKong_Right3);
		SunWuKong_Right.add(SunWuKong_Right4);
		
		SunWuKong_Stop.add(SunWuKong_Stop1);
		SunWuKong_Stop.add(SunWuKong_Stop2);
		SunWuKong_Stop.add(SunWuKong_Stop3);
		SunWuKong_Stop.add(SunWuKong_Stop4);
		
	}



	public ArrayList<ImageIcon> getSunWuKong_Front() {
		return SunWuKong_Front;
	}
	public ArrayList<ImageIcon> getSunWuKong_Back() {
		return SunWuKong_Back;
	}
	public ArrayList<ImageIcon> getSunWuKong_Left() {
		return SunWuKong_Left;
	}
	public ArrayList<ImageIcon> getSunWuKong_Right() {
		return SunWuKong_Right;
	}
	public ArrayList<ImageIcon> getSunWuKong_Stop() {
		return SunWuKong_Stop;
	}
}
