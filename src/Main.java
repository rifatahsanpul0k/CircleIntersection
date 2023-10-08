import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input for the first circle
        System.out.println("Enter X, Y, and the radius of the 1st Circle:");
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();
        System.out.print("Radius: ");
        double radius = scan.nextDouble();

        // Create the first circle
        Point center1 = new Point(x, y);
        Circle c1 = new Circle(center1, radius);

        // Input for the second circle
        System.out.println("Points and the radius of Circle 2:");
        System.out.print("X: ");
        int x1 = scan.nextInt();
        System.out.print("Y: ");
        int y1 = scan.nextInt();
        System.out.print("Radius: ");
        double radius2 = scan.nextDouble();
        Point center2 = new Point(x1, y1);
        Circle c2 = new Circle(center2, radius2);

        // Check if the two circles intersect and print the result
        boolean doIntersect = c1.intersect(center2, radius2);
        if (doIntersect) {
            System.out.println("Two Circles intersect at two points.");
        } else {
            System.out.println("Two Circles do not intersect.");
        }
    }
}