package com.educaciencia.odm.response;

/* ********************************************************************** 
*************** PROJETO EDUUCACIENCIA ***********************************
*************************************************************************
****** Data: 30/09/2023
****** Projeto: APROVACAO ESCOLAR
****** Versão: 1.0
****** Atualização: 30/09/2023
************************************************************************/

public class Resultado {

	private double resultado_media_portugues;
	private String portugues = "sem media atribuida";

	private double resultado_media_matematica;
	private String matemarica = "sem media atribuida";

	private double resultado_media_historia;
	private String historia = "sem media atribuida";

	private double resultado_media_geografia;
	private String geografia = "sem media atribuida";

	boolean status_portugues = false;
	boolean status_matematica = false;
	boolean status_historia = false;
	boolean status_geografia = false;

	public Resultado() {
		super();
	}

	public Resultado(double resultado_media_portugues, String portugues, double resultado_media_matematica,
			String matemarica, double resultado_media_historia, String historia, double resultado_media_geografia,
			String geografia, boolean status_portugues, boolean status_matematica, boolean status_historia,
			boolean status_geografia) {
		super();
		this.resultado_media_portugues = resultado_media_portugues;
		this.portugues = portugues;
		this.resultado_media_matematica = resultado_media_matematica;
		this.matemarica = matemarica;
		this.resultado_media_historia = resultado_media_historia;
		this.historia = historia;
		this.resultado_media_geografia = resultado_media_geografia;
		this.geografia = geografia;
		this.status_portugues = status_portugues;
		this.status_matematica = status_matematica;
		this.status_historia = status_historia;
		this.status_geografia = status_geografia;
	}

	public double getResultado_media_portugues() {
		return resultado_media_portugues;
	}

	public void setResultado_media_portugues(double resultado_media_portugues) {
		this.resultado_media_portugues = resultado_media_portugues;
	}

	public String getPortugues() {
		return portugues;
	}

	public void setPortugues(String portugues) {
		this.portugues = portugues;
	}

	public double getResultado_media_matematica() {
		return resultado_media_matematica;
	}

	public void setResultado_media_matematica(double resultado_media_matematica) {
		this.resultado_media_matematica = resultado_media_matematica;
	}

	public String getMatemarica() {
		return matemarica;
	}

	public void setMatemarica(String matemarica) {
		this.matemarica = matemarica;
	}

	public double getResultado_media_historia() {
		return resultado_media_historia;
	}

	public void setResultado_media_historia(double resultado_media_historia) {
		this.resultado_media_historia = resultado_media_historia;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public double getResultado_media_geografia() {
		return resultado_media_geografia;
	}

	public void setResultado_media_geografia(double resultado_media_geografia) {
		this.resultado_media_geografia = resultado_media_geografia;
	}

	public String getGeografia() {
		return geografia;
	}

	public void setGeografia(String geografia) {
		this.geografia = geografia;
	}

	public boolean isStatus_portugues() {
		return status_portugues;
	}

	public void setStatus_portugues(boolean status_portugues) {
		this.status_portugues = status_portugues;
	}

	public boolean isStatus_matematica() {
		return status_matematica;
	}

	public void setStatus_matematica(boolean status_matematica) {
		this.status_matematica = status_matematica;
	}

	public boolean isStatus_historia() {
		return status_historia;
	}

	public void setStatus_historia(boolean status_historia) {
		this.status_historia = status_historia;
	}

	public boolean isStatus_geografia() {
		return status_geografia;
	}

	public void setStatus_geografia(boolean status_geografia) {
		this.status_geografia = status_geografia;
	}

}
