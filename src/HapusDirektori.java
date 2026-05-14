import java.io.File;
import java.util.Scanner;

public class HapusDirektori {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama Direktori / Addres : ");
        String namaDirektori = in.nextLine();

        File direktori = new File(namaDirektori);

        if (direktori.exists() && direktori.isDirectory()) {

            File[] daftarFile = direktori.listFiles();
            System.out.println("\n------------------------------------------------------");

            for (File file : daftarFile) {
                if (file.isFile()) {
                    file.delete();
                    System.out.println("File Dihapus : " + file.getName());
                }
            }

            System.out.println("------------------------------------------------------");

            if (direktori.delete()) {
                System.out.println("Direktori (" + direktori.getName() + ") Berhasil Dihapus!!!");
            } 
            else {
                System.out.println("Direktori Gagal Dihapus!!!");
            }

            System.out.println("------------------------------------------------------");

        } 
        
        else {
            System.out.println("Direktori Tidak Ditemukan!!!");
        }

        in.close();
    }

}