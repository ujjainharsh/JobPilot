package com.jobpilot.ai.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
@Slf4j
public class PdfTextExtractionService {

    public String extractText(Resource pdfResource) {

        try (InputStream inputStream = pdfResource.getInputStream();
             PDDocument document = Loader.loadPDF(inputStream.readAllBytes())) {

            PDFTextStripper pdfTextStripper = new PDFTextStripper();

            String text = pdfTextStripper.getText(document);

            log.info(
                    "PDF text extraction successful. pages={}, characters={}",
                    document.getNumberOfPages(),
                    text.length()
            );

            return text;

        } catch (IOException e) {

            log.error(
                    "Failed to extract text from PDF. fileName={}",
                    pdfResource.getFilename(),
                    e
            );

            throw new IllegalStateException(
                    "Unable to extract text from PDF",
                    e
            );
        }
    }
}
