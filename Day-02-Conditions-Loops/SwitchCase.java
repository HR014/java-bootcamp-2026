import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose (1-3): ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Pizza");
                break;

            case 2:
                System.out.println("Burger");
                break;

            case 3:
                System.out.println("Sandwich");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}