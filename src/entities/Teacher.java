package entities;

/**
 * 
 * Created by Adriano Pavaneli on 07/08/2022 
 * Esta classe é responsável por
 * mantendo o controle do nome do professor, id, salário..
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

	/**
	 * Cria um novo objeto professor.
	 * 
	 * @param id     id do professor.
	 * @param name   nome do professor.
	 * @param salary salario do professor.
	 */

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

	/**
	 * 
	 * @return o id do professor.
	 */

	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return nome do professor.
	 */

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return o salario do professor.
	 */

	public int getSalary() {
		return salary;
	}

	/**
	 * defini  o salario.
	 * @param salary
	 */
	public void setSalary(int salary){
        this.salary=salary;
	}
	
	/**
	 * Adiciona o salario pago.
     * Remove do total de dinheiro ganho pela escola.
	 * @param d
	 */
	 public void receiveSalary(int d){
	        salaryEarned+=d;
	        School.updateTotalMoneySpent(d);
	    }

	

	@Override
	public String toString() {
		return "Nome do Professor: " + name
				+ ". Total de salario recebido até agora R$" + salaryEarned;
	}
	
	
	
	
	

}
