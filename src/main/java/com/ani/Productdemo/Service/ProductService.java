package com.ani.Productdemo.Service;

import com.ani.Productdemo.Entity.Product;
import com.ani.Productdemo.Exception.ResourceNotFoundException;
import com.ani.Productdemo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public Product addProduct(Product p){


      return  productRepository.save(p);

    }

    public List<Product> saveProducts(List<Product>  lp) {

        return productRepository.saveAll(lp);

    }

    public String   deleteProductByID(Integer i){

         productRepository.deleteById(i);

         return "Deleted Record with product id "+i;
    }

    public List<Product> getAllProducts(){

      return productRepository.findAll();

    }

    public Product getProductByPid(Integer id){

      // return productRepository.findById(id).orElseThrow(()-> new RuntimeException("No record found for this pid "));

        return productRepository.findById(id).orElse(null);
    }

    public Product getProductByPName(String productName){

        return productRepository.findByName(productName).orElseThrow(() -> new ResourceNotFoundException("Record not found for Product name searched "));

    }

    public Product updateProductDetails(Product product){

        Optional<Product> p = productRepository.findById(product.getId());
        if (p.isPresent()) {
            p.get().setName(product.getName());
            p.get().setQuantity(product.getQuantity());
            p.get().setPrice(product.getPrice());
            return productRepository.save(p.get());
        } else {
            return null;
        }

    }



}
