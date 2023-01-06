public class Cabinet {
    private int length;
    private int width;
    private int height;
    private MebelEnum mebelEnum;


    public MebelEnum getMebelEnum() {
        return mebelEnum;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Cabinet(int length, int width, int height, MebelEnum mebelEnum, String kraska) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.mebelEnum = mebelEnum;
    }

}
