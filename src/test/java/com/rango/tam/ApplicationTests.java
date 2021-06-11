package com.rango.tam;

import com.rango.tam.entity.User;
import com.rango.tam.mapper.UserMapper;
import com.rango.tam.mq.producer.MessageProducer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ApplicationTests {

    @Value("${spring.rabbitmq.exchange.name}")
    private String exchangeName;

    @Value("${spring.rabbitmq.key}")
    private String key;

    @Autowired
    private MessageProducer messageProducer;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    void testSender() throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put("num", "123456");
        messageProducer.send(exchangeName, key, "哈哈", properties);
    }
}
