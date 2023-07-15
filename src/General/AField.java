package General;


public class AField {
       private String name;
    private AType type;
    public AField(AType type, String name){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public AType getType() {
        return type;
    }

    public void setType(AType type) { this.type = type; }

    @Override
    public String toString(){
        String result = "";
        result += "Field: (Name: " + name + ") (Type: " + type.toString() + ")";
        return result;
    }
}
