package data;

import com.poiji.bind.Poiji;
import model.FiguresModel;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private static final String excelpath = "src/test/resources/data/Sides.xlsx";

    public static List<FiguresModel> getFiguresList() {
        return Poiji.fromExcel(new File(excelpath), FiguresModel.class);
    }
}
