package assignment;

public class WordCount {

	    public static void main(String[] args) {
	        String sentence = "Hello world java";

	        int wordCount = countWords(sentence);
	        System.out.println("Number of words: " + wordCount);
	    }

	    public static int countWords(String sentence) {
	        if (sentence == null || sentence.isEmpty()) {
	            
	            
	        }

	        String[] words = sentence.trim().split("\\s+");
	        return words.length;
	    }
	}

	

