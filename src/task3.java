import java.util.ArrayList;
import java.util.HashMap;

public class task3 {
    public static void main(String[] args){
        ArrayList <String> planets = new ArrayList<String>();
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Земля");
        planets.add("Уран");
        planets.add("Юпитер");
        planets.add("Юпитер");
        CountPl(planets);
    }
    static void CountPl(ArrayList<String> planets){
        HashMap planetCounts = new HashMap();
        for (String planet:planets){
            if(planetCounts.containsKey(planet)){
                int count = (int) planetCounts.get(planet);
                planetCounts.put(planet,count+1);
            }
            else {
                planetCounts.put(planet,1);
            }
        }
        System.out.println(planetCounts);
    }
}
