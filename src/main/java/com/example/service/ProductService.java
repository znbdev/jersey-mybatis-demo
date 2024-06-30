package com.example.service;

import com.example.mapper.ProductMapper;
import com.example.model.Product;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ProductService {

    private final SqlSessionFactory sqlSessionFactory;

    public ProductService(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public Product createProduct(Product product) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            ProductMapper mapper = session.getMapper(ProductMapper.class);
            mapper.insertProduct(product);
            session.commit();
        }
        return product;
    }

    public List<Product> getAllProducts() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            ProductMapper mapper = session.getMapper(ProductMapper.class);
            return mapper.getAllProducts();
        }
    }
}
