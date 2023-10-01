package com.educaciencia.odm.validacao;

/* ********************************************************************** 
*************** PROJETO EDUUCACIENCIA ***********************************
*************************************************************************
****** Data: 30/09/2023
****** Projeto: APROVACAO ESCOLAR
****** Versão: 1.0
****** Atualização: 30/09/2023
************************************************************************/

public class Calcula_Semestre_2 {

	private double media_portugues;
	private String portugues;

	private double media_matematica;
	private String matemarica;

	private double media_historia;
	private String historia;

	private double media_geografia;
	private String geografia;

	boolean status_calcula_portugues = false;
	boolean status_calcula_matematica = false;
	boolean status_calcula_historia = false;
	boolean status_calcula_geografia = false;

	public Calcula_Semestre_2() {
		super();
	}

	public Calcula_Semestre_2(double media_portugues, String portugues, double media_matematica, String matemarica,
			double media_historia, String historia, double media_geografia, String geografia,
			boolean status_calcula_portugues, boolean status_calcula_matematica, boolean status_calcula_historia,
			boolean status_calcula_geografia) {
		super();
		this.media_portugues = media_portugues;
		this.portugues = portugues;
		this.media_matematica = media_matematica;
		this.matemarica = matemarica;
		this.media_historia = media_historia;
		this.historia = historia;
		this.media_geografia = media_geografia;
		this.geografia = geografia;
		this.status_calcula_portugues = status_calcula_portugues;
		this.status_calcula_matematica = status_calcula_matematica;
		this.status_calcula_historia = status_calcula_historia;
		this.status_calcula_geografia = status_calcula_geografia;
	}

	public double getMedia_portugues() {
		return media_portugues;
	}

	public void setMedia_portugues(double media_portugues) {
		this.media_portugues = media_portugues;
	}

	public String getPortugues() {
		return portugues;
	}

	public void setPortugues(String portugues) {
		this.portugues = portugues;
	}

	public double getMedia_matematica() {
		return media_matematica;
	}

	public void setMedia_matematica(double media_matematica) {
		this.media_matematica = media_matematica;
	}

	public String getMatemarica() {
		return matemarica;
	}

	public void setMatemarica(String matemarica) {
		this.matemarica = matemarica;
	}

	public double getMedia_historia() {
		return media_historia;
	}

	public void setMedia_historia(double media_historia) {
		this.media_historia = media_historia;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public double getMedia_geografia() {
		return media_geografia;
	}

	public void setMedia_geografia(double media_geografia) {
		this.media_geografia = media_geografia;
	}

	public String getGeografia() {
		return geografia;
	}

	public void setGeografia(String geografia) {
		this.geografia = geografia;
	}

	public boolean isStatus_calcula_portugues() {
		return status_calcula_portugues;
	}

	public void setStatus_calcula_portugues(boolean status_calcula_portugues) {
		this.status_calcula_portugues = status_calcula_portugues;
	}

	public boolean isStatus_calcula_matematica() {
		return status_calcula_matematica;
	}

	public void setStatus_calcula_matematica(boolean status_calcula_matematica) {
		this.status_calcula_matematica = status_calcula_matematica;
	}

	public boolean isStatus_calcula_historia() {
		return status_calcula_historia;
	}

	public void setStatus_calcula_historia(boolean status_calcula_historia) {
		this.status_calcula_historia = status_calcula_historia;
	}

	public boolean isStatus_calcula_geografia() {
		return status_calcula_geografia;
	}

	public void setStatus_calcula_geografia(boolean status_calcula_geografia) {
		this.status_calcula_geografia = status_calcula_geografia;
	}

}
