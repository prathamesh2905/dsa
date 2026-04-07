//check if all elements are even
class p4{
    public static void main(String[] args) {
        int []arr = {2,4,6,5};
        int count=0;
        int index=0;

        boolean iseven = fun(arr,count,index);
        System.out.println(iseven);
    }
    static boolean fun(int []arr,int count ,int index){
        if (arr.length==index) {
            if (count==arr.length) {
                return true;
            }else{
                return false;
            }
        }
        if (arr[index]%2==0) {
            count++;
        }
        return fun(arr,count,index+1);
    }
}