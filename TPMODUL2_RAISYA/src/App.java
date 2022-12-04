public class App {
    public static void main(String[] args) throws Exception {
        perangkat perangkat1 = new perangkat("Sandisk", 64, 3.5);
        perangkat1.informasi();
        System.out.println("");

        laptop laptop1 = new laptop("Seagate", 32, 2.4, true);
        laptop1.informasi();
        laptop1.bukagame("Feeding Frenzy");
        laptop1.kirimEmail("hahaha@gmail.com");
        laptop1.kirimEmail("hihihi@gmail.com", "hohoho@gmail.com");
        System.out.println("");

        handphone handphone1 = new handphone("Samsung", 4, 2.4, false);
        handphone1.informasi();
        handphone1.telfon(628495858);
        handphone1.kirimSMS(62747488);
        handphone1.kirimSMS(63747283, 64674847);
        System.out.println("");

    }

}
