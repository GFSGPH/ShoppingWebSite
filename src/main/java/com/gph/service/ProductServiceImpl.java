package com.gph.service;


import com.gph.dao.ProductDao;
import com.gph.po.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao pd;

    public List<Product> selectAll() {
        return pd.selectAll();
    }

    public Product selectOne(int product_id) {
        return pd.selectOne(product_id);
    }

    public int insert(Product product) {
        return pd.insert(product);
    }

    public int update(Product product) {
        return pd.update(product);
    }

    public int delete(int product_id) {
        return pd.delete(product_id);
    }
}
