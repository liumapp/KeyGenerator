package com.liumapp.KeyGenerator.worker;

import com.liumapp.DNSQueen.worker.job.JobTodo;
import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import com.liumapp.KeyGenerator.keytool.KeyTool;
import com.liumapp.KeyGeneratorHelper.service.KeyTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * Created by liumapp on 9/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class KeyGenerator extends StandReadyWorker {

    @Autowired
    private KeyTool keyTool;

    @Override
    public String doWhatYouShouldDo(String s) {

        try {
            try (FileOutputStream out = new FileOutputStream("test.ks")) {
                KeyTools.newKeyStore("1234")
                        .newKeyPair()
                        .keyLength(2048)
                        .generateWithCertificate()
                        .withValidity(1, ChronoUnit.YEARS)
                        .withDistinguishName()
                        .commonName("Andrea Como")
                        .state("Toscana")
                        .locality("Prato")
                        .country("IT")
                        .email("test@example.com")
                        .build()
                        .createInKeyStore("test", "456")
                        .writeTo(out);
            } finally {
                File keyStoreFile = new File("test.ks");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "job is done , my queen";
    }

    @Override
    public Class<? extends JobTodo> whatKindOfJobWillYouDo() {
        return super.whatKindOfJobWillYouDo();
    }

    @Override
    public void setJobs(List<? extends JobTodo> jobs) {
        super.setJobs(jobs);
    }

}
