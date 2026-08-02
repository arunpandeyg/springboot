package com.blog.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryId;
    @NotEmpty
    @Size(min = 4, message = "min size of category title is 4 char")
    private String categoryTitle;
    @NotBlank
    @Size(min = 10, message = "min size of category Description is 10 char")
    private String categoryDescription;
}
