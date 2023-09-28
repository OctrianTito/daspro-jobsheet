import java.util.Scanner;
public class HargaBayar23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHalaman;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan Merk Buku Yang Dibeli : ");
        merkBuku = input.nextLine();
        System.out.println("Masukkan Jumlah Halaman Buku Yang Dipilih : ");
        jmlHalaman = input.nextInt();
        System.out.println("Masukkan Harga Barang Yang Dibeli : ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah Barang Yang Dibeli : ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Diskon Yang Tertera Pada Buku Anda : ");
        dis = input.nextDouble();

        
        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total - jmlDis;

        System.out.println("Diskon Yang Anda Dapatkan Adalah : " + jmlDis);
        System.out.println("Jumlah Yang Harus Dibayar adalah : " + bayar);
        
    }
}