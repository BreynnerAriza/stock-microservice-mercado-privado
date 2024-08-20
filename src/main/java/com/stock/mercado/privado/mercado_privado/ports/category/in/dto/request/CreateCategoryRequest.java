package com.stock.mercado.privado.mercado_privado.ports.category.in.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public record CreateCategoryRequest(
    @NotBlank(message = "{name.required}")
    @Size(max = NAME_LENGTH, message = "{name.length.invalid}")
    String name,
    @NotBlank(message = "{description.required}")
    @Size(max = DESCRIPTION_LENGTH, message = "{description.length.invalid}")
    String description
) implements Serializable {

    private static final int NAME_LENGTH = 50;
    private static final int DESCRIPTION_LENGTH = 90;

}
