package data;

import model.FiguresModel;
import utilities.Logs;

import java.util.HashMap;
import java.util.Map;

public class MapParser {
    public Map<String, String> hexagesimalColors() {
        Logs.debug("Creating Map list of colors");
        var map = new HashMap<String, String>();
        map.put("red", "D71717");
        map.put("white", "FFFFFF");
        map.put("blue", "0769FC");
        map.put("sky-blue", "0010FC");
        map.put("black", "000000");
        map.put("green", "28CC23");
        return map;
    }

    public static Map<String, FiguresModel> getFigures() {
        Logs.debug("creatin figures Model");

        final var map = new HashMap<String, FiguresModel>();
        final var figureList = ExcelReader.getFiguresList();
        for (var element : figureList) {
            map.put(element.getItem(), element);
        }
        return map;
    }
}
