package com.rajdowa.wallet.bootstrap;

import com.rajdowa.wallet.entity.Category;
import com.rajdowa.wallet.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category category = Category.builder()
                .id(categoryRepository.generateId())
                .name("kamil")
                .build();
        categoryRepository.save(category);
    }
}
