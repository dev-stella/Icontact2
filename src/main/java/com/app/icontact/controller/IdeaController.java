package com.app.icontact.controller;

import com.app.icontact.domain.IdeaVO;
import com.app.icontact.domain.UserVO;
import com.app.icontact.exception.LoginFailedException;
import com.app.icontact.service.IdeaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/idea/*")
public class IdeaController {
    private final IdeaService ideaService;

    @GetMapping("detail")
    public void detail(Long id){;}

    @GetMapping("ideaBank")
    public void list(){;}

    @GetMapping("update")
    public void goToUpdateIdeaForm(){;}

    @PostMapping("update")
    public RedirectView update(IdeaVO ideaVO, RedirectAttributes redirectAttributes){
        return new RedirectView("/idea/detail");
    }

    @GetMapping("write")
    public void goToWriteIdeaForm(IdeaVO ideaVO){;}

    @PostMapping("write")
    public RedirectView write(IdeaVO ideaVO, RedirectAttributes redirectAttributes){
//        ideaService.write(ideaVO);
        return new RedirectView("/idea/ideaBank");
    }


}
