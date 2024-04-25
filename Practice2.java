import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, a, b ,c ,d, e;
            System.out.println("Enter a 5 digit number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        sum = a + b + c + d + e;
        System.out.println(sum);
    }
    
}
