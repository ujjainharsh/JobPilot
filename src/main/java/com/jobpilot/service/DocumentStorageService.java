package com.jobpilot.service;


import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class DocumentStorageService {

    private final GridFsTemplate gridFsTemplate;

    public String store(MultipartFile file) throws IOException {

        ObjectId fileId = gridFsTemplate.store(
                file.getInputStream(),
                file.getOriginalFilename(),
                file.getContentType()
        );

        return fileId.toHexString();
    }

    public GridFsResource getResource(String storageId) {

        var file = gridFsTemplate.findOne(
                new org.springframework.data.mongodb.core.query.Query(
                        org.springframework.data.mongodb.core.query.Criteria
                                .where("_id")
                                .is(new ObjectId(storageId))
                )
        );

        if (file == null) {
            throw new IllegalArgumentException(
                    "Document not found in GridFS: " + storageId
            );
        }

        return gridFsTemplate.getResource(file);
    }

    public void delete(String storageId) {

        gridFsTemplate.delete(
                new org.springframework.data.mongodb.core.query.Query(
                        org.springframework.data.mongodb.core.query.Criteria
                                .where("_id")
                                .is(new ObjectId(storageId))
                )
        );
    }
}
