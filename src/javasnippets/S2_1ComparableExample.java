package javasnippets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S2_1ComparableExample {
    //  Comparable is an interface defining a strategy of comparing an object with other objects of the same type.
    //  This is called the class’s “natural ordering.”


    //Here we are sorting Players objects based on one of the value(Ranking) of that object
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);
        // If you directly print a java object it will call its toString default implmentation
        // you can override existing implementation with your own to string implementation
        System.out.println(player1);

    }
}

class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }


    // To represent in a human readable format while printing this object I have overriden toString method of this class
    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}";
    }

}

