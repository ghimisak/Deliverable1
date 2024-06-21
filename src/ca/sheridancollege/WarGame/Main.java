package ca.sheridancollege.WarGame;

import java.util.Scanner;

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
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter player 1 Name: ");
        Players player1 = new Players(in.nextLine());
        System.out.print("Enter player 2 Name: ");
        Players player2 = new Players(in.nextLine());

        game.addPlayer(player1);
        game.addPlayer(player2);
       
    game.play();

    }        

}


