public class Main {
    public static void main(String[] args) {
        String teststring = "class TestKlasse{int i = i;}";
        System.out.println(Compiler.generateAST(teststring));
    }
}
