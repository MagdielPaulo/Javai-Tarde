
package gerencclientes;

// Classe teste

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// A classe herda "JFrame" justamente por conter uma interface gráfica (e pra facilitar as coisas)

public class Teste extends JFrame {
	
	// Inicializando algumas variáveis como "JButton" (o proprio nome já meio que ja diz pra que serve)
	
	private static JButton adic, remov, cons, sair;
   
	// Inicializando o painel (onde vao ficar os botões)
	
	JPanel painel = new JPanel();
	
	// Criando a janela, utilizando JFrame
		
    public static void main(String[] args) {

    	// Definindo alguns aspectos da janela
    	
    	Teste janela = new Teste();
    	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	janela.setSize(350,100);
    	janela.setResizable(false);
    	janela.setVisible(true);
    	janela.setLocationRelativeTo(null);

     }
	
    // Construtor
    
    public Teste() {
            
    	/*
    	Nessa parte foram adicionados os botões criados anteriormente e técnicamente "complementando"
    	alguns dos aspectos do "JFrame" (nome de janela, operação realizada ao fechar o programa
    	e adicionar o painel)
    	*/
            super("Gerenciador de usuarios");
            this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            this.getContentPane().add(painel);
            
            adic = new JButton("Adicionar usuario");
            painel.add(adic);

            remov = new JButton("Remover usuarios");
            painel.add(remov);
            
            cons = new JButton("Consultar usuarios");
            painel.add(cons);
            
            sair = new JButton("Sair");
            painel.add(sair);
            
            // Inicializando um objeto na classe "Botões"
            
            Botoes botoes = new Botoes();
            
            // Adicionando os "listeners" dos botões
            
            adic.addActionListener(botoes);
            remov.addActionListener(botoes);
            cons.addActionListener(botoes);
            sair.addActionListener(botoes);
            
            // O "FlowLayout" serve pra deixar o painel mais organizado
            
            painel.setLayout(new FlowLayout(FlowLayout.CENTER));
            
    }
    
    // Classe botões, implementando "ActionListener"
    
	class Botoes implements ActionListener {
		
		// Inicializando uma arraylist de clientes (pois posteriormente varios atributos serão associados)
		
		Cliente cliente; {
			cliente = new Cliente(); 
			ArrayList <Cliente> lista = new ArrayList <Cliente>();   
			lista.add(cliente);
			
		}
		
		/*
		O método actionPerformed é "chamado" quando uma ação
		é executada, no caso do botão, a ação é o clique
		*/
		
		public void actionPerformed(ActionEvent e) {
			
			/*
			Caso escolhida a opção "adic", será inicializado 3 campos de texto como
			"JTextField", que depois serão associados a um JOptionPane no qual o usuario
			deverá inserir os dados correspondentes ao cliente (nome, numero e email)
			*/
			
			if (e.getSource() == adic) {
				
				JTextField campo0 = new JTextField();
				JTextField campo1 = new JTextField();
				JTextField campo2 = new JTextField();
				
				Object[] campos = {
						
					"Nome", campo0,
					"Numero", campo1,
					"Email", campo2,
					
				};
				
				int opcao = JOptionPane.showConfirmDialog(null, campos, "Insira os dados do usuario", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				
				/*
				Caso a opção selecionada corresponda ao numero 0 (opção "Ok"), será verificado 
				se o campo "nome" contem algum nome, para depois adicionar o cliente. Se não
				for informado o nome do cliente, será exibida uma mensagem de "aviso"
				*/
				
				if (opcao == 0) {
					
					if (!campo0.getText().equals("")) {

						cliente.setNome(campo0.getText());
						cliente.setNumero(campo1.getText());
						cliente.setEmail(campo2.getText());
						
					}
					
					else {
						
						JOptionPane.showMessageDialog(null, "Insira pelo menos o nome do cliente", "Aviso", JOptionPane.WARNING_MESSAGE);
					
					}
				}
			}
			
			/*
			Caso escolhida a opção "cons", será inicializado um JOptionPane no
			qual o usuario deverá inserir os nome do cliente a ser consultado.
			Apos o nome ser informado o programa realizara uma busca por todos
			os clientes, para depois exibir as informações do cliente inserido.
			Caso o cliente não esteja cadastrado, sera exibida uma mensagem de erro
			afirmando que o cliente não consta na lista
			*/
				
			else if (e.getSource() == cons) {
				
				String consCliente = JOptionPane.showInputDialog(null, "Insira o nome do cliente a ser consultado", "Consultar cliente", JOptionPane.PLAIN_MESSAGE);
				
				for (int i = 0; i < cliente.nome.length; i++) {
					
					try {
						
						if (cliente.nome[i].equals(consCliente)) {
							JOptionPane.showMessageDialog(null, "Nome do cliente: " +cliente.nome[i] +"\n"
							+"Numero do cliente: " +cliente.numero[i]+"\n"
							+"Email do cliente: " +cliente.email[i], 
							"Dados do cliente", JOptionPane.PLAIN_MESSAGE);
							break;
							
						}
					}
					
					catch(Exception ex) {
						
						if (!consCliente.equals("")) {
							JOptionPane.showMessageDialog(null, "Cliente não cadastrado" +" (" +consCliente +")", "Erro", JOptionPane.ERROR_MESSAGE);
						}
						
						break;
						
					}
				}
			}
			
			/*
			Caso escolhida a opção "remov", será inicializado um JOptionPane no
			qual o usuario deverá inserir os nome do cliente a ser removido.
			Apos o nome ser informado o programa realizara uma busca por todos
			os clientes, para depois remover ocliente inserido. Caso o cliente
			não esteja cadastrado, sera exibida uma mensagem de erro afirmando
			que o cliente não consta na lista
			*/
			
			else if (e.getSource() == remov) {
				
				String removCliente = JOptionPane.showInputDialog(null, "Insira o nome do cliente a ser removido", "Remover cliente", JOptionPane.PLAIN_MESSAGE);
							
				for (int i = 0; i < cliente.nome.length; i++) {
					
					try {
						
						if (cliente.nome[i].equals(removCliente)) {
							
							cliente.nome[i] = null;
							cliente.numero[i] = null;
							cliente.email[i] = null;
							JOptionPane.showMessageDialog(null, "Cliente removido" +" (" +removCliente +")", "Sucesso", JOptionPane.PLAIN_MESSAGE);
							break;
							
						}
					}
					
					catch(Exception ex) {

						if (!removCliente.equals("")) {
							JOptionPane.showMessageDialog(null, "Cliente não cadastrado" +" (" +removCliente +")", "Erro", JOptionPane.ERROR_MESSAGE);
						}
						
						break;
						
					}
				}
			}
			
			// Se sair sai
			
			else {
				
				System.exit(0);
				
			}
		}
	}
}
