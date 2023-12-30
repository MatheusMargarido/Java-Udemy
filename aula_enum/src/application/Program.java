package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.aguardando_pagamento);

		System.out.println(order);

		// TRANSFORMANDO UMA STRING PARA UM ENUM
		
		OrderStatus os1 = OrderStatus.Entregue;
		OrderStatus os2 = OrderStatus.valueOf("Entregue");
		System.out.println(os1);
		System.out.println(os2);

	}

}
