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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AType type = (AType) obj;
        return typeName.equals(type.typeName);
    }

    @Override
    public int hashCode() {
        return typeName.hashCode();
    }
}

