package main;

import java.util.ArrayList;
import java.util.Scanner;

import entities.School;
import entities.Student;
import entities.Teacher;


/**
 * Created by Adriano Pavaneli on 07/08/2022 
 */
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o numero de Professores a cadastrar: ");
		int p = sc.nextInt();
		ArrayList<Teacher> teacherlist = new ArrayList<>();
		ArrayList<Student> studentlist = new ArrayList<>();
		for(int i=1; i<=p;i++) {
			int id = p;
			System.out.println("Digite o nome do professor: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite o salário do professor: ");
			int grade = sc.nextInt();
			Teacher teacher = new Teacher(id, name, grade);
			teacherlist.add(teacher);	
			
		}
		System.out.println("Digite o numero de alunos a cadastrar: ");
		int a = sc.nextInt();
		
		for(int i=1; i<=a;i++) {
			int id = p;
			System.out.println("Digite o nome do aluno: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite a nota do aluno: ");
			int grade = sc.nextInt();
			Student student = new Student(id, name, grade);
			studentlist.add(student);
			System.out.println("Digite o valor da mensalidade: ");
			int mensalidade = sc.nextInt();
			School.updateTotalMoneyEarned(mensalidade);
		}
		School objetivo = new School(teacherlist, studentlist);
		
		
		
		System.out.println("Objetivo recebeu R$" + objetivo.getTotalMoneyEarned());

		System.out.println("------------\r\n"
				+ "-----------------Fazendo Escola Pagar Salário-------------");
		
		for (Teacher teacher : teacherlist) {
			teacher.receiveSalary(teacher.getSalary());
			System.out.println("Objetivo gastou com salario para" + teacher.getName() 
			+ "e agora tem R$" + objetivo.getTotalMoneyEarned());
		}
		
		
		for (Student student : studentlist) {
			System.out.println(student);
			
		}
	
		

		
	
		
		
		
		
		
		
		
		
		sc.close();

	}

}
