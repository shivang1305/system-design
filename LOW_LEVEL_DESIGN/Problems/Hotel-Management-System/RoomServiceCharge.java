public class RoomServiceCharge implements BaseRoomCharge {
    double cost;
    BaseRoomCharge baseRoomCharge;

    public RoomServiceCharge(RoomCharge roomCharge) {
        baseRoomCharge = new RoomCharge();
    }

    @Override
    public Double getCost() {
        return cost + baseRoomCharge.getCost();
    }

}
