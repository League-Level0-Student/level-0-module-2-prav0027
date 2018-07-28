int x = 100;
int y = 200;
int size = 100;
int distance;
int getDistance(int x1, int y1, int x2, int y2){
  return(int)Math.sqrt(x2*x2+y2*y2)-(int)Math.sqrt(x1*x1+y1*y1);
}
void setup(){
  size(400,400);
}
void draw(){
  background(181,139,250);
  noStroke();
  ellipse(x,y,size,size);
}

void mousePressed(){
  distance=getDistance(x, y, mouseX, mouseY);
 print(distance);
 if(distance>-0.5*size&&distance<0.5*size){
    x = (int)random(400) ;
    y = (int)random(400);
 }
}