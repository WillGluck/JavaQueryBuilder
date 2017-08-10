package com.brufstudios.javaquerybuilder;

public class Main {
	
	public static void main(String[] args) {
		
		//Pensamentos...
		
		Query
		.select()
			.table("u").column("nome").alias("nomeUsuario")
			.table("u").column("idade")
			.column("cpf").alias("cpfUsuario")
			.column("numero")
			.subSelect().all().from().table("xyz")
		.from().table("usuario").alias("u")
		.innerJoin("cidade").on().field("cidade.id").equals().field()
		.leftJoin().select().all().from().table("pais").where("pais").on().
		
			
	}

}
