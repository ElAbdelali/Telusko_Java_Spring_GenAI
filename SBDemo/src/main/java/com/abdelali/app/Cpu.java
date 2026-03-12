package com.abdelali.app;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.stereotype.Component;

@Component
public class Cpu {

    public void thinking(){
        System.out.println("Thinking...");

    }
}
