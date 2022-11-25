package hello.hellospring.mapper;

import hello.hellospring.entity.UserVo;
import hello.hellospring.entity.rh;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//MyBatis
@Repository
@Mapper
public interface BoardMapper {
    public List<rh> getLists();  // XML Mapper file
    public void boardInsert(rh vo);

    public List<UserVo> userLists();


}
