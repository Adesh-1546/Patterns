import java.util.Scanner;

public class MenuPattern {
	public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a pattern:");
        System.out.println("1. Right-Angled Triangle");
        System.out.println("2. Pyramid");
        System.out.println("3. Butterfly");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        
        switch (choice) {
        case 1:
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                    Thread.sleep(100);
                }
                System.out.println();
            }
            break;

        case 2:
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) System.out.print(" ");
                for (int k = 1; k <= (2*i - 1); k++) {
                    System.out.print("*");
                    Thread.sleep(50);
                }
                System.out.println();
            }
            break;
        case 3:
            // Butterfly top half
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    Thread.sleep(50);
                }
                for (int j = 1; j <= 2*(n-i); j++) System.out.print(" ");
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    Thread.sleep(50);
                }
                System.out.println();
            }
            // Bottom half
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    Thread.sleep(50);
                }
                for (int j = 1; j <= 2*(n-i); j++) System.out.print(" ");
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    Thread.sleep(50);
                }
                System.out.println();
            }
            break;
        default:
            System.out.println("Invalid choice!");
    }

    sc.close();
}


}
