public class p3 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,1};
        int index = 0;

        boolean sorted = fun(arr,index);

        System.out.println(sorted);
    }
    static boolean fun(int []arr,int index){
        if (index==arr.length-1) {
            return true;
        }

        boolean issorted = fun(arr,index+1);
        if (issorted==false) {
            return issorted;
        }
        if(arr[index]<arr[index+1]){
            return true;
        }

        return false;
    }
}
