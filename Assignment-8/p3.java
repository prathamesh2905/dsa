


public class p3 {
   public static void main(String[] args) {
       int []arr = {1,1,2,2,2,3,3,3,3,3,3};
       int k = 2;
       int max = 0;
       for (int idx = 0; idx < arr.length; idx++) {
           if (arr[idx]>max) {
            max = arr[idx];
           } 
       }
       int []freq = new int[max+1];

       for (int idx = 0; idx < arr.length; idx++) {
           freq[arr[idx]]++; 
       }
    //     for (int idx = 0; idx < freq.length; idx++) {
    //       System.out.println(freq[idx]);
    //    }

       for (int idx = 0; idx < freq.length; idx++) {
            if (freq[arr[idx]]>k) {
                System.out.println(idx);
            }
           
       }
   } 
}
