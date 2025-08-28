package org.transacao.factory;

import org.transacao.model.Transacao;

import java.math.BigDecimal;

public class TransacaoFactory {
    public static Transacao criarTransacao(String id, BigDecimal valor) {
        return new Transacao(id, valor);
    }

}
