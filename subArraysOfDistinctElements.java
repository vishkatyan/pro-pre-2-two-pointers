import java.util.HashMap;

public class subArraysOfDistinctElements {
    public static int distinctElements(int b[], int k){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            HashMap<Integer, Integer> g = new HashMap<>();
            for (int j = i; j < b.length; j++) {
                g.put(b[j], g.getOrDefault(b[j], 0) + 1);
                long d = g.size();
                if (d <= k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int b[] = {1, 2, 1, 3, 4};
        System.out.println(distinctElements(b, 3));
    }
}

