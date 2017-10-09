package com.liumapp.KeyGenerator.keytool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by liumapp on 9/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class GenerateThread extends Thread {

    private KeyTool keyTool;

    Lock lock = new ReentrantLock();

    public void setKeyTool(KeyTool keyTool) {
        this.keyTool = keyTool;
    }

    @Override
    public void run() {

        for (int j = 0 ; j < 1000 ; j++) {
            lock.lock();
            try {
                keyTool.inc++;
            } finally {
                lock.unlock();
            }
        }

    }

    /**
     * 中断线程
     */
    public void cancel () {
        interrupt();
    }

}
