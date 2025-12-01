// generated with ast extension for cup
// version 0.8
// 27/5/2024 13:9:43


package rs.ac.bg.etf.pp1.ast;

public class ConstDecls extends ConstDeclList {

    private ConstDeclList ConstDeclList;
    private Constanta Constanta;

    public ConstDecls (ConstDeclList ConstDeclList, Constanta Constanta) {
        this.ConstDeclList=ConstDeclList;
        if(ConstDeclList!=null) ConstDeclList.setParent(this);
        this.Constanta=Constanta;
        if(Constanta!=null) Constanta.setParent(this);
    }

    public ConstDeclList getConstDeclList() {
        return ConstDeclList;
    }

    public void setConstDeclList(ConstDeclList ConstDeclList) {
        this.ConstDeclList=ConstDeclList;
    }

    public Constanta getConstanta() {
        return Constanta;
    }

    public void setConstanta(Constanta Constanta) {
        this.Constanta=Constanta;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstDeclList!=null) ConstDeclList.accept(visitor);
        if(Constanta!=null) Constanta.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDeclList!=null) ConstDeclList.traverseTopDown(visitor);
        if(Constanta!=null) Constanta.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDeclList!=null) ConstDeclList.traverseBottomUp(visitor);
        if(Constanta!=null) Constanta.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDecls(\n");

        if(ConstDeclList!=null)
            buffer.append(ConstDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Constanta!=null)
            buffer.append(Constanta.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDecls]");
        return buffer.toString();
    }
}
