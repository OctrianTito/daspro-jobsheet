import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        boolean exit = true;

        String [][] penonton = new String[4][2];
        while (exit) {
            System.out.println("Menu :");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3) : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = sc.nextInt();
                
                if(baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if(penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                    } else {
                        System.out.println("Kursi telah terisi");
                        System.out.println("Silahkan pilih kursi lainnya");
                    }
                } else 
                    System.out.println("Baris/Kolom tidak tersedia");
                }
                break;

                case 2: {
                    System.out.println("Daftar Penonton");
                    for (int i = 0; i < penonton.length; i++) {
                            if (penonton[i][0] == null) {
                                penonton[i][0] = "***";
                            } else if (penonton[i][1] == null) {
                                penonton[i][1] = "***";
                            } else if (penonton[i][2] == null) {
                                penonton[i][2] = "***";
        
                            }
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                    }
                }
                break;
                
                case 3: {
                System.out.println("Terima kasih banyak!");
                exit = false;
                }
                break;
            } 
        }
    }
}
