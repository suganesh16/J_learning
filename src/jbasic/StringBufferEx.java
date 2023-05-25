package jbasic;

public class StringBufferEx {

	public static void main(String[] args) {

		
		StringBuffer sbb= new StringBuffer();
		System.out.println("default Capacity-->"+sbb.capacity());
		
		sbb.append("Hello");
		System.out.println("After inserting hello-->"+sbb);
		
		
		sbb.insert(1, "Java");
		System.out.println("After Inserting in sbb-->"+sbb);

		sbb.replace(5,10,"Java");
		System.out.println("After replacing in sbb-->"+sbb);
		
		String sub=sbb.substring(0,5);
		System.out.println("Extracting Hello from sbb-->"+sub);
		System.out.println("Extracting Hello from sbb-->"+sbb.substring(0,5));
		
		String sub1= sbb.substring(5);
		System.out.println("Extracting Hello from sbb-->"+sub1);
		
		//sb.reverse();
		//System.out.println("reversing sbb-->"+sbb);
		
		char ch=sbb.charAt(1);
		System.out.println("charAt-->"+ch);
		
		System.out.println("Length of sbb-->"+sbb.length());
		
		StringBuilder sb4= new StringBuilder();
		System.out.println("Default capacity-->"+sb4.capacity());
		sb4.append("Hello");
		System.out.println("Capacity after appending Hello-->"+sb4.capacity());
		sb4.append("java is my favorite language");
		System.out.println("After inserting characters more than 16-->"+sb4.capacity());
		

/*
 * new capacity = (old capacity *2) +2;
 * newcapacity= (16*2)+2 = 32 +2 =34
 * 
 */

		//ensureCapacity
		StringBuilder sb5= new StringBuilder();
		System.out.println("Default capacity in sb5-->"+sb5.capacity()); //16
		sb5.append("Hello");
		System.out.println("Capacity after appending Hello in sb5-->"+sb5.capacity()); //16
		sb5.append("java is my favorite language");
		System.out.println("After inserting characters more than 16 in sb5-->"+sb5.capacity()); //34
		
		sb5.ensureCapacity(15);
		System.out.println("checking the capacity when the minimumcapacity (15) < current capacity (34)-->"+sb5.capacity());
		
		
		
		sb5.ensureCapacity(50);
		System.out.println("Checking the capacity when the minimum capacity(50) > current capacity(34)-->"+sb5.capacity());
		
		/*
		 * new capacity = (old capacity *2) +2;
		 * newcapacity= (34*2)+2 =68 +2 =70
		 * 
		 */
		

	}
		
	}


