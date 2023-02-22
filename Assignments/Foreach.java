public class Foreach{
	public static void main (String[] args){
		String[] names = {"Java", "JS", "C", "C++"};
		System.out.println("Printing the content of array names: ");
		for (String name:names){
			System.out.println (name);
		}
	}
}