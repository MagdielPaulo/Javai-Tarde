
package gerencclientes;


// Classe do cliente, onde todos os atributos e métodos do mesmo se encontram

public class Cliente {
    
	protected String nome[] = new String[3];
	   
	protected String numero[] = new String[3];
	   
	protected String email[] = new String[3];

	// Retorna o nome do cliente
	
	public String getNome() {

		for (int i = 0; i < nome.length; i++) {
			return this.nome[i];
		}
		
		return null;
		
	}

	// Define o nome do cliente caso esteja em branco
	   
	public void setNome(String novoNome) {

		for (int i = 0; i < nome.length; i++) {
			
			if (nome[i] == null) {
				
				this.nome[i] = novoNome;
				break;
			
			}
		}	
	}

	// Retorna o numero do cliente
	   
	public String getNumero() {

		for (int i = 0; i < numero.length; i++) {
			return this.numero[i];
		}
		
		return null;
		
	}

	// Define o numero do cliente caso esteja em branco
	
	public void setNumero(String novoNumero) {

		for (int i = 0; i < numero.length; i++) {
			
			if (numero[i] == null) {
				
				this.numero[i] = novoNumero;
				break;
			
			}
		}	
	}

	// Retorna o email do cliente
	
	public String getEmail() {

		for (int i = 0; i < email.length; i++) {
			return this.email[i];
		}
		
		return null;
		
	}

	// Define o email do cliente caso esteja em branco
	   
	public void setEmail(String novoEmail){

		for (int i = 0; i < email.length; i++) {
			
			if (email[i] == null) {
				
				this.email[i] = novoEmail;
				break;
			
			}
		}	
	}
	 
}