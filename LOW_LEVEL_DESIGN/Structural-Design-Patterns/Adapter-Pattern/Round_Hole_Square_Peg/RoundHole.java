public class RoundHole {
    public double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }
}