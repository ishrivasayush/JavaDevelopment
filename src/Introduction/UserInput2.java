package Introduction;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.useRadix(2);      //Convert binary to decimal
        int n=scanner.nextInt();
        System.out.println(n);

    }
}
