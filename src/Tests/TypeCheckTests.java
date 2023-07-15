package Tests;
import Expr.AInteger;
import Expr.LocalOrFieldVar;
import Expr.StmtExprExpr;
import General.*;
import statementExpressions.AssignStmt;
import statementExpressions.Method;
import TreeGeneration.ASTGenerator;
import TypeChecking.TypeChecker;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import statements.Block;
import statements.LocalVarDecl;
import statements.StmtExprStmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TypeCheckTests {

    //TODO: BITTE DEN NACHFOLGENDEN TEXT LESEN
    /*
    Nach Rücksprache mit dem TypeChecker Team, welches durch das Fehlen eines Mitglieds stark beeinträchtigt wurde,
    kam heraus, das es nicht angedacht ist Dingen wie Assign, Unary, CallMethod etc. Typen zu verpassen.
    Da dies also nie der Plan war, sind die folgenden Tests so konzipiert, das sie das testen, was funktionieren sollte.
    Meines erachtens nach sind die Typen für fast alle Klassen relevant und können nicht weggelassen werden. Insbesondere nicht
    bei LocalFieldVar etc.
    Zudem sind die Typen, die vom Typechecker "überschrieben" werden bereits im Parser vorhanden.
    Dem zufolge sind die Tests hier eher nutzlos.
    Einige Klassen haben nicht einmal die Variable Typ, obwohl sie benötigt wird, also ist die Abfrage unmöglich.

    Edit:
    Ich habe meine Aufgabe so verstanden, das die Objekte bzw. das Objekt Program hier von Hand erstellt werden muss und
    zwar für alle Fälle, die ich auch im ParsingTests.java habe. Leider kann ich das Objekt Program nicht korrekt generieren,
    da mindestens eine relevante Klasse fehlt (s. letzter auskommentierter Test).
    ( Stand 15.07.2023 15:45 )
    Deshalb habe ich abgebrochen und nur ein Example ganz unten eingefügt.

    geschrieben von: Kevin Kern
     */

    protected Program TypeChecker(Program in) throws Exception {
        TypeChecker checker = new TypeChecker();
        Program result = checker.check(in);
        return result;
    }
    ArrayList<Clazz> classes = new ArrayList<>();
    ArrayList<AField> field = new ArrayList<>();
    ArrayList<Method> methods = new ArrayList<>();
    Program result = null;
    @Test
    void EmptyClass(){

        classes.add(new Clazz( "Empty", field,  methods));
        try {
            result = TypeChecker(new Program(classes));
        }catch(Exception e){
            Assert.fail("Type Check auf Grund von kritischem Fehler abgebrochen");
        }
        //nichts zu prüfen
    }

    @Test
    void PrivateClass(){

        AccessModifier clazzmod = AccessModifier.PRIVATE;

        classes.add(new Clazz( clazzmod, "Empty", field,  methods));
        try {
            result = TypeChecker(new Program(classes));
        }catch(Exception e){
            Assert.fail("Type Check auf Grund von kritischem Fehler abgebrochen");
        }
        //nichts zu prüfen
    }

    @Test
    void EmptyConstructor(){

        methods.add(new Method("Empty", new ArrayList<>(), new Block(Arrays.asList())));

        classes.add(new Clazz( "Empty", field,  methods));
        try {
            result = TypeChecker(new Program(classes));
        }catch(Exception e){
            Assert.fail("Type Check auf Grund von kritischem Fehler abgebrochen");
        }
        //nichts zu prüfen
    }

    @Test
    void EmptyMethod(){

        methods.add(new Method("emptyMethod", new ArrayList<>(), new Block(Arrays.asList())));

        classes.add(new Clazz(  "Method", field,  methods));
        try {
            result = TypeChecker(new Program(classes));
        }catch(Exception e){
            Assert.fail("Type Check auf Grund von kritischem Fehler abgebrochen");
        }
        //nichts zu prüfen
    }

    @Test
    void Parameters(){


        List<LocalOrFieldVar> params = new ArrayList<>();
        params.add(new LocalOrFieldVar(new AType("int"), "i"));
        params.add(new LocalOrFieldVar(new AType("boolean"), "b"));

        methods.add(new Method("emptyMethod", params, new Block(Arrays.asList())));

        classes.add(new Clazz( "Method", field,  methods));
        try {
            result = TypeChecker(new Program(classes));
        }catch(Exception e){
            Assert.fail("Type Check auf Grund von kritischem Fehler abgebrochen");
        }
        assertEquals(new AType("int"), result.getClazzes().get(0).getMethods().get(0).getParams().get(0).getType());
        assertEquals(new AType("boolean"), result.getClazzes().get(0).getMethods().get(0).getParams().get(1).getType());
    }

    @Test
    void Field(){

        field.add(new AField(new AType("int"), "x"));

        classes.add(new Clazz( "Field", field,  methods));
        try {
            result = TypeChecker(new Program(classes));
        }catch(Exception e){
            Assert.fail("Type Check auf Grund von kritischem Fehler abgebrochen");
        }
        assertEquals(new AType("int"), result.getClazzes().get(0).getFields().get(0).getType());
    }

    @Test
    void FieldFail(){

        field.add(new AField(new AType("void"), "x"));

        classes.add(new Clazz( "Field", field,  methods));
        try {
            result = TypeChecker(new Program(classes));
        }catch(Exception e){
            return; //Fehler erwartet
        }
        Assert.fail("void ist kein Valider Feld Typ, wird aber akzeptiert");
    }


    //Bitte den folgenden Block auskommentieren uns selbst das Problem begutachten.


    /*
    @Test
    void shouldBeLikeFollowing(){

        field.add(new AField(new AType("int"), "x"));

        List<LocalOrFieldVar> params = new ArrayList<>();
        params.add(new LocalOrFieldVar(new AType("int"), "i"));
        params.add(new LocalOrFieldVar(new AType("boolean"), "b"));

        methods.add(new Method(AccessModifier.PUBLIC, new ReturnType("boolean"), "booleanMethod", params, new Block(Arrays.asList(new LocalVarDecl(new AType("int"), "i", new ExprStmtExpr("", new AssignStmt("i", new AInteger(404))))))));

        classes.add(new Clazz( "Field", field,  methods));
        try {
            result = TypeChecker(new Program(classes));
        }catch(Exception e){
            Assert.fail("Type Check auf Grund von kritischem Fehler abgebrochen");
        }
        //das ist alles quatsch, da ich das selbe Feld abfrage, das bereits aus dem Parser kommt. der Type Checker ändert nichts.
        assertEquals(new AType("int"), result.getClazzes().get(0).getFields().get(0).getType());
        assertEquals(new AType("boolean").toString(), result.getClazzes().get(0).getMethods().get(0).getReturnType().toString());
        assertEquals(new AType("int"), result.getClazzes().get(0).getMethods().get(0).getParams().get(0).getType());
        assertEquals(new AType("boolean"), result.getClazzes().get(0).getMethods().get(0).getParams().get(1).getType());
        //funktioniert ohnehin nicht
        assertEquals(new AType("int"), ((LocalVarDecl)result.getClazzes().get(0).getMethods().get(0).getBlock().getStatements().get(0)).getType());
        assertEquals(new AType("int"), ((LocalVarDecl)result.getClazzes().get(0).getMethods().get(0).getBlock().getStatements().get(0)).getExpr());
        //der Assign etc lässt sich gar nicht abfragen, da dort keine Types sind und sich der Assign nicht korrekt erstellen lässt
    }
    */



    //weitere Tests der Typisierung lohnen sich nicht und lassen sich auch nicht korrekt erstellen, da mir der Link zwischen StmtExpr und Expr fehlt.
    //Ich bitte um Verständnis.
    //Natürlich habe ich mir dennoch Gedanken gemacht, wie das alles aufgebaut sein müsste.
    //Der nachfolgende Teil war meine Gedankenstütze und beinhaltet Quasi die komplette ParsingTests.jar. Ich habe dies nicht zu Ende gebracht, da der Type Checker einiges nicht unterstützt.





    /*
    prg :: Prg
prg = [Class
        (Type "ParsingTests")
        []
        [Method
          (Type "void")
          "generateTree"
          [Type "String", Type "String"]
          (Block
            [TypedStmtExpr (MethodCall
              This
              "generateTree"
              [TypedExpr (String "class String{String stringMethod(){ string s = \"*TODO: versteckte Nachricht für Prof einfügen!\"; } }") (Type "String"),
               TypedExpr (String "Clazz: (Name: String) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: stringMethod) (AccesModifier: PUBLIC) (ReturnType: string) (Parameters: ) Block: (statements: [LocalVarDecl(string, s)]),)") (Type "String")])]
          )
        ],
      Class
        (Type "ParsingTests")
        []
        [Method
          (Type "void")
          "EmptyClass"
          []
          (Block
            [TypedStmtExpr (MethodCall
              This
              "generateTree"
              [TypedExpr (String "class Empty { }") (Type "String"),
               TypedExpr (String "Clazz: (Name: Empty) (AccesModifier: PUBLIC) (Fields: ) (Methods: )") (Type "String")])]
          ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "PrivateClass"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "private class Empty{ }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Empty) (AccesModifier: PRIVATE) (Fields: ) (Methods: )") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "EmptyConstructor"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Empty{ Empty( ){  } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Empty) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: Empty) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: ),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "EmptyMethod"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Method{ int emptyMethod(){ } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Method) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: emptyMethod) (AccesModifier: PUBLIC) (ReturnType: int) (Parameters: ) Block: (statements: ),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Parameters"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Method{ int emptyMethod( int i, boolean b ){ } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Method) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: emptyMethod) (AccesModifier: PUBLIC) (ReturnType: int) (Parameters: LocalOrFieldVar: (Id: i) (Type: int) (AccessModifier: PUBLIC),LocalOrFieldVar: (Id: b) (Type: boolean) (AccessModifier: PUBLIC),) Block: (statements: ),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Field"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Field{ int x; }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Field) (AccesModifier: PUBLIC) (Fields: Field: (Name: x) (Type: int),) (Methods: )") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "LocalOrFieldVar"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Variable{void var(){ int a; int b; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Variable) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: var) (AccesModifier: PUBLIC) (ReturnType: int) (Parameters: ) Block: (statements: [LocalVarDecl(int, a), LocalVarDecl(int, b)]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Boolean"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Bool{ boolean bool(){ boolean b = true; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Bool) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: bool) (AccesModifier: PUBLIC) (ReturnType: boolean) (Parameters: ) Block: (statements: [LocalVarDecl(boolean, b)]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Character"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Char { char charMethod(){ char a = '_'; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Char) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: charMethod) (AccesModifier: PUBLIC) (ReturnType: char) (Parameters: ) Block: (statements: [LocalVarDecl(char, a)]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Integer"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Int{int intMethod(){ int a = -1; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Int) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: intMethod) (AccesModifier: PUBLIC) (ReturnType: int) (Parameters: ) Block: (statements: [LocalVarDecl(int, a)]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "String"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class String{String stringMethod(){ string s = \"*TODO: versteckte Nachricht für Prof einfügen!\"; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: String) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: stringMethod) (AccesModifier: PUBLIC) (ReturnType: string) (Parameters: ) Block: (statements: [LocalVarDecl(string, s)]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Null"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Null{void nullMethod(){ string s = null; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Null) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: nullMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [LocalVarDecl(string, s)]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Binary"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Binary{ void binaryMethod(){ int x; x = 1 + 99; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Binary) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: binaryMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [LocalVarDecl(int, x), StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:x=Binary(JInteger:1+, JInteger:99))]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "InstVar"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class InstVar{int i; void instMethod(){ this.i = 1; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Int) (AccesModifier: PUBLIC) (Fields: Field: (Name: i) (Type: int),) (Methods: Method: (Id: instMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:i=JInteger:1)]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Unary"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Unary{ void unaryMethod(){ boolean b = !false; } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Unary) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: unaryMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [LocalVarDecl(boolean, b), StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:b=Unary(JBoolean:false!))]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "If"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class If{ void ifMethod(){ if( 1 == 1 ) {int i = 1;} else { i = 404;} } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: If) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: ifMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [If(Expression: Binary(JInteger:1==JInteger:1)if body: Block(LocalVarDecl(int, i)StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:i=JInteger:1)))else body: Block(StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:i=JInteger:404)))]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "Return"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Return{ boolean returnMethod(){ return true } }") (Type "String"),
                TypedExpr (String "Clazz: (Name:Return) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: returnMethod) (AccesModifier: PUBLIC) (ReturnType: boolean) (Parameters: ) Block: (statements: [Return(Expression: JBoolean:true)]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "While"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class While{ boolean whileMethod(){ while( 1 == 1 ){ return true; } } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: While) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: whileMethod) (AccesModifier: PUBLIC) (ReturnType: boolean) (Parameters: ) Block: (statements: [While(Expression: Binary(JInteger:1==JInteger:1)body: Block(Return(Expression: JBoolean:true))))]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "MethodCall"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class MethodCall{ void  method(){ } void call(){ method(); } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: MethodCall) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: method) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: []),Method: (Id: call) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [StmtExprStmt(StatementExpression: MethodCall(This, method, []))])]),)") (Type "String")])]
           ),
       Class
         (Type "ParsingTests")
         []
         [Method
           (Type "void")
           "New"
           []
           (Block
             [TypedStmtExpr (MethodCall
               This
               "generateTree"
               [TypedExpr (String "class Neu{ Neu(){} void newMethod(){ Neu neu = new Neu(); } }") (Type "String"),
                TypedExpr (String "Clazz: (Name: Neu) (AccesModifier: PUBLIC) (Fields: ) (Methods: Method: (Id: newMethod) (AccesModifier: PUBLIC) (ReturnType: void) (Parameters: ) Block: (statements: [LocalVarDecl(Neu, neu), StmtExprStmt(StatementExpression: Assign:LocalOrFieldVar:neu=New(Neu))])]),)") (Type "String")])]
           )]

     */

}
