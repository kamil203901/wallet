package com.rajdowa.wallet.controller;

import com.rajdowa.wallet.entity.Category;
import com.rajdowa.wallet.entity.UsersCategories;
import com.rajdowa.wallet.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @PostMapping("/newCategory")
    public void saveCategory(@ModelAttribute(value="usersCategoriesInput") UsersCategories usersCategories) {
        System.out.println(usersCategories);
//        Category category = Category.builder()
//                .id(categoryRepository.generateId())
//                .name(name)
//                .build();
//
//        categoryRepository.save(category);
    }

    @GetMapping("/kaszanka")
    public String getCategories(Model model) {
        List<Category> all = categoryRepository.findAll();
        model.addAttribute("categoriesDTO", all);

        model.addAttribute("usersCategoriesInput", new UsersCategories());
        return "index";
    }

}
