package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @PostMapping("/payment")
    public Map<String, Object> processPayment(@RequestBody Map<String, Object> paymentRequest){
        simulateDelay(500, 1500);
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("paymentId", UUID.randomUUID().toString());
        return response;
    }

    @GetMapping("/payment/status/{id}")
    public Map<String, Object> getPaymentStatus(@PathVariable String id){
        simulateDelay(300, 1200);
        Map<String, Object> response = new HashMap<>();
        response.put("paymentId", id);
        response.put("status", "completed");
        return response;
    }

    @PostMapping("/refund")
    public Map<String, Object> processRefund(@RequestBody Map<String, Object> refundRequest){
        simulateDelay(400, 2000);
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("refundId",UUID.randomUUID().toString());
        return response;
    }

    @GetMapping("/transaction/history")
    public List<Map<String, Object>> getTransactionHistory(){
        simulateDelay(500, 2500);
        List<Map<String, Object>> transaction = new ArrayList<>();
        for (int i =0; i<5; i++){
            transaction.add(Map.of(
                "transaction",UUID.randomUUID().toString(),
                "amount", Math.random()*1000
            ));
        }
        return transaction;
    }

    @GetMapping("/health")
    public Map<String, String> healthCheck(){
        simulateDelay(100, 500);
        return Map.of("status", "UP");
    }

    /**
     * симуляция задержки запроса
     * 
     * @param minMillis 
     * @param maxMillis
     */
    private void simulateDelay(int minMillis, int maxMillis) {
        try {
            int delay = ThreadLocalRandom.current().nextInt(minMillis, maxMillis + 1);
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
        }
    }

}
