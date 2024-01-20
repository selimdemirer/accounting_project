package com.cydeo.fintracker.service;


import com.cydeo.fintracker.exception.CategoryNotFoundException;
import com.cydeo.fintracker.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto getById(Long id) ;
    List<CategoryDto> listAllCategories();
    CategoryDto update(CategoryDto category) ;
    void delete(Long id) ;
    CategoryDto save(CategoryDto category);


}