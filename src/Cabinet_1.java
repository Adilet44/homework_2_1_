public class Cabinet_1 extends Cabinet{
    private int window;
    private Cabinet_3 cabinet_3;

    public Cabinet_3 getCabinet_3() {
        return cabinet_3;
    }

    public int getWindow() {
        return window;
    }

    public Cabinet_1(int length, int width, int height, MebelEnum mebelEnum, String kraska ,int window, Cabinet_3 cabinet_3) {
        super(length, width, height,mebelEnum,kraska);
        this.cabinet_3 = cabinet_3;
        this.window = window;
    }
    public void getInfo(){
        System.out.println("footbal");

    }
final public void getInfo2(){
    System.out.println("car");

}



}

