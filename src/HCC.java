


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
			int startX = 0;
			int startY = 0;
			int windowX = 400;
			int windowY = 300;
			Color colorB = Color.BLUE;
			
			//Creates new pen for the project
			GPen pen = new GPen();
			add(pen);
			pen.setLocation(startX, startY);
			pen.showPen();
			
			//Sets the size of the window for the program
			 setSize(windowX, windowY);
			 
			   //Black Square
			   pen.setFillColor(Color.BLACK);
			   pen.startFilledRegion();
			   pen.setLocation(0, 100);
			   pen.drawLine(260,0);
			   pen.drawLine(0 , 100);
			   pen.drawLine(-260, 0);
			   pen.drawLine(0,-100);
			   pen.endFilledRegion();
			   
			   //White Square
			   pen.setFillColor(Color.WHITE);
			   pen.startFilledRegion();
			   pen.setLocation(10, 110);
			   pen.drawLine(240,0);
			   pen.drawLine(0 , 80);
			   pen.drawLine(-240, 0);
			   pen.drawLine(0,-80);
			   pen.endFilledRegion();
			   
			   //Letter H
			   pen.setFillColor(colorB);
			   pen.startFilledRegion();
			   pen.setLocation(20, 120);
			   pen.drawLine(20,0);
			   pen.drawLine(0,20);
			   pen.drawLine(20,0);
			   pen.drawLine(0, -20);
			   pen.drawLine(20,0);
			   pen.drawLine(0,60);
			   pen.drawLine(-20, 0);
			   pen.drawLine(0, -20);
			   pen.drawLine(-20,00);
			   pen.drawLine(0,20);
			   pen.drawLine(-20,0);
			   pen.drawLine(0,-60);
			   pen.endFilledRegion();
			   
			 //Letter C #1
			   pen.setFillColor(colorB);
			   pen.startFilledRegion();
			   pen.setLocation(100, 120);
			   pen.drawLine(40,0);
			   pen.drawLine(0,20);
			   pen.drawLine(-20,0);
			   pen.drawLine(0, 20);
			   pen.drawLine(20,0);
			   pen.drawLine(0,20);
			   pen.drawLine(-40, 0);
			   pen.drawLine(0, -60);
			   pen.endFilledRegion();
			   
			   //Letter C #2
			   pen.setFillColor(colorB);
			   pen.startFilledRegion();
			   pen.setLocation(160, 120);
			   pen.drawLine(40,0);
			   pen.drawLine(0,20);
			   pen.drawLine(-20,0);
			   pen.drawLine(0, 20);
			   pen.drawLine(20,0);
			   pen.drawLine(0,20);
			   pen.drawLine(-40, 0);
			   pen.drawLine(0, -60);
			   pen.endFilledRegion();
			   
		       //Period
			   pen.setFillColor(colorB);
			   pen.startFilledRegion();
			   pen.setLocation(220, 160);
			   pen.drawLine(20,0);
			   pen.drawLine(0 , 20);
			   pen.drawLine(-20, 0);
			   pen.drawLine(0,-20);
			   pen.endFilledRegion();
			   
			   //Hides the Pen after drawing
			   pen.hidePen();
			   
			 
			 
		}
		
		
	

	}
