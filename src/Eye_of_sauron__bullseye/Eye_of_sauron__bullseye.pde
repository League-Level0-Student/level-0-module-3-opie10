void setup() {
  size (1000, 1000);
}
void draw() { 
  for (int i=0; i<20; i++) {
    if (i%2==0) {
      fill(#EA241A);
      ellipse(500, 500, 1000-(i*50), 1000-(i*50));// 
   // ellipse(500, 500, 1000-(i*50), 1000-(i));eye of sauron code loop 20
  }
    else {
      fill(#000000);
      ellipse(500, 500, 1000-(i*50), 1000-(i*50));
    //ellipse(500, 500, 1000-(i*50), 1000-(i)); cool code
  }
  }
}
