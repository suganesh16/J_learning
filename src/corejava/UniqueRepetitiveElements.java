package corejava;
import java.util.*;
public class UniqueRepetitiveElements {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(40);
        numbers.add(70);
        numbers.add(70);
        numbers.add(10);
        numbers.add(15);
        
        List<Integer> uniqueElements = new ArrayList<>();
        List<Integer> repetitiveElements = new ArrayList<>();
        
        Set<Integer> uniqueSet = new HashSet<>();
        
        for (int num : numbers) {
            if (uniqueSet.contains(num)) {
                repetitiveElements.add(num);
            } else {
                uniqueSet.add(num);
                uniqueElements.add(num);
            }
        }
        
        System.out.println("Unique elements: " + uniqueElements);
        System.out.println("Repetitive elements: " + repetitiveElements);
	}

}
