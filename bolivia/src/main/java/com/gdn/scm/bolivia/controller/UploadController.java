/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

/**
 *
 * @author sofrie.zumaytis
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UploadController {

  
  /**
   * Show the index page containing the form for uploading a file.
   */
  @RequestMapping("/")
  public String index() {
    return "index.html";
  }
  
  /**
   * POST /uploadFile -> receive and locally save a file.
   * 
   * @param uploadfile The uploaded file as Multipart file parameter in the 
   * HTTP request. The RequestParam name must be the same of the attribute 
   * "name" in the input tag with type file.
   * 
   * @return An http OK status in case of success, an http 4xx status in case 
   * of errors.
   */
  @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<?> uploadFile(
      @ModelAttribute("uploadfile") MultipartFile uploadfile) {
    
    try {
      // Get the filename and build the local file path
      String filename = uploadfile.getOriginalFilename();
      String directory ="D://temp//";
      String filepath = Paths.get(directory, filename).toString();
      
      // Save the file locally
      BufferedOutputStream stream =
          new BufferedOutputStream(new FileOutputStream(new File(filepath)));
      stream.write(uploadfile.getBytes());
      stream.close();
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    
    return new ResponseEntity<>(HttpStatus.OK);
  } // method uploadFile

} // class MainController
