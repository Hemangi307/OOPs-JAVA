import java.util.Scanner;
public class Practical1{

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enrollment Number: 240390107011");
    System.out.println("Enter The Meters To Convert: ");
    double meter = sc.nextDouble();
    
    double feet = meter * 3.28084;
    
    System.out.printf("Converted Feet: %.3f ", feet);
    sc.close();
    
    }
}