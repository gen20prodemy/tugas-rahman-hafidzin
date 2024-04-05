package kafka.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "myFirstTopic", groupId = "my-group-id")
    public void listen (String message){
        System.out.println("Pesan diterima: " + message);
    }

//    @KafkaListener(topics = "myFirstTopic", groupId = "my-group-id")
//    public void listenCost (Object message){
//        System.out.println("Pesan diterima: " + message);
//    }


}
