package br.edu.ifpb.esp.poo.whatsapp;

public class Cadastrar implements WhatsappInterface {

	private String Usuario;
	private String Senha;
	
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;		
	}
	
	
}
