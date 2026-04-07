public class p5 {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3};
        int k=2;
        int element = 0;
        for (int idx = 0; idx < arr.length; idx++) {
           int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[idx]==arr[j]) {
                    count++;
                    
                }
                
            }
            
            if (count==k) {
                element=arr[idx];
            }
        }
        System.err.println(element);

    }    
}
