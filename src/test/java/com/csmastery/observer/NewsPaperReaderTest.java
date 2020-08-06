package com.csmastery.observer;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NewsPaperReaderTest {

  private NewsPaperPublisher publisher;
  private ByteArrayOutputStream stream;

  private NewsPaperReader reader1;
  private NewsPaperReader reader2;
  private NewsPaperReader reader3;

  @BeforeEach
  public void init() {
    publisher = new NewsPaperPublisher();
    reader1 = NewsPaperReader.builder().name("Emese").build();
    reader2 = NewsPaperReader.builder().name("Zoli").build();
    reader3 = NewsPaperReader.builder().name("Nora").build();

    publisher.subscribe("Blikk", reader1);
    publisher.subscribe("Blikk", reader2);
    publisher.subscribe("Nepszava", reader3);

    this.stream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stream));
  }

  @Test
  @Order(1)
  public void firstTwoReadersCouldReadTheFirstPaperIn4Seconds() throws InterruptedException {
    publisher.publish("Blikk", "Kiskutya");
    assertThat(stream.toString()).isEqualToIgnoringWhitespace("KiskutyaKiskutya");
  }
  
  @Test
  @Order(2)
  public void thirdReaderCouldReadTheFirstPaperIn4Seconds() throws InterruptedException {
    publisher.publish("Nepszava", "Kismacska");
    assertThat(stream.toString()).isEqualToIgnoringWhitespace("Kismacska");
  }

}