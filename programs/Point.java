public class Point {
    private int x;
    private int y;
    public Point(int startx, int starty) {
        this.x = startx;
        this.y = starty;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public double distance(Point otherPt) {
        int dx = this.x - otherPt.getX();
        int dy = this.y - otherPt.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = new Point(6,8);
        System.out.println(p1.distance(p2));
    }
}