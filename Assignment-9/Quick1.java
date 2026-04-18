public class Quick1 {
    public static void main(String[] args) {
    int []arr = {75,85,55,95,65};
    int low = 0;
    int high = arr.length-1;
    fun(arr,low,high);
    for (int idx = 0; idx < arr.length; idx++) {
        System.out.println(arr[idx]);        
    } 
    }
    public static void fun(int[]arr,int low,int high){
        if (low >= high) {
            return;
        }
        int pivot = pivotfinder(arr,low,high);
        fun(arr,low,pivot-1);
        fun(arr,pivot+1,high);
    }
    public static int pivotfinder(int[]arr,int low,int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j) {
            while (i<=high&&arr[i]<=pivot) {
                i++;
            }
            while (j>=low&&arr[j]>pivot) {
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
            
        }
        int temp = arr[low];
        arr[low]= arr[j];
        arr[j]=temp;
        return j;
        
    }
}
