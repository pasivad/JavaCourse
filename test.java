import java.util.Date;
import java.util.Scanner;

class test {
    public static void main(String[] args) {

        double y, z, a = -0.5, b = 1.7, t = 0.44;
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        a = in.nextDouble();
        System.out.print("b = ");
        b = in.nextDouble();
        System.out.print("t = ");
        t = in.nextDouble();

        y = Math.exp(-b*t)*Math.sin(a*t+b)-Math.sqrt(Math.abs(b*t+a));       
        System.out.println("Y = " + y);
        z = b*Math.sin(a*Math.pow(t, 2)*Math.cos(2*t))-1;
        System.out.println("Z = " + z);

        Date date = new Date();

        System.out.printf("Current Date: %1$te %1$tB %1$tY\n", date);
        // SimpleDateFormat ft = new SimpleDateFormat ("dd MMMM yyyy");
        // System.out.println("Current Date: " + ft.format(date));
        in.close();
    }
}