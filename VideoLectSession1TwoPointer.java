public class VideoLectSession1TwoPointer {
    // Two pointer Algorithm
    public static int twoPointer(int arr[], int k){
        int count = 0;
        int sum=0;
        for(int i=0, j=0; j<arr.length; j++){
            sum+=arr[j];
            while(sum>k){
                sum-= arr[i];
                i++;
            }
            count+=(j-i+1);
        }

        return count;
    }
    public static void main(String[] args) {
    int arr[] = {1,1,2,2,1,1};
        System.out.println(twoPointer(arr, 4));
    }
}
