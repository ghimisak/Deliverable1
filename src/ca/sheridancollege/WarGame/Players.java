package ca.sheridancollege.WarGame;


import ca.sheridancollege.projectStarterCode.Player;
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
public class Players extends Player {
    private ArrayList<Card> hand;

    public Players(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    @Override
    public void play() {
        // Implementation specific to the game logic
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}