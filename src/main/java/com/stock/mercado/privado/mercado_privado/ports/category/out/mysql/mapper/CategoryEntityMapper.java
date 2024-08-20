package com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.mapper;

import com.stock.mercado.privado.mercado_privado.domain.category.model.Category;
import com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.entitiy.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryEntityMapper {

    CategoryEntity toCategoryEntity(Category category);

}
