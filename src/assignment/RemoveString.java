package assignment;

public class RemoveString {

	public static void main(String[] args) {

		String originalString = "Hello, Java";
		String stringToRemove = ", ";
		String modifiedString = originalString.replace(stringToRemove, "");
		System.out.println(modifiedString); 

	}

}
