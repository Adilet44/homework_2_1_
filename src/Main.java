public class Main {
    public static void main(String[] args) {
        Cabinet_3 cabinet_3 = new Cabinet_3("fizik");
        Cabinet_1 objectA = new Cabinet_1(12, 25, 3, MebelEnum.DEVAN, "black", 21, cabinet_3);
        objectA.getInfo();
        objectA.getInfo2();
        Cabinet_3 cabinet_3_ = new Cabinet_3("Algebra");
        Cabinet_2 objectB = new Cabinet_2(14, 63, 2, MebelEnum.STOL, "yellow", 12, cabinet_3_, "wid");
        objectB.getInfo();
        objectB.getInfo2();

        Cabinet_3 cabinet_31 = new Cabinet_3("english");
        Cabinet_2 c2 = new Cabinet_2(56, 36, 4, MebelEnum.KRESLO, "red", 32, cabinet_31, "blue");
        c2.getInfo();
        c2.getInfo2();
    }
}



