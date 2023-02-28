package com.ingeniemos.holamundothymeleafdata.web;

import com.ingeniemos.holamundothymeleafdata.dominio.dao.IPersonaDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private IPersonaDao personaDao;
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Se esta ejecutando el MVC");
        var personas = personaDao.findAll();
        model.addAttribute("personas",personas);
        return "index";
    }
}
