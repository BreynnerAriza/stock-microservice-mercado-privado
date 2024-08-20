package com.stock.mercado.privado.mercado_privado.domain.category.usecase;

import com.stock.mercado.privado.mercado_privado.domain.category.api.ICategoryServicePort;
import com.stock.mercado.privado.mercado_privado.domain.category.model.Category;
import com.stock.mercado.privado.mercado_privado.domain.category.spi.ICategoryPersistencePort;

public class CategoryUseCase implements ICategoryServicePort {

    private final ICategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }

    @Override
    public void saveCategory(Category category) {
        categoryPersistencePort.saveCategory(category);
    }

}
