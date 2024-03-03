package com.dev.teacher;

import com.dev.homework.Homework;
import com.dev.services.HomeworkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class MathTeacherTest {

    @Mock
    private HomeworkService homeworkService;
    MathTeacher mathTeacher;

    @Test(expected = NullPointerException.class)
    public void givenValidMathTeacher_whenGetHomeworkIsCalledAndHomeworkServiceThrowError_thenShouldThrowError(){
        mathTeacher = new MathTeacher(homeworkService);

        HomeworkService homeworkService1 = new HomeworkService() {
            @Override
            public Homework getHomework() {
                throw new NullPointerException();
            }
        };

        Mockito.when(mathTeacher.getHomework()).thenThrow(new NullPointerException("some message"));
    }


}