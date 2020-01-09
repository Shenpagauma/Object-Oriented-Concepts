package section2;

public class PayBackCard extends Card {
    private Integer pointsEarned;
    private Double totalAmount;

    public PayBackCard(String holderName, String cardNumber, String expiryDate,
            Integer pointsEarned, Double totalAmount) {
        super(holderName, cardNumber, expiryDate);
        this.pointsEarned=pointsEarned;
        this.totalAmount=totalAmount;

    }

    public Integer getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(Integer pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    void display() {
        System.out.println(getHolderName()+" Payback Card Details ");
        System.out.println("Card Number  " + getCardNumber());
        System.out.println("Points Earned  " + getPointsEarned());
        System.out.println("TotalAmount  " + getTotalAmount());
    }

}
