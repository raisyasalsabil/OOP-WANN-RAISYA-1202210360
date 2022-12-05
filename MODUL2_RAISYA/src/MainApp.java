public class MainApp {
    public static void main(String[] args) {

        System.out.println("Tidak diketahui");
        Sampan tidaktahu = new Sampan(4, 2000, 0);
        tidaktahu.informasi();
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
        System.out.println("Transportasi Air dengan jenis tidak diketahui berlabuh di pantai");

        System.out.println();

        System.out.println("Sampan");
        Sampan sampan = new Sampan(20, 100000001, 5);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(10);

        System.out.println();

        System.out.println("Kapal");
        Kapal kapal = new Kapal(2500, 10000, "Diesel 10 baling");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(2500);
        kapal.berlabuh();
    }


}
