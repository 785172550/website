package com.demo.controller;

import com.demo.domain.model.Item;
import com.demo.service.SecKillService;
import com.google.common.collect.Lists;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SecKillController {

    @Autowired
    SecKillService secKillService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getList(Model model) {
        Item item = new Item(1L, "hello", "content", 10, new Date(), new Date(), new Date());
        List list = Lists.newArrayList(item);
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/{Id}/detail")
    public String getDetail(@PathVariable("Id") Long Id, Model model) {
        if (Id == null) {
            return "redirect:/list";
        }
        Item item = secKillService.getById(Id);
        if (item == null) {
            return "forward:/list";
        }
        model.addAttribute("item", item);
        return "detail";
    }

    @RequestMapping("add/{Id}")
    public Object addItem(@PathVariable("Id") Long Id) {

        Item item = new Item(Id, "q", "content", 2, new Date(), new Date(), new Date());

        return item;
    }
}