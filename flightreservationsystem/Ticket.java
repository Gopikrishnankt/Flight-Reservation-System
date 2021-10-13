
package flightreservationsystem;


public abstract class Ticket {
    public String pnrNumber;
    public String depLocation;
    public String desLocation;
    public String flightName;
    public String seatNumber;
    public double ticketPrice;
    public boolean isCancelled;
    
    Ticket(String pnrNumber,String depLocation,String desLocation, String flightName,String seatNumber,double ticketPrice,
  boolean isCancelled)
    {
        this.pnrNumber=pnrNumber;
        this.depLocation=depLocation;
        this.desLocation=desLocation;
        this.flightName=flightName;
        this.seatNumber=seatNumber;
        this.ticketPrice=ticketPrice;
        this.isCancelled=isCancelled;
    }
    public  void getPassengerDetails(){}
    public  void getStatus(){}
    public  void cancelTicket(){}
}
