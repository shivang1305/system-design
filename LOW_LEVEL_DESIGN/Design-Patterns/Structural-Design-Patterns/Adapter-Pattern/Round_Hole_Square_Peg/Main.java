public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println("Round Peg fits the hole: " + roundHole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        // we cannot directly put square peg into round hole as it expects round peg
        // object
        // roundHole.fits(smallSquarePeg);
        // roundHole.fits(largeSquarePeg);

        // therefore we need to use square peg adapter to convert square peg into round
        // peg
        RoundPeg smallRoundPeg = new SquarePegAdapter(smallSquarePeg);
        RoundPeg largeRoundPeg = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Small Round Peg fits the hole: " + roundHole.fits(smallRoundPeg));
        System.out.println("Large Round Peg fits the hole: " + roundHole.fits(largeRoundPeg));
    }
}
