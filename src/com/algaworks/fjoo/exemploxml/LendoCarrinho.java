package com.algaworks.fjoo.exemploxml;

import com.algaworks.fjoo.exemploxml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class LendoCarrinho {

    public static void main(String[] args) throws FileNotFoundException {
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("produto", Produto.class);
        xStream.aliasAttribute(Produto.class, "codigo", "codigo");
        xStream.alias("carrinho", List.class);
        xStream.allowTypes(new Class[]{Produto.class});

        List<Produto> carrinho = (List<Produto>) xStream.fromXML(new FileInputStream("./lib/carrinho.xml"));
        for (Produto p : carrinho) {
            System.out.println(p.getCodigo());
            System.out.println(p.getDescricao());
            System.out.println(p.getValor());
            System.out.println("------------------------------------");
        }
    }
}
