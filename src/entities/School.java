package entities;

import java.util.List;

/**
 * Muitos Professores, Muitos Estudantes.
 * Implementa professores e alunos
 * usando uma ArrayList.
 * Created by Adriano Pavaneli on 07/08/2022 
 */

	public class School {

	    private List<Teacher> teachers;
	    private List<Student> students;
	    private static int  totalMoneyEarned;
	    private static int totalMoneySpent;
	
	/**
	 * new school is created;
	 * @param teachers lista de professores da escola.
	 * @param students lista de estudantes da escola.
	 */
	
	    public School(List<Teacher> teachers, List<Student> students) {
	        this.teachers = teachers;
	        this.students = students;
	        totalMoneyEarned=0;
	        totalMoneySpent=0;
	    }
	
	/**
	 * 
	 * @return lista de professores da escola.
	 */

	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Adiciona um professor na escola.
	 * @param teacher professor a ser adicionado.
	 */
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return lista de estudantes da escola.
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Adiciona um estudante na escola.
	 * @param estudante a ser adicionado.
	 */
	public void addStudents(Student student) {
		students.add(student);
	}
	
	/**
	 * 
	 * @return o total de dinheiro ganho pela escola.
	 */

	public double getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adiciona o total de dinheiro ganho pela escola.
	 * @param totalMoneyEarned dinheiro que deveria ser adicionado.
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
	/**
	 * 
	 * @return o dinheiro total gasto pela escola.
	 */

	public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
	/**
	 * atualizar o dinheiro que é gasto pela escola que
	 * é o salário dado pela escola aos seus professores. 
	 * @param MoneySpent o dinheiro gasto pela escola.
	 */

	public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
	
	
	
	

}
