package Tests;
import General.Program;
import TreeGeneration.ASTGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParsingTests {

    private void generateTree( String input, String expected) {
        Program output = null;
        try {
            output = ASTGenerator.generateAST(input);
        }catch (Exception e) {
            Assertions.fail("Syntax Fehler beim Generieren des Trees");
        }
        assertEquals(expected ,output.toString());
    }


    @Test
    void EmptyClass() {
        generateTree("class Empty { }", "Clazz: " +
                                                      "(Name: Empty) " +
                                                      "(AccesModifier: PUBLIC) " +
                                                      "(Fields: ) " +
                                                      "(Methods: )");
    }

    //sollte hier ein Constructor generiert werden?!
    @Test
    void PrivateClass() {
        generateTree("private class Empty{ }", "Clazz: " +
                                                              "(Name: Empty) " +
                                                              "(AccesModifier: PRIVATE) " +
                                                              "(Fields: ) " +
                                                              "(Methods: )");
    }

    @Test
    void EmptyConstructor()
    {
        generateTree("class Empty{ Empty( ){  } }", "Clazz: " +
                                                                   "(Name: Empty) " +
                                                                   "(AccesModifier: PUBLIC) " +
                                                                   "(Fields: ) " +
                                                                   "(Methods: " +
                                                                     "Method: " +
                                                                     "(Id: Empty) " +
                                                                     "(AccesModifier: PUBLIC) " +
                                                                     "(ReturnType: void) " +
                                                                     "(Parameters: ) " +
                                                                     "Block: (statements: )," +
                                                                   ")");
    }

    @Test
    void EmptyMethod(){
        generateTree("class Method{ int emptyMethod(){ } }", "Clazz: " +
                                                                          "(Name: Method) " +
                                                                          "(AccesModifier: PUBLIC) " +
                                                                          "(Fields: ) " +
                                                                          "(Methods: " +
                                                                            "Method: " +
                                                                            "(Id: emptyMethod) " +
                                                                            "(AccesModifier: PUBLIC) " +
                                                                            "(ReturnType: int) " +
                                                                            "(Parameters: ) " +
                                                                            "Block: (statements: )," +
                                                                          ")");
    }

    @Test
    void Parameters(){
        generateTree("class Method{ int emptyMethod( int i, boolean b ){ } }", "Clazz: " +
                                                                                  "(Name: Method) " +
                                                                                  "(AccesModifier: PUBLIC) " +
                                                                                  "(Fields: ) " +
                                                                                  "(Methods: " +
                                                                                  "Method: " +
                                                                                  "(Id: emptyMethod) " +
                                                                                  "(AccesModifier: PUBLIC) " +
                                                                                  "(ReturnType: int) " +
                                                                                  "(Parameters: " +
                                                                                    "LocalOrFieldVar: " +
                                                                                    "(Id: i) " +
                                                                                    "(Type: int) " +
                                                                                    "(AccessModifier: PUBLIC)," +
                                                                                    "LocalOrFieldVar: " +
                                                                                    "(Id: b) " +
                                                                                    "(Type: boolean) " +
                                                                                    "(AccessModifier: PUBLIC)," +
                                                                                  ") " +
                                                                                  "Block: (statements: )," +
                                                                                  ")");
    }

    @Test
    void Field() {
        generateTree("class Field{ int x; }", "Clazz: " +
                                                            "(Name: Field) " +
                                                            "(AccesModifier: PUBLIC) " +
                                                            "(Fields: " +
                                                                "Field: " +
                                                                "(Name: x) " +
                                                                "(Type: int)," +
                                                            ") " +
                                                            "(Methods: )");
    }

    @Test
    void LocalOrFieldVar(){
        generateTree("class Variable{void var(){ int a; int b; } }", "Clazz: " +
                                                                                   "(Name: Variable) " +
                                                                                   "(AccesModifier: PUBLIC) " +
                                                                                   "(Fields: ) " +
                                                                                   "(Methods: " +
                                                                                   "Method: " +
                                                                                   "(Id: var) " +
                                                                                   "(AccesModifier: PUBLIC) " +
                                                                                   "(ReturnType: int) " +
                                                                                   "(Parameters: " +
                                                                                   ") " +
                                                                                   "Block: (statements: ????????????)," +
                                                                                   ")");
    }

    @Test
    void Boolean(){
        generateTree("class Bool{ void bool(){ boolean b = true; } }", "Clazz: " +
                                                                                        "(Name: Bool) " +
                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                        "(Fields: ) " +
                                                                                        "(Methods: " +
                                                                                            "Method: " +
                                                                                            "(Id: bool) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(ReturnType: void) " +
                                                                                            "(Parameters: ) " +
                                                                                            "Block: (statements: " +
                                                                                                    "LocalVarDecl: (Id: b) (Type: boolean) " +
                                                                                                    "(expr: AssignStmt: (Id: b) (expr: ABoolean true))," +
                                                                                            ")," +
                                                                                        ")");
    }

    @Test
    void Character(){
        generateTree("class Char { void charMethod(){ char a = '_'; } }", "Clazz: " +
                                                                                        "(Name: Char) " +
                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                        "(Fields: ) " +
                                                                                        "(Methods: " +
                                                                                            "Method: " +
                                                                                            "(Id: charMethod) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(ReturnType: void) " +
                                                                                            "(Parameters: ) " +
                                                                                            "Block: (statements: " +
                                                                                                "LocalVarDecl: (Id: a) (Type: char) " +
                                                                                                "(expr: AssignStmt: (Id: a) (expr: Char: _))," +
                                                                                            ")," +
                                                                                        ")");
    }

    @Test
    void Integer(){
        generateTree("class Int{void intMethod(){ int a = -1; } }", "Clazz: " +
                                                                                     "(Name: Int) " +
                                                                                     "(AccesModifier: PUBLIC) " +
                                                                                     "(Fields: ) " +
                                                                                     "(Methods: " +
                                                                                        "Method: " +
                                                                                        "(Id: intMethod) " +
                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                        "(ReturnType: void) " +
                                                                                        "(Parameters: ) " +
                                                                                        "Block: (statements: " +
                                                                                            "LocalVarDecl: (Id: a) (Type: int) " +
                                                                                            "(expr: AssignStmt: (Id: a) (expr: int: -1))," +
                                                                                        ")," +
                                                                                     ")");
    }

    @Test
    void String(){
        generateTree("class String{String stringMethod(){ void s = \"*TODO: versteckte Nachricht für Prof einfügen!\"; } }", "Clazz: " +
                                                                                                                                        "(Name: String) " +
                                                                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                                                                        "(Fields: ) " +
                                                                                                                                        "(Methods: " +
                                                                                                                                            "Method: " +
                                                                                                                                            "(Id: stringMethod) " +
                                                                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                                                                            "(ReturnType: void) " +
                                                                                                                                            "(Parameters: ) " +
                                                                                                                                            "Block: (statements: " +
                                                                                                                                                "LocalVarDecl: (Id: s) (Type: string) " +
                                                                                                                                                "(expr: AssignStmt: (Id: s) (expr: string: *TODO: versteckte Nachricht für Prof einfügen!))," +
                                                                                                                                            ")," +
                                                                                                                                        ")");
    }

    @Test
    void Null(){
        generateTree("class Null{void nullMethod(){ string s = null; } }", "Clazz: " +
                                                                                            "(Name: Null) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(Fields: ) " +
                                                                                            "(Methods: " +
                                                                                                "Method: " +
                                                                                                "(Id: nullMethod) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: void) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: " +
                                                                                                    "LocalVarDecl: (Id: s) (Type: string) " +
                                                                                                    "(expr: AssignStmt: (Id: s) (expr: string: *TODO: versteckte Nachricht für Prof einfügen!))," +
                                                                                                ")," +
                                                                                            ")");
    }

    @Test
    void Binary(){
        generateTree("class Binary{ void binaryMethod(){ int x; x = 1 + 99; } }", "Clazz: " +
                                                                                            "(Name: Binary) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(Fields: ) " +
                                                                                            "(Methods: " +
                                                                                                "Method: " +
                                                                                                "(Id: binaryMethod) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: void) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: " +
                                                                                                    "LocalVarDecl: (Id: x) (Type: int) " +
                                                                                                    "(expr: ---sowas ähnliches----AssignStmt: (Id: s) (expr: string: *TODO: versteckte Nachricht für Prof einfügen!))," +
                                                                                                ")," +
                                                                                            ")");
    }

    @Test
    void InstVar(){
        generateTree("class InstVar{int i; void instMethod(){ this.i = 1; } }", "Clazz: " +
                                                                                               "(Name: Int) " +
                                                                                               "(AccesModifier: PUBLIC) " +
                                                                                               "(Fields: " +
                                                                                                    "Field: " +
                                                                                                    "(Name: i) " +
                                                                                                    "(Type: int)," +
                                                                                               ") " +
                                                                                               "(Methods: " +
                                                                                                    "Method: " +
                                                                                                    "(Id: instMethod) " +
                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                    "(ReturnType: void) " +
                                                                                                    "(Parameters: ) " +
                                                                                                    "Block: (statements: ??????)," +
                                                                                               ")");
    }

    @Test
    void Unary(){
        generateTree("class Unary{ void unaryMethod(){ boolean b = !false; } }", "Clazz: " +
                                                                                              "(Name: Unary) " +
                                                                                              "(AccesModifier: PUBLIC) " +
                                                                                              "(Fields: ) " +
                                                                                              "(Methods: " +
                                                                                                  "Method: " +
                                                                                                  "(Id: unaryMethod) " +
                                                                                                  "(AccesModifier: PUBLIC) " +
                                                                                                  "(ReturnType: void) " +
                                                                                                  "(Parameters: ) " +
                                                                                                  "Block: (statements: ??????)," +
                                                                                              ")");
    }

    @Test
    void If(){
        generateTree("class If{ void ifMethod(){ if( 1 == 1 ) {int i = 1;} else { i = 404;} } }", "Clazz: " +
                                                                                                                    "(Name: If) " +
                                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                                    "(Fields: ) " +
                                                                                                                    "(Methods: " +
                                                                                                                        "Method: " +
                                                                                                                        "(Id: ifMethod) " +
                                                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                                                        "(ReturnType: void) " +
                                                                                                                        "(Parameters: ) " +
                                                                                                                        "Block: (statements: ??????)," +
                                                                                                                    ")");
    }

    @Test
    void Return(){
        generateTree("class Return{ boolean returnMethod(){ return true; } }", "Clazz: " +
                                                                                            "(Name:Return) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(Fields: ) " +
                                                                                            "(Methods: " +
                                                                                                "Method: " +
                                                                                                "(Id: returnMethod) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: boolean) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: ??????)," +
                                                                                            ")");
    }

    @Test
    void While(){
        generateTree("class While{ boolean whileMethod(){ while( 1 == 1 ){ return true; } } }", "Clazz: " +
                                                                                                                "(Name: While) " +
                                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                                "(Fields: ) " +
                                                                                                                "(Methods: " +
                                                                                                                    "Method: " +
                                                                                                                    "(Id: whileMethod) " +
                                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                                    "(ReturnType: boolean) " +
                                                                                                                    "(Parameters: ) " +
                                                                                                                    "Block: (statements: ??????)," +
                                                                                                                ")");
    }

    @Test
    void MethodCall(){
        generateTree("class MethodCall{ void  method(){ } void call(){ method(); } }", "Clazz: " +
                                                                                                     "(Name: MethodCall) " +
                                                                                                     "(AccesModifier: PUBLIC) " +
                                                                                                     "(Fields: ) " +
                                                                                                     "(Methods: " +
                                                                                                         "Method: " +
                                                                                                         "(Id: method) " +
                                                                                                         "(AccesModifier: PUBLIC) " +
                                                                                                         "(ReturnType: void) " +
                                                                                                         "(Parameters: ) " +
                                                                                                         "Block: (statements: )," +
                                                                                                         "Method: " +
                                                                                                         "(Id: call) " +
                                                                                                         "(AccesModifier: PUBLIC) " +
                                                                                                         "(ReturnType: void) " +
                                                                                                         "(Parameters: ) " +
                                                                                                         "Block: (statements: ??????)," +
                                                                                                     ")");
    }

    @Test
    void New(){
        generateTree("class Neu{ Neu(){} void newMethod(){ Neu neu = new Neu(); } }", "Clazz: " +
                                                                                                    "(Name: Neu) " +
                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                    "(Fields: ) " +
                                                                                                    "(Methods: " +
                                                                                                        "Method: " +
                                                                                                        "(Id: newMethod) " +
                                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                                        "(ReturnType: void) " +
                                                                                                        "(Parameters: ) " +
                                                                                                        "Block: (statements: ??????)," +
                                                                                                    ")");
    }
}
