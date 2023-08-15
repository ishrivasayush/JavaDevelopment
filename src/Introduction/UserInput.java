import java.util.Scanner;
public class UserInput
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter two values:");
int a=scan.nextInt();
int b=scan.nextInt();
int c=a+b;
System.out.println(c);


System.out.println("May I know your Name: ");
scan.nextLine();
String name=scan.nextLine();
System.out.println("Welcome "+ name);

}
}