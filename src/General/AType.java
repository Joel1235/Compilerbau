package General;

public class AType {
    public static final AType INT = new AType("int");
    public static final AType BOOLEAN = new AType("boolean");
    public static final AType CHAR = new AType("char");
    public static final AType VOID = new AType("void");
    private final String typeName;

    public AType(String typeName) {
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

