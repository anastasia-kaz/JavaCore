package homework_19;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        StrModify strModify = String::toUpperCase;

        City city1 = new City (1, "Брест", 20000, ContinentsEnum.EUROPE);
        City city2 = new City (2, "Минск", 200000, ContinentsEnum.EUROPE);
        City city3 = new City (3, "Гродно", 50000, ContinentsEnum.EUROPE);
        City city4 = new City (4, "Макао", 2000000, ContinentsEnum.ASIA);
        City city5 = new City (5, "Нью-Йорк", 5000000, ContinentsEnum.NORTH_AMERICA);

        List<City> cities = List.of(city1, city2, city3, city4, city5);

        List<City> filteredCities = cities.stream().filter(city -> {
            if (city.getContinent().equals(ContinentsEnum.EUROPE)){
                return true;
            }
            return false;
        }).toList();

        //1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
        Optional<City> findCity1 = filteredCities.stream().max(Comparator.comparingInt(City::getPopulation));
        System.out.println(findCity1.get());

        //1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
        Optional<City> findCity2 = filteredCities.stream().min(Comparator.comparingInt(City::getPopulation));
        System.out.println(findCity2.get());

        //1.4. Найти самый густонаселённый город (max)
        Optional<City> findCity3 = cities.stream().max(Comparator.comparingInt(City::getPopulation));
        System.out.println(findCity3.get());

        //1.5. Найти город с самым маленьким населением. (min)
        Optional<City> findCity4 = cities.stream().min(Comparator.comparingInt(City::getPopulation));
        System.out.println(findCity4.get());

        //1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
        Optional<City> oneBillionCitie = cities.stream().filter(city -> {
            if (city.getPopulation() >= 1000000){
                return true;
            }
            return false;
        }).findFirst();
        System.out.println(oneBillionCitie.get());


        //1.7. Отобрать города с населением больше 1 млн. (filter)
        List<City> oneBillionCities = cities.stream().filter(city -> {
            if (city.getPopulation() >= 1000000){
                return true;
            }
            return false;
        }).toList();
        System.out.println(oneBillionCities);


        //1.8. Создать коллекцию из названий городов, на основании объектов (map)
        List<String> namesCity = cities.stream().map(city -> {
                    return city.getName();
                }
        ).toList();
        System.out.println(namesCity);
    }
}
