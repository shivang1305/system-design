import java.util.*;

public class Guest extends Person {
    // composition -> Guest class HAS A Search and Book object so that it can access
    // its api
    // and also share that with Receptionist class
    Search seachObj;
    Book bookingObj;

    public List<RoomBooking> getAllRoomBookings() {
        // get the list of all the booked rooms
        return new ArrayList<>();
    }
}
