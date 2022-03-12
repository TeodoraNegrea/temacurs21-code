package ro.fasttrackit.temacurs21.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieRating {
    @Id
    @GeneratedValue
    private int id;
    private int rating;
    private String agency;

    public MovieRating(){
    }
    public MovieRating(int rating,String agency){
        this.rating = rating;
        this.agency = agency;
    }
    public int getId() {
        return id;
    }
    public int getRating() {
        return rating;
    }
    public String getAgency() {
        return agency;
    }
}
