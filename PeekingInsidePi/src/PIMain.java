import java.util.Scanner;

public class PIMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Search in 1 Million digits of Pi");
        System.out.println("2. Search in 1 Billion digits of Pi");
        System.out.println("3. Generate Pi up to N digits");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter sequence to search: ");
                String sequence1M = scanner.nextLine();
                int index1M = PiSearch1M.search(sequence1M);
                System.out.println("Index: " + index1M);
                break;

            case 2:
                System.out.print("Enter sequence to search: ");
                String sequence1B = scanner.nextLine();
                int index1B = PiSearch1B.searchIn1BillionPi(sequence1B);
                System.out.println("Index: " + index1B);
                break;

//            case 3:
//                System.out.print("Enter number of digits to generate: ");
//                int digits = scanner.nextInt();
//                System.out.println("Pi: " + PiGenerator.computePi(digits));
//                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}