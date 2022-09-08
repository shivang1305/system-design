import Builders.HouseBuilder;
import Builders.IglooBuilder;
import Director.CivilEngineer;
import Product.*;

public class Main {
    public static void main(String[] args) {
        // we want to build a house of type igloo
        HouseBuilder iglooBuilder = new IglooBuilder();

        // tell that to our director i.e. Civil Engineer
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        // engineer constructs the house
        engineer.constructHouse();

        // house creation done, just fetch the house
        House house = engineer.getHouse();

        // print the house
        System.out.println("House constructed " + house);
    }
}
