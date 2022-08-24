/* AQUI ESTÁ CHAMANDO A SUPERCLASSE (CATEGORIA.SERVICE.JAVA) PARA APRESENTA O ERRO (COMO SE FOSSE UMA FUNÇÃO)*/

package com.example.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
