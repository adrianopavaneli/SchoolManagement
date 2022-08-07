package entities;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and student
 * using an ArrayList.
 * Created by Adriano Pavaneli on 07/08/2022 
 */

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	/**
	 * new school is created;
	 * @param teachers list of teacheres in the school.
	 * @param students list of students int the school.
	 */
	
	public School(List<Teacher> teachers, List<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneyEarned = 0;
		
		
	}
	
	/**
	 * 
	 * @return the list of teachers int the school.
	 */

	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Adds a teacher to the school.
	 * @param teacher the teacher to be added.
	 */
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return the list of students in the school.
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Adds a students to the school.
	 * @param students the student to be added.
	 */
	public void addStudents(Student student) {
		students.add(student);
	}
	
	/**
	 * 
	 * @return the total money earned by the school.
	 */

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the total money earned by the school.
	 * @param totalMoneyEarned money that is supposed to be added.
	 */
	public void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	/**
	 * 
	 * @return the total money spent by the school.
	 */

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	/**
	 * update the money that is spent by the school which
	 * is the salary given by the school to its teachers. 
	 * @param MoneySpent the money spent by school.
	 */

	public void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned = totalMoneyEarned-MoneySpent;
		totalMoneySpent -= MoneySpent;
	}
	
	
	
	

}
