package com.xworkz.fileUpload.controller;

import com.xworkz.fileUpload.dto.StudentDTO;
import com.xworkz.fileUpload.util.SendMail;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/")
public class StudentController {
    public StudentController(){
        System.out.println("controller...");
    }

    @Autowired
    SendMail sendMail;

//    @PostMapping("/upload")
//    public String upload(@ModelAttribute StudentDTO studentDTO) throws IOException {
//        System.out.println(studentDTO);
//        MultipartFile fileName = studentDTO.getFileName();
//        byte[] imagSize = fileName.getBytes();
//        Path imagePath= Paths.get("J:\\xworkz\\projectImages\\"+fileName.getOriginalFilename()+System.currentTimeMillis()+".jpg");
//        Files.write(imagePath,imagSize);
//        System.out.println(imagePath);
//        return "index";
//    }

    @PostMapping("/upload")
    public String upload(@ModelAttribute StudentDTO studentDTO, Model model, HttpSession session) throws IOException {

        MultipartFile file = studentDTO.getFileName();

        String filePath = "J:\\xworkz\\projectImages\\" + System.currentTimeMillis() + "_" + file.getOriginalFilename();

        Path path = Paths.get(filePath);
        Files.write(path, file.getBytes());

        // ✅ Store in session
        session.setAttribute("imagePath", filePath);

        return "index";
    }

    @GetMapping("/image")
    public String image(HttpServletResponse response,
                        HttpSession session,
                        Model model){

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

        String imagePath = (String) session.getAttribute("imagePath");

        model.addAttribute("imagePath", imagePath);

        String otp = sendMail.sendMail();
        System.out.println("Generated OTP: " + otp);

        return "image";
    }

    @GetMapping("/download")
    public void getImage(HttpServletResponse httpServletResponse, @RequestParam String imagePath) throws IOException {
        httpServletResponse.setContentType("image/jpg");
        File file=new File(imagePath);
        InputStream inputStream=new BufferedInputStream(new FileInputStream(file));
        ServletOutputStream servletOutputStream=httpServletResponse.getOutputStream();
        IOUtils.copy(inputStream,servletOutputStream);
        httpServletResponse.flushBuffer();

    }
}
