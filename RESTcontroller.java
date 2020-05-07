/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author me
 */
public class RESTcontroller {

    private final List<Player> players = new ArrayList<>();

    public RESTcontroller() {
    players.add(new Player(1,"ion"));
    players.add(new Player(2,"george"));
    }

    public static GetPlayers() {
        @GetMapping
        public List<Players> getPlayers
        
        
            () {
 return players;
        }

        @GetMapping("/{id}")
        public Player getPlayer(@PathVariable("id")int id)
        
        
             {
 return players.stream()
                    .filter(p -> p.getId() == id).findFirst().orElse(null);
        }
    }

    public static AddPlayer() {
        @PostMapping
        public int createPlayer(@RequestParam String name)
        
        
      {
 int id = 1 + players.size();
            players.add(new Player(id, name));
            return id;
        }




    

    public ResponseEntity<String>
            createPlayer(@RequestBody Player player) {
        players.add(player);
        return new ResponseEntity<>(
                "Pplayer added successfully", HttpStatus.CREATED);
    }
}

public static ModifyName(){
 @PutMapping("/{id}")
public ResponseEntity<String> updatePlayer(
 @PathVariable int id, @RequestParam String name) {
 Player player = findById(id);
 if (player == null) {
 return new ResponseEntity<>(
 "Player not found", HttpStatus.NOT_FOUND); 
 }
 player.setName(name);
 return new ResponseEntity<>(
 "name modified successsfully", HttpStatus.OK);
 }}
 
public static DeletePlayer(){
 @DeleteMapping(value = "/{id}")
public ResponseEntity<String> deletePlayer(@PathVariable int id) {
 Player player = findById(id);
 if (player == null) {
 return new ResponseEntity<>(
 "Player not found", HttpStatus.GONE);
 }
 players.remove(player);
 return new ResponseEntity<>("Player removed", HttpStatus.OK);
 }
}
}
