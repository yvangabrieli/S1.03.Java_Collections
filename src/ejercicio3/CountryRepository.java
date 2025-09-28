package ejercicio3;

import java.io.*;
import java.util.*;
// Load countries from source file
public class CountryRepository {
    public HashMap<String, String> loadCountries(String resourcePath) throws IOException {
        HashMap<String, String> countries = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(resourcePath)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    countries.put(parts[0].trim(), parts[1].trim());
                }
            }
        }
        return countries;
    }
}
