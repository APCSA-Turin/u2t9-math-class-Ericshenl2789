public class Projectile {
    final double GRAVITY = 9.81;
    private double initalVelocity;
    private double launchAngle;

    public Projectile(double iV, double lA){
        initalVelocity = iV;
        launchAngle = lA;
    }

    public double maxHeight(){
        return Math.pow(initalVelocity * Math.sin(Math.toRadians(launchAngle)), 2) / (2 * GRAVITY);
    }

    public double timeOfFlight() {
        return (2 * initalVelocity * Math.sin(Math.toRadians(launchAngle))) / GRAVITY;
    }

    public double distanceTraveled() {
        return (Math.pow(initalVelocity, 2) * Math.sin(Math.toRadians(2 * launchAngle))) / GRAVITY;
    }

    public String positionAtTime(double time) {
        double x = initalVelocity * time * Math.cos(Math.toRadians(launchAngle));
        double y = (initalVelocity * time * Math.sin(Math.toRadians(launchAngle))) - (0.5 * GRAVITY * Math.pow(time, 2));
        return "At t = " + time + " seconds, x = " + x + " meters and y = " + y + " meters.";
    }
}
