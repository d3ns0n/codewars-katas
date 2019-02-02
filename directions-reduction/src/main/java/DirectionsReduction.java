import java.util.*;

public class DirectionsReduction {

    private static Map<String, Integer> directionValues = new HashMap<String, Integer>() {{
        put("NORTH", 1);
        put("SOUTH", -1);
        put("WEST", 2);
        put("EAST", -2);
    }};

    public static String[] dirReduc(String[] directions) {
        String[] reducedDirections = removeNeedlessDirections(directions);

        if (directions.length == reducedDirections.length) {
            return directions;
        }

        return dirReduc(reducedDirections);
    }


    private static String[] removeNeedlessDirections(String[] directions) {
        List<String> list = new ArrayList<>(Arrays.asList(directions));

        for (int i = 0; i < list.size() - 1; i++) {
            if (directionValues.get(list.get(i)) + directionValues.get(list.get(i + 1)) == 0) {
                list.subList(i, i + 2).clear();

                return list.toArray(new String[0]);
            }
        }

        return directions;
    }

}
