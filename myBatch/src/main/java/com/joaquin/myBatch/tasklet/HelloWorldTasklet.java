package com.joaquin.myBatch.tasklet;


import com.joaquin.myBatch.service.IService;
import org.generator.api.StudentControllerApi;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldTasklet implements Tasklet {

    private final StudentControllerApi studentControllerApi;
    private final IService service;

    public HelloWorldTasklet(StudentControllerApi studentControllerApi, IService service) {
        this.studentControllerApi = studentControllerApi;
        this.service = service;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception{

        service.createStudentsFinished(studentControllerApi.getAllFinished(true));


        System.out.println("Hello world");
        return RepeatStatus.FINISHED;
    }
}