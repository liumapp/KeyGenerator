package com.liumapp.KeyGenerator.worker;

import com.liumapp.DNSQueen.queen.Queen;
import junit.framework.TestCase;
import com.liumapp.DNSQueen.*;

import java.io.IOException;

/**
 * Created by liumapp on 9/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class KeyGeneratorTest extends TestCase {

    public void testHello () {
        Queen queen = new Queen();
        queen.setPort(30123);
        try {
            queen.connect();
            if (queen.isConnected()) {
                queen.say("ls");
                System.out.println(queen.hear());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
