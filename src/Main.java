import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // membuat objek motor
        Motor Cbr150 = new Honda();

        // membuat objek user
        driver bambang = new driver(Cbr150);

        // kita coba nyalakan HP-nya
        bambang.nyalakanMesin();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan MOTOR");
            System.out.println("[2] Matikan MOTOR");
            System.out.println("[3] Tambah kecepatan");
            System.out.println("[4] Kurangi Kecepatan");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                bambang.nyalakanMesin();
            } else if (aksi.equalsIgnoreCase("2")){
                bambang.matikanMesin();
            } else if (aksi.equalsIgnoreCase("3")){
                bambang.makeSlow();
            } else if (aksi.equalsIgnoreCase("4")){
                bambang.makeFast();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}