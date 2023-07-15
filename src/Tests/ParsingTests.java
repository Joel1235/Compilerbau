package Tests;
import General.Program;
import TreeGeneration.ASTGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParsingTests {

    //TODO: BITTE DEN NACHFOLGENDEN TEXT LESEN
    /*
    Die Expected Werte sind nicht zu 100% Korrekt, da strukturell ein paar Klassen fehlen und was nicht existiert lässt sich nicht testen.
    Ich habe einfach mal so getan, als würden die fehlenden Klassen existieren (Bsp.: ExprStmtExpr oder Boolean).
    Ebenfalls fehlen sämtliche Objekttypen.
    Sämtliche .toString() Methoden stammen von mir.
    Ich habe mich bewusst dazu entschieden Strings zu nutzen und keine Objekte, da sich jeder Zeit etwas an den Klassen und der generellen
    Projektstruktur hätte ändern können. Nur so konnte ich diesem Problem entgehen.
    ( Stand 15.07.2023 15:55 )

    geschrieben von: Kevin Kern
     */


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
    void EmptyClassOK() {
        generateTree("class Empty { }", "Clazz: " +
                                                      "(Name: Empty) " +
                                                      "(AccesModifier: PUBLIC) " +
                                                      "(Fields: ) " +
                                                      "(Methods: " +
                                                      "Method: " +
                                                        "(Id: Empty) " +
                                                        "(AccesModifier: PUBLIC) " +
                                                        "(ReturnType: Empty) " +
                                                        "(Parameters: ) " +
                                                        "Block: (statements: )," +
                                                      ")");
    }

    @Test
    void PrivateClassOK() {
        generateTree("private class Empty{ }", "Clazz: " +
                                                              "(Name: Empty) " +
                                                              "(AccesModifier: PRIVATE) " +
                                                              "(Fields: ) " +
                                                              "(Methods: " +
                                                              "Method: " +
                                                                "(Id: Empty) " +
                                                                "(AccesModifier: PUBLIC) " +
                                                                "(ReturnType: Empty) " +
                                                                "(Parameters: ) " +
                                                                "Block: (statements: )," +
                                                              ")");
    }

    @Test
    void EmptyConstructorOK()
    {
        generateTree("class Empty{ Empty( ){  } }", "Clazz: " +
                                                                   "(Name: Empty) " +
                                                                   "(AccesModifier: PUBLIC) " +
                                                                   "(Fields: ) " +
                                                                   "(Methods: " +
                                                                     "Method: " +
                                                                     "(Id: Empty) " +
                                                                     "(AccesModifier: PUBLIC) " +
                                                                     "(ReturnType: Empty) " +
                                                                     "(Parameters: ) " +
                                                                     "Block: (statements: )," +
                                                                   ")");
    }

    @Test
    void EmptyMethodOK(){
        generateTree("class Method{ int emptyMethod(){ } }", "Clazz: " +
                                                                          "(Name: Method) " +
                                                                          "(AccesModifier: PUBLIC) " +
                                                                          "(Fields: ) " +
                                                                          "(Methods: " +

                                                                            "Method: " +
                                                                            "(Id: Method) " +
                                                                            "(AccesModifier: PUBLIC) " +
                                                                            "(ReturnType: Method) " +
                                                                            "(Parameters: ) " +
                                                                            "Block: (statements: )," +

                                                                            "Method: " +
                                                                            "(Id: emptyMethod) " +
                                                                            "(AccesModifier: PUBLIC) " +
                                                                            "(ReturnType: int) " +
                                                                            "(Parameters: ) " +
                                                                            "Block: (statements: )," +
                                                                          ")");
    }

    @Test
    void ParametersOK(){
        generateTree("class Method{ int emptyMethod( int i, boolean b ){ } }", "Clazz: " +
                                                                                  "(Name: Method) " +
                                                                                  "(AccesModifier: PUBLIC) " +
                                                                                  "(Fields: ) " +
                                                                                  "(Methods: " +

                                                                                  "Method: " +
                                                                                  "(Id: Method) " +
                                                                                  "(AccesModifier: PUBLIC) " +
                                                                                  "(ReturnType: Method) " +
                                                                                  "(Parameters: ) " +
                                                                                  "Block: (statements: )," +


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
    void FieldOK() {
        generateTree("class Field{ int x; }", "Clazz: " +
                                                            "(Name: Field) " +
                                                            "(AccesModifier: PUBLIC) " +
                                                            "(Fields: " +
                                                                "Field: " +
                                                                "(Name: x) " +
                                                                "(Type: int)," +
                                                            ") " +
                                                            "(Methods: " +
                                                                "Method: " +
                                                                "(Id: Field) " +
                                                                "(AccesModifier: PUBLIC) " +
                                                                "(ReturnType: Field) " +
                                                                "(Parameters: ) " +
                                                                "Block: (statements: )," +
                                                            ")");
    }

    @Test
    void LocalOrFieldVarOK(){
        generateTree("class Variable{void var(){ int a; int b; } }", "Clazz: " +
                                                                                   "(Name: Variable) " +
                                                                                   "(AccesModifier: PUBLIC) " +
                                                                                   "(Fields: ) " +
                                                                                   "(Methods: " +

                                                                                    "Method: " +
                                                                                    "(Id: Variable) " +
                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                    "(ReturnType: Variable) " +
                                                                                    "(Parameters: ) " +
                                                                                    "Block: (statements: )," +

                                                                                   "Method: " +
                                                                                   "(Id: var) " +
                                                                                   "(AccesModifier: PUBLIC) " +
                                                                                   "(ReturnType: int) " +
                                                                                   "(Parameters: " +
                                                                                   ") " +
                                                                                   "Block: (statements: " +
                                                                                        "LocalVarDecl: (Id: a) (Type: int) " +
                                                                                        "(expr: )," +
                                                                                        "LocalVarDecl: (Id: b) (Type: int) " +
                                                                                        "(expr: )," +
                                                                                    ")," +
                                                                                   ")");
    }

    @Test
    void BooleanOK(){
        generateTree("class Bool{ void bool(){ boolean b = true; } }", "Clazz: " +
                                                                                        "(Name: Bool) " +
                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                        "(Fields: ) " +
                                                                                        "(Methods: " +

                                                                                            "Method: " +
                                                                                            "(Id: Bool) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(ReturnType: Bool) " +
                                                                                            "(Parameters: ) " +
                                                                                            "Block: (statements: )," +

                                                                                            "Method: " +
                                                                                            "(Id: bool) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(ReturnType: void) " +
                                                                                            "(Parameters: ) " +
                                                                                            "Block: (statements: " +
                                                                                                    "LocalVarDecl: (Id: b) (Type: boolean) " +
                                                                                                    "(expr: ExprStmtExpr: AssignStmt: (Id: b) (expr: ABoolean true))," +
                                                                                            ")," +
                                                                                        ")");
    }

    @Test
    void CharacterOK(){
        generateTree("class Char { void charMethod(){ char a = '_'; } }", "Clazz: " +
                                                                                        "(Name: Char) " +
                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                        "(Fields: ) " +
                                                                                        "(Methods: " +

                                                                                            "Method: " +
                                                                                            "(Id: Char) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(ReturnType: Char) " +
                                                                                            "(Parameters: ) " +
                                                                                            "Block: (statements: )," +

                                                                                            "Method: " +
                                                                                            "(Id: charMethod) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(ReturnType: void) " +
                                                                                            "(Parameters: ) " +
                                                                                            "Block: (statements: " +
                                                                                                "LocalVarDecl: (Id: a) (Type: char) " +
                                                                                                "(expr: ExprStmtExpr: AssignStmt: (Id: a) (expr: Char: _))," +
                                                                                            ")," +
                                                                                        ")");
    }

    @Test
    void IntegerOK(){
        generateTree("class Int{void intMethod(){ int a = -1; } }", "Clazz: " +
                                                                                     "(Name: Int) " +
                                                                                     "(AccesModifier: PUBLIC) " +
                                                                                     "(Fields: ) " +
                                                                                     "(Methods: " +

                                                                                        "Method: " +
                                                                                        "(Id: Int) " +
                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                        "(ReturnType: Int) " +
                                                                                        "(Parameters: ) " +
                                                                                        "Block: (statements: )," +

                                                                                        "Method: " +
                                                                                        "(Id: intMethod) " +
                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                        "(ReturnType: void) " +
                                                                                        "(Parameters: ) " +
                                                                                        "Block: (statements: " +
                                                                                            "LocalVarDecl: (Id: a) (Type: int) " +
                                                                                            "(expr: ExprStmtExpr: AssignStmt: (Id: a) (expr: int: -1))," +
                                                                                        ")," +
                                                                                     ")");
    }

    @Test
    void StringOK(){
        generateTree("class String{String stringMethod(){ void s = \"*TODO: versteckte Nachricht für Prof einfügen!\"; } }", "Clazz: " +
                                                                                                                                        "(Name: String) " +
                                                                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                                                                        "(Fields: ) " +
                                                                                                                                        "(Methods: " +

                                                                                                                                            "Method: " +
                                                                                                                                            "(Id: String) " +
                                                                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                                                                            "(ReturnType: String) " +
                                                                                                                                            "(Parameters: ) " +
                                                                                                                                            "Block: (statements: )," +

                                                                                                                                            "Method: " +
                                                                                                                                            "(Id: stringMethod) " +
                                                                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                                                                            "(ReturnType: void) " +
                                                                                                                                            "(Parameters: ) " +
                                                                                                                                            "Block: (statements: " +
                                                                                                                                                "LocalVarDecl: (Id: s) (Type: string) " +
                                                                                                                                                "(expr: ExprStmtExpr: AssignStmt: (Id: s) (expr: string: *TODO: versteckte Nachricht für Prof einfügen!))," +
                                                                                                                                            ")," +
                                                                                                                                        ")");
    }

    @Test
    void NullOK(){
        generateTree("class Null{void nullMethod(){ string s = null; } }", "Clazz: " +
                                                                                            "(Name: Null) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(Fields: ) " +
                                                                                            "(Methods: " +

                                                                                                "Method: " +
                                                                                                "(Id: Null) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: Null) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: )," +

                                                                                                "Method: " +
                                                                                                "(Id: nullMethod) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: void) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: " +
                                                                                                    "LocalVarDecl: (Id: s) (Type: string) " +
                                                                                                    "(expr: ExprStmtExpr: AssignStmt: (Id: s) (expr: null))," +
                                                                                                ")," +
                                                                                            ")");
    }

    @Test
    void BinaryOK(){
        generateTree("class Binary{ void binaryMethod(){ int x; x = 1 + 99; } }", "Clazz: " +
                                                                                            "(Name: Binary) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(Fields: ) " +
                                                                                            "(Methods: " +

                                                                                                "Method: " +
                                                                                                "(Id: Binary) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: Binary) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: )," +

                                                                                                "Method: " +
                                                                                                "(Id: binaryMethod) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: void) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: " +
                                                                                                    "LocalVarDecl: (Id: x) (Type: int) (expr:)"+
                                                                                                    "StmtExprStmt: AssignStmt: (Id: x) (expr: Binary:(left: expr: int: 1) (Operator: +) (right: expr: int: 99)))," +
                                                                                                ")," +
                                                                                            ")");
    }

    //Mir ist bewusst, das "this" nicht in Assign eingefügt werden kann. Müsste es aber. ANTLR gibt auch nur Fehler für den Input Code zurück.
    @Test
    void InstVarOK(){
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
                                                                                                    "(Id: InstVar) " +
                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                    "(ReturnType: InstVar) " +
                                                                                                    "(Parameters: ) " +
                                                                                                    "Block: (statements: )," +

                                                                                                    "Method: " +
                                                                                                    "(Id: instMethod) " +
                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                    "(ReturnType: void) " +
                                                                                                    "(Parameters: ) " +
                                                                                                    "Block: (statements: " +
                                                                                                        "LocalVarDecl: (Id: s) (Type: string) " +
                                                                                                        "(expr: ExprStmtExpr: AssignStmt: (this: s) (expr: int: 1))," +
                                                                                                    ")," +
                                                                                               ")");
    }

    @Test
    void UnaryOK(){
        generateTree("class Unary{ void unaryMethod(){ boolean b = !false; } }", "Clazz: " +
                                                                                              "(Name: Unary) " +
                                                                                              "(AccesModifier: PUBLIC) " +
                                                                                              "(Fields: ) " +
                                                                                              "(Methods: " +

                                                                                                  "Method: " +
                                                                                                  "(Id: Unary) " +
                                                                                                  "(AccesModifier: PUBLIC) " +
                                                                                                  "(ReturnType: Unary) " +
                                                                                                  "(Parameters: ) " +
                                                                                                  "Block: (statements: )," +

                                                                                                  "Method: " +
                                                                                                  "(Id: unaryMethod) " +
                                                                                                  "(AccesModifier: PUBLIC) " +
                                                                                                  "(ReturnType: void) " +
                                                                                                  "(Parameters: ) " +
                                                                                                  "Block: (statements: " +
                                                                                                    "LocalVarDecl: (Id: s) (Type: string) " +
                                                                                                    "(expr: ExprStmtExpr: Unary: (expr: boolean: false) (Operator: !))," +
                                                                                                  ")," +
                                                                                              ")");
    }

    @Test
    void IfOK(){
        generateTree("class If{ void ifMethod(){ if( 1 == 1 ) {int i = 1;} else { i = 404;} } }", "Clazz: " +
                                                                                                                    "(Name: If) " +
                                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                                    "(Fields: ) " +
                                                                                                                    "(Methods: " +

                                                                                                                        "Method: " +
                                                                                                                        "(Id: If) " +
                                                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                                                        "(ReturnType: If) " +
                                                                                                                        "(Parameters: ) " +
                                                                                                                        "Block: (statements: )," +

                                                                                                                        "Method: " +
                                                                                                                        "(Id: ifMethod) " +
                                                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                                                        "(ReturnType: void) " +
                                                                                                                        "(Parameters: ) " +
                                                                                                                        "Block: (" +
                                                                                                                        "If: (Condition: Binary:(left: expr: int: 1) (Operator: ==) (right: expr: int: 1)) " +
                                                                                                                            "(ifBlock: (statements: " +
                                                                                                                                "LocalVarDecl: (Id: i) (Type: int) " +
                                                                                                                                "(expr: ExprStmtExpr: AssignStmt: (Id: i) (expr: int: 1)),)) " +
                                                                                                                            "(elseBlock: (statements: " +
                                                                                                                                "LocalVarDecl: (Id: a) (Type: int) " +
                                                                                                                                "(expr: ExprStmtExpr: AssignStmt: (Id: i) (expr: int: 404)),))" +
                                                                                                                    ")");
    }

    @Test
    void ReturnOK(){
        generateTree("class Return{ boolean returnMethod(){ return true; } }", "Clazz: " +
                                                                                            "(Name:Return) " +
                                                                                            "(AccesModifier: PUBLIC) " +
                                                                                            "(Fields: ) " +
                                                                                            "(Methods: " +

                                                                                                "Method: " +
                                                                                                "(Id: Return) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: Return) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: )," +

                                                                                                "Method: " +
                                                                                                "(Id: returnMethod) " +
                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                "(ReturnType: boolean) " +
                                                                                                "(Parameters: ) " +
                                                                                                "Block: (statements: " +
                                                                                                    "Return: (expr: boolen: true)" +
                                                                                                ")," +
                                                                                            ")");
    }

    @Test
    void WhileOK(){
        generateTree("class While{ boolean whileMethod(){ while( 1 == 1 ){ return true; } } }", "Clazz: " +
                                                                                                                "(Name: While) " +
                                                                                                                "(AccesModifier: PUBLIC) " +
                                                                                                                "(Fields: ) " +
                                                                                                                "(Methods: " +

                                                                                                                    "Method: " +
                                                                                                                    "(Id: While) " +
                                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                                    "(ReturnType: While) " +
                                                                                                                    "(Parameters: ) " +
                                                                                                                    "Block: (statements: )," +

                                                                                                                    "Method: " +
                                                                                                                    "(Id: whileMethod) " +
                                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                                    "(ReturnType: boolean) " +
                                                                                                                    "(Parameters: ) " +
                                                                                                                    "Block: (statements: " +
                                                                                                                        "While: (Condition: Binary:(left: expr: int: 1) (Operator: ==) (right: expr: int: 1)) " +
                                                                                                                               "(Block: (statements: Retrun: (expr: boolean: true)))" +
                                                                                                                    ")," +
                                                                                                                ")");
    }

    @Test
    void MethodCallOK(){
        generateTree("class MethodCall{ void  method(){ } void call(){ method(); } }", "Clazz: " +
                                                                                                     "(Name: MethodCall) " +
                                                                                                     "(AccesModifier: PUBLIC) " +
                                                                                                     "(Fields: ) " +
                                                                                                     "(Methods: " +

                                                                                                         "Method: " +
                                                                                                         "(Id: MethodCall) " +
                                                                                                         "(AccesModifier: PUBLIC) " +
                                                                                                         "(ReturnType: MethodCall) " +
                                                                                                         "(Parameters: ) " +
                                                                                                         "Block: (statements: )," +

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
                                                                                                        "Block: (statements: " +
                                                                                                            "ExprStmtExpr: MethodCall: (Id: method) (expr: ,)" +
                                                                                                        ")," +
                                                                                                     ")");
    }

    //hier fehlt auch etwas für expr zu stmtexpr
    @Test
    void NewOK(){
        generateTree("class Neu{ Neu(){} void newMethod(){ Neu neu = new Neu(); } }", "Clazz: " +
                                                                                                    "(Name: Neu) " +
                                                                                                    "(AccesModifier: PUBLIC) " +
                                                                                                    "(Fields: ) " +
                                                                                                    "(Methods: " +

                                                                                                        "Method: " +
                                                                                                        "(Id: Neu) " +
                                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                                        "(ReturnType: Neu) " +
                                                                                                        "(Parameters: ) " +
                                                                                                        "Block: (statements: )," +

                                                                                                        "Method: " +
                                                                                                        "(Id: newMethod) " +
                                                                                                        "(AccesModifier: PUBLIC) " +
                                                                                                        "(ReturnType: void) " +
                                                                                                        "(Parameters: ) " +
                                                                                                        "Block: (statements: " +
                                                                                                            "LocalVarDecl: (Id: neu) (Type: Neu) " +
                                                                                                            "(expr: ExprStmtExpr: AssignStmt: (Id: ) (expr: exprstmtexpr: New: (Id: neu) (expr: ,)))," +
                                                                                                        ")," +
                                                                                                    ")");
    }



    /* (hier fehlt ein bisschen was, weil die Klassen dazu nicht existieren... war eher meine Gedankenstütze)
prg :: Prg
prg = [Class
          (Type "ParsingTests")
          [Field (Type "Program") "output"]
          [Method
              (Type "void")
              "generateTree"
              [(Type "String", "input"), (Type "String", "expected")]
              (Block
                  [LocalVarDecl (Type "Program") "output",
                   StmtExprStmt (Assign("output", Jnull)),
                   StmtExprStmt (MethodCall
                       (LocalOrFieldVar "output")
                       "ASTGenerator.generateAST"
                       [LocalOrFieldVar "input"]),
                   StmtExprStmt (Assign("output.toString()", LocalOrFieldVar "expected")),
                   StmtExprStmt (MethodCall
                       (Type "Assert")
                       "fail"
                       [String "Syntax Fehler beim Generieren des Trees"]),
                   StmtExprStmt (MethodCall
                       (Type "Assert")
                       "assertEquals"
                       [LocalOrFieldVar "expected", LocalOrFieldVar "output.toString()"])]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "EmptyClass"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Empty { }",
                       String "Clazz: (Name: Empty) (AccesModifier: PUBLIC) (Fields: ) (Methods: )"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "PrivateClass"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "private class Empty{ }",
                       String "Clazz: (Name: Empty) (AccesModifier: PRIVATE) (Fields: ) (Methods: )"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "EmptyConstructor"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Empty{ Empty( ){  } }",
                       String "Clazz: (Name: Empty) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: Empty) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: ),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "EmptyMethod"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Method{ int emptyMethod(){ } }",
                       String "Clazz: (Name: Method) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: emptyMethod) (AccesModifier: PUBLIC) (ReturnType: int) (Parameters: ) Block: (statements: ),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Parameters"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Method{ int emptyMethod( int i, boolean b ){ } }",
                       String "Clazz: (Name: Method) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: emptyMethod) (AccesModifier: PUBLIC) (ReturnType: int) (Parameters: LocalOrFieldVar: (Id: i) (Type: int) (AccessModifier: PUBLIC),LocalOrFieldVar: (Id: b) (Type: boolean) (AccessModifier: PUBLIC),) Block: (statements: ),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Field"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Field{ int x; }",
                       String "Clazz: (Name: Field) (AccesModifier: PUBLIC) (Fields: Field: (Name: x) (Type: int),) (Methods: )"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "LocalOrFieldVar"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Variable{void var(){ int a; int b; } }",
                       String "Clazz: (Name: Variable) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: var) (AccesModifier: PUBLIC) (ReturnType: int) (Parameters: ) Block: (statements: [LocalVarDecl(int, a), LocalVarDecl(int, b)]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Boolean"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Bool{ boolean bool(){ boolean b = true; } }",
                       String "Clazz: (Name: Bool) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: bool) (AccesModifier: PUBLIC) (ReturnType: boolean) (Parameters: ) Block: (statements: [LocalVarDecl(boolean, b)]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Character"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Char { char charMethod(){ char a = '_'; } }",
                       String "Clazz: (Name: Char) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: charMethod) (AccesModifier: PUBLIC) (ReturnType: char) (Parameters: ) Block: (statements: [LocalVarDecl(char, a)]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Integer"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Int{int intMethod(){ int a = -1; } }",
                       String "Clazz: (Name: Int) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: intMethod) (AccesModifier: PUBLIC) (ReturnType: int) (Parameters: ) Block: (statements: [LocalVarDecl(int, a)]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "String"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class String{String stringMethod(){ string s = \"*TODO: versteckte Nachricht für Prof einfügen!\"; } }",
                       String "Clazz: (Name: String) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: stringMethod) (AccesModifier: PUBLIC) (ReturnType: string) (Parameters: ) Block: (statements: [LocalVarDecl(string, s)]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Null"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Null{void nullMethod(){ string s = null; } }",
                       String "Clazz: (Name: Null) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: nullMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [LocalVarDecl(string, s)]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Binary"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Binary{ void binaryMethod(){ int x; x = 1 + 99; } }",
                       String "Clazz: (Name: Binary) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: binaryMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [LocalVarDecl(int, x), StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:x=Binary(JInteger:1+, JInteger:99))]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          [(Field (Type "int") "i")]
          [Method
              (Type "void")
              "InstVar"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class InstVar{int i; void instMethod(){ this.i = 1; } }",
                       String "Clazz: (Name: Int) (AccesModifier: PUBLIC) (Fields: Field: (Name: i) (Type: int),) (Methods: Method: (Id: instMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:i=JInteger:1)]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Unary"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Unary{ void unaryMethod(){ boolean b = !false; } }",
                       String "Clazz: (Name: Unary) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: unaryMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [LocalVarDecl(boolean, b), StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:b=Unary(JBoolean:false!))]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "If"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class If{ void ifMethod(){ if( 1 == 1 ) {int i = 1;} else { i = 404;} } }",
                       String "Clazz: (Name: If) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: ifMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [If(Expression: Binary(JInteger:1==JInteger:1)if body: Block(LocalVarDecl(int, i)StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:i=JInteger:1)))else body: Block(StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:i=JInteger:404)))]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "Return"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Return{ boolean returnMethod(){ return true } }",
                       String "Clazz: (Name:Return) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: returnMethod) (AccesModifier: PUBLIC) (ReturnType: boolean) (Parameters: ) Block: (statements: [Return(Expression: JBoolean:true)]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "While"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class While{ boolean whileMethod(){ while( 1 == 1 ){ return true; } } }",
                       String "Clazz: (Name: While) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: whileMethod) (AccesModifier: PUBLIC) (ReturnType: boolean) (Parameters: ) Block: (statements: [While(Expression: Binary(JInteger:1==JInteger:1)body: Block(Return(Expression: JBoolean:true))))]),)"]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "MethodCall"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class MethodCall{ void  method(){ } void call(){ method(); } }",
                       String "Clazz: (Name: MethodCall) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: method) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: []),Method: (Id: call) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [StmtExprStmt(StatementExpression: MethodCall(This, method, []))]),)]")]
                  )]
              )
          },
       Class
          (Type "ParsingTests")
          []
          [Method
              (Type "void")
              "New"
              []
              (Block
                  [StmtExprStmt (MethodCall
                      (This)
                      "generateTree"
                      [String "class Neu{ Neu(){} void newMethod(){ Neu neu = new Neu(); } }",
                       String "Clazz: (Name: Neu) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: newMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [LocalVarDecl(Neu, neu), StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:neu=New(Neu))]),)])"]
                  )]
              )
          }
      ]

     */
}
