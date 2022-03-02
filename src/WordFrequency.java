import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void numberedFrequency(String[] sentence){
		int count;
		HashMap<String, Integer> wordFrequencies = new HashMap<>();
		for (String word: sentence) {
			count = wordFrequencies.containsKey(word) ? wordFrequencies.get(word) : 0;
			wordFrequencies.put(word,count+1);
		}
		wordFrequencies.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
				.forEach(entry -> System.out.println(entry.getValue()+" "+entry.getKey()));
	}

	public static void main(String[] args) {
		WordFrequency.numberedFrequency(args);
	}

}
