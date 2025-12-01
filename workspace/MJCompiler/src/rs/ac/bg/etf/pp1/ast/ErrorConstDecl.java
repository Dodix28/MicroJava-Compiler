// generated with ast extension for cup
// version 0.8
// 27/5/2024 13:9:43


package rs.ac.bg.etf.pp1.ast;

public class ErrorConstDecl extends ConstDeclList {

    public ErrorConstDecl () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ErrorConstDecl(\n");

        buffer.append(tab);
        buffer.append(") [ErrorConstDecl]");
        return buffer.toString();
    }
}
