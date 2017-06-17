/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

<<<<<<< HEAD
/**
 *
 * @author sofri
 */
=======
>>>>>>> 1da5fad02d5cbb8c083b1b203322d08cc45dd633
import com.gdn.scm.bolivia.entity.UploadModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;

=======
import org.springframework.web.bind.annotation.CrossOrigin;


/**
 *
 * @author sofrie.zumaytis
 */
>>>>>>> 1da5fad02d5cbb8c083b1b203322d08cc45dd633
@RestController
public class RestUploadController {

    private final Logger logger = LoggerFactory.getLogger(RestUploadController.class);

    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "D://temp//";

    // 3.1.1 Single file upload
    @PostMapping("/api/upload")
    // If not @RestController, uncomment this
    //@ResponseBody
<<<<<<< HEAD
    public void uploadFile(@RequestBody UploadModel uploadfile) {
        logger.debug("Single file upload!");
//        if (uploadfile.getFiles().length<=0) {
////            return new ResponseEntity("please select a file!", HttpStatus.OK);            
//        }
        if (uploadfile.getFiles().length > 0) {
            saveUploadedFiles(Arrays.asList(uploadfile));

        }//        return new ResponseEntity("Successfully uploaded - " +
//                uploadfile.getFiles()[0].getOriginalFilename(), new HttpHeaders(), HttpStatus.OK);
=======
      @CrossOrigin
    public ResponseEntity<?> uploadFile(@RequestParam MultipartFile invoiceFile) {

        logger.debug("Single file upload!");

        if (invoiceFile.isEmpty()) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }

        try {

            saveUploadedFiles(Arrays.asList(invoiceFile));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded - " +
                invoiceFile.getOriginalFilename(), new HttpHeaders(), HttpStatus.OK);

>>>>>>> 1da5fad02d5cbb8c083b1b203322d08cc45dd633
    }

    // 3.1.2 Multiple file upload
    @PostMapping("/api/upload/multi")
    public ResponseEntity<?> uploadFileMulti(
            @RequestParam("extraField") String extraField,
            @RequestParam("files") MultipartFile[] uploadfiles) {

        logger.debug("Multiple file upload!");

        // Get file name
        String uploadedFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
                .filter(x -> !StringUtils.isEmpty(x)).collect(Collectors.joining(" , "));

        if (StringUtils.isEmpty(uploadedFileName)) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }

        try {

            saveUploadedFiles(Arrays.asList(uploadfiles));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded - "
                + uploadedFileName, HttpStatus.OK);

    }

    // 3.1.3 maps html form to a Model
    @PostMapping("/api/upload/multi/model")
    public ResponseEntity<?> multiUploadFileModel(@ModelAttribute UploadModel model) {

        logger.debug("Multiple file upload! With UploadModel");

        try {

            saveUploadedFiles(Arrays.asList(model.getFiles()));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded!", HttpStatus.OK);

    }

    //save file
    private void saveUploadedFiles(List<MultipartFile> files) throws IOException {

        for (MultipartFile file : files) {

            if (file.isEmpty()) {
                continue; //next pls
            }

            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

        }

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 1da5fad02d5cbb8c083b1b203322d08cc45dd633
