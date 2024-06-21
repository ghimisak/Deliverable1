package ca.sheridancollege.WarGame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakuraghimire
 */
public class Main {
    public static void main(String[] args) {
        Games game = new Games("War");
        Players player1 = new Players("Player 1");
        Players player2 = new Players("Player 2");

        game.addPlayer(player1);
        game.addPlayer(player2);
       
    game.play();

    }        

}


