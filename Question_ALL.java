
class Question_ALL{
    public static void main(String[] args){
        int [][] ratings = { {4,6,2,5},{7,9,4,8},{6,9,3,7}};
        //Q1
        System.out.println("Q1");
        double rating0 = movieAvgRating(ratings,0);
        System.out.println("Movie zero's average rating: " + rating0);
        double rating1 = movieAvgRating(ratings,1);
        System.out.println("Movie one's average rating: " + rating1);
        double rating2 = movieAvgRating(ratings,2);
        System.out.println("Movie two's average rating: " + rating2);
        double rating3 = movieAvgRating(ratings,3);
        System.out.println("Movie three's average rating: " + rating3);
        // Q2
        System.out.println("Q2");
        double ratingr0 = reviewerAvgRating(ratings,0);
        System.out.println("Reviewer zero's average rating: " + ratingr0);
        double ratingr1 = reviewerAvgRating(ratings,1);
        System.out.println("Reviewer one's average rating: " + ratingr1);
        double ratingr2 = reviewerAvgRating(ratings,2);
        System.out.println("Reviewer two's average rating: " + ratingr2);
        //Q3
        System.out.println("Q3");
        double total = avgRating2018(ratings);
        System.out.println("Average Rating for 2018: " + ratings);
        //Q4
        System.out.println("Q4");
        int hardRater = hardestRater2018(ratings);
        System.out.println("The hardest rater is number: " + ratings);
        System.out.println("Q5");
        int worstMovie = worstMovie2018(ratings);
        System.out.println("The worst movie is number: " + ratings);
    }

    /*Question 1: Write the method movieAverageRating() 
     * that takes a Rotten Potato database (2D
    int array) as a parameter and another int 
    that represents a particular movie. Return the average
    rating for that movie.*/
    public static double movieAvgRating(int[][] ratings, int movie){
        double sum = 0;

        for(int r = 0; r<ratings.length;r++){
            sum += ratings[r][movie];
        }
        return sum/ratings.length;
    }

    /*Question 2: Write a method that takes a Rotten Potato 
     * database (2D int array) as a parameter
    and another int that represents a particular movie 
    reviewer. Return the average rating for that
    particular reviewer.*/
    public static double reviewerAvgRating(int[][] ratings, int reviewer){
        double sum = 0;
        for(int c = 0; c<ratings[0].length;c++){
            sum += ratings[reviewer][c];
        }
        return sum/ratings[0].length;
    }

    /*Question 3: Write a method that takes a 
     * Rotten Potato database (2D int array) as a parameter.
    Return the average movie rating for all movies and 
    all reviewers in the database.*/
    public static double avgRating2018(int[][] ratings){
        double sum = 0;
        for(int r = 0; r<ratings.length;r++){
            for(int c = 0; c<ratings[0].length;c++){
                sum += ratings[r][c];

            }
        }
        return sum/(ratings.length*ratings[0].length);
    }

    /*Question 4: Write a method that takes a Rotten Potato database (2D int array) as a parameter.
    Return the index of the hardest reviewer (the reviewer with the lowest average ranking). */
    public static int hardestRater2018(int[][] ratings){
        int hardestReviewer = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int c = 0; c<ratings[0].length;c++){
            sum1 += ratings[0][c];
        }
        for(int c = 0; c<ratings[0].length;c++){
            sum2 += ratings[1][c];
        }
        for(int c = 0; c<ratings[0].length;c++){
            sum3 += ratings[2][c];
        }
        if(sum1>sum2&&sum1>sum3){
            hardestReviewer = 0;
        }
        if(sum2>sum3&&sum2>sum1){
            hardestReviewer = 1;
        }
        if(sum3>sum2&&sum3>sum1){
            hardestReviewer = 2;
        }

        return hardestReviewer;
    }

    /*Question 5: Write a method that takes a Rotten Potato database (2D int array) as a parameter.
    Return the index of the worst movie (the movie with the lowest average ranking).*/
    public static int worstMovie2018(int[][] ratings){
        int worstMovie = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int r = 0; r<ratings.length;r++){
            sum1 += ratings[r][0];
        }
        for(int r = 0; r<ratings.length;r++){
            sum2 += ratings[r][1];
        }
        for(int r = 0; r<ratings.length;r++){
            sum3 += ratings[r][2];
        }
        if(sum1>sum2&&sum1>sum3){
            worstMovie = 0;
        }
        if(sum2>sum3&&sum2>sum1){
            worstMovie = 1;
        }
        if(sum3>sum2&&sum3>sum1){
            worstMovie = 2;
        }

        return worstMovie;
    }

}