import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int original_no = n;
        int rev = 0;
        while (n!=0) {
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        if (original_no==rev) {
            System.out.println("Number is  Palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
