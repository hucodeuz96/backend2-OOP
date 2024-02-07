package personBaza;

import java.util.Scanner;

public class Card {
    private Long id;
    private String bankName;
    private Long cardNumber;
    private String expireDate;
    static Scanner sc = new Scanner(System.in);

    // fn+alt+insert yoki bu  alt+insert --> get set lar uchun
    static Long cardId = 1L;
    static Card [] cards = new Card[100];

    public static void createCard(){
        Card card = new Card();
        System.out.print("bank :");
        card.setBankName(sc.nextLine());
        System.out.print("number :");
        card.setCardNumber(sc.nextLong());
        sc = new Scanner(System.in);
        System.out.print(" muddati :");
        card.setExpireDate(sc.nextLine());
        card.setId(cardId++);
        for (int i = 0; i < cards.length; i++) {
            if (cards[i]==null){
                cards[i]=card;
                break;
            }
        }
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", cardNumber=" + cardNumber +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }

    public static  void getAllCard(){
        for (Card card : cards) {
            if (card!=null) {
                System.out.println(card.toString());
            }
        }
    }
}
