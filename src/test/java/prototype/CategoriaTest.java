package prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {

    private Categoria categoria;

    @BeforeEach
    public void setUp() {
        categoria = new Categoria(1, "Eletrônicos");
    }

    @Test
    public void testCloneCategoria() throws CloneNotSupportedException {
        Categoria categoriaClone = categoria.clone();

        assertNotSame(categoria, categoriaClone);
        assertEquals(categoria.getId(), categoriaClone.getId());
        assertEquals(categoria.getNome(), categoriaClone.getNome());
    }
}
