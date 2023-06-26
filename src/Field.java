import General.AType;

public class Field {
       private String name;
    private AType type;
    public Field(String name, AType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public AType getType() {
        return type;
    }
}
