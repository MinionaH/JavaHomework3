import java.util.*;
public class RandomCollection {
    public static void randomCollection() {
        Random rand = new Random();
        int randint = rand.nextInt(3);

        System.out.println(randint);        //  [0/1/2]  //

        HashMap<Integer, CollectionNames> collectionsMap = new HashMap<>();
        collectionsMap.put(0, CollectionNames.LIST);
        collectionsMap.put(1, CollectionNames.MAP);
        collectionsMap.put(2, CollectionNames.SET);

        CollectionNames collectionNames = collectionsMap.get(randint);

        System.out.println(collectionNames); // collectionsMap.get(0/1/2);


        switch (collectionNames){
            case LIST:
                ArrayList<String> food = new ArrayList<>();
                food.add("LRG");
                food.add("Khinkali");
                food.add("Chkmeruli");
                food.add("Satsivi");
                // for (int i = 0; i < food.size(); i++)  () =>  alt+enter Shedegi =>  enhanced for
                for (String foods : food) {
                    System.out.println(foods);
                }
                break;
            case MAP:
                HashMap<String, String> car = new HashMap<>();
                car.put("SUV", "Cybertruck");
                car.put("USSR", "Mosckvich");
                car.put("Sport", "Generic C7");
                car.put("Derby", "Chrysler Imperia");

                for (String cars : car.values()) {
                    System.out.println(cars);
                }
                break;
            case SET:
                HashSet<String> Sport = new HashSet<>();
                Sport.add("Football");
                Sport.add("Basketball");
                Sport.add("Skiing");
                Sport.add("Archery");
                for (String sports : Sport) {
                    System.out.println(sports);
                }
                break;
        }
    }
}