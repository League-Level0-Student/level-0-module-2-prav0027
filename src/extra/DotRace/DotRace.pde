int xco = 30;
void setup(){
size(800,200);  
}
void draw(){
  background(115,94,216);
  ellipse(xco, 100, 100,100);
  if(mousePressed){
   xco=xco+10; 
  }
  if(xco==800){
  import dff.minim.*;
   boolean soundPlayed = false;
   void playSound(){
     if(!soundPlayed){
       Minim minim = new Minim (this);
       AudioSample sound = minim.loadSample("ding2.wav");
       sound.trigger();
       sound Played = true;
     }
  }
  }
}