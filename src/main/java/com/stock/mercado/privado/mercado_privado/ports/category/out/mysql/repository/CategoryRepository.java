package com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.repository;

import com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.entitiy.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByName(String name);

}
