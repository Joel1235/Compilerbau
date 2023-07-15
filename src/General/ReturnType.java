package General;

public class ReturnType {
    public static final ReturnType INT = new ReturnType("int");
    public static final ReturnType BOOLEAN = new ReturnType("boolean");
    public static final ReturnType CHAR = new ReturnType("char");
    public static final ReturnType VOID = new ReturnType("void");
    private final String typeName;

    public ReturnType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
