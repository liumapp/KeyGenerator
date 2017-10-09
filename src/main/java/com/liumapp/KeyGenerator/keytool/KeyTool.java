package com.liumapp.KeyGenerator.keytool;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by liumapp on 9/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class KeyTool {

    public volatile int inc = 0;

    Lock lock = new ReentrantLock();

    public void increase() {
        lock.lock();
        try {
            inc++;
        } finally {
            lock.unlock();
        }
    }

    public static void exeCmd(String commandStr) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
//        String commandStr = "ping www.taobao.com";
//        KeyTool.exeCmd(commandStr);
        KeyTool keyTool = new KeyTool();

        for (int i = 0 ; i < 10 ; i++) {

            GenerateThread generateThread = new GenerateThread();
            generateThread.setKeyTool(keyTool);
            new Thread(generateThread).start();

        }

        while (Thread.activeCount() > 1 ) {
            Thread.yield();
        }

        System.out.println(keyTool.inc);

    }

}
