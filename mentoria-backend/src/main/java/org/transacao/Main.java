package org.transacao;

import org.transacao.factory.TransacaoFactory;
import org.transacao.service.TransacaoService;
import org.transacao.strategy.MediaImpl;
import org.transacao.strategy.SomaImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TransacaoService servico = TransacaoService.getInstancia();

        servico.adicionarTransacao(TransacaoFactory.criarTransacao("T1", new BigDecimal("100.50")));
        servico.adicionarTransacao(TransacaoFactory.criarTransacao("T2", new BigDecimal("250.75")));
        servico.adicionarTransacao(TransacaoFactory.criarTransacao("T3", new BigDecimal("50.25")));

        System.out.println("Total: " + servico.calcular(new SomaImpl()));

        System.out.println("Média: " + servico.calcular(new MediaImpl()));

        System.out.println("Transações acima de 100:");
        servico.filtrarAcimaDe(new BigDecimal("100"))
                .forEach(System.out::println);
    }
}