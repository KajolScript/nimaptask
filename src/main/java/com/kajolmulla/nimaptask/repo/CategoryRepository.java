package com.kajolmulla.nimaptask.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kajolmulla.nimaptask.pojo.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
