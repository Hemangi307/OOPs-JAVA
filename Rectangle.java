import java.util.Scanner; 
class Rectangle{
      double width ,height;
      Rectangle()
      {
         width=1;
         height=1;
       }

      Rectangle (double w , double h)
      {
        width=w;
        height=h;
       }

   void getArea()
  {
     System.out.println("Area of Rectangle:"+(width*height));
  }

   void getPerimetre()
  {
    System.out.println("Perimetre of Rectangle:"+(2*(width+height)));
   }


       public static void main(String args[]) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enrollment Number: 240390107011");

        double a;
        System.out.println("Enter Value of a: ");
	a=s1.nextDouble();

        double b;
        System.out.println("Enter Value of b: ");
	b=s1.nextDouble();

       

              Rectangle obj1=new Rectangle();
                        obj1.getArea();
                        obj1.getPerimetre();
            
              Rectangle obj2=new Rectangle(a,b);        
                        obj2.getArea();
                        obj2.getPerimetre();
     }
}