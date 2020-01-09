package section2;

public class MembershipCard extends Card {
    private Integer rating;

    public MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
        super(holderName, cardNumber, expiryDate);
        this.rating=rating;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    void display() {
        System.out.println(getHolderName()+" Membership Card Details:  ");
        System.out.println("Card Number  " + getCardNumber());
        System.out.println("Rating  " + getRating());

    }

}
