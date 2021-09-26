package com.algaworks.fjoo.exemploxml;

import com.algaworks.fjoo.exemploxml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalvandoCarrinho {

    public static void main(String[] args) throws FileNotFoundException {
        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(new Produto(1L, "sabao", new BigDecimal("3.00")));
        carrinho.add(new Produto(2L, "shampoo", new BigDecimal("8.00")));

        XStream xStream = new XStream(new DomDriver());
        xStream.alias("produto", Produto.class);
        xStream.aliasAttribute(Produto.class, "codigo", "codigo");
        xStream.alias("carrinho", List.class);
        xStream.allowTypes(new Class[]{Produto.class});

        OutputStream os = new FileOutputStream("./lib/carrinho.xml");
        xStream.toXML(carrinho,os);
    }
}
