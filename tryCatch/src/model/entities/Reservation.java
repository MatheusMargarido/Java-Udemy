package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	// SIMPLEDATEFORMAT PARA FORMATAR A DATA INSTANCIADA
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	// CONSTRUTOR VAZIO E UM COM VARIAVEIS
	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	// GETTERS E SETTERS
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	// METODO DURAÇÃO QUE RETORNARÁ UM LONG(USADO PARA ARMAZENAR INTEIROS GRANDES)
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

	// METODO DE UPDATE DAS DATAS DE CHECK-IN E CHECK-OUT 
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		
		// CALCULANDO SE O CHECK-IN OU O CHECK-OUT É ANTES DE "NOW" INSTANCIADO ACIMA
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		// ATRIBUINDO OS NOVOS VALORES QUE RECEBEU NO METODO
		this.checkIn = checkIn;
		this.checkOut = checkOut;

	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)
				+ " ," + duration() + " nights";

	}
}
