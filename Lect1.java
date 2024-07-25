public class Lect1 {
    // Find the no. of subarrays whose sum<=k.
    // brute Force Approach
    public static int subArrays(int arr[], int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            long sum = 0;// --> We need to update sum variable again & again so take it in for loop.
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum<=k) count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 1, 4, 8};
        System.out.println(subArrays(arr, 1));
    }
}
