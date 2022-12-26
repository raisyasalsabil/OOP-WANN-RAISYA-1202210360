import javax.swing.event.SwingPropertyChangeSupport;

public class Calculation implements Runnable{
    private final double radius;
    private final double side;
    private final double area;
    static double phi = 3.14;

    public Calculation (double radius, double side, double area){
        this.radius = radius;
        this.side = side;
        this.area = area;
    }

}

@Override
public void run() {

    while (true) {
        getSquare();
        try {
            System.out.println("Program will start in");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setSquare() {
        System.out.println("Enter the length of the side of the square: " + this.side);
        System.out.println("The calculation result: " +side*side);
}

    public void getSquare(){
        return area
    }

    public void setCircle(){
        System.out.println("Enter the radius of the circle" +this.radius);
        System.out.println("The calculation result: " +phi * radius);
    }   

    public void getCircle(){
        return area
    }

    public void setTrapezoid(){
        System.out.println("Insert the side of the base of the trapezoid: ");
        System.out.println("Enter the upper side of the trapezoid: ");
        System.out.println("Enter the height of the trapezoid: " );
    }

    public void getTrapezoid(){
        return area
    }
}