package by.grsu.ka.datamodel;

import java.util.List;

public class Test extends AbstractModel {
	private String subject;
	private int countOfQuestions;
	private int finalPoint;
	List<Question> questions;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getCountOfQuestions() {
		return countOfQuestions;
	}
	public void setCountOfQuestions(int countOfQuestions) {
		this.countOfQuestions = countOfQuestions;
	}
	
	public int getFinalPoint() {
		return finalPoint;
	}
	public void setFinalPoint(int finalPoint) {
		this.finalPoint = finalPoint;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
		

}

class Question {
	private String question;
	private String[] answers;
	private String tryAnswer;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getAnswers() {
		return answers;
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	public String getTryAnswer() {
		return tryAnswer;
	}
	public void setTryAnswer(String tryAnswer) {
		this.tryAnswer = tryAnswer;
	}
	
}