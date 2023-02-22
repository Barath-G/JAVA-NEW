import java.util.Scanner;
public class Demo{
	public static void main (String args[]){
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("What is your name");
			
			String name = scanner.nextLine();
			
			scanner.nextLine();
			
			int rating = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Hello" + name);
		
	}
}