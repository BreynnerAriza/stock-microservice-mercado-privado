package com.stock.mercado.privado.mercado_privado.ports.category.in.controller;

import com.stock.mercado.privado.mercado_privado.domain.category.api.ICategoryServicePort;
import com.stock.mercado.privado.mercado_privado.ports.category.in.dto.request.CreateCategoryRequest;
import com.stock.mercado.privado.mercado_privado.ports.category.in.mapper.CreateCategoryMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryRestController {

    private final ICategoryServicePort categoryServicePort;
    private final CreateCategoryMapper createCategoryMapper;

    @PostMapping("/")
    public ResponseEntity<Void> saveCategory(@Valid @RequestBody CreateCategoryRequest categoryRequest){
        categoryServicePort.saveCategory(createCategoryMapper.toCategory(categoryRequest));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
