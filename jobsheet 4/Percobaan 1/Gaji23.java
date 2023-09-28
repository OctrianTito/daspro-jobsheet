import java.util.Scanner;
public class Gaji23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji, potGaji ;

        System.out.println("Masukkan Jumlah Masuk Hari Kerja Anda : ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Tidak Masuk Hari Kerja Anda : ");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Gaji Harian Anda : ");
        gaji = input.nextInt();
        System.out.println("Masukkan Jumlah Potongan Gaji Anda : ");
        potGaji = input.nextInt();
        
        totGaji = (jmlMasuk*gaji) - (jmlTdkMasuk*potGaji);
        System.out.println("Gaji Yang Anda Terima Adalah : " + totGaji);
    }
}