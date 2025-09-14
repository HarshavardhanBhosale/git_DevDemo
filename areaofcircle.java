import java.util.*;

public class areaofcircle {
    public static void main (String [] args) {
        Scanner a = new Scanner (System.in);
        float rad = a.nextFloat();

        float Area = (3.14f * rad * rad );
        System.out.print("Area of circle: ");
        System.out.print(Area);

    }
    
}
