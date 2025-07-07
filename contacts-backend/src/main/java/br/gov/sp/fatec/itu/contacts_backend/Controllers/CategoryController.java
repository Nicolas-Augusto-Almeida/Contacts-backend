package br.gov.sp.fatec.itu.contacts_backend.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.itu.contacts_backend.Entities.Category;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin
public class CategoryController {

    @GetMapping
    public List<Category> getAllCategories() {
        return Arrays.asList(Category.values());
    }
}