import java.time.LocalDateTime;

public class Transaction {
    Artifact soldArt;
    LocalDateTime timeStamp;
    Stakeholder seller;
    Stakeholder buyer;
    Stakeholder auctionHouse;
    Double price;

    public Transaction(Artifact soldArt, LocalDateTime timeStamp, Stakeholder seller, Stakeholder buyer, Stakeholder auctionHouse, double price) {
        this.soldArt = soldArt;
        this.timeStamp = timeStamp;
        this.seller = seller;
        this.buyer = buyer;
        this.auctionHouse = auctionHouse;
        this.price = price;
    }

    public String toString() {
        String result =  soldArt + ", " + timeStamp + ", " + seller + ", " + buyer + ", " + auctionHouse + ", " + price;
        return result;
    }

    public Artifact getSoldArt() {
        return soldArt;
    }

    public void setSoldArt(Artifact soldArt) {
        this.soldArt = soldArt;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Stakeholder getSeller() {
        return seller;
    }

    public void setSeller(Stakeholder seller) {
        this.seller = seller;
    }

    public Stakeholder getBuyer() {
        return buyer;
    }

    public void setBuyer(Stakeholder buyer) {
        this.buyer = buyer;
    }

    public Stakeholder getAuctionHouse() {
        return auctionHouse;
    }

    public void setAuctionHouse(Stakeholder auctionHouse) {
        this.auctionHouse = auctionHouse;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
