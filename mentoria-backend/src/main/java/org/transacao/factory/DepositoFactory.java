package org.transacao.factory;

import org.transacao.model.Transacao;

import java.math.BigDecimal;

public class DepositoFactory {
    public static Transacao criar(String id, BigDecimal valor) {
        return new Transacao(id, valor, TipoTransacao.DEPOSITO);
    }
}