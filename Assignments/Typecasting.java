//04 Type Casting in Java
/*
	Widening Casting
		byte -> short -> char -> int -> long -> float -> double
	Narrowing Casting
		double->float->long->int->char->short->byte
*/
class Typecasting
{
	public static void main (String args[])
	{
	int a=10;
	double b=a, d=25.5385;
	int c=(int)d;
	System.out.println("Int : "+a);
	System.out.println("Double : "+b);
	System.out.println("Double : "+d);
	System.out.println("Int : "+c);
	}
}