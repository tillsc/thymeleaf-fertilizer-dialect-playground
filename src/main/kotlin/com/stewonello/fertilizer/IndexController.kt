package com.stewonello.fertilizer

import com.stewonello.fertilizer.components.Test
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class IndexController {

    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("title", "Global Context Title")
        model.addAttribute("testProps", Test("TestProp title", "TestProp content"))
        model.addAttribute("variableTitle", "A Variable Title")
        model.addAttribute("someAbandonedVariable", "Abandoned Content")
        return "pages/index"
    }
}
