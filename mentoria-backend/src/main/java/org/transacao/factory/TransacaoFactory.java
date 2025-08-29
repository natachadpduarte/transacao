package org.transacao.factory;

import org.transacao.model.TipoTransacao;
import org.transacao.model.Transacao;

import java.math.BigDecimal;

public class TransacaoFactory {
    public static Transacao criarTransacao(String id, BigDecimal valor, TipoTransacao tipo) {
        return new Transacao(id, valor, tipo);
    }
}