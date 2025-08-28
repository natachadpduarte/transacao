package org.transacao.service;

import org.transacao.model.Transacao;
import org.transacao.strategy.CalculadoraStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransacaoService {
    private final List<Transacao> transacoes = new ArrayList<>();
    private static final TransacaoService instancia = new TransacaoService();

    private TransacaoService() {}

    public static TransacaoService getInstancia() {
        return instancia;
    }

    public void adicionarTransacao(Transacao t) {
        transacoes.add(t);
    }

    public List<Transacao> buscarTodas() {
        return new ArrayList<>(transacoes);
    }

    public List<Transacao> filtrarAcimaDe(BigDecimal valorMinimo) {
        return transacoes.stream()
                .filter(t -> t.getValor().compareTo(valorMinimo) > 0)
                .collect(Collectors.toList());
    }

    public BigDecimal calcular(CalculadoraStrategy calculadora) {
        return calculadora.calcular(transacoes);
    }
}
