package model;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("figurines")
public class FiguresModel {
    @ExcelCellName("item")
    private String item;
    @ExcelCellName("background")
    private String background;
    @ExcelCellName("pincel")
    private String pincel;
    @ExcelCellName("x1")
    private int x1;
    @ExcelCellName("y1")
    private int y1;
    @ExcelCellName("x2")
    private int x2;
    @ExcelCellName("y2")
    private int y2;
    @ExcelCellName("x3")
    private int x3;
    @ExcelCellName("y3")
    private int y3;
    @ExcelCellName("x4")
    private int x4;
    @ExcelCellName("y4")
    private int y4;

    public String getItem() {
        return item;
    }

    public String getBackground() {
        return background;
    }

    public String getPincel() {
        return pincel;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public int getX4() {
        return x4;
    }

    public int getY4() {
        return y4;
    }
}
