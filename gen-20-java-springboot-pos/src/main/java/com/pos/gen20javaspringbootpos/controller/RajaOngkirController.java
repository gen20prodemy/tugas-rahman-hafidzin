package com.pos.gen20javaspringbootpos.controller;


import com.pos.gen20javaspringbootpos.kafka.producer.MessageProducer;
import com.pos.gen20javaspringbootpos.service.RajaOngkirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/api")
public class RajaOngkirController {


    @Autowired
    RajaOngkirService ros;

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/province")
    public Object provinceApi(){
        return ros.fetchAPI();
    }

    @PostMapping("/cost")
//    @Scheduled(cron = "*/10 * * * * *")
    public Object costApi(){
        return ros.fetchCost();
    }


    @PostMapping("/cost/detail")
    public Object costApiDetail(){
        return ros.fetchCostDetail();
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message){
        messageProducer.sendMessage("myFirstTopic", message);
        return "Pesan terkirim: " + message;
    }
//    @PostMapping("/costkafka")
//    public Object kafkaCost(){
//        Object data = messageProducer.sendCost("myFirstTopic", ros.fetchCost());
//        return data;
//    }


    @PostMapping("/cost/detail1")
    public ResponseEntity<Object> costApiDetail1(){
        return ResponseEntity.ok(ros.fetchCostDetail1());
    }
}
