import java.util.Arrays;

public class Question {
	private static int countQ=0;
	private int id;
	private String questionText;
	private String[] options;
	private String answer;
	
	public Question() {
		
	}
	
	public Question( String questionText, String[] options, String answer) {
		countQ+=1;
		this.id=countQ;
		this.questionText = questionText;
		this.options = options;
		this.answer = answer;
	}

	public static int getCountQ() {
		return countQ;
	}

	public static void setCountQ(int countQ) {
		Question.countQ = countQ;
	}

	public int getId() {
		return id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", questionText=" + questionText + ", options=" + Arrays.toString(options)
				+ ", answer=" + answer + "]";
	}
	
	
	
}
