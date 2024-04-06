package view;

import LocadoraDeVeiculos.Cliente;
import LocadoraDeVeiculos.Locacao;
import LocadoraDeVeiculos.Veiculo;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("JFK1963", "Lincoln", "74A conversível", 1961);
        Cliente cliente = new Cliente(7, "Filemon", "114.002.892-02");
        Date dataInicio = new Date(); //Data atual + 1 dia (em milissegundos)
        Date dataFim = new Date(dataInicio.getTime() + 06042024);

        Locacao locacao = new Locacao(veiculo, cliente, dataInicio, dataFim, 100.0);
        System.out.println("Locação realizada" + locacao.getCliente().getNome() + " do veículo " + locacao.getVeiculo().getModelo() + " " + locacao.getVeiculo().getMarca());
    }
}

