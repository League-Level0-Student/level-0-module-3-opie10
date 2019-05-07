int speed = 2;
int x1 = 500 ;
int x2 = 1500 ;
void setup() {
  size (2000, 2000);
}
void draw() { 
 noFill();
  for (int i=0; i<101; i++) {
   
      
    ellipse(x1, 500, 500-(i*10), 500-(i*10));
   
  
    
      
      ellipse(x2, 500, 500-(i*10), 500-(i*10));
    
  
  }
  x1 += speed;
  x2 -= speed;
  
  
  
  
  
}
