package CardsDeck;

import java.util.ArrayList;

/**
 * Created by Vitaliy on 21.03.2017.
 */
public class Deck {

    public static ArrayList<Card> cards = new ArrayList<Card>();

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                Card card = new Card(Rank.values[j], Suit.values[i]);
                cards.add(card);
                count++;
            }
        }

/*        for (CardsDeck.Card card : cards) {
            System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
        }*/

        Deck deck = new Deck();
        deck.shuffle();
        deck.order();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();
        deck.drawOne();

    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        ArrayList<Card> cardsRandom = new ArrayList<>();
        ArrayList<Card> cloneCardsRandom = new ArrayList<>();
        
        for (Card card : cards) {
            cardsRandom.add(card);
        }

        for (int i = cardsRandom.size(); i > 0; i--) {
            int random = (int) (Math.random() * i);
            cloneCardsRandom.add(cardsRandom.get(random));
            cardsRandom.remove(random);
        }

/*        for (CardsDeck.Card card : cloneCardsRandom) {
            System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
        }*/

        for (int i = 0; i < cloneCardsRandom.size(); i++) {
            cards.set(i,cloneCardsRandom.get(i));
        }
    }

    /*     * Впорядкування колоди за мастями та значеннями
        * Порядок сотрування:
        * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
        * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
        * Наприклад
        * HEARTS Ace
        * HEARTS King
        * HEARTS Queen
        * HEARTS Jack
        * HEARTS 10
        * HEARTS 9
        * HEARTS 8
        * HEARTS 7
        * HEARTS 6
        * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        int count = 0;
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                Card card = new Card(Rank.values[j], Suit.values[i]);
                cards.set(count,card);
                count++;
            }
        }


    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if (cards.size()==0){
            return false;
        }
        return true;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (hasNext()==true) {
            int size = cards.size()-1;
            //System.out.println(cards.get(size).getSuit().getName() + " " + cards.get(size).getRank().getName());
            Card temp = cards.get(size);
            cards.remove(size);
            return temp;
        }
            return null;

    }
}

