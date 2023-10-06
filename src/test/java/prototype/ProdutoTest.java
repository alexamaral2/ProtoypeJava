package prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    private Categoria categoria;
    private Produto produto;

    @BeforeEach
    public void setUp() {
        categoria = new Categoria(1, "Eletrônicos");
        produto = new Produto(101, "Smartphone", 999.99, categoria);
    }

    @Test
    public void testCloneProduto() throws CloneNotSupportedException {
        Produto produtoClone = produto.clone();

        assertNotSame(produto, produtoClone);
        assertEquals(produto.getCodigo(), produtoClone.getCodigo());
        assertEquals(produto.getNome(), produtoClone.getNome());
        assertEquals(produto.getPreco(), produtoClone.getPreco(), 0.001); // Comparação de valores double
        assertNotSame(produto.getCategoria(), produtoClone.getCategoria());
        assertEquals(produto.getCategoria().getId(), produtoClone.getCategoria().getId());
        assertEquals(produto.getCategoria().getNome(), produtoClone.getCategoria().getNome());
    }
}