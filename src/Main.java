import TreeGeneration.ASTGenerator;

public class Main {
    public static void main(String[] args) {
        String teststring = "class Variable{void var(){ int a; int b; } }";
        System.out.println(ASTGenerator.generateAST(teststring));
    }
}
