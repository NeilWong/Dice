Die one;
Die two;
void setup()
{
    
    noLoop();
    size(400,400);
}
void draw()
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
void mousePressed()
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
    void roll()
    {  
        //numDots=(int)(Math.random()*6)+1;
    }
    void show()
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
