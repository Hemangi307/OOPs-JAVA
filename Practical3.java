import java.util.Scanner;
public class Practical3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			System.out.println("\nEnrollment No.: 240390107011");
			System.out.println("Enter Any Single Letter: ");
			char ch = sc.next().charAt(0);
			ch = Character.toLowerCase(ch);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				System.out.println("The Letter "+ ch+ " is Vowal.");
			}
			else{
				System.out.println("The Letter "+ ch+ " is Consonant.");
			}
			sc.close();
			
	}
}