import java.util.Scanner;
public class Cylinder {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the radius of the cylinder's base: ");

            double radius = input.nextDouble();

            System.out.print("Enter the length of the cylinder: ");

            double length = input.nextDouble();
            double baseArea = Math.PI * radius * radius;
            double volume = baseArea * length;

            System.out.println("The base area of the cylinder is " + baseArea + " square units.");
            System.out.println("The volume of the cylinder is " + volume + " cubic units.");
        }

}
