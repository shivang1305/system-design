public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter() {
        super();
    }

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getSide() * Math.sqrt(2) / 2; // formula to get radius of square (i.e. length of daigonal / 2)
    }
}
