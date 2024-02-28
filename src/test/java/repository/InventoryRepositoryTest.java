package repository;

import com.example.c322spring2024homework2.model.Guitar;
import com.example.c322spring2024homework2.repository.InventoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryRepositoryTest {

    private InventoryRepository inventoryRepository;

    @BeforeEach
    void setUp() {
        inventoryRepository = new InventoryRepository();
    }

    /*@Test
    void addGuitar() {
        Guitar g = new Guitar("121533619", 850.00, "Bob", "Stratocaster",
                "Electric", "Oak", "Birch");
        inventoryRepository.addGuitar(g);

        assertEquals("Bob", g.getBuilder());
        assertEquals("Stratocaster", g.getModel());
    }

    @Test
    void addGuitarNullArguments() {
        Guitar g = new Guitar("121536", 850.00, "Jeremy", "Stratocaster",
                "Electric", null, "Pine");
        inventoryRepository.addGuitar(g);

        Guitar getter = inventoryRepository.getGuitar("121536");
        assertEquals("Jeremy", getter.getBuilder());
        assertEquals("Stratocaster", getter.getModel());
    }

    @Test
    void getGuitar() {
        Guitar g = inventoryRepository.getGuitar("121533619");

        assertEquals("121533619", g.getSerialNumber());
        assertEquals(850.00, g.getPrice());
        assertEquals("Bob", g.getBuilder());
        assertEquals("Stratocaster", g.getModel());
        assertEquals("Electric", g.getType());
        assertEquals("Oak", g.getBackWood());
        assertEquals("Birch", g.getTopWood());
    }

    @Test
    void search() {
        Guitar g = new Guitar("121533619", 850.00, "Bob", "Stratocaster",
                "Electric", "Oak", "Birch");

        List<Guitar> satisfiableGuitars = inventoryRepository.search(g);
        assertTrue(!satisfiableGuitars.isEmpty());
    }*/
}