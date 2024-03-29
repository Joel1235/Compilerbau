# Compilerbau

Willkommen zum Java Compiler!

# Doku

Scannen und Parsen (Koch Maximilian, Stenzel Olivier):

Grammatik: die Grammatik befindet sich als miniJava.g4-Datei im Package AntlrSrc.
Abstrakte Syntax: die Abstrakte Syntax wir in der Methode generateAST der Klasse ASTGenerator erzeugt. <br>
UML-Diagramm des ASTs: ![UML_AST](UML_AST.png "UML AST")

<br><br>
Tests:
<br>
Die Grammatik kann mittels des ANTLR-Plugins per rechtsklick auf „program“ in Zeile 3 der Datei miniJava.g4 getestet werden. Ein Beispiel für einen solchen Test wäre die Eingabe von folgendem Code:<br>
public class TestGrammar {<br>
private int i;<br>
private char buchstabe = 'a';<br>
public TestGrammar( int i){<br>
this.i = i;<br>
}<br>
public void foo (int x){<br>
I = i + x;<br>
}}. <br>

Den Parser ist zu testen, indem man den Code einer Klasse als String der Methode ASTGenerator.generateAST(String input) übergibt. Ein Beispiel hierfür wäre:<br>
ASTGenerator.generateAST("public class TestGrammar {
private int i;
private char buchstabe = 'a';
}")<br>
Diese Methode hat ein Objekt der Klasse Program als Rückgabewert, welche die im übergebenen String definierten Objekte beinhaltet.

Aufgabenverteilung:
Der Großteil der Grammatik und der Klassenstruktur des Parsers, sowie die Implementierung der übergeordneteren Klassen wie Programm, Clazz, Method,.. wurde zu Beginn von Olivier Stenzel übernommen.<br>
Die fehlenden Klassen-Implementationen, die intensive Zusammenarbeit mit dem Test-Team, sowie das Lösen der bereits vorher bekannten und hier aufgetauchten Probleme wurde von Maximilian Koch übernommen.

---

semantische Analyse (Antoni Paul, Dag, Joel):

Type Checking:
The Type Checking is started by calling the check method of TypeChecker. Expressions, Statements and StatementExpressions are not Type-checked, since our Statements, Expressions and StatementExpressions do not have Types.

All work was done by myself (Paul Antoni) since joel did not pass another course whose grade is combined with this one and therefore (somewhat understandably) decided not to work on the project.

---

Codeerzeugung (Schnüll Leo, Binzenhoefer Luis):

In der Klasse BeispielCodegen.java sind mehrere Beispiele vorhanden, an denen gezeigt ist, dass die Codegenerierung
funktioniert.
Um die Codegenerierung mit anderen Klassen zu testen, muss leider der Code der Klasse BeispielCodegen selbst verändert
werden.
Anhand der Beispiele ist demonstriert, wie eine Klasse definiert werden kann, sodass weitere Testfälle erstellt werden
können.

Nicht implementiertes(nur von Codegenerierung nicht implementiert)

1. Class Field Varaiblen werden nicht unterstützt
2. Klassen können nur den Standardkonstruktor besitzen, da Fields nicht verarbeitet werden können.

---

Testen (Kern Kevin):

Die Tests für den Parser liegen alle in ParsingTests.java.
Die Tests für den TypeChecker liegen alle in TypeCheckTests.java

Die Tests laufen via JUnit5 und können alle ausnahmslos ausgeführt werden.
In beiden Dateien habe ich zu Beginn der Klasse einige Infos beigefügt.
sämtliche .toString() Methoden stammen von mir.
Alle benötigten Tests habe ich verfasst.
Zudem habe ich immer mal wieder Zeit damit verbracht strukturelle Probleme des Projekts zu erkennen und zu analysieren, um diese anschließend an die betroffenen Teams weiterzugeben.

---
