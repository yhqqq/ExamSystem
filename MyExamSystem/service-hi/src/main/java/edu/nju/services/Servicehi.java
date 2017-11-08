package edu.nju.services;

import edu.nju.mapper.TestEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/8.
 */
@RestController
@RequestMapping("/heihei")
public class Servicehi {

    @Value("${server.port}")
    String port;

    @Autowired
    TestEntityMapper TestEntityMapper;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @RequestMapping("/test/{id}")
    public String testEntity(@PathVariable("id") int id){
        return TestEntityMapper.getOne(id).toString();
    }

}
