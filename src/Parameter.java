import General.AType;

public class Parameter {
    private AType t;
    private String s;

    public Parameter(AType t, String s) {
        this.t = t;
        this.s = s;
    }

    public AType getT() {
        return t;
    }

    public String getS() {
        return s;
    }
}
