package com.brunomendes.ScrapingData.model;

public class Time {
	
	private String nome;
	private String  pontos;
	private String  jogos;
	private String  vitorias;
	private String  empates;
	private String  derrotas;
	private String  golsMarcados;
	private String  golsSofridos;
	private String  saldoDeGols;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPontos() {
		return pontos;
	}
	public void setPontos(String pontos) {
		this.pontos = pontos;
	}
	public String getJogos() {
		return jogos;
	}
	public void setJogos(String jogos) {
		this.jogos = jogos;
	}
	public String getVitorias() {
		return vitorias;
	}
	public void setVitorias(String vitorias) {
		this.vitorias = vitorias;
	}
	public String getEmpates() {
		return empates;
	}
	public void setEmpates(String empates) {
		this.empates = empates;
	}
	public String getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(String derrotas) {
		this.derrotas = derrotas;
	}
	public String getGolsMarcados() {
		return golsMarcados;
	}
	public void setGolsMarcados(String golsMarcados) {
		this.golsMarcados = golsMarcados;
	}
	public String getGolsSofridos() {
		return golsSofridos;
	}
	public void setGolsSofridos(String golsSofridos) {
		this.golsSofridos = golsSofridos;
	}
	public String getSaldoDeGols() {
		return saldoDeGols;
	}
	public void setSaldoDeGols(String saldoDeGols) {
		this.saldoDeGols = saldoDeGols;
	}
	@Override
	public String toString() {
		return "Time [nome=" + nome + ", pontos=" + pontos + ", jogos=" + jogos + ", vitorias=" + vitorias
				+ ", empates=" + empates + ", derrotas=" + derrotas + ", golsMarcados=" + golsMarcados
				+ ", golsSofridos=" + golsSofridos + ", saldoDeGols=" + saldoDeGols + "]";
	}
	
	
}
