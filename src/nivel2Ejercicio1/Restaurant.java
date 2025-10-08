package nivel2Ejercicio1;

public class Restaurant {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurant)) return false;
        Restaurant other = (Restaurant) o;
        return this.name.equalsIgnoreCase(other.name) && this.rating == other.rating;
    }

    @Override
    public int hashCode() {
        return this.name.toLowerCase().hashCode() + rating;
    }


    @Override
    public String toString() {
        return "Restaurant: " + getName() + " " + getRating();
    }
}
