package com.kolanvs.epamtutor.nosql;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class LearnMongo {

    public static void tryGetListOfCollection() {
//        final MongoCredential creds = MongoCredential.createCredential(
//                "kolanvs",
//                "myFirstDatabase",
//                "a6feztcz".toCharArray()
//                );
//
//        MongoClientOptions opts = MongoClientOptions.builder()
//                .retryWrites(true)
//                .writeConcern(WriteConcern.MAJORITY)
//                .sslEnabled(true)
//                .build();
//
//        MongoClient mc = new MongoClient(
//                new ServerAddress("kolansupercluster.7zl62.mongodb.net", 27017),
//                creds,
//                MongoClientOptions.builder().build());

        MongoClient mc = new MongoClient(new MongoClientURI(
                "mongodb+srv://kolanvs:I0dnCgGi5fmb5981" +
                "@kolansupercluster.7zl62.mongodb.net/" +
                "myFirstDatabase?retryWrites=true&w=majority"));

        MongoDatabase db = mc.getDatabase("myFirstDatabase");

        MongoCollection<Document> family = db.getCollection("myFamily");

        MongoCursor<Document> iterable = family.find().cursor();

        while(iterable.hasNext()) {
            System.out.println(iterable.next().toJson());
        }


    }

}
