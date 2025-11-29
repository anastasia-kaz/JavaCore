package homework_19;

import java.util.Objects;

public class City {
    private int id;
    private String name;
    private int population;
    private ContinentsEnum continent;

    public City(int id, String name, int population, ContinentsEnum continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public ContinentsEnum getContinent() {
        return continent;
    }

    public void setContinent(ContinentsEnum continent) {
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id == city.id && population == city.population && Objects.equals(name, city.name) && continent == city.continent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, population, continent);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", continent=" + continent +
                '}';
    }
}
