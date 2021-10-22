public class Honda implements Motor {

    private int kecepatan;
    private boolean MesinMenyala;

    public Honda() {
        // set volume awal
        this.kecepatan = 0;
    }

    @Override
    public void nyalakanMesin() {
        MesinMenyala = true;
        System.out.println("Mesin menyala...");
        System.out.println("Selamat mengendarai Motor , hati hati dijalan");
        System.out.println("Honda CBR150");
    }

    @Override
    public void matikanMesin() {
        MesinMenyala = false;
        System.out.println("Mesin dimatikan");
    }

    @Override
    public void kurangiKecepatan() {
        if (MesinMenyala) {
            if (this.kecepatan == MAX_KECEPATAN) {
                System.out.println("anda rusuh ,silahkan rem demi keselamatan");
                System.out.println("kecepatan mencapai " + this.getKecepatan() + "KM/JAM");
            } else {
                this.kecepatan += 10;
                System.out.println("Kecepatan sekarang: " + this.getKecepatan());
            }
        } else {
            System.out.println("Silahkan baca di manualbook untuk mengetahui bagaimana caramenyalakan motor");
        }
    }

    @Override
    public void tambahKecepatan() {
        if (MesinMenyala) {
            if (this.kecepatan == MIN_KECEPATAN) {
                System.out.println("Kecepatan = 0 KM/JAM");
            } else {
                this.kecepatan -= 10;
                System.out.println("Kecepatan anda : " + this.getKecepatan());
            }
        } else {
            System.out.println("Silahkan baca di manualbook untuk mengetahui bagaimana cara menyalakan motor");
        }
    }

    public int getKecepatan() {
        return this.kecepatan;
    }

}