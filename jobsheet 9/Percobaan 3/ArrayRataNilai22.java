import java.util.Scanner;
public class ArrayRataNilai22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2Lulus, rataTdkLulus;
        int jmlLulus = 0;
        int jmlTdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int nilaiMhs[] = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            }
        }

        rata2Lulus = totalLulus / jmlLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        rataTdkLulus = totalTdkLulus / jmlTdkLulus;
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);

        sc.close();
    }
}