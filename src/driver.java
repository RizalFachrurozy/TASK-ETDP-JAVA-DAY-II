public class driver {

    private Motor motor;

    public driver(Motor motor) {
        this.motor = motor;
    }

    void nyalakanMesin(){
        this.motor.nyalakanMesin();
    }

    void matikanMesin(){
        this.motor.matikanMesin();
    }

    void makeFast(){
        this.motor.tambahKecepatan();
    }

    void makeSlow(){
        this.motor.kurangiKecepatan();
    }
}