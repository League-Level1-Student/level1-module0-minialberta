void setup(){
  size(500, 500);
    background(0, 0, 0);
}


void draw(){
  
  int x=501;
  int y=501;
  makeMagical();
  for (int i=0; i<300; i++){
      fill(255, 0, 0);
    ellipse(x,y,2,2);
x= (int)getWormX(i);
y=(int)getWormY(i);
}}


    float frequency = .005;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
