import java.util.*;

public class RoomBooking {
    String bookingId;
    Date startDate;
    int durationInDays;
    BookingStatus bookingStatus;
    List<Guest> guestList;

    // total cost = base room charges + extra room service charge + in-room
    // purchases
    BaseRoomCharge totalRoomCharge;
}
