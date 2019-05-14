int speed1 = 30;
int speed = 30;
int x1 = 500 ;
int x2 = 1000 ;
int y1 =100 ;
int y2 =1000;
void setup() {
  size (1500, 1500);
}
void draw() { 
  background(#FF0000);
  noFill();

  for (int i=0; i<101; i++) {
    ellipse(x1, 500, 500-(i*10), 500-(i*10));
    ellipse(x2, 500, 500-(i*10), 500-(i*10));
    ellipse(750, y1, 500-(i*10), 500-(i*10));
    ellipse(750, y2, 500-(i*10), 500-(i*10));
  }

  if (x1>1500) {
    speed=-20;
  } 
  if (x1<0) {
    speed=20;
  } 
 if (y1>1500) {
    speed1=-20;
  } 
  if (y1<00) {
    speed1=20;
  } 

  x1 += speed;
  x2 -= speed;
y1 += speed1;
y2-=speed1;
}
