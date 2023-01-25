package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T> { //T: SoccerPlayer, FootballPlayer, BaseballPlayer

    private String name;

    private List<T> members = new ArrayList<T>(); //polymorphism for Player: we can put players for Baseball, Soccer, etc.

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //method
    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(((Player)player).getName()+" is already in the team");
            return false;
        }else{
            members.add(player);
            System.out.println(((Player)player).getName()+" picked for team" + this.name); //this: current team object
            return true;
        }
    }



}
