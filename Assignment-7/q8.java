public class q8 {
        public static void main(String[] args) {
        int []arr = {3,9,1,7,511};
        int index = 0;

        int min = Maxele(arr,index);
        System.out.println(min);
    }
    static int Maxele(int []arr,int index){
        if (arr.length-1==index) {
            return arr[index];
        }
        return Math.min(arr[index], Maxele(arr, index+1));
    }
}
