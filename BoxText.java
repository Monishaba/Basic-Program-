import java.util.Scanner;

class Box {
    double width, height, depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double getVolume() {
        return width * height * depth;
    }
}
public class BoxText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        System.out.println("Enter the depth: ");
        double depth = sc.nextDouble();

        Box box = new Box(width, height, depth);
        System.out.println("Volume of the box: " + box.getVolume());
    }
}