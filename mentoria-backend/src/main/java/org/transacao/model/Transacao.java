package org.transacao.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Transacao(String id, BigDecimal valor, TipoTransacao tipo, LocalDateTime data) {
    public Transacao(String id, BigDecimal valor, TipoTransacao tipo) {
        this(id, valor, tipo, LocalDateTime.now());
    }
}
