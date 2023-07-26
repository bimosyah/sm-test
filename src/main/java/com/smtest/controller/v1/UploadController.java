package com.smtest.controller.v1;

import com.smtest.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("v1/upload/")
public interface UploadController {

    @PostMapping("image")
    ResponseEntity<BaseResponse> uploadImage(@RequestParam("file") MultipartFile multipartFile);
}
