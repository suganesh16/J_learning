package jbasic;

public class ContinueExample {
	///continue statement is used to skip that particular iteration and go to the beginning of the next iteration

	public static void main(String[] args) {

		for(int i=3; i<10; i++)
		{
			if(i==8)
			{
				continue;
			}
		System.out.println(i);
		}
	}

}
