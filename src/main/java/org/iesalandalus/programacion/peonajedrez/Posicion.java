package org.iesalandalus.programacion.peonajedrez;

public class Posicion {

	private int fila;
	private char columna;


	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {

		if(fila<1 || fila>8){
			throw new IllegalArgumentException("ERROR: Fila no v�lida");
		} else {

			this.fila = fila;
		}

	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {

		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no v�lida");
		} else {
			this.columna = columna;
		}
	}
	
	/*Constructor*/
	

	Posicion(int fila,char columna){

		if(fila<1 || fila>8){
			throw new IllegalArgumentException("ERROR: Fila no v�lida");
		} else {

			this.setFila(fila);
		}

		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no v�lida");
		} else {
			this.setColumna(columna);
		}


	}


	
	
	

}
