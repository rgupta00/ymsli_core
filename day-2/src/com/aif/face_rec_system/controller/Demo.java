package com.aif.face_rec_system.controller;

import com.aif.face_rec_system.model.Face;

public class Demo {

	public static void main(String[] args) {
		Face face=new Face();
		face.addToDB();
		
		com.aif.face_rec_system.ui.Face face2=new com.aif.face_rec_system.ui.Face();
		face2.displayToScreen();
	}
}
