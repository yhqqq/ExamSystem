package edu.nju.services;

import edu.nju.entity.examinee;
import edu.nju.mapper.examineeMappper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by NJU on 2017/11/10.
 */
@RestController
//@RequestMapping("/examinee")
public class serviceExaminee {

    @Value("${server.port}")
    String port;

    @Autowired
    examineeMappper examineeMapper;

    @RequestMapping("/hi")
    public String home() {
        return "welcome";
    }

    @RequestMapping("/email/{userID}/{examID}")
    public String getEmail(@PathVariable("userID") int userID,@PathVariable("examID") int examID){
        return examineeMapper.getexaminee(userID,examID).getEmail();
    }

    @RequestMapping("/email/{userID}")
    public ArrayList<String> getNewEmail(@PathVariable("userID") int userID){
        ArrayList<String> EmailList =new ArrayList();
        examinee[] examinees=examineeMapper.getexamineeList(userID);
        for(int i=0;i<examinees.length;i++){
            EmailList.add(examinees[i].getEmail());
        }
        return EmailList;
    }

    @RequestMapping("/answerSheet/{userID}/{examID}")
    public int getAnswerSheet(@PathVariable("userID") int userID,@PathVariable("examID") int examID){
        return examineeMapper.getexaminee(userID, examID).getAnswerSheetID();
    }

    @RequestMapping("/answerSheet/{userID}")
    public ArrayList<Integer> getAnswerSheetList(@PathVariable("userID") int userID){
        ArrayList<Integer> AnswerSheetList =new ArrayList();
        examinee[] examinees=examineeMapper.getexamineeList(userID);
        for(int i=0;i<examinees.length;i++){
            AnswerSheetList.add(examinees[i].getGrade());
        }
        return AnswerSheetList;
    }

    @RequestMapping("/exam/{userID}")
    public ArrayList<Integer> getExamList(@PathVariable("userID") int userID){
        ArrayList<Integer> examlist =new ArrayList();
        examinee[] examinees=examineeMapper.getexamineeList(userID);
        for(int i=0;i<examinees.length;i++){
            examlist.add(examinees[i].getGrade());
        }
        return examlist;
    }

    @RequestMapping("/grade/{userID}/{examID}")
    public int getGrade(@PathVariable("userID") int userID,@PathVariable("examID") int examID){
        return examineeMapper.getexaminee(userID, examID).getGrade();
    }

    @RequestMapping("/grade/{userID}")
    public ArrayList<Integer> getGradeList(@PathVariable("userID") int userID){
        ArrayList<Integer> gradelist =new ArrayList();
        examinee[] examinees=examineeMapper.getexamineeList(userID);
        for(int i=0;i<examinees.length;i++){
            gradelist.add(examinees[i].getGrade());
        }
        return gradelist;
    }


}
