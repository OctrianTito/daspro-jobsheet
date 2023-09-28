package Percobaan;
public class ContohVariabel23 {
    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain game online";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;
        System.out.println("Salah satu hobi saya adalah " + salahSatuHobiSayaAdalah);
        System.out.println("Apakah saya pandai? " + isPandai);
        System.out.println("Jenis kelamin saya : " + jenisKelamin);
        System.out.println("Umurku saat ini " + umurSayaSekarang + "tahun");
        System.out.println(String.format("Saya mendapatkan IPK %s pada semester ini, dan tinggi badan saya adalah %s m", $ipk, tinggi));
    }
}