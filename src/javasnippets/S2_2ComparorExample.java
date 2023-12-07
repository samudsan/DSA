package javasnippets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class S2_2ComparorExample {
    public static void main(String[] args) {
        List<Athlet> footballTeam = new ArrayList<>();
        Athlet athlet1 = new Athlet(59, "John", 20);
        Athlet athlet2 = new Athlet(67, "Roger", 22);
        Athlet athlet3 = new Athlet(45, "Steven", 24);
        footballTeam.add(athlet1);
        footballTeam.add(athlet2);
        footballTeam.add(athlet3);

        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam, new AthletRankingComparator());
        System.out.println("After Sorting : " + footballTeam);

    }
}

class AthletRankingComparator implements Comparator<Athlet> {

    @Override
    public int compare(Athlet firstPlayer, Athlet secondPlayer) {
        return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
    }
}

class Athlet {
    private int ranking;
    private String name;
    private int age;

    public Athlet(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    // To represent in a human readable format while printing this object I have overriden toString method of this class
    @Override
    public String toString() {
        return "Athlets{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

