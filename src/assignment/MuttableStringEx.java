package assignment;

//In Java, the mutable versions of String are StringBuilder and StringBuffer.

public class MuttableStringEx {

	public static void main(String[] args) {

		StringBuilder mutableString = new StringBuilder("Java");
        System.out.println("Original mutable string: " + mutableString);

        mutableString.append(" Program");
        System.out.println("Modified mutable string: " + mutableString);
	}

}
