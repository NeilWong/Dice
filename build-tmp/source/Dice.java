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

public class Dice extends PApplet {

Die one;
Die two;
public void setup()
{
    
    noLoop();
    size(400,400);
}
public void draw()
{
    background(0,0,0);
    one = new Die(80,150);
    two = new Die(200,150);
    one.show();
    two.show();
    textSize(20);
        fill(255,255,255);
        text("=   " + (one.numDots + two.numDots),330,200);    
        fill(255,255,255);
        text("+",184,200);
}
public void mousePressed()
{
    redraw();
}
class Die 
{
    int numDots, myX, myY;
    Die(int x, int y)
    {
        numDots=(int)(Math.random()*6)+1;
        myX = x;
        myY = y;      
        
    }
    public void roll()
    {  
        //numDots=(int)(Math.random()*6)+1;
    }
    public void show()
    {
        fill(255,255,255);
        rect(myX,myY,100,100);
        if(numDots == 1)
        {
            fill(0,0,0);
            ellipse(myX+50,myY+50,15,15);
        }
        if(numDots == 2)
        {
            fill(0,0,0);
            ellipse(myX+25,myY+25,15,15);
            ellipse(myX+75,myY+75,15,15);
        }
        if(numDots == 3)
        {
            fill(0,0,0);
            ellipse(myX+25,myY+25,15,15);
            ellipse(myX+75,myY+75,15,15);
            ellipse(myX+50,myY+50,15,15);
        }
        if(numDots == 4)
        {
            fill(0);
            ellipse(myX+25,myY+25,15,15);
            ellipse(myX+75,myY+75,15,15);
            ellipse(myX+75,myY+25,15,15);
            ellipse(myX+25,myY+75,15,15);
        }
        if(numDots == 5)
        {
            fill(0);
            ellipse(myX+25,myY+25,15,15);
            ellipse(myX+75,myY+75,15,15);
            ellipse(myX+75,myY+25,15,15);
            ellipse(myX+25,myY+75,15,15);
            ellipse(myX+50,myY+50,15,15);
        }
        if(numDots == 6)
        {
            fill(0);
            ellipse(myX+25,myY+25,15,15);
            ellipse(myX+75,myY+75,15,15);
            ellipse(myX+75,myY+25,15,15);
            ellipse(myX+25,myY+75,15,15);
            ellipse(myX+50,myY+25,15,15);
            ellipse(myX+50,myY+75,15,15);
        }
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
