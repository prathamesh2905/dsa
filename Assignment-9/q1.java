class q1{
    public static void main(String[]args){
        int [] arr = {18, 22, 20, 19, 21};
        
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]= temp;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
            
        }
    }
}