package corejava;

public class ClassCastExceptionEx {

	public static void main(String[] args) {

		Object obj = new Integer(42);
        String str = (String) obj; // Throws ClassCastException
        System.out.println("String: " + str);
		
	}

}
