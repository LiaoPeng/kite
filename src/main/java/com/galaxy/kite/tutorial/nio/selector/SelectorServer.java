package com.galaxy.kite.tutorial.nio.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class SelectorServer {

	public static void main(String[] args) throws IOException {

		int port = 30;
		ServerSocketChannel ssc = ServerSocketChannel.open();
		ServerSocket ss = ssc.socket();
		ss.bind(new InetSocketAddress(port));
		ssc.configureBlocking(false);

		Selector selector = Selector.open();
		ssc.register(selector, SelectionKey.OP_ACCEPT);

		while (true) {
			int n = selector.select();
			if (n == 0) continue;
			Iterator<SelectionKey> it = selector.selectedKeys().iterator();
			while (it.hasNext()) {
				SelectionKey key = it.next();
				if (key.isAcceptable()) {
					ServerSocketChannel acceptSsc = (ServerSocketChannel) key.channel();
					SocketChannel sc = acceptSsc.accept();
					if (sc == null) {
						continue;
					} else {
						sc.configureBlocking(false);
						sc.register(selector, SelectionKey.OP_READ);
					}
				} else if (key.isReadable()) {

				}
				it.remove();

			}
		}
	}

}
