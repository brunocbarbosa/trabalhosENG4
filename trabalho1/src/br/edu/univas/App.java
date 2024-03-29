package br.edu.univas;

import java.util.List;

public class App {

	public static void main(String[] args) {
		FlightDAO flightDAO = new FlightDAO();
		List<Flight> flights = flightDAO.getAll();
		FlightAdapter adapter = new FlightAdapterImpl(flightDAO);
		
		for (Flight flight : flights) {
			System.out.println(flight);
		}
		
		for (Flight flight : adapter.getAllFlights()) {
			System.out.println(flight);
		}
		
		/* 
		 * Valor: 5 pontos
		 * Data Entrega: 19/09/2019
		 * Como Entregar: Subir o c�digo para o Github do aluno e enviar o link do Github para o email: rodrigolfsi@gmail.com
		 * Descri��o:
		 * Um segundo cliente apareceu para nossa aplica��o. Mas esse cliente gostaria de saber as horas do voo no fuso hor�rio
		 * de Los Angeles - EUA. Atualmente a aplica��o entrega os horarios dos voos no fuso hor�rio de S�o Paulo.
		 * Utilizando algum design pattern aprendido, altere a aplica��o, sem mexer nas classes FlightDAO e Fligh, para 
		 * atender esse novo cliente.
		 */
	}
}

