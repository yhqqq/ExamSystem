package edu.nju.mapper;

import edu.nju.entity.Exam;
import edu.nju.mapper.provider.ExamProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 69401 on 2017/11/10.
 */
public interface ExamMapper {

    //    @Select 是查询类的注解，所有的查询均使用这个
    //    @Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
    //    @Insert 插入数据库使用，直接传入实体类会自动解析属性到对应的值
    //    @Update 负责修改，也可以直接传入对象
    //    @delete 负责删除
//    @Select("SELECT * FROM exam WHERE examID = #{examID}")
    @SelectProvider(type = ExamProvider.class,method = "getByExamID")
    public Exam getByExamID(@Param("examID")long examID);

//    @Insert("INSERT INTO exam(examID,single_num,multiple_num,,completion_num,single_score,multiple_score,completion_score,starttime,endtime,courseID) " +
//            "values (#{examID},#{single_num},#{multiple_num},#{completion_num},#{single_score},#{multiple_score},#{completion_score},#{starttime},#{endtime},#{courseID})")
    @InsertProvider(type = ExamProvider.class,method = "insert")
    public Boolean insert(@Param("exam")Exam exam);

    @Select("SELECT * FROM exam")
    public List<Exam> getAll();

//    @Select("SELECT * FROM exam WHERE courseID = #{courseID}")
    @SelectProvider(type = ExamProvider.class,method = "getByCourseID")
    public List<Exam> getByCourseID(@Param("courseID")long courseID);

}
