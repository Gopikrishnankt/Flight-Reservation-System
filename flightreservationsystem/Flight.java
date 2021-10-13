
package flightreservationsystem;

public class Flight {
    
    public String flightType;
    public int flightCapacity;
    public String flightNumber ;
    public String airlineName;
    public int numberOfSeats;
    
    public void showflightDetails() 
    {
        
    }
    public boolean seatAvailable()
    {
        return numberOfSeats != 0;
    }
    public void bookSeats() 
    {
        System.out.println("Seat Booked");
        updateSeatNos();
    }
    public void updateSeatNos()
    {
       numberOfSeats=numberOfSeats+1; 
    }
}
