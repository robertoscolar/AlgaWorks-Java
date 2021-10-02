package com.algaworks.fjoo.enviandoobjetosnarede;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("192.168.0.119", 3333);

        OutputStream saida = socket.getOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(saida);

        Pedido pedido = new Pedido();
        pedido.setCodigo(1L);
        pedido.setDescricao("Sabonete");
        pedido.setQuantidade(5);

        objectOutput.writeObject(pedido);

        InputStream entrada = socket.getInputStream();
        DataInputStream dataInput = new DataInputStream(entrada);
        System.out.println("Recebeu do servidor: " + dataInput.readUTF());

        socket.close();
    }
}
