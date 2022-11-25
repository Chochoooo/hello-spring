package hello.hellospring;

import hello.hellospring.entity.rh;
import hello.hellospring.mapper.BoardMapper;
import hello.hellospring.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringApplicationTests {

	@Autowired
	BoardMapper mapper;

	@Test
	void contextLoads() {
		rh vo = new rh();
		vo.setTitle("게시판 연습");
		vo.setWriter("관리자");
		vo.setContent("게시판 연습");
		mapper.boardInsert(vo);
		System.out.println("저장성공");
	}

}
