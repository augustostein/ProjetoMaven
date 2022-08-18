package cursoDev;

public class Titular {
	
	private String nome;
	private String cpf;
	
	
	public Titular(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
	}
	
	@Override
    public String toString() {
        return "\nTitular da conta: " + nome
                + "\nTipo de conta: " + cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
        
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
