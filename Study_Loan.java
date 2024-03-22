package third_term_project;

public class Study_Loan {
	
	private static Integer studyLoan = (int) (50000*Math.random() + 50000);

	public static Integer getStudyLoan() {
		return studyLoan;
	}

	public void setStudyLoan(int studyLoan) {
		this.studyLoan = studyLoan;
	}
	public static void checkLoan() {
		System.out.println("Your debt in Study Loan is: " + getStudyLoan()+ "TRY");
	}
	
	
}
