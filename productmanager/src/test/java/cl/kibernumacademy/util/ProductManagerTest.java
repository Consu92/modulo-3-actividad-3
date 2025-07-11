package cl.kibernumacademy.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import cl.kibernumacademy.modelo.Product;

public class ProductManagerTest {
  private ProductManager manager;

  @BeforeEach
  void iniciarTest() {
    manager = new ProductManager();
  }

  @AfterEach
  void finalizarTest() {
    manager = null;
  }

  @Test
  void agregarProducto_deberiaAgregarProductoALaLista() {
    Product product = manager.addProduct("Laptop", "Alto rendimiento", 1200.0);

    assertNotNull(product);
    assertEquals("Laptop", product.getName());
    assertEquals(1200.0, product.getPrice(), 0.001);
    assertNotNull(product.getId());

    // Verificamos que el producto se haya agregado
    List<Product> allProducts = manager.getAllProducts();
    assertTrue(allProducts.contains(product));
  }

  @Test
  void actualizarProducto_deberiaModificarDatosDeUnProducto() {
    Product product = manager.addProduct("Celular", "Smartphone", 800.0);

    boolean result = manager.updateProduct(
        product.getId(),
        "Actualizar celular",
        "Nuevo modelo smartphone",
        900.0);

    assertTrue(result);

    Product updated = manager.findProductById(product.getId());
    assertNotNull(updated);
    assertEquals("Actualizar celular", updated.getName());
    assertEquals("Nuevo modelo smartphone", updated.getDescription());
    assertEquals(900.0, updated.getPrice(), 0.001);
  }

  @Test
  void eliminarProducto_deberiaEliminarUnProducto() {
    Product product = manager.addProduct("Mouse", "Mouse inalambrico", 20.0);

    boolean deleted = manager.deleteProduct(product.getId());

    assertTrue(deleted);

    Product resultado = manager.findProductById(product.getId());
    assertNull(resultado);

    assertThat(manager.getAllProducts(), not(hasItem(product)));
  }

  @ParameterizedTest
  @ValueSource(doubles = { 0.0, -10.0, 1000000.0 })
  void agregarProducto_deberiaAgregarVariacionesDePrecios(double price) {
    assumingThat(price >= 0, () -> {
      System.out.println("Asumiendo que el precio es positivo: " + price);
      Product product = manager.addProduct("Teclado", "Mecánico", price);

      assertEquals(price, product.getPrice(), 0.001);

    });

  }

  @Test
  void afirmacionesConHamcrest() {
    Product product1 = manager.addProduct("Monitor", "24 pulgadas", 300.0);
    Product product2 = manager.addProduct("Teclado", "RGB", 80.0);

    List<Product> allProducts = manager.getAllProducts();

    // Usando Hamcrest
    assertThat(allProducts, hasSize(2));
    assertThat(allProducts, hasItems(product1, product2));
    assertThat(allProducts, everyItem(hasProperty("price", greaterThanOrEqualTo(0.0))));
  }
}
