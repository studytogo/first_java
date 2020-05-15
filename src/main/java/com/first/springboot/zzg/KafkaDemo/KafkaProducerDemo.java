package com.first.springboot.zzg.KafkaDemo;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class KafkaProducerDemo {
    private final static String BROKER = "127.0.0.1:9092";
    private final String TOPIC = "test";

   public static Properties getProperties() {
        Properties proper = new Properties();
        proper.put("bootstrap.servers", BROKER);
//        proper.put("ack", "all");
//        proper.put("retries",0);
//        proper.put("batch.size",16384);
//        proper.put("linger.ms",1);
//        proper.put("buffer.memory",33554432);
        proper.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        proper.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
        proper.put("request.required.acks", 1);
        return  proper;
    }

    public void produceMessage() {
        Properties properties = getProperties();
        Producer<String,String> producer = new KafkaProducer<String, String>(properties);
        String key,value;
        for(int i = 1;i<=20;i++){
            key = "key-"+i;
            value = "value-"+i+"-"+new SimpleDateFormat("HH:mm:ss").format(new Date());
            System.out.println("TOPIC: "+TOPIC+",key: "+key+",value: "+value);
            producer.send(new ProducerRecord<String, String>(TOPIC,key,value));
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        producer.close();
    }
}
