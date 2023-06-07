package com.bookitaka.NodeulProject.payment;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class PaymentServiceImplTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void getMyAllPaymentTest() {
        Page<Payment> myAllPayment = paymentService.getMyAllPayment("bbbb@naver.com", new PaymentCri(1, 10));
        log.info("test myAllPayment contents = {}", myAllPayment.getContent());
        log.info("test myAllPayment page = {}", myAllPayment.getTotalPages());

    }

}