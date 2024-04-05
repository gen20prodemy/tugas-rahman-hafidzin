package com.pos.gen20javaspringbootpos.service;


import com.pos.gen20javaspringbootpos.entity.Category;
import com.pos.gen20javaspringbootpos.model.CategoryRequest;
import com.pos.gen20javaspringbootpos.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncService {

    @Autowired
    private CategoryRepository catRepo;

    public void processSave(CategoryRequest cr) throws InterruptedException {
        log.info("initiate payment for order " + cr.getCategoryId());
        //call actual payment gateway
        Thread.sleep(2000L);
        log.info("completed payment for order " + cr.getCategoryId());
    }
    @Async("asyncTaskExecutor")
    public void notifyUser(CategoryRequest Category) throws InterruptedException {
        Thread.sleep(10000L);
        log.info("Notified to the user " + Thread.currentThread().getName());
    }
    @Async("asyncTaskExecutor")
    public void assignVendor(CategoryRequest Category) throws InterruptedException {
        Thread.sleep(5000L);
        log.info("Assign Category to vendor " + Thread.currentThread().getName());
    }
    @Async("asyncTaskExecutor")
    public void packaging(CategoryRequest Category) throws InterruptedException {
        Thread.sleep(2000L);
        log.info("Category packaging completed " + Thread.currentThread().getName());
    }
    @Async("asyncTaskExecutor")
    public void assignDeliveryPartner(CategoryRequest Category) throws InterruptedException {
        Thread.sleep(10000L);
        log.info("Delivery partner assigned " + Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void assignTrailerAndDispatch(CategoryRequest Category) throws InterruptedException {
        Thread.sleep(3000L);
        log.info("Trailer assigned and Category dispatched " + Thread.currentThread().getName());
    }

}
