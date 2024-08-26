package com.kajolmulla.nimaptask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.kajolmulla.nimaptask.pojo.Category;
import com.kajolmulla.nimaptask.service.CategoryService;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public Page<Category> getAllCategories(@RequestParam(defaultValue = "0") int page) {
        return categoryService.getAllCategories(page, 10); // 10 items per page
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
