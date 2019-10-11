package br.edu.ifpb.esp.poo.whatsapp;

public interface WhatsappInterface {
	
	public void cadastrar(String usuario, String senha);
	
	public void login(String usuario, String senha);

	public void enviarMensagem(String mensagem, int contato);
	
	public void receberMensagem(String mensagem, int contato);
	
	public void arquivarMensagem(int contato);
	
	public void deletarMensagem(int contato);
}
