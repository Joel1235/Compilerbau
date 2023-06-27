package Syntaxcollection.Statements;

import java.util.Vector;

public class Block implements IStatement {
    private String type;
    public int line;
    public int column;

    private Vector statements;

}
