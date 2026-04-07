public class p2 {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3,3,3,3};
        int k = 2;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    
                }
            }
            
            if (count>k) {
               element=arr[i];
               System.out.println(element);
               
            }
        }
        
        
    }
}
