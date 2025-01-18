import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if(L.isEmpty())
            return 0;

        int sum = 0;
        for(int i = 0; i < L.size(); i++){
            sum += L.get(i);
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> results = new java.util.ArrayList<>();
        for(int n : L){
            if(n % 2 == 0 ){
                results.add(n);
            }
        }
        return results;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> results = new java.util.ArrayList<>();
        int size = L1.size();
        if(L2.size() < size)
            size = L2.size();

        for(int i = 0; i < size; i++){
            if(L2.contains(L1.get(i)))
                results.add(L1.get(i));
        }
        return results;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int total = 0;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == c)
                    total++;
            }
        }
        return total;
    }
}
