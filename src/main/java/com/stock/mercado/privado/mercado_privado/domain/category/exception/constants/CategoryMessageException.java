package com.stock.mercado.privado.mercado_privado.domain.category.exception.constants;

public enum CategoryMessageException {

    NAME_CATEGORY_ALREADY_EXISTS("Name category already exists");

    private final String message;

    CategoryMessageException(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
