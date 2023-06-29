package data;

import org.testng.annotations.DataProvider;

public class DataGiver {
    public final static String figurines = "DataGiver";

    @DataProvider(name = figurines)
    public Object[][] anotherColors() {
        final var map = MapParser.getFigures();

        return new Object[][]{
                {map.get("1").getBackground(), map.get("1").getPincel(), map.get("1").getX1(), map.get("1").getY1(),
                        map.get("1").getX2(), map.get("1").getY2(), map.get("1").getX3(), map.get("1").getY3(),
                        map.get("1").getX4(), map.get("1").getY4()}
        };
    }
}
