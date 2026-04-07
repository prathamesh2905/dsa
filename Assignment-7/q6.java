//Chevk if any number is Negative

public class q6 {
    public static void main(String[] args) {
        int []arr = {1,2,-3,4};
        int index = 0;
        boolean Negative = isNegative(arr,index);
        System.out.println(Negative);
    }
    static boolean  isNegative(int []arr,int index){
        if (index==arr.length) {
            return false;
        }
        boolean ans = isNegative(arr, index+1);
        
        if(arr[index]<0){
            ans=true;
            return ans;
        }
        return ans;
    }
}