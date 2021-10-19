import java.util.ArrayList;
import java.util.List;

public class Conjunto {
    private List<Integer> listaDeNumeros;

    public Conjunto() {
    }

    public Conjunto(List<Integer> listaDeNumeros) {
        this.listaDeNumeros = listaDeNumeros;
    }

    public List<Integer> getListaDeNumeros() {
        return listaDeNumeros;
    }

    public void setListaDeNumeros(List<Integer> listaDeNumeros) {
        this.listaDeNumeros = listaDeNumeros;
    }

    public List<Integer> uniao(Conjunto conjuntoComparacao){
        List<Integer> listaUniao = new ArrayList<>();
        // verifica primeira lista
        for (int i = 0; i < this.listaDeNumeros.size(); i++){
            if (!listaUniao.contains(this.listaDeNumeros.get(i))) {
                listaUniao.add(this.listaDeNumeros.get(i));
            }
        }

        // verifica segunda lista
        for (int i = 0; i < conjuntoComparacao.listaDeNumeros.size(); i++){
            if (!listaUniao.contains(conjuntoComparacao.listaDeNumeros.get(i))) {
                listaUniao.add(conjuntoComparacao.listaDeNumeros.get(i));
            }
        }
        return listaUniao;
    }

    public List<Integer> interseccao(Conjunto conjuntoComparacao){
        List<Integer> listaInterseccao = new ArrayList<>();

        for (int i = 0; i < this.listaDeNumeros.size(); i++){
            if (conjuntoComparacao.listaDeNumeros.contains(this.listaDeNumeros.get(i))){
                listaInterseccao.add(this.listaDeNumeros.get(i));
            }
        }

        return listaInterseccao;
    }

    public List<Integer> diferenca(Conjunto conjuntoComparacao){
        List<Integer> listaDiferenca = new ArrayList<>();

        for (int i = 0; i < this.listaDeNumeros.size(); i++){
            if (!conjuntoComparacao.listaDeNumeros.contains(this.listaDeNumeros.get(i))){
                listaDiferenca.add(this.listaDeNumeros.get(i));
            }
        }
        for (int i = 0; i < conjuntoComparacao.listaDeNumeros.size(); i++){
            if (!this.listaDeNumeros.contains(conjuntoComparacao.listaDeNumeros.get(i))){
                listaDiferenca.add(conjuntoComparacao.listaDeNumeros.get(i));
            }
        }

        return listaDiferenca;
    }

    public List<Integer> complemento(Conjunto conjuntoComparacao){
        List<Integer> listaComplemento = new ArrayList<>();

        for (int i = 0; i < this.listaDeNumeros.size(); i++){
            if (!conjuntoComparacao.listaDeNumeros.contains(this.listaDeNumeros.get(i))){
                listaComplemento.add(this.listaDeNumeros.get(i));
            }
        }
        return listaComplemento;
    }
}
