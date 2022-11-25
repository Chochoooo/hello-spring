package hello.hellospring.controller;

import hello.hellospring.entity.rh;
import hello.hellospring.mapper.BoardMapper;
import hello.hellospring.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardMapper mapper;

    @Autowired
    BoardRepository repository;

    @RequestMapping("/list")
        public String list(Model model) {
           List<rh> list = mapper.getLists();
           model.addAttribute("list", list);
                return "board/list"; // templates/board/list.html
    }

    @RequestMapping("/list1")
        public String list1(Model model) {
            List<rh> list = repository.findAll();
            model.addAttribute("list",list);
                return "board/list"; // templates/board/list.html
        }
    }

