package com.rajdowa.wallet.controller;

import com.rajdowa.wallet.entity.Category;
import com.rajdowa.wallet.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @PostMapping(name = "/newCategory")
    public void saveCategory(@RequestParam(value = "name") String name) {
        Category category = Category.builder()
                .id(categoryRepository.generateId())
                .name(name)
                .build();

        categoryRepository.save(category);
    }

}
