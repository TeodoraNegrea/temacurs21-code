package ro.fasttrackit.temacurs21.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Studio {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;

    public Studio(){
    }
    public Studio(String name, String address){
        this.name= name;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
