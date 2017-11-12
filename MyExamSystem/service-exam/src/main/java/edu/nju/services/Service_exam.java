package edu.nju.services;

import edu.nju.entity.Exam;
import edu.nju.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by 69401 on 2017/11/12.
 */
@RestController
public class Service_exam {

    @Value("${server.port}")
    String port;

    @Autowired
    ExamMapper ExamMapper;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @RequestMapping("/get/{examID}")
    public String testEntity(@PathVariable("examID") long examID){
        return ExamMapper.getByExamID(examID).toString();
    }

    @RequestMapping("/getby/{courseID}")
    public String getBycourseID(@PathVariable("courseID") long courseID){
        return ExamMapper.getByCourseID(courseID).toString();
    }


    @RequestMapping("/insert")
    public String insert(){

        String dateString = "1900-1-1 16:36:44";
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss", Locale.ENGLISH);
        dateFormat.setLenient(false);
        java.util.Date timeDate = null;//util类型
        try {
            timeDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date dateTime = new java.sql.Date(timeDate.getTime());

        System.out.println(dateTime);

        Exam exam = new Exam();
        exam.setSingle_num(3);
        exam.setCompletion_num(3);
        exam.setCompletion_score(5);
        exam.setSingle_score(5);
        exam.setMultiple_num(10);
        exam.setMultiple_score(5);
        exam.setCourseID((long)1234567890);
        exam.setStarttime(dateTime);
        exam.setEndtime(dateTime);
        return ExamMapper.insert(exam).toString();
    }


}
