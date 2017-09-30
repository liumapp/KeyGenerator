package com.liumapp.KeyGenerator.keytool;

/**
 * Created by liumapp on 9/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class GenerateThread extends Thread {

    private KeyTool keyTool;

    public void setKeyTool(KeyTool keyTool) {
        this.keyTool = keyTool;
    }

    @Override
    public void run() {

        for (int j = 0 ; j < 1000 ; j++) {
            keyTool.increase();
        }

    }

    /**
     * 中断线程
     */
    public void cancel () {
        interrupt();
    }



}
