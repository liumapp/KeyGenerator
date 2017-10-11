package com.liumapp.KeyGenerator.worker;

import com.liumapp.DNSQueen.worker.job.JobTodo;
import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import com.liumapp.KeyGenerator.keytool.KeyTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        return keyTool.exeCmd(s);
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
