package com.generic;

import java.util.Arrays;

public class WildCardExampl {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	} //제네릭객체 타입에 제한을 두는것 ?만있으면 다 받는다.
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	} //학생과 그 하위인 고등학생
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	} //직장인 그리고 그 상위인 일반인

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		 personCourse.add(new Person("일반인"));
		 personCourse.add(new Worker("직장인"));
		 personCourse.add(new Student("학생"));
		 personCourse.add(new HighStudent("고등학생"));
		Course<Worker> workerCourse = new Course<Worker> ("직장인과정", 5);
		 workerCourse.add(new Worker("직장인"));
		Course<Student> studentCourse = new Course<Student> ("학생과정", 5);
		 studentCourse.add(new Student("학생"));
		 studentCourse.add(new HighStudent("고등학생"));
		Course<HighStudent> highStudentCourse = new Course<HighStudent> ("고등학생과정", 5);
		 highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
	}
}
