import java.util.Arrays;

public class pairDifference {
    // Brute Force
    public static int pairDiff(int arr[], int k){
        int count = 0;
        Arrays.sort(arr);
        for (int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if((arr[j]-arr[i]) <=k)
                    count++;
            }
        }
        return count;
    }
    // Optimized
    public static int diffPairs(int arr[], int k){
        int count = 0;
        Arrays.sort(arr);
        for(int i=0, j=0; j<arr.length; j++){
            int d = arr[j] - arr[i];
            while (d>k) {
                i++;
                d = arr[j] - arr[i];
            }
            count+= (j-i+1);
        }
        return (count-arr.length);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2};
        System.out.println(diffPairs(arr, 2));

    }
}
