package org.apache.catalina.connector;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.MultipartConfigElement;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;

/**
 * Responsible for configuring the multipart upload mechanism.
 */
class MultipartUploadHandler {

    static FileUpload createUploadHandler(
            MultipartConfigElement config,
            File location,
            int maxPartHeaderSize,
            int partLimit) throws IOException {

        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setRepository(location.getCanonicalFile());
        factory.setSizeThreshold(config.getFileSizeThreshold());

        FileUpload upload = new FileUpload();
        upload.setFileItemFactory(factory);
        upload.setFileSizeMax(config.getMaxFileSize());
        upload.setSizeMax(config.getMaxRequestSize());
        upload.setPartHeaderSizeMax(maxPartHeaderSize);
        upload.setFileCountMax(partLimit);

        return upload;
    }
}
