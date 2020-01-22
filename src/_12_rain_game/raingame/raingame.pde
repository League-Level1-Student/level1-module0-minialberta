 int score=0;
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
void setup(){
   size(500, 500);
}
int y=0;
int randomNumber = 250;
void draw(){
  background(255, 0, 0);
      fill(0, 0, 250);
      

    stroke(0, 0, 250);
    ellipse(randomNumber, y, 20, 40);
      y=y+10;
    if (y==500){
      checkCatch(randomNumber);
       y=0;
       randomNumber= (int) random(500);
}
 rect(mouseX, 480, 25, 25);
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    
}
