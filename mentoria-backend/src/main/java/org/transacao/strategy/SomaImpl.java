package org.transacao.strategy;

import org.transacao.model.Transacao;

import java.math.BigDecimal;
import java.util.List;

public class SomaImpl implements CalculadoraStrategy {
    public BigDecimal calcular(List<Transacao> transacoes) {
        return transacoes.stream()
                .map(Transacao::valor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}