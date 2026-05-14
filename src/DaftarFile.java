import java.io.File;
import java.util.Scanner;

public class DaftarFile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama Direktori / Addres : ");
        String namaDirektori = in.nextLine();

        File direktori = new File(namaDirektori);
        
        if (direktori.exists() && direktori.isDirectory()) {

            File[] daftarFile = direktori.listFiles();

            System.out.println("\n------------------------------------");
            System.out.println("Daftar File di Direktori : " + direktori.getName());
            System.out.println("------------------------------------");

            for (File file : daftarFile) {
                System.out.println(file.getName());
            }

            System.out.println("------------------------------------");

        } 
        
        else {
            System.out.println("Direktori Tidak Ditemukan!!!");
        }

        in.close();

    }


}