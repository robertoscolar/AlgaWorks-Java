package com.algaworks.fjoo.exemploxml;

import com.algaworks.fjoo.exemploxml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LendoProduto {

    public static void main(String[] args) throws FileNotFoundException {

        XStream xstream = new XStream(new DomDriver());
        xstream.allowTypes(new Class[]{Produto.class});
        xstream.alias("produto", Produto.class);
        xstream.aliasAttribute(Produto.class, "codigo", "codigo");

        Produto p = (Produto) xstream.fromXML(new FileInputStream("./lib/produto1.xml"));
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
        System.out.println(p.getValor());
    }
}
