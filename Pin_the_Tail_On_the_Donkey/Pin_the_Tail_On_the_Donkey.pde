int x = 0;
int y = 0;
boolean tailOn = false;
PImage tail;
PImage donkey;
public void setup() {
donkey = loadImage("2460.jpg");
tail = loadImage("download.png");

size(700, 500);
tail.resize(175, 175);
}
public void draw() {

  
  if(tailOn) {
  }
  else {
    if(mouseX < 31 && mouseY < 31) {
    background(donkey);
    }
    else {
      background(255);
    }
    if(mousePressed) {
image(tail, mouseX - 60, mouseY - 70);
x = mouseX;
y = mouseY;
}
}
 rect(0, 0, 30, 30);
}