


void setup()
{
	size(500,500);
	frameRate(120);
}

void draw()
{
	background(0);
	party();
	discoball();
}


void discoball()
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

void party()
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




