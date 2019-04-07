package springbootdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public class PvlostMapper {

    @Select("select * from user where user_id = #{userId}")
    public Pvlost getById(Integer userId);


}
