package org.demo.jmsservice;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Renwei.Han
 */
@Component
public class Consumer {
  @JmsListener(destination = "test")
  public void receive(String text) {
    System.out.println("Consumer:" + text);
  }
}
