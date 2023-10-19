package com.bridgeLab.solution.bootCamp.day3;

public class MovieRatings {
	
	public static double[] avgRatings(int[][] movieRatings) {
        int totalMovies = movieRatings.length;
        double totalReviewers = movieRatings[0].length;
        //double avgRatings=0;
        double[] avgRatings = new double[totalMovies];

        for (int i = 0; i < totalMovies; i++) {
            int totalRating = 0;
            for (int j = 0; j < totalReviewers; j++) {
                totalRating += movieRatings[i][j];
            }
            avgRatings[i] = totalRating / totalReviewers;
           // System.out.println("Average rating for movie "+(i+1)+" -> "+ avgRatings);
        }
        return avgRatings;
    }

    public static void main(String[] args) {

    	int[][] movieRatings = {{4, 7, 6},{6, 9, 9},{2, 4, 3},{5, 8, 7}};

        double[] avgRatings = avgRatings(movieRatings);
        
        for (int i = 0; i < avgRatings.length; i++) {
            System.out.printf("Average rating for Movie - " +(i+1)+" -> "+ avgRatings[i]);
        }
    }
}

