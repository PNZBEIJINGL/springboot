package com.boot.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "产品管理相关接口")
@RequestMapping("/product")
public class ProductController {

    /**
     * Restful: 【POST】 /Products # 新建产品信息
     *
     * @param productName
     * @param productCode
     * @return
     */
    @PostMapping("/")
    @ApiOperation("新建产品接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productName", value = "产品名称", defaultValue = "测试产品"),
            @ApiImplicitParam(name = "productCode", value = "产品编码", defaultValue = "99999", required = true)
    }
    )
    public Product addProduct(String productName, @RequestParam(required = true) String productCode) {
        System.out.println("do addProduct");
        Product product = new Product();
        product.setProductName("高清包");
        product.setId(1000L);
        return product;
    }

    /**
     * Restful: 【PUT】 /Products/1001 # 更新产品信息(全部字段)
     *
     * @param
     * @return
     */
    @PutMapping("/{id}")
    @ApiOperation("更新产品接口")
    public Product updateProduct(@RequestBody Product product) {
        System.out.println("do update");
        return product;
    }

    /**
     * Restful: 【GET】 /Products/1000 # 查询产品信息列表
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation("查询产品接口")
    @ApiImplicitParam(name = "id", value = "产品id", defaultValue = "99", required = true)
    public Product getProduct(@PathVariable Long id) {
        System.out.println("do getProductById");
        Product product = new Product();
        product.setId(id);
        product.setProductName("基本包产品");
        product.setProductCode("BASIC");
        return product;
    }

    /**
     * Restful: 【DELETE】 /Products/1001 # 删除产品信息
     */
    @DeleteMapping("/{id}")
    @ApiOperation("删除产品接口")
    @ApiImplicitParam(name = "id", value = "产品id")
    public void deleteProduct(@PathVariable Long id) {
        System.out.println("do deleteProduct");
    }

    /**
     * Restful: 【GET】 /Products # 查询产品信息列表
     *
     * @return
     */
    @GetMapping("/")
    @ApiOperation("查询所有产品接口")
    public List<Product> getProduct() {
        Product product = new Product();
        product.setId(1000L);
        product.setProductName("基本包产品");
        product.setProductCode("BASIC");

        List<Product> products = new ArrayList<>();
        products.add(product);
        return products;
    }
}
