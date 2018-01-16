void setup() {
size(600, 600);
}
void draw() {
fill(#FFFFFF);
ellipse(170, 200, 175, 125);
ellipse(430, 200, 175, 125);
fill(#000000);
if(mouseX < 470 && mouseX > 390 && mouseY < 220 && mouseY > 180) {
ellipse(mouseX - 260, mouseY, 60, 60);
ellipse(mouseX, mouseY, 60, 60);
}
else if(mouseX >= 470 && mouseY <= 220 && mouseY >= 180) {
ellipse(470, mouseY, 60, 60);
ellipse(210, mouseY, 60, 60);
}
else if(mouseX <= 390 && mouseY <= 220 && mouseY >= 180) {
ellipse(400, mouseY, 60, 60);
ellipse(140, mouseY, 60, 60);
}
else if(mouseY <= 220 && mouseX <= 470 && mouseX >= 390) {
ellipse(mouseX, 190, 60, 60);
ellipse(mouseX - 260, 190, 60, 60);
} 
else if(mouseY >= 180 && mouseX <= 470 && mouseX >= 390) {
ellipse(mouseX, 200, 60, 60);
ellipse(mouseX - 260, 200, 60, 60);
}
}