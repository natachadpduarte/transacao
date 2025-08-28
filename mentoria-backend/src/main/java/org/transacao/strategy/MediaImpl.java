package org.transacao.strategy;

import org.transacao.model.Transacao;

import java.math.BigDecimal;
import java.util.List;

public class MediaImpl implements CalculadoraStrategy {
    public BigDecimal calcular(List<Transacao> transacoes) {
        if (transacoes.isEmpty()) return BigDecimal.ZERO;
        BigDecimal soma = transacoes.stream()
                .map(Transacao::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return soma.divide(new BigDecimal(transacoes.size()), 2, BigDecimal.ROUND_HALF_UP);
    }
}