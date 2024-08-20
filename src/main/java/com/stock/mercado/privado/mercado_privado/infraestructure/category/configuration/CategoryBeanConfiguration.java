package com.stock.mercado.privado.mercado_privado.infraestructure.category.configuration;

import com.stock.mercado.privado.mercado_privado.domain.category.api.ICategoryServicePort;
import com.stock.mercado.privado.mercado_privado.domain.category.spi.ICategoryPersistencePort;
import com.stock.mercado.privado.mercado_privado.domain.category.usecase.CategoryUseCase;
import com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.adapter.CategoryAdapter;
import com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.mapper.CategoryEntityMapper;
import com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CategoryBeanConfiguration {

    private final CategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Bean
    public ICategoryPersistencePort getCategoryPersistencePort(){
         return new CategoryAdapter(categoryRepository, categoryEntityMapper);
    }

    @Bean
    public ICategoryServicePort getCategoryServicePort(){
        return new CategoryUseCase(getCategoryPersistencePort());
    }

}
