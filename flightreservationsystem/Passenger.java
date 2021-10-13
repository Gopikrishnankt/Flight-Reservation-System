
package flightreservationsystem;


public class Passenger {
    
   
    
    private static class Address {
        
        private String pStreet;
        private String pCity;
        private String pState;
       
        public String getPStreet()
        {
            return pStreet;
        }
        public String getPCity()
        {
            return pCity;
        }
        public String getPState()
        {
            return pState;
        }
        public void setPState(String state)
        {
            this.pState=state;
        }
        public void setPCity(String city)
        {
            this.pCity=city;
        }
        public void setPStreet(String street)
        {
            this.pStreet=street;
        }
    }
    private static class Contact
    {
        private String pName;
        private String pPhoneNumber;
        private String pEmail;
       
        public String getPName()
        {
            return pName;
        }
        public String getPPhoneNumber()
        {
            return pPhoneNumber;
        }
        public String getPEmail()
        {
            return pEmail;
        }
        public void setPName(String name)
        {
            this.pName=name;
        }
        public void setPPhoneNumber(String phoneNumber)
        {
            this.pPhoneNumber=phoneNumber;
        }
        public void setPEmail(String email)
        {
            this.pEmail=email;
        }
        
    }
}
        
    
  

