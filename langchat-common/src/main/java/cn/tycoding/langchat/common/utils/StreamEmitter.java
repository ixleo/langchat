package cn.tycoding.langchat.common.utils;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * @author tycoding
 * @since 2024/1/30
 */
public class StreamEmitter {

    private final SseEmitter emitter;

    public StreamEmitter() {
        emitter = new SseEmitter(60 * 1000L);
    }

    public StreamEmitter(Long timeout) {
        emitter = new SseEmitter(timeout);
    }

    public SseEmitter get() {
        return emitter;
    }

    public void send(Object obj) {
        try {
            emitter.send(obj);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void complete() {
        try {
            emitter.complete();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void error(String message) {
        try {
            emitter.send("Error: " + message);
            emitter.complete();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
