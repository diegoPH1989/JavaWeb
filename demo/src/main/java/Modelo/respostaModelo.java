package Modelo;

public class respostaModelo {
	private String Mensagem;
	
	public respostaModelo() {}
	
	public respostaModelo(String Mensagem) {
		this.Mensagem = Mensagem;		
		
	}

	public String getMensagem() {
		return Mensagem;
	}

	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}
	
}
	
