package com.app;

import static org.hamcrest.CoreMatchers.any;
import static org.mockito.Mockito.doReturn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.app.model.Product;
import com.app.repository.ProductRepository;
import com.app.service.ProductService;

@SpringBootTest
class SbjspcrudappApplicationTests {

	@Autowired
	private ProductService service;
	@MockBean
	private ProductRepository repository;   

	@Test
    @DisplayName("Test findById Success")
    void testFindById() {
        // Setup our mock repository
        Product prod = new Product(2, "name", "brand", "madeIn", 1900.0);
        doReturn(Optional.of(prod)).when(repository).findById(2);

        // Execute the service call
        Optional<Product> rprod = repository.findById(2);

        // Assert the response
        Assertions.assertTrue(rprod.isPresent(), "product not found");
        Assertions.assertSame(rprod.get(), prod, 
        		"product return is not the same as the mock");
    }
	@Test
    @DisplayName("Test findById Not Found")
    void testFindByIdNotFound() {
        // Setup our mock repository
        doReturn(Optional.empty()).when(repository).findById(1);

        // Execute the service call
        Optional<Product> rprod = repository.findById(1);

        // Assert the response
        Assertions.assertFalse(rprod.isPresent(), "product not be found");
    }
	@Test
    @DisplayName("Test findAll")
    void testFindAll() {
        // Setup our mock repository
		Product prod = new Product(2, "name", "brand", "madeIn", 1900.0);
		Product prod1 = new Product(3, "name", "brand", "madeIn", 19000.0);
        doReturn(Arrays.asList(prod, prod1)).when(repository).findAll();

        // Execute the service call
        List<Product> prodt = repository.findAll();

        // Assert the response
        Assertions.assertEquals(3, prodt.size(), "findAll should return 3 prod");
    }

    @Test
    @DisplayName("Test save widget")
    void testSave() {
        // Setup our mock repository
		Product prod = new Product(2, "name", "brand", "madeIn", 1900.0);

        doReturn(prod).when(repository).save(any());

        // Execute the service call
        Product rprod = repository.save(prod);

        // Assert the response
        Assertions.assertNotNull(rprod, "The saved prod should not be null");
        Assertions.assertEquals(2, rprod.getPrice(), "The price should be incremented");
    }
}
