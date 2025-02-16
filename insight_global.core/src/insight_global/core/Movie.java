package insight_global.core;

//Movie.java
import java.util.Date;

public class Movie implements Comparable<Movie> {
 private String name;
 private String language;
 private Date releaseDate;
 private String director;
 private String producer;
 private int duration; // duration in minutes

 // Constructor
 public Movie(String name, String language, Date releaseDate, String director, String producer, int duration) {
     this.name = name;
     this.language = language;
     this.releaseDate = releaseDate;
     this.director = director;
     this.producer = producer;
     this.duration = duration;
 }

 // Getters and Setters
 public String getName() {
     return name;
 }

 public String getLanguage() {
     return language;
 }

 public Date getReleaseDate() {
     return releaseDate;
 }

 public String getDirector() {
     return director;
 }

 public String getProducer() {
     return producer;
 }

 public int getDuration() {
     return duration;
 }

 @Override
 public String toString() {
     return "Movie{name='" + name + "', language='" + language + "', releaseDate=" + releaseDate + 
            ", director='" + director + "', producer='" + producer + "', duration=" + duration + " minutes}";
 }

 // Implementing the compareTo method from Comparable interface to sort by language
 @Override
 public int compareTo(Movie other) {
     return this.language.compareTo(other.language);
 }
}

