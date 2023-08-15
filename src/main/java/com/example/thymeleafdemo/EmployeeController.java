package com.example.thymeleafdemo;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    @GetMapping("/iteration")
    public String bootstrap(Model model){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ramesh","Fadatare","ramesh@gmail.com"));
        employees.add(new Employee("John","Cena","cena@gmail.com"));
        employees.add(new Employee("Tom","Cruise","cruise@gmail.com"));
        employees.add(new Employee("Tony","Spark","spark@gmail.com"));
        model.addAttribute("employees", employees);
        return "iteration";
    }
}
