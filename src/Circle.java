public class Circle {
    Point center;
    double radius;
    public Circle(Point point , double radius) {
        center = point;
        this.radius = radius;
    }
    public boolean intersect(Point center,double radius){
        double d = Math.sqrt(Math.pow(this.center.x - center.x,2)+Math.pow(this.center.y - center.y,2));
        if (d <this.radius+radius){
            return true;
        } else if (d>this.radius+radius){
            return false;
        }
        else return true;
    }
}
