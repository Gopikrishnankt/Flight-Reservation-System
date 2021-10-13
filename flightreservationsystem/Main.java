package flightreservationsystem;


public class Main {
   public static void main(String args[])
   {
       RegularTicket regular= new RegularTicket("10987", "Delhi", "Mumbai", "Indigo", "06", 0, false);
       TouristTicket tourist = new TouristTicket("108907", "Shimla", "Jammu", "Spicejet", "27", 0, true);
       printTicketDetails(tourist);
       printTicketDetails(regular);
   }
    
   public static void printTicketDetails(Ticket ticket )
   {
       String pnr=ticket.pnrNumber;
       System.out.println(pnr);
   }
}