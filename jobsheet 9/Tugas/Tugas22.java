import java.util.Scanner;
public class Tugas22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlElemen;

        System.out.print("Masukkan jumlah elemen : ");
        jmlElemen = sc.nextInt();
        int arr[] = new int[jmlElemen];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + " : " + arr[i]);
        }

        int jmlNilai = 0;
        int nilaiRata2 = 0;

        for (int i = 0; i < arr.length; i++) {
            jmlNilai += arr[i];
            nilaiRata2 = jmlNilai / arr.length;
        }

        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > nilaiTertinggi) {
                nilaiTertinggi = arr[i];
            }
            if (arr[i] < nilaiTerendah) {
                nilaiTerendah = arr[i];
            }
        }
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah : " + nilaiTerendah);
        System.out.println("Rata-rata : " + nilaiRata2);
    }
}