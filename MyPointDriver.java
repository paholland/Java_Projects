/******************************************
* MyPointDriver.java
* Client program for MyPoint class. Create
* objects of MyPoint and call methods
*******************************************/

public class MyPointDriver
{
  public static void main(String[] args)
  {
    // object #1
    MyPoint p1 = new MyPoint();
    p1.setX(10);
    p1.setY(5);
    System.out.print("p1: ");
    p1.display();
    System.out.printf("distance from origin to p1: %.4f\n", p1.distanceFromOrigin());

    p1.move(2, -3);
    System.out.print("\np1 after move: ");
    p1.display();
    System.out.printf("distance from origin to p1: %.4f\n",  p1.distanceFromOrigin());
    System.out.println(); // space

    // object #2
  
    // create a MyPoint object called p2
    MyPoint p2 = new MyPoint();
    // call setLocation(int, int) to set its location to x 4 and y 6
    p2.setLocation(4, 6); 
    System.out.print("p2: ");
    p2.display(); // call display to print out p2
    
    // call distanceFromOrigin. print the result
    System.out.printf("distance from origin to p2: %.4f\n",    p2.distanceFromOrigin());
    System.out.println(); // space
    
    
    // method calls involving two objects #1 and #2
    
    // call distance(MyPoint) to calculate distance between p1 and p2.     print result
    
    System.out.printf("distance from p1 to p2: %.4f\n",  p1.distance(p2));
    
    // call equals to compare p1 and p2. print result
    System.out.print("p1 equals p2? " + p1.equals(p2));
    System.out.println();// space
    // END ADD CODE 2

    // object #3
    MyPoint p3 = new MyPoint();
    p3.setLocation(p1);
    System.out.print("\np3: ");
    p3.display();
    System.out.println(); // space

    // method calls involving two objects #1 and #3
    
    // call distance(MyPoint) to calculate distance between p1 and p3.     print result
    System.out.printf("distance from p1 to p3: %.4f\n", p1.distance(p3));
    // call equals to compare p1 and p3. print result
    System.out.println("p1 equals p3? " + p1.equals(p3));
    // use == to compare p1 and p3. Print result
    System.out.println("p1 == p3? " + (p1 == p3));
    // END ADD CODE 3

  } // end main
}// end class













public class MyPoint 
{
  private int x;
  private int y;

  // accessor methods, to access private
  public int getX()
    {
    return x;
    }

  public int getY()
  {
    return y;
  }

  // mutators methods  
  public void setX(int x)
  {
    this.x = x;
  }
 
  public void setY(int y)
  {
    this.y = y;
  }

  // method sets the x and y coordinates of the calling object to        parameters x and y
  public void setLocation(int x, int y)
  {
    this.x = x;
    this.y = y; 
  }

  // method sets the x and y coordinates of the calling object to that   of MyPoint object p
  public void setLocation(MyPoint p)
  {
    this.x = p.x; 
    this.y = p.y; 
  }
  
  // method returns true if the x and y coordinators of the calling      obj equal to those of the param p
  public boolean equals(MyPoint p)
  {
    if(x == p.x && y== p.y)
      return true;
    else 
      return false; 
  }

  // method increases the calling object by dx in x coordinate and dy    in y coordinate
  public void move(int dx, int dy)
  {
    x += dx;
    y += dy;  
  }

  // method calculates and returns the distance of the calling object    and the 'other' object
  public double distance(MyPoint other)
  {
    double distX = Math.pow((this.x - other.x),2);
    double distY = Math.pow((this.y - other.y),2);
    return Math.sqrt(distX + distY);
  }

  // method calculates and returns the distance of the calling object    and (0,0)
  public double distanceFromOrigin()
  {
    return Math.sqrt(x*x + y*y);
  }

  // method prints the calling object on screen in format
  public void display()
  {
    System.out.println("(x = " + x + ", y = " + y + ")");
  }

}// end class

