package com.stock.mercado.privado.mercado_privado.ports.category.in.mapper;

import com.stock.mercado.privado.mercado_privado.domain.category.model.Category;
import com.stock.mercado.privado.mercado_privado.ports.category.in.dto.request.CreateCategoryRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreateCategoryMapper {

    Category toCategory(CreateCategoryRequest createCategoryRequest);

}
