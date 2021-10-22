public interface Motor {
    int MAX_KECEPATAN = 100;
    int MIN_KECEPATAN = 0;

    void nyalakanMesin();
    void matikanMesin();
    void tambahKecepatan();
    void kurangiKecepatan();
}