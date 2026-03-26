import java.util.Scanner;

class Shape{
       double d1, d2;

void getData( double d1, double d2){
      this.d1=d1;
      this.d2=d2;
  }
}

class Rectangle extends Shape{
double CalculateArea() {
       return d1*d2;
    }
}

class Triangle extends Shape{
      double CalculateArea(){
        return 0.5*d1*d2;
   }
}

class Practical22{
    public static void main(String []args){
    
Scanner sc = new Scanner(System.in);
     System.out.println("Enter values");
	double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();


  Triangle T= new Triangle();
  T.getData(d1,d2);
  double Area=T.CalculateArea();
  System.out.println("Area of Triangle="+ Area);

  Rectangle R=new Rectangle();
  R.getData(d1,d2);
  System.out.println("Area of Rectangle="+ R.CalculateArea());
}
}

