import java.util.Scanner;

public class Temperature {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input in Fahrenheit");
        double Fahrenheit = sc.nextDouble();
        double celsius = ((5*(Fahrenheit - 32.0))/9.0);
        System.out.println(Fahrenheit + "Degree is " + celsius + "in celsius");
    }
}
