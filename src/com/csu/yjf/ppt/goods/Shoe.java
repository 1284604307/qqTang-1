package com.csu.yjf.ppt.goods;

import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

import javax.swing.ImageIcon;

import com.csu.yjf.ppt.Item.Item;
import com.csu.yjf.ppt.frame.MyJLabel;
import com.csu.yjf.ppt.mapItem.Brick;

public class Shoe extends Goods{
	public Shoe(Point position, List<Item> items ,Brick brick) {
		super(position, items, brick);
		goodsCategory = GoodsCategory.BOTTLE;
		imageIcon= new ImageIcon("src/Images/Goods/����2.png");
		image = imageIcon.getImage();
	}

	int timer = 0;
	
	@Override
	public void paint(Graphics g) {
		if(!hasPicked) {
			timer+=20 ;
			if(timer>600) timer =0 ;
			int i = 0;
			if(timer>=300) i=5;
			g.drawImage(image, real_position.x, real_position.y+10-i,MyJLabel.Grid_WIDTH-4,MyJLabel.Grid_HEIGHT-5, null);
		}
			
	}
}
