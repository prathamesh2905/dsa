class p1{
    public static void main(String[] args) {
        int []arr={5,2,3,2,5};
        int target = 2;
        int index = 0;
        int first_occurance = fun(arr,target,index);
        System.out.println(first_occurance);
    }
    static int fun(int []arr,int target,int index){
        if (target==arr[index]) {
            return index;
        }

        return fun(arr,target,index+1);
    }
}