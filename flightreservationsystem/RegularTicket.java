
package flightreservationsystem;


public class RegularTicket extends Ticket {
    
    public RegularTicket(String pnrNumber, String depLocation, String desLocation, String flightName, String seatNumber, double ticketPrice, boolean isCancelled) {
        super(pnrNumber, depLocation, desLocation, flightName, seatNumber, ticketPrice, isCancelled);
    }
    
}
