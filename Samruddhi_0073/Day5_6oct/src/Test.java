import java.util.Arrays;
import java.util.Date;

public class Test {
	  private static int count =0;
      private int id;
      private String subjectName;
      private Date testDate;
      private Question[] questionList;
      private int noOfQuestions;
      
      public Test() {
    	  id=0;
    	  subjectName=null;
    	  testDate=null;
    	  questionList=null;
    	  noOfQuestions=0;
      }
      public Test(String subjectName , Date testDate , Question[] questionList , int noOfQuestions) {
    	  count++;
    	  this.id=count;
    	  this.subjectName=subjectName;
    	  this.testDate=testDate;
    	  this.questionList=questionList;
    	  this.noOfQuestions=noOfQuestions;
      }
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Test.count = count;
	}
	public int getId() {
		return id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public Question[] getQuestionList() {
		return questionList;
	}
	public void setQuestionList(Question[] questionList) {
		this.questionList = questionList;
	}
	public int getNoOfQuestions() {
		return noOfQuestions;
	}
	public void setNoOfQuestions(int noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}
	
	@Override
	public String toString() {
		return "Test [id=" + id + ", subjectName=" + subjectName + ", testDate=" + testDate + ", questionList="
				+ Arrays.toString(questionList) + ", noOfQuestions=" + noOfQuestions + "]";
	}
	
      
      
}
