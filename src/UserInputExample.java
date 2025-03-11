import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("Your name is "+name+" and Your age is "+30+" ");
        scanner.close();
    }
}
