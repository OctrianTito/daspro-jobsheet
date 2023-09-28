import java.util.Scanner;
public class Tugas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, abs, kls, prodi, jurusan;

        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("Absen      : ");
        abs = sc.nextLine();
        System.out.print("Kelas      : ");
        kls = sc.nextLine();
        System.out.print("Prodi      : ");
        prodi = sc.nextLine();
        System.out.print("Jurusan    : ");
        jurusan = sc.nextLine();

        System.out.println("***** IDENTITAS DIRI *****");
        System.out.println("Nama = " + nama);
        System.out.println("Absen = " + abs);
        System.out.println("Kelas = " + kls);
        System.out.println("Prodi " + prodi);
        System.out.println("Jurusan = " + jurusan);
    }
}