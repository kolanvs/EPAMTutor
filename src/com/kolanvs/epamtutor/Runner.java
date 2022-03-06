package com.kolanvs.epamtutor;

import com.kolanvs.epamtutor.collections.ListLearn;
import com.kolanvs.epamtutor.collections.QueueDequeLearn;
import com.kolanvs.epamtutor.collections.SetMapLearn;
import com.kolanvs.epamtutor.multithread.StartThreadLearn;

public class Runner {

    public static void main(String[] args) {

        /////////////Tutor collections
        /////////////Tutor List

        //ListLearn.tryList();
        //ListLearn.performanceList();

        /////////////Tutor set

        //SetMapLearn.trySet();
        //SetMapLearn.tryMap();

        /////////////Tutor queue

        //QueueDequeLearn.tryQueue();

        /////////Tutor multithreading

        //StartThreadLearn.tryStartThread();

        StartThreadLearn.tryConcurrent();


    }
}
