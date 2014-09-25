/**
 * House.java
 * @author Garrett J. Beasley
 * 09/24/2014
 * Draws a House Picture
 */

//Imports for the program.
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class HCC extends GraphicsProgram 
	{
		//Method called run
		public void run()
		{
			//Variables for the project.
			/**Values for the pen start point*/
			int startX = 0;
			int startY = 0;
			/**Values to change the location of where the logo is drawen (0,0) is the default*/
			int moveX = 0;
			int moveY = 0;
			/**Values for the window Size*/
			int windowX = 400;
			int windowY = 300;
			/**Colors for the project*/
			Color colorB = Color.BLUE;
			Color colorW = Color.WHITE;
			Color colorBK = Color.BLACK;
			
			//Creates new pen for the project
			GPen pen = new GPen();
			add(pen);
			pen.showPen();
			
			//Sets the size of the window for the program
			 setSize(windowX, windowY);
			 
			   //Black Square
			   pen.setFillColor(colorBK);
			   pen.startFilledRegion();
			   pen.setLocation(moveX,moveY+100);
			   pen.drawLine(260,startY);
			   pen.drawLine(startX,100);
			   pen.drawLine(-260,startY);
			   pen.drawLine(startX,-100);
			   pen.endFilledRegion();
			   
			   //White Square
			   pen.setFillColor(colorW);
			   pen.startFilledRegion();
			   pen.setLocation(moveX+10,moveY+110);
			   pen.drawLine(240,startY);
			   pen.drawLine(startX,80);
			   pen.drawLine(-240,startY);
			   pen.drawLine(startX,-80);
			   pen.endFilledRegion();
			   
			   //Letter H
			   pen.setFillColor(colorB);
			   pen.startFilledRegion();
			   pen.setLocation(moveX+20,moveY+120);
			   pen.drawLine(20,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(20,startY);
			   pen.drawLine(startX,-20);
			   pen.drawLine(20,startY);
			   pen.drawLine(startX,60);
			   pen.drawLine(-20,startY);
			   pen.drawLine(startX,-20);
			   pen.drawLine(-20,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(-20,startY);
			   pen.drawLine(startX,-60);
			   pen.endFilledRegion();
			   
			 //Letter C #1
			   pen.setFillColor(colorB);
			   pen.startFilledRegion();
			   pen.setLocation(moveX+100,moveY+120);
			   pen.drawLine(40,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(-20,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(20,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(-40,startY);
			   pen.drawLine(startX,-60);
			   pen.endFilledRegion();
			   
			   //Letter C #2
			   pen.setFillColor(colorB);
			   pen.startFilledRegion();
			   pen.setLocation(moveX+160,moveY+120);
			   pen.drawLine(40,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(-20,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(20,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(-40,startY);
			   pen.drawLine(startX,-60);
			   pen.endFilledRegion();
			   
		       //Period
			   pen.setFillColor(colorB);
			   pen.startFilledRegion();
			   pen.setLocation(moveX+220,moveY+160);
			   pen.drawLine(20,startY);
			   pen.drawLine(startX,20);
			   pen.drawLine(-20,startY);
			   pen.drawLine(startX,-20);
			   pen.endFilledRegion();
			   
			   //Hides the Pen after drawing
			   pen.hidePen();
			   
			 
			 
		}
		
		
	

	}
