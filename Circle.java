public class Circle {
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    /* Returns the area of the circle with given radius
       Area of a circle = pi * r ^ 2
       Use Math.PI for pi and use the pow method
     */
    public double area() {
        return Math.PI * radius * radius;
    }
  
    /* Returns the circumference of the circle with given radius
       Circumference of a circle = pi * 2 * r
       Use Math.PI for pi
     */
    public double circumference() {
        return Math.PI * 2 * radius;
    }
  
    /* Setter method to update the radius of the circle to newRadius
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
  
    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
       see example output below (Reminder: the new line escape
       sequence \n allows you to include new lines in Strings)
       This method should call your other methods as appropriate.
     */
    public String getInfo() {
        String info = "radius = " + radius;
        info += "\narea = " + area(); 
        info += "\ncircumference = " + circumference();
        return info;
    }
  }
  
  