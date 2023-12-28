package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.parse("2023-12-20");
		LocalDateTime d2 = LocalDateTime.parse("2023-12-20T01:21:30");
		Instant d3 = Instant.parse("2023-07-20T01:30:26Z");

		//SUBTRAINDO E SOMANDO DATAS NO lOCALDATE
		LocalDate pastWeekLocalDate = d1.minusDays(7);
		LocalDate nextWeekLocalDate = d1.plusDays(7);

		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);

		//SUBTRAINDO E SOMANDO DATAS NO lOCALDATETIME
		LocalDateTime pastWeekLocalDateTime = d2.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d2.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		//SUBTRAINDO E SOMANDO DATAS NO INSTANT
		Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstan: " + pastWeekInstant);
		System.out.println("nextWeekInstan: " + nextWeekInstant);
		
		// CALCULANDO O PERIODO DE INTERVALO ENTRE DUAS DATAS
		Duration t1 = Duration.between(pastWeekLocalDateTime, d2);
		System.out.println("T1 Dias: "+ t1.toDays());
		
		
		
		
		
	}

}
