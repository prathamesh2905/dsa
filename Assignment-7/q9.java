public class q9 {
    public static void main(String[] args) {
        int []arr= {10,20,30,40,50,60};
        int index = 0;
        int sum = 0;

        int oddsum = Oddsum(arr,sum,index);
        System.out.println(oddsum);
    }
    static int Oddsum(int[]arr,int sum,int index){
        if(arr.length==index){
            return sum;
        }
        if (index%2==1) {
            sum+=arr[index];
        }
        return Oddsum(arr, sum, index+1);
    }
}
