package com.xworkz.fileUpload.controller;

import com.xworkz.fileUpload.dto.StudentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/")
public class StudentController {
    public StudentController(){
        System.out.println("controller...");
    }

    @PostMapping("/upload")
    public String upload(@ModelAttribute StudentDTO studentDTO) throws IOException {
        System.out.println(studentDTO);
        MultipartFile fileName = studentDTO.getFileName();
        byte[] imagSize = fileName.getBytes();
        Path imagePath= Paths.get("J:\\xworkz\\projectImages\\"+fileName.getOriginalFilename()+System.currentTimeMillis()+".jpg");
        Files.write(imagePath,imagSize);
        return "index";
    }
}
