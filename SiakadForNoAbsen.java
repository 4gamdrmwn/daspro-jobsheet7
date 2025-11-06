import java.util.Scanner;
public class SiakadForNoAbsen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade, highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE;
        int pass = 0, fail = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the grade for student " + i + ":");
            grade = scanner.nextDouble();
            
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            if (grade >= 60) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("The Highest grade: " + highest);
        System.out.println("The Lowest grade: " + lowest);
        System.out.println("Number of students passed: " + pass);
        System.out.println("Number of students failed: " + fail);
        
        scanner.close();
    }
}
