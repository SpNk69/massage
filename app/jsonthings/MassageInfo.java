package jsonthings;

/**
 * Created by alex on 2017-12-19.
 */
public class MassageInfo {


    int id;
    String massageName;
    String code;
    String whatever;
    String col1;
    String col2;
    String col3;

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3;
    }


    public MassageInfo(int id, String massageName, String code, String whatever, String col1, String col2, String col3) {
        this.id = id;
        this.massageName = massageName;
        this.code = code;
        this.whatever = whatever;
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
    }

    public String getMassageName() {
        return massageName;
    }

    public void setMassageName(String massageName) {
        this.massageName = massageName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWhatever() {
        return whatever;
    }

    public void setWhatever(String whatever) {
        this.whatever = whatever;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
