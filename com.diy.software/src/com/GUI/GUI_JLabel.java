package com.GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class GUI_JLabel extends JLabel
{

	public GUI_JLabel() 
	{
		this.setText("Sample Text");
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Franklin Gothic",Font.PLAIN, 10));
	}
	

}
