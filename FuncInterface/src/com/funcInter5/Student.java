package com.funcInter5;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	private int subjectTotal;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	public int getSubjectTotal() {
		subjectTotal = englishScore + mathScore;
		return subjectTotal;
	}	
}
