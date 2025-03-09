package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme berserk = new Filme("Berserk", 1980);
        berserk.avaliacao(8);

        Filme attackOnTitan = new Filme("attackOnTitan",2025);
        attackOnTitan.avaliacao(8);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(berserk);
        lista.add(attackOnTitan);
        lista.add(lost);

        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println(filme.getClassificacao());
            }
        }
    }
}
