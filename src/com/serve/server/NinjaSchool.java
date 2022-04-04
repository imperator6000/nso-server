package com.serve.server;

import com.serve.stream.Server;
import java.io.IOException;

public class NinjaSchool {
    public static void main(String[] args) throws IOException  {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                try {
                    Server.close(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));
        Server.start(true);
    }
}
