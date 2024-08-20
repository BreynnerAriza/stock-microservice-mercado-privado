package com.stock.mercado.privado.mercado_privado.domain.category.spi;

import com.stock.mercado.privado.mercado_privado.domain.category.model.Category;

public interface ICategoryPersistencePort {

    void saveCategory(Category category);

}
