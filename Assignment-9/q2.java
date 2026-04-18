public class q2 {
    public static void main(String[] args) {
        int []arr = {12,34,56,45,23};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int midIndex = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[midIndex]){
                    midIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[midIndex];
            arr[midIndex]=temp;
        }        
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
        }
    }
    
}
