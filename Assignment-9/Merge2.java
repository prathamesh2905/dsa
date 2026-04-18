public class Merge2 {
    public static void main(String[] args) {
        int [] arr = {12,45,1,23,67,90};
        int high = arr.length-1;
        int low = 0;
        fun(arr,low,high);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
}
    public static void fun(int []arr,int low,int high){
        if (low>=high) {
            return;
        }
        int mid = (low+high)/2;

        fun(arr, low, mid);
        fun(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int []arr,int low,int mid,int high){
        int []merged = new int [high-low+1];

        int blue = low;
        int green = mid+1;
        int red = 0;

        while (blue<=mid &&green<=high) {
            if (arr[blue]<=arr[green]) {
                merged[red]=arr[blue];
                red++;
                blue++;
            }else{
                merged[red]=arr[green];
                red++;
                green++;
            }
        }
        while (blue<=mid) {
            merged[red]=arr[blue];
            red++;
            blue++;
        }
        while (green<=high) {
            merged[red]=arr[green];
            red++;
            green++;
        }
        for (int i = 0; i < merged.length; i++) {
            arr[low+i]=merged[i];
        }
    }

}