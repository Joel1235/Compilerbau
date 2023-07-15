# Codegenerierung

## Codegenerierung alleinig testen
In der Klasse BeispielCodegen.java sind mehrere Beispiele vorhanden, an denen gezeigt ist, dass die Codegenerierung funktioniert.
Um die Codegenerierung mit anderen Klassen zu testen, muss leider der Code der Beispielcodegen selbst verändert werden.
Anhand der beispiele ist demonstriert, wie eine Klasse definiert werden kann, sodass weitere Testfälle erstellt werden können.
## Nicht Implementiertes
1. Class Field Varaiblen werden nicht unterstützt
2. Klassen können nur den Standartconstruktor besitzen, da ja eh keine Field verarbeitet werden können
## Bekannte Fehler
1. Wenn eine LocalVarDecleration vor einem Statement aufgerufen wird, das eine GOTO oder IF Anweisung beinhaltet, so crasht das Programm mit dem Fehler:Index 0 out of bounds for length 0 in der Methode computeAllFrames.
2. Wenn ein Assign in einer while Schleife aufgerufen wird, kommt es zum selben Fheler wie bei 1.
3. 