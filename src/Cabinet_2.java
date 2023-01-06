public final class Cabinet_2 extends Cabinet_1{
    private String kraska;

    public String getKraska() {
        return kraska;
    }

    public Cabinet_2(int length, int width, int height, MebelEnum mebelEnum, String kraska, int window, Cabinet_3 cabinet_3, String kraska1) {
        super(length, width, height, mebelEnum, kraska, window, cabinet_3);
        this.kraska = kraska1;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("sdgudg");
    }

}
