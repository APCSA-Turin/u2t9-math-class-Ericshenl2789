import java.util.Scanner;

public class U2T9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the intital velcoity of the projectile: ");
        double velocity = scan.nextDouble();
        System.out.println("Enter the launch angle of the projectile: ");
        double angle = scan.nextDouble();

        Projectile projectile1 = new Projectile(velocity, angle);
        System.out.println("Maximum height reached: " + projectile1.maxHeight());
        System.out.println("Total distance traveled: " + projectile1.distanceTraveled());
        System.out.println("Time of flight: " + projectile1.timeOfFlight());
        
        for (int i = 0; i < (int) projectile1.timeOfFlight(); i ++){
            System.out.println(projectile1.positionAtTime(i));
        }
        System.out.println(projectile1.positionAtTime(projectile1.timeOfFlight()));
    }
}