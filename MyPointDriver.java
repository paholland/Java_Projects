/******************************************
* MyPointDriver.java (shell)
*
* client program for MyPoint class. Created
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
    System.out.printf("distance from origin to p1: %.4f\n", p1.distanceFromOrigin());

    // object #2
    // ADD CODE 1
    // create a MyPoint object called p2
    // call setLocation(int, int) to set its location to x 4 and y 6
    // call display to print out p2
    // call distanceFromOrigin. print the result
    // END ADD CODE 1


    // method calls involving two objects #1 and #2
    // ADD CODE 2
    // call distance(MyPoint) to calculate distance between p1 and p2. print result
    // call equals to compare p1 and p2. print result
    // END ADD CODE 2


    // object #3
    MyPoint p3 = new MyPoint();
    p3.setLocation(p1);
    System.out.print("\np3: ");
    p3.display();

    // method calls involving two objects #1 and #3
    // ADD CODE 3
    // call distance(MyPoint) to calculate distance between p1 and p3. print result
    // call equals to compare p1 and p3. print result
    // use == to compare p1 and p3. print result
    // END ADD CODE 3

  } // end main
} // end class MyPointDriver
