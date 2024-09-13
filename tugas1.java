import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        // Scanner input bilangan pertama
        Scanner input = new Scanner(System.in);

        // Meminta input bilangan pertama
        System.out.println("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        // Meminta input bilangan kedua
        System.out.println("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        // Menentukan bilangan terkecil
        int bilanganTerkecil;

        if (bilangan1 < bilangan2) {
            bilanganTerkecil = bilangan1;
        } else {
            bilanganTerkecil = bilangan2;
        }

        // Menampilkan hasil
        System.out.println("Bilangan terkecil adalah: " + bilanganTerkecil);
    }
}
