import TreeGeneration.ASTGenerator;

public class Main {
    public static void main(String[] args) {
        String teststring = "class InstVar{int i; void instMethod(){ this.i = 1; } }";
        System.out.println(ASTGenerator.generateAST(teststring));
    }
}
