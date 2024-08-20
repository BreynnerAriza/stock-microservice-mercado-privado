package com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.adapter;

import com.stock.mercado.privado.mercado_privado.domain.category.exception.custom.NameCategoryAlreadyExits;
import com.stock.mercado.privado.mercado_privado.domain.category.model.Category;
import static com.stock.mercado.privado.mercado_privado.domain.category.exception.constants.CategoryMessageException.*;
import com.stock.mercado.privado.mercado_privado.domain.category.spi.ICategoryPersistencePort;
import com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.mapper.CategoryEntityMapper;
import com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategoryAdapter implements ICategoryPersistencePort {

    private final CategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;


    @Override
    public void saveCategory(Category category) {
        if(categoryRepository.findByName(category.getName()).isPresent())
            throw new NameCategoryAlreadyExits(NAME_CATEGORY_ALREADY_EXISTS.getMessage());
        categoryRepository.save(categoryEntityMapper.toCategoryEntity(category));
    }

}
