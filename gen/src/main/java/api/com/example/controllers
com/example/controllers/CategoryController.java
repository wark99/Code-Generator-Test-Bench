package com.example/controllers;

import com.example.models.*;
import com.example.utils HashmapUtils;

public class CategoryController extends DefaultController {
    @GET("/categories")
    public Resource<CategoryModel> getCategories() {
        return new DefaultResponse<CategoryModel[]>(getMapToResource(new HashMap<>()));
    }

    @GET("/categories/{id}")
    public Resource<CategoryModel> getCategory(int id) {
        return new DefaultResponse<CategoryModel[]>(getMapToResource(new HashMap<>()));
    }

    public CategoryController() {
        super().onGetAction();
    }
}

package com.example.controllers;

import com.example.models.*;
import com.example.utils HashmapUtils;

public class FilterController extends DefaultController {
    @GET("/filter")
    public Resource<Iterable<ProductModel>> getProductByName(String name) {
        return new DefaultResponse<Iterable<ProductModel>>(getFilterProducts(
            "name", null, null, null, null, null, null, false, 0,
            ProductModel.class));
    }

    @GET("/filter")
    public Resource<Iterable<ProductModel>> getProductRange(int from, int to) {
        return new DefaultResponse<Iterable<ProductModel>>(getFilterProducts(
            "price", Double.parseDouble(from),
            Double.parseDouble(to), null, null, null, null, false, 0,
            ProductModel.class));
    }

    @GET("/filter")
    public Resource<Iterable<ProductModel>> getProductAvailable() {
        return new DefaultResponse<Iterable<ProductModel>>(getFilterProducts(
            "quantityAvailable", null, -1, null, null, null, null, false, 0,
            ProductModel.class));
    }

    @GET("/filter")
    public Resource<Iterable<ProductModel>> getCategory(String category) {
        return new DefaultResponse<Iterable<ProductModel>>(getFilterProducts(
            "category_name", null, null, category, null, null, null, false, 0,
            ProductModel.class));
    }

    @GET("/filter")
    public Resource<Iterable<ProductModel>> filtering(int from, int to, 
            String available, String category) {
        return new DefaultResponse<Iterable<ProductModel>>(getFilterProducts(
            "price", Double.parseDouble(from),
            Double.parseDouble(to), null,
            (available != null) ? available : "-1",
            (category == null) ? null : category,
            null, false, 0, ProductModel.class));
    }

    public FilterController() {
        super().onGetAction();
    }
}

