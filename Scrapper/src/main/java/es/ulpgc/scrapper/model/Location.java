package es.ulpgc.scrapper.model;

public class Location {
    public String direction;
    public String coordinates;

    public Location(String direction, String coordinates) {
        this.direction = direction;
        this.coordinates = coordinates;
    }
}
