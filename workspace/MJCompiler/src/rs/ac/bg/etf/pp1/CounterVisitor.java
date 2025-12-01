package rs.ac.bg.etf.pp1;

import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.SyntaxNode;
import rs.ac.bg.etf.pp1.ast.VarDecl;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

public class CounterVisitor extends VisitorAdaptor {

	protected int count;
	
	public int getCount() {
		return count;
	}
	
	Logger log = Logger.getLogger(getClass());
	private boolean errorDetected = false;
	
	public void report_error(String message, SyntaxNode info) {
		errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0: info.getLine();	
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.error(msg.toString());	
	}

	public void report_info(String message, SyntaxNode info) {
		StringBuilder msg = new StringBuilder(message); 	
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)	
			msg.append (" na liniji ").append(line);	
		log.info(msg.toString());
	}
	
	//---------------------------------------------
	
	public static class VarCounter extends CounterVisitor {
		public void visit(VarDecl varDecl) {
			report_info("PRepoznata varijabla ",null);
			count++;
		}
	}
	
}
