package com.funcInter5;

public class Student {
	private String name;
	private String sex;
	private int score;
	private int englishScore;
	private int mathScore;
	private int subjectTotal;
	
	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
//		this.englishScore = englishScore;
//		this.mathScore = mathScore;
	}
	
	
	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
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
