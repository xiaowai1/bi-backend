package com.cyj.bibackend.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadPoolExecutorConfig
 * @Description TODO
 * @Author chixiaowai
 * @Date 2023/10/13 15:27
 * @Version 1.0
 */
@Configuration
public class ThreadPoolExecutorConfig {
    @Bean
    public ThreadPoolExecutor threadPoolExecutor() {
        ThreadFactory threadFactory = new ThreadFactory() {
            private int count = 1;

            @Override
            public Thread newThread(@NotNull Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("线程" + count++);
                return thread;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 100, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(20), threadFactory);
        return threadPoolExecutor;
    }
}
