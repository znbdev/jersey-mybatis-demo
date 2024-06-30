package com.example.mapper;

import com.example.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    @Insert("INSERT INTO products (name, price) VALUES (#{name}, #{price})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertProduct(Product product);

    @Select("SELECT * FROM products")
    List<Product> getAllProducts();
}
