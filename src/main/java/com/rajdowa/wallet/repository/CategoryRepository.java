package com.rajdowa.wallet.repository;


import com.rajdowa.wallet.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

    default String generateId() {
        return "CAT-" + UUID.randomUUID();
    }

}
