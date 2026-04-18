public class Selection1 {
    public static void main(String[] args) {
        int []arr={2,5,8,6,1};
        for (int idx = 0; idx < arr.length-1; idx++) {
            int minIndex = idx;
            for (int j = idx+1; j < arr.length; j++) {
                if (arr[j]<arr[idx]) {
                    minIndex = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[minIndex];
            arr[minIndex]=temp;
            
        }
        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
