public class p2 {
    public static void main(String[] args) {
        int []arr = {1,2,2,3,2,2};
        int t = 7;
        int i = 0;
        int oc = fun(arr,t,i);
        System.out.println(oc);
    }
    static int fun(int[]arr,int t,int i){
        if (i==arr.length) {
           return 0; 
        }
        int count = fun(arr,t,i+1);

        if (t==arr[i]) {
            count++;
            return count;
        }
        return count;
    }
}
