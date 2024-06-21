package ca.sheridancollege.WarGame;


import ca.sheridancollege.projectStarterCode.Game;
import ca.sheridancollege.projectStarterCode.Card;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakuraghimire
 */
public class Games extends Game {
    private Players player1;
    private Players player2;
    private GroupOfCard deck;

    public Games(String name) {
        super(name);
        deck = new GroupOfCard(52);
    }

    public void addPlayer(Players player) {
        if (getPlayers().size() < 2) {
            getPlayers().add(player);
        } else {
            System.out.println("The game already has two players.");
        }
    }

    public void dealCards() {
        ArrayList<Card> cards = deck.getCards();
        for (int i = 0; i < cards.size(); i++) {
            if (i % 2 == 0) {
                player1.addCard(cards.get(i));
            } else {
                player2.addCard(cards.get(i));
            }
        }
    }

    @Override
    public void play() {
        player1 = (Players) getPlayers().get(0);
        player2 = (Players) getPlayers().get(1);

        dealCards();
        System.out.println("Player 1 cards: " + player1.getHand());
        System.out.println("Player 2 cards: " + player2.getHand());
        
        System.out.println(player1.getHand().size());

        int counter = 0;
        while (!player1.getHand().isEmpty() && !player2.getHand().isEmpty()) {
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println(player1.getName() + " plays " + card1);
            System.out.println(player2.getName() + " plays " + card2);

            int result = compareCards(card1, card2);
            if (result > 0) {
                System.out.println(player1.getName() + " wins the round.");
                player1.addCard(card1);
                player1.addCard(card2);
            } else if (result < 0) {
                System.out.println(player2.getName() + " wins the round.");
                player2.addCard(card1);
                player2.addCard(card2);
            } else {
                System.out.println("It's a tie!");
                // Handle tie case
            }
            
            if (counter == 10)
            {
                declareWinner();
                break;
            }
            counter++;
        }
    }

    private int compareCards(Card card1, Card card2) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int rank1 = 0, rank2 = 0;

        for (int i = 0; i < ranks.length; i++) {
            if (ranks[i].equals(((Cards) card1).getRank())) {
                rank1 = i;
            }
            if (ranks[i].equals(((Cards) card2).getRank())) {
                rank2 = i;
            }
        }

        return Integer.compare(rank1, rank2);
    }

    @Override
    public void declareWinner() 
    {
        if (player1.getHand().size() > player2.getHand().size())
        {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player1.getHand().size() < player2.getHand().size())
        {
            System.out.println(player2.getName() + " wins the game!");
        }
        else {
            System.out.println("The game is a draw!");
        }
    }

}

