package org.transacao.strategy;

import org.transacao.model.Transacao;
import java.math.BigDecimal;
import java.util.List;

public interface CalculadoraStrategy {
    BigDecimal calcular(List<Transacao> transacoes);
}