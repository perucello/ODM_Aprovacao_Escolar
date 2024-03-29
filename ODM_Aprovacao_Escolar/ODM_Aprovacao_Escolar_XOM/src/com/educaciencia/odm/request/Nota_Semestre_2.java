package com.educaciencia.odm.request;

/* ********************************************************************** 
*************** PROJETO EDUUCACIENCIA ***********************************
*************************************************************************
****** Data: 30/09/2023
****** Projeto: APROVACAO ESCOLAR
****** Vers�o: 1.0
****** Atualiza��o: 30/09/2023
************************************************************************/

public class Nota_Semestre_2 {

	private double nota_portugues;
	private double nota_matematica;
	private double nota_historia;
	private double nota_geografia;

	public Nota_Semestre_2() {
		super();
	}

	public Nota_Semestre_2(double nota_portugues, double nota_matematica, double nota_historia, double nota_geografia) {
		super();
		this.nota_portugues = nota_portugues;
		this.nota_matematica = nota_matematica;
		this.nota_historia = nota_historia;
		this.nota_geografia = nota_geografia;
	}

	public Nota_Semestre_2(double nota_portugues, double nota_matematica, double nota_historia) {
		super();
		this.nota_portugues = nota_portugues;
		this.nota_matematica = nota_matematica;
		this.nota_historia = nota_historia;
	}

	public Nota_Semestre_2(double nota_portugues, double nota_matematica) {
		super();
		this.nota_portugues = nota_portugues;
		this.nota_matematica = nota_matematica;
	}

	public Nota_Semestre_2(double nota_portugues) {
		super();
		this.nota_portugues = nota_portugues;
	}

	public double getNota_portugues() {
		return nota_portugues;
	}

	public void setNota_portugues(double nota_portugues) {
		this.nota_portugues = nota_portugues;
	}

	public double getNota_matematica() {
		return nota_matematica;
	}

	public void setNota_matematica(double nota_matematica) {
		this.nota_matematica = nota_matematica;
	}

	public double getNota_historia() {
		return nota_historia;
	}

	public void setNota_historia(double nota_historia) {
		this.nota_historia = nota_historia;
	}

	public double getNota_geografia() {
		return nota_geografia;
	}

	public void setNota_geografia(double nota_geografia) {
		this.nota_geografia = nota_geografia;
	}

}
