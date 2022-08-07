package entities;

/**
 * Created by Adriano Pavaneli on 07/08/2022. 
 * esta classe é responsável por manter o
 * acompanhamento das taxas dos alunos, nome, nota e taxas
 * pago.
 * 
 */
public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * Para criar um novo aluno inicializando.
	 * @param id id do aluno: único.
	 * @param name nome do estudante
	 * @param grade nota do aluno.
	 */
	
	
	public Student(int id, String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
	}
	
	
	
	//Não vou alterar o nome do aluno, a identificação do aluno.
	
	/**
	 * Usado para atualizar a nota do aluno.
	 * @param grade nova nota do aluno.
	 */
	
	public void setGrade(int grade) {
		this.grade=grade;
		
	}
	
	/**
	 * Continue adicionando as taxas ao campo feesPaid..
	 * Adicione as taxas às taxas pagas.
	 * A escola vai receber os fundos.
	 * 
	 * @param fees  as taxas que o aluno paga.
	 */
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	/**
	 * 
	 * @return id do estudante.
	 */

	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return nome do estudante.
	 */

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return nota do estudante.
	 */

	public int getGrade() {
		return grade;
	}

	/**
	 * 
	 * @return dinheiro pago pelo aluno.
	 */

	public int getFeesPaid() {
		return feesPaid;
	}

	/**
	 * 
	 * @return taxas totais do estudante.
	 */

	public int getFeesTotal() {
		return feesTotal;
	}
	/**
	 * 
	 * @return taxas restantes.
	 */
	public int getReimainingFees() {
		return feesTotal - feesPaid;
	}



	@Override
	public String toString() {
		return "Nome do Estudante: " + name + 
				". Total de taxas paga até agora R$" + feesPaid;
	}
	
	
	

}
