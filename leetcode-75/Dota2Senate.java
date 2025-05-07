import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RD")); // Radiant
        System.out.println(predictPartyVictory("RDD")); // Dire
        System.out.println(predictPartyVictory("DDRRR")); // Dire

        /*
         * DDRRR
         * DRRRD
         * RRDD
         * RDDR
         * DRR
         * RD
         * R
         */
    }

    public static String predictPartyVictory(String senate) {

        final Queue<Integer> radiant = new LinkedList<>();
        final Queue<Integer> dire = new LinkedList<>();

        int row = 0;
        for (Character character : senate.toCharArray()) {
            if (character == 'R') {
                radiant.add(row++);
            } else {
                dire.add(row++);
            }
        }

        while (radiant.size() != 0 && dire.size() != 0) {
            if (radiant.peek() > dire.peek()) {
                radiant.poll();
                dire.add(dire.poll() + senate.length());
            } else {
                dire.poll();
                radiant.add(radiant.poll() + senate.length());
            }
        }


        return radiant.size() > dire.size() ? "Radiant" : "Dire";
    }
}
