package com.marcoduarte.dom6.controller;

import com.marcoduarte.dom6.entity.Nation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private final List<Nation> nations;

    public HomeController() {
        nations = new ArrayList<>();
        nations.add(new Nation(5, "Arcoscephale", "Golden Era", "Arc", "early_arcoscephale", 1));
        nations.add(new Nation(6, "Mekone", "Brazen Giants", "Mek", "early_mekone", 1));
        nations.add(new Nation(7, "Pangaea", "Age of Revelry", "Pa", "early_pangaea", 1));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/dynamic")
    public String dynamic(Model model) {
        model.addAttribute("nations", nations);
        return "dynamic";
    }
}
