package entities;

import java.util.Date;

public class Usuario {
	private Long id;
	private String login;
	private String senha; 
	private String nome; 
	private boolean ativo;
	private Date dataNascimento;
	private Date dataCdastro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataCdastro() {
		return dataCdastro;
	}
	public void setDataCdastro(Date dataCdastro) {
		this.dataCdastro = dataCdastro;
	}
	
	
}
