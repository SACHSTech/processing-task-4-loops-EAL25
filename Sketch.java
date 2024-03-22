import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    noSmooth();
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// circles (MUST BE IN RIGHT TOP)
  stroke(100);
    
  for (int circleY = 15; circleY <= 220; circleY += 45) {
    for (int circleX = 220; circleX <= 385; circleX += 40) {
      ellipse(circleX, circleY, 20, 20);
    }
  }



// GRADIENT - BOTTOM LEFT
    for (int x = 000; x < 200; x++) { 
      for(int y = 200; y < height; y++) { 
            float distanceFromTopLeft = dist(30, y, 30, 0);
            float distanceFromTopRight = dist(10, 60, width, 20);
            float distanceFromBottomLeft = dist(30, y, 20, height);
      
            stroke(distanceFromBottomLeft, distanceFromTopRight, distanceFromTopLeft);
            point(x, y);
      }
    }

      // checker pattern top left
    stroke(0);

    for (int lineX = 20; lineX <= 210; lineX += 20) {
      line(lineX, 0, lineX, 200);
    }

    for (int lineY = 20; lineY <= 200; lineY += 20) {
      line(0, lineY, 200, lineY);
    }


      // flower 
      // flower petal 
      fill(204, 90, 90);
      ellipse((float) (width*.75), (float) (height*.75), (float) (width/2.5), height/16);
      ellipse((float) (width*.75), (float) (height*.75), width/16, (float) (height/2.5));
     
      for (int i = 0; i < 2; i++); {

        fill(184 , 97, 143);
          ellipse((float) (width*.75), (float) (height*.75), (float) (width/2.5), height/16);
          ellipse((float) (width*.75), (float) (height*.75), width/16, (float) (height/2.5));

      }
    
     
      //yellow flower pollen
      fill(255, 254, 168);
      ellipse((float) (width*.75), (float) (height*.75), width/8, height/8);
     

    
      

  // define other methods down here.
}
  }
  