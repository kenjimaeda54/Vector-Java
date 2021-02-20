package util;

public class Quarto {
	private String nome;
       private int quarto;
       private String email;
       private int aluguel;
    
      

	public Quarto(int aluguel,String nome,String email,int quarto) {
		this.nome = nome;
		this.quarto = quarto;
		this.email = email;
		this.aluguel = aluguel;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAluguel() {
		return aluguel;
	}
	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}
	public String toString(){
		return "Aluguel #:"
			   +aluguel
			   +" Nome do cliente: "
			   +nome
			   +".Seu email: "
			   +email
			   +".Numero do seu quarto:"
			   +quarto;
	}
   
}
