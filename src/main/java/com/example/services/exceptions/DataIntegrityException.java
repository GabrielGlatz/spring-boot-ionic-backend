/* AQUI ESTÁ CHAMANDO A SUPERCLASSE (CATEGORIA.SERVICE.JAVA) PARA APRESENTA O ERRO (COMO SE FOSSE UMA FUNÇÃO)*/

package com.example.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
