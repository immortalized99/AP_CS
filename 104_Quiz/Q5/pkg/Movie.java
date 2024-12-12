package pkg;

public class Movie{
    String name;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie() {
        name = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String name, double rating, int numRatings, int revenue) {
        this.name = name;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString() {
        System.out.println("Movie: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    
    public String getMovieName() {
        return name;
    }
    
    public int getRevenue() {
        return revenue;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void addRating(double newRating){
        rating *= numRatings;
        rating += newRating;
        numRatings += 1;
        rating /= numRatings;
    }
    
    public boolean compareRatings(Movie r) {
        if (r.getRating() < rating) {
            return true;
        } else if (r.getRating() > rating) {
            return false;
        } else {
            return false;
        }
    }
 }
