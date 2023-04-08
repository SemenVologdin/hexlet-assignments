package exercise;

// BEGIN
class Segment {

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getMidPoint() {
        int midX = (p1.getX() + p2.getX()) /2;
        int midY = (p1.getY() + p2.getY()) /2;

        return new Point(midX, midY);
    }

    public Point getBeginPoint() {
        return p1;
    }

    public Point getEndPoint() {
        return p2;
    }
}
// END
