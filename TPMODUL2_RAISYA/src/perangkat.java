public class perangkat {
    protected String drive;
    protected int ram;
    protected double prosesor;

    public perangkat(String drive, int ram, double prosesor) {
        this.drive = drive;
        this.ram = ram;
        this.prosesor = prosesor;
    }
    
   public void informasi(){
    System.out.println("Perangkat tidak diketahui memiliki drive tipe"+drive+
    "dengan RAM sebesar"+ram+"GB dan processor secepat"+prosesor+"Ghz");
   }
}