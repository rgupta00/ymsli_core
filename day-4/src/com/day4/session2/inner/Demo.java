package com.day4.session2.inner;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Demo extends JFrame {
	Button button;
	
	public Demo() {
		button=new Button("click me");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(" i am clicked!");
			}
		});
		this.add(button);
		this.setVisible(true);
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		Demo demo=new Demo();
		
		ActionListener al =new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(" i am clicked!");
			}
		};
	}
}
