import java.util.Scanner;
public class PemilihanPercobaan222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.print("Nilai UAS     :");
        float uas = input22.nextFloat();
        System.out.print("Nilai UTS     :");
        float uts = input22.nextFloat();
        System.out.print("Nilai kuis    :");
        float kuis = input22.nextFloat();
        System.out.print("Nilai tugas   :");
        float tugas = input22.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        System.out.println("Nilai total anda adalah : " + total);
        
       if (total > 80) {
        System.out.print("Nilai anda A");
       } else if (total <= 80) {
        System.out.print("Nilai anda B+");
       } else if (total <= 73) {
        System.out.print("Nilai anda B");
       } else if (total <= 65) {
        System.out.print("Nilai anda C+");
       } else if (total <= 60) {
        System.out.print("Nilai anda C");
       } else if (total <= 50) {
        System.out.print("Nilai anda D");
       } else if (total <= 39) {
        System.out.print("Nilai anda E");
       }
    }
}