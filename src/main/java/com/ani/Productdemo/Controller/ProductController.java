package com.ani.Productdemo.Controller;


import com.ani.Productdemo.Entity.Product;
import com.ani.Productdemo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // needed for react app api call
public class ProductController {
@Autowired
ProductService productService;

@PostMapping("/product-add")
public Product addProduct(@RequestBody Product p){

   return productService.addProduct(p);
}

@DeleteMapping("/delete-product/{id}")
public String deleteProduct(@PathVariable Integer id){

    return productService.deleteProductByID(id);
}

@GetMapping("/products")
public List<Product> getProducts(){
    return productService.getAllProducts();
}

@GetMapping("/product/{pid}")
public Product getProductById(@PathVariable Integer pid){

 return productService.getProductByPid(pid);
}

    @GetMapping("/product-name/{productName}")
    public Product getProductByName(@PathVariable String productName){

        return productService.getProductByPName(productName);
    }

@PutMapping("update-product")
 public Product updateProduct(@RequestBody Product p){

    return productService.updateProductDetails(p);
}

}
