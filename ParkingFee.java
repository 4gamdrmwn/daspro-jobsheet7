import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Enter the type of vehicle (1 Car, 2 Motorcycle, 0 Exit): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Enter parking duration (hours): ");
                durasi = input.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) { 
                    total += durasi * 3000;
                } else if (jenis == 2) { 
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total parking fee: Rp. " + total);
        input.close();
    }
}