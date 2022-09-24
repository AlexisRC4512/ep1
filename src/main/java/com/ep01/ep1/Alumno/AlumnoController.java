package com.ep01.ep1.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Alumno")
public class AlumnoController {
    Alumno al1=new Alumno(1,"Alexis","Ramos","123213","Progrmacion");
    Alumno al2=new Alumno(2,"Arian","Ramos","123213","Progrmacion2");
    @GetMapping
    @RequestMapping("/obtenerAlumnos")
    public List<Alumno> obtenerAlumnos(){
        List<Alumno>miLista=new ArrayList<Alumno>();
        miLista.add(al1);
        miLista.add(al2);
        return miLista.stream().toList();
    }
}
