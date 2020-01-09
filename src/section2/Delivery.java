package section2;

public class Delivery {
    void displayDeliveryDetails(String lnameBowler,String lnameBatsman) {
        /*String[] lnameBowler=bowler.split(" ");
        String[] lnameBatsman=batsman.split(" ");*/
        System.out.println("Player details of the delivery\nBowler : "+lnameBowler);
        System.out.println("Batsman : "+lnameBatsman);
        
    }
    void displayDeliveryDetails(Long runs) {
        System.out.println("Number of runs scored in the delivery :"+runs);
        if(runs==6||runs==4) {
            System.out.println("Its a boundary");
        }
        
    }
}
