import java.io.File;
import java.util.Scanner;

public class UkuranFile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama File : ");
        String namaFile = in.nextLine();

        File file = new File(namaFile);

        if (file.exists() && file.isFile()) {

            double ukuranByte = file.length();
            double ukuranKB = ukuranByte / 1024.0;
            double ukuranMB = ukuranKB / 1024.0;

            System.out.println("\n------------------------------------");
            System.out.println("Nama File : " + file.getName());
            
            if (ukuranMB < 1) {
                System.out.printf("Ukuran File : %.2f KB%n", ukuranKB);
            } else {
                System.out.printf("Ukuran File : %.2f MB%n", ukuranMB);
            }

            System.out.println("------------------------------------");

        } 
        
        else {
            System.out.println("File Tidak Ditemukan!!!");
        }

        in.close();
    }

}