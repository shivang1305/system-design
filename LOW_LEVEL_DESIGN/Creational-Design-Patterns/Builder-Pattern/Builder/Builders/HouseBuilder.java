package Builders;

import Product.House;

public interface HouseBuilder {
    // steps to build the house
    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();
}