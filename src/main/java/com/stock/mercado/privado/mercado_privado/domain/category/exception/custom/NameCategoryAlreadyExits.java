package com.stock.mercado.privado.mercado_privado.domain.category.exception.custom;

import com.stock.mercado.privado.mercado_privado.domain.shared.exception.gobalexception.AlreadyException;

public class NameCategoryAlreadyExits extends AlreadyException {
    public NameCategoryAlreadyExits(String message) {
        super(message);
    }
}
