package com.first.springboot.zzg.KafkaDemo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

public class KafkaConsumerDemo {

    private final static String BROKER = "127.0.0.1:9092";
    private final String TOPIC = "test";


    public static Properties getProperties() {
        Properties properties  = new Properties();
        /* 定义kakfa 服务的地址，不需要将所有broker指定上 */
        properties.put("bootstrap.servers",BROKER);
        /* 制定consumer group */
        properties.put("group.id","test-group");
        /* 是否自动确认选项 ,设置不自动提交，采用手动方式*/
        properties.put("enable.auto.commit","true");
        /* key的序列化类 */
        properties.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        /* value的序列化类 */
        properties.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        return properties;
    }

    public void consumerMessage(){
        Properties properties = getProperties();

        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);

       consumer.subscribe(Arrays.asList(TOPIC));

       while (true) {
           //poll频率
           ConsumerRecords<String,String> consumerRecords = consumer.poll(100);
           for(ConsumerRecord<String,String> consumerRecord : consumerRecords){
               System.out.println("在test中读到：" + consumerRecord.value());
           }
       }
    }

}
