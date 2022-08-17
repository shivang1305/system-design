package Director;

import Builders.*;
import Product.*;

public class CivilEngineer {
    private HouseBuilder houseBuilder;

    // parametrized constructor
    // it will tell the civil engineer which type of house to be build
    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }

    public void constructHouse() {
        // steps civil engineer will follow to build the house
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildInterior();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
    }
}