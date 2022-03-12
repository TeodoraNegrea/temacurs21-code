package ro.fasttrackit.temacurs21.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int birthYear;

    public  Actor(){
    }
    public Actor(String name,int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
}
