public class Main {
    public static void main(String[] args) {
        ComputadorFactory computadorFactory = new ComputadorFactory();

        Computador mac1 = computadorFactory.getCcomputador(8, 500);
        System.out.println(mac1.toString());
        Computador windows = computadorFactory.getCcomputador(16, 128);
        System.out.println(windows.toString());
        Computador mac2 = computadorFactory.getCcomputador(8, 500);
        System.out.println(mac2.toString());

    }
}
