# Compilerbau

Willkommen zum Java Compiler!

# Doku

Scannen und Parsen (Koch Maximilian, Stenzel Olivier):

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
