package com.api.livros.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage>erros = new ArrayList<FieldMessage>();

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
	}

	public List<FieldMessage> getErros() {
		return erros;
	}

	public void addError(String fieldMessage, String message) {
		erros.add(new FieldMessage(fieldMessage,message));
	}
}
