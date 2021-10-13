
package flightreservationsystem;


public class TouristTicket extends Ticket {
    
    public TouristTicket(String pnrNumber, String depLocation, String desLocation, Flight flightName, String seatNumber, double ticketPrice, boolean isCancelled) {
        super(pnrNumber, depLocation, desLocation, flightName, seatNumber, ticketPrice, isCancelled);
    }
    
}
