package com.kolanvs.epamtutor;

import com.kolanvs.epamtutor.collections.ListLearn;
import com.kolanvs.epamtutor.collections.QueueDequeLearn;
import com.kolanvs.epamtutor.collections.SetMapLearn;
import com.kolanvs.epamtutor.jsonxmllearn.JsonLearn;
import com.kolanvs.epamtutor.multithread.StartThreadLearn;
import com.kolanvs.epamtutor.streams.StreamLearn;

public class Runner {

    public static void main(String[] args) {

        try {

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

            //StartThreadLearn.tryConcurrent();

            //StartThreadLearn.tryExecutor();

            ///////////Tutor streams

            //StreamLearn.tryStream();

            ///////////Tutor json

            //JsonLearn.tryJsonBinding();

            //JsonLearn.tryJsonTree();

            //JsonLearn.tryJsonStreaming();

            JsonLearn.tryJsonPathAndPointer();

        }

        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
