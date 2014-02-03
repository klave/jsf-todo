package klave.jsf.todo.model;

import java.util.Calendar;

public class Todo {
	private String id, titolo, descrizione;
	private int priorita;
	private Calendar scandeza;

	/*
	 * Costruttori
	 */
	public Todo(String titolo, String descrizione, int priorita) {
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.priorita = priorita;
	}
	
	/*
	 * Getter & Setter
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getPriorita() {
		return priorita;
	}

	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}

	public Calendar getScandeza() {
		return scandeza;
	}

	public void setScandeza(Calendar scandeza) {
		this.scandeza = scandeza;
	}

}
