package ejercicio1;
import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }
    public void setName(String name) { this.name = name;}
    public String getName() { return this.name; }

    @Override
    public String toString() {
        return this.name;
    }

    @Override // Would be useful to se HashSet to avoid duplications
    public boolean equals(Object obj) {
        if (this == obj) {return true;};
        if (obj == null || getClass() != obj.getClass()) {return false;}
        Month month = (Month) obj;
        return this.name.equals(month.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}