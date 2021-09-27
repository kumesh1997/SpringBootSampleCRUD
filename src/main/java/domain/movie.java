package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String duration;
    private String released_date;
    private float rating;
    private String image;
    private String genre;


    public  movie(){

    }

    public movie(int id,String title,String description,String duration,String released_date,float rating,String image,String genre){
    this.id=id;
    this.description=description;
    this.title=title;
    this.duration=duration;
    this.released_date=released_date;
    this.rating=rating;
    this.image=image;
    this.genre=genre;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getDuration() {return duration;}

    public void setDuration(String duration) {this.duration = duration;}

    public String getReleased_date() {return released_date;}

    public void setReleased_date(String released_date) {this.released_date = released_date;}

    public float getRating() {return rating;}

    public void setRating(float rating) {this.rating = rating;}

    public String getImage() {return image;}

    public void setImage(String image) {this.image = image;}

    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}
}
