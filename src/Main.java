import TreeGeneration.ASTGenerator;

public class Main {
    public static void main(String[] args) {
        String teststring = "class If{ void ifMethod(){ if( 1 == 1 ) {int i = 1;} else { i = 404;} } }";
        System.out.println(ASTGenerator.generateAST(teststring));
    }
}
