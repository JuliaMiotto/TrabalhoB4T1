import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    Conjunto conjuntoA = new Conjunto(Arrays.asList(1, 2, 3, 4, 5));
    Conjunto conjuntoB = new Conjunto(Arrays.asList(4, 5, 6, 7));

    @Test
    public void deveRetornarUmConjuntoDaUniaoDeDoisConjuntos(){
        List<Integer> conjuntoResultante = conjuntoA.uniao(conjuntoB);

        assertEquals(7, conjuntoResultante.size());
        assertEquals(1, conjuntoResultante.get(0));
        assertEquals(7, conjuntoResultante.get(6));
    }

    @Test
    public void deveRetornarAInterseccaoDosConjuntos(){
        List<Integer> conjuntoResultante = conjuntoA.interseccao(conjuntoB);

        assertEquals(2, conjuntoResultante.size());
        assertEquals(4, conjuntoResultante.get(0));
        assertEquals(5, conjuntoResultante.get(1));
    }

    @Test
    public void deveRetornarADiferencaDosConjuntos(){
        List<Integer> conjuntoResultante = conjuntoA.diferenca(conjuntoB);

        assertEquals(5, conjuntoResultante.size());
        assertFalse(conjuntoResultante.contains(4));
        assertEquals(1, conjuntoResultante.get(0));
        assertEquals(7, conjuntoResultante.get(4));
    }

    @Test
    public void deveRetornarOComplementoDosConjuntos(){
        List<Integer> conjuntoResultante = conjuntoA.complemento(conjuntoB);

        assertEquals(3, conjuntoResultante.size());
        assertFalse(conjuntoResultante.contains(7));
        assertTrue(conjuntoResultante.contains(3));
        assertEquals(1, conjuntoResultante.get(0));
    }
}
