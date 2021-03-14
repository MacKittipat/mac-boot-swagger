package com.mackittipat.macbootswagger.controller;

import com.mackittipat.macbootswagger.model.Product;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @ApiOperation(value = "Find all products")
    @GetMapping("")
    public List<Product> findProduct() {

        Product product = new Product();
        product.setId(1);
        product.setName("Soap");
        product.setPrice(10.00);
        product.setQuantity(100);

        return Arrays.asList(product);
    }

    @ApiOperation(value = "Find a product by id")

    @GetMapping("/{id}")
    public Product findProductById(
            @ApiParam(value = "Id of product", example = "123")
            @PathVariable("id") Long id) {

        Product product = new Product();
        product.setId(id);
        product.setName("Soap");
        product.setPrice(10.00);
        product.setQuantity(100);

        return product;
    }
}
