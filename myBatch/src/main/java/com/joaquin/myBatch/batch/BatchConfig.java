package com.joaquin.myBatch.batch;

import com.joaquin.myBatch.tasklet.HelloWorldTasklet;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableScheduling
public class BatchConfig {

    private final JobRepository jobRepository;
    private final PlatformTransactionManager platformTransactionManager;
    private final HelloWorldTasklet helloWorldTasklet;

    public BatchConfig(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager, HelloWorldTasklet helloWorldTasklet) {
        this.jobRepository = jobRepository;
        this.platformTransactionManager = platformTransactionManager;
        this.helloWorldTasklet = helloWorldTasklet;
    }


    @Bean
    public Job job(){
        return new JobBuilder("job", jobRepository)
                .start(step())
                .build();
    }

    @Bean
    public Step step(){
        return new StepBuilder("step", jobRepository)
                .tasklet(helloWorldTasklet, platformTransactionManager)
                .build();

    }
}