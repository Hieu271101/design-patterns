package org.example.structural_design.Decorator.OpeanAIExample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Text simpleText = new SimpleText("Hello world");
        log.info("Original: {}", simpleText);

        TextDecorator encryptedText = new EncryptedText(simpleText);
        log.info("Encrypted: {}", encryptedText);
        TextDecorator compressText = new CompressedText(simpleText);
        log.info("Compress: {}", compressText);

    }
}
