class q7{
    public static void main(String[] args) {
        int []arr = {3,9,1,7,511};
        int index = 0;

        int max = Maxele(arr,index);
        System.out.println(max);
    }
    static int Maxele(int []arr,int index){
        if (arr.length-1==index) {
            return arr[index];
        }
        return Math.max(arr[index], Maxele(arr, index+1));
    }
}