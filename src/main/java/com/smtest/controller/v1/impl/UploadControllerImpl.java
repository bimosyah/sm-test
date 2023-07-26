package com.smtest.controller.v1.impl;

import com.smtest.config.aws.FileService;
import com.smtest.controller.v1.UploadController;
import com.smtest.response.BaseResponse;
import com.smtest.utils.ResponseHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
public class UploadControllerImpl implements UploadController {

    private final FileService fileService;

    @Override
    public ResponseEntity<BaseResponse> uploadImage(MultipartFile multipartFile) {
        return ResponseHelper.buildOkResponse(fileService.save(multipartFile));
    }
}
