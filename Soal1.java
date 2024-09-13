import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Nilai 1: ");
        int Nilai1 = scanner.nextInt();

        System.out.println("Masukan Nilai 2: ");
        int Nilai2 = scanner.nextInt();

        int nilaiTertinggi = (Nilai1>Nilai2) ? Nilai1:Nilai2;

        System.out.println("Nilai tertinggi adalah "+ nilaiTertinggi);
    }
}
