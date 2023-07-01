package General;

public class ReturnType {
    private final String typeName;

    public static final ReturnType INT = new ReturnType("int");
    public static final ReturnType BOOLEAN = new ReturnType("boolean");
    public static final ReturnType CHAR = new ReturnType("char");

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ReturnType type = (ReturnType) obj;
        return typeName.equals(type.typeName);
    }

    @Override
    public int hashCode() {
        return typeName.hashCode();
    }
}
