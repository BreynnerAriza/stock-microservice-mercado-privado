package com.stock.mercado.privado.mercado_privado.ports.category.out.mysql.entitiy;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "category")
@Builder @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;
    private String name;
    private String description;

}
