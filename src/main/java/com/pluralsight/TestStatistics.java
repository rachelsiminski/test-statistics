package com.pluralsight;

public class TestStatistics {

    public static void main(String[] args) {

        // average
        // high score
        // low score
        // median

        int[] scores = {65, 35, 24, 86, 26, 98, 26, 97, 64, 87};
        int average = scores[0];
        int highScore = scores[0];
        int lowScore = scores[0];
        int median = scores[0];

//        for (int i = 0; i < scores.length; i++) {
//            average = average + scores[i];
//
//            if (highScore < scores[i]) {
//                highScore = scores[i];
//            }
//
//            if (lowScore > scores[i]) {
//                lowScore = scores[i];
//            }
//        }

        for (int score : scores) {
            average = average + score;

            if (highScore < score) {
                highScore = score;
            }

            if (lowScore > score) {
                lowScore = score;
            }
        }

        average = average / scores.length;

        System.out.println("Average: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);

    }
}
