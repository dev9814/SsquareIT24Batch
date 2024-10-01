package srp_solid;

public class LoanServiceClass {

	public void loanBook(MemberClass member, BookClass book) {
		
//		Code to loan book to member
		System.out.println("Book '" + book.getTitle() + "' loaned to member " + member.getName() + ".");
		
	}
	
	public static void main(String args[]) {
		
		MemberClass mc = new MemberClass("dev", "111");
		BookClass bc = new BookClass("clear thinking", "shane parish");
		
		LoanServiceClass lsc = new LoanServiceClass();
		
		lsc.loanBook(mc, bc);
		
	}
	
	
}
