public class Receptionist extends Person {
    // composition -> Receptionist class HAS A Search and Book object so that it can
    // access its api
    // and also share that with Guest class
    Search seachObj;
    Book bookingObj;

    public void checkInGuest(Guest guest, RoomBooking bookingInfo) {
        // check in the guest
    }

    public void checOutGuest(Guest guest, RoomBooking bookingInfo) {
        // check out the guest
    }
}
