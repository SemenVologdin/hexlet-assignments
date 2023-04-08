package exercise;

// BEGIN
class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    @Override
    public double getArea() {
        return this.area;
    }
    @Override
    public int compareTo(Home h) {
        return (int) Math.signum(this.getArea() - h.getArea());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
            .append(this.floorCount)
            .append(" этажный коттедж площадью ")
            .append(this.getArea())
            .append(" метров");

        return sb.toString();
    }
}
// END
