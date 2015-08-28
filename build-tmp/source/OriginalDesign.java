import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {




public void setup()
{
	size(500,500);
	frameRate(120);
}

public void draw()
{
	background(0);
	party();
	discoball();
}


public void discoball()
{
	noFill();
	noStroke();
	int r = (int)(Math.random()*255);
	int g = (int)(Math.random()*255);
	int b = (int)(Math.random()*255);
	float random = (float)(Math.random()*100);
	stroke(r,g,b);
	strokeWeight(random);
	fill(255,255,255, random);
	ellipse(mouseX, mouseY, 75, 75);
}

public void party()
{
	noFill();
	noStroke();
	int r1 = (int)(Math.random()*255);
	int g1 = (int)(Math.random()*255);
	int b1 = (int)(Math.random()*255);
	int random2 = (int)(Math.random()*255);
	fill(r1,g1,b1,random2);
	int x = (int)(Math.random()*470);
	int y = (int)(Math.random()*470);
	ellipse(x,y,75,75);
}




  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
