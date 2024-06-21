package ca.sheridancollege.WarGame;

import ca.sheridancollege.projectStarterCode.GroupOfCards;
import ca.sheridancollege.projectStarterCode.Card;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakuraghimire
 */

public class GroupOfCard extends GroupOfCards {

    public GroupOfCard(int size) {
        super(size);
        cards = new ArrayList<>(size);
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Cards(suit, rank));
            }
        }

        shuffle();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public ArrayList<Card> getCards() {
        return cards;
    }
}