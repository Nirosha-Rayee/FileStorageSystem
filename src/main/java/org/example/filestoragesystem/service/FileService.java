package org.example.filestoragesystem.service;

import org.example.filestoragesystem.entity.File;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {
    File saveAttachment(MultipartFile file) throws Exception;

    File getAttachment(String fileId) throws Exception;

    List<File> getAllFiles();
}
