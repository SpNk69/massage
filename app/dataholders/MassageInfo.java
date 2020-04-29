package dataholders;

/**
 * Created by alex on 2017-12-19.
 */
public class MassageInfo {

    private int id;
    private String massageName;
    private String code;
    private String whatever;
    private String col1;
    private String col2;
    private String col3;
    private String col4;
    private String col5;
    private String col6;


    public MassageInfo(int id, String massageName, String code, String whatever, String col1, String col2, String col3, String col4, String col5, String col6) {
        this.id = id;
        this.massageName = massageName;
        this.code = code;
        this.whatever = whatever;
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        this.col5 = col5;
        this.col6 = col6;
    }

    public String getCol1() {
        return col1;
    }

    public String getCol2() {
        return col2;
    }

    public String getCol3() {
        return col3;
    }

    public String getCol4() {
        return col4;
    }
    public String getCol5() {
        return col5;
    }
    public String getCol6() {
        return col6;
    }

    public String getMassageName() {
        return massageName;
    }

    public String getCode() {
        return code;
    }

    public String getWhatever() {
        return whatever;
    }

    public int getId() {
        return id;
    }


}
