package com.csmastery.adapter;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;

import com.csmastery.other.util.ResourcesFileReader;
import com.google.common.base.Charsets;
import com.google.common.io.Files;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {

  private StringProcessor processor;

  @BeforeEach
  public void init() {
    this.processor = new StringProcessor();
  }

  @Test
  public void splitSampleText() {
    TokenizerData tokenizerData = new TokenizerData("Hello, welcome to tokenizing", " ");
    assertThat(processor.tokenize(tokenizerData)).contains("Hello,", "welcome", "to", "tokenizing");
  }

  @Test
  public void splitSampleTextFromFile() throws IOException {
    File file = ResourcesFileReader.getInstance().readFile("adapter-data.txt");
    String result = Files.asCharSource(file, Charsets.UTF_8).read();
    assertThat(result).isEqualTo("hello, I would like to tokenize myself!");
    // assertThat(processor.tokenize(???)).contains("hello,", "I", "would", "like",
    // "to", "tokenize", "myself!");
  }
}