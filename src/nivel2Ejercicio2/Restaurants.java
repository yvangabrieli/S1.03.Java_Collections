package nivel2Ejercicio2;

public class Restaurants implements Comparable <Restaurants> {
    private String name;
    private int rating;

    public Restaurants (String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRating(){
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Restaurants other){
        int nameCompare = this.name.compareTo(other.name);
        if (nameCompare !=0){
            return nameCompare;
        } else {
            return Integer.compare(other.rating, this.rating);
        }

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Restaurants)) return false;
        Restaurants resto = (Restaurants) o ;
        return this.name.equalsIgnoreCase(resto.name) && this.rating == resto.rating;
    }
    @Override
    public int hashCode(){
        return name.toLowerCase().hashCode() + rating;
    }

    @Override
    public String toString(){
        return "\n name: " + getName() + " ---------   Rating: " + getRating();
    }
}
