package com.bestlinmufeng.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Base extends JLabel {

	// 前一个位置
	int begin_base_x = 0;
	int begin_base_y = 0;

	// 指针是否在base图片上
	boolean inTheBase = false;
	
	private String picName;

	int p_width = 0;
	int p_height = 0;
	Image im = null;
	
	int i = 0; // temp var

	public Base(String picName) {
		ImageIcon imageIcon = new ImageIcon(picName);
        im = imageIcon.getImage();

        p_width = imageIcon.getIconWidth();
        p_height = imageIcon.getIconHeight();
        setBounds(0, 0, p_width, p_height);
	}
	
	public void paint(Graphics g) {
        g.drawImage(im, 0, 0, p_width, p_height, null);
    }
}
