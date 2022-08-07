package main;

import java.util.ArrayList;
import java.util.List;

import entities.School;
import entities.Student;
import entities.Teacher;


/**
 * Created by Adriano Pavaneli on 07/08/2022 
 */
public class Main {

	public static void main(String[] args) {
		Teacher Renata = new Teacher(1, "Renata", 500);
		Teacher Roberto = new Teacher(2, "Roberto", 1000);
		Teacher Andreia = new Teacher(3, "Andreia", 800);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Renata);
		teacherList.add(Roberto);
		teacherList.add(Andreia);
		
		Student Rodrigo = new Student(1, "Rodrigo", 4);
		Student Marcos = new Student(2, "Marcos", 12);
		Student Beatriz = new Student(3, "Beatriz", 5);
		List<Student> studentList = new ArrayList<>();
		studentList.add(Rodrigo);
		studentList.add(Marcos);
		studentList.add(Beatriz);
		
		
		School ghs = new School(teacherList, studentList);
		
		
		Rodrigo.payFees(5000);
		Marcos.payFees(6000);
		System.out.println("GHS has earned R$" + ghs.getTotalMoneyEarned());

		System.out.println("------------\r\n"
				+ "-----------------Fazendo Escola Pagar Salário-------------");
		Renata.receiveSalary(Renata.getSalary());
		System.out.println("GHS gastou por salario para " + Renata.getName() + 
				" e agora tem R$" + ghs.getTotalMoneyEarned());
		
		Roberto.receiveSalary(Roberto.getSalary());
		System.out.println("GHS gastou por salario para " + Roberto.getName() + 
				" e agora tem R$" + ghs.getTotalMoneyEarned());
	
		
		System.out.println(Marcos);
		System.out.println(Renata);
	}

}
