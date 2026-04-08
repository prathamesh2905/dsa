

public class p6 {
    public static void main(String[] args) {
        int n = 153;
        int original =n;
        int original2=original;
        int count = 0;
        int sum = 0;
        while (n!=0) {
            count++;
            n=n/10;
        }
        System.out.println(count);

        for(int i = 1;i<count;i++){
            int digit = original%10;
            for (int j = 1; j < count-1; j++) {
                digit *=digit;
            }
            sum+=digit;
        }
        System.out.println(sum);
    }    
}
