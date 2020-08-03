package com.csmastery.observer;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class NewsPaperReaderTest {

  private NewsPaperPublisher publisher;

  private NewsPaperReader reader1;
  private NewsPaperReader reader2;

  @BeforeEach
  public void init() {
    publisher = new NewsPaperPublisher("Blikk");
    reader1 = NewsPaperReader.builder().publisher(publisher).name("Peti").build();
    reader2 = NewsPaperReader.builder().publisher(publisher).name("Zoli").build();
    
  }

  @Test
  @Timeout(value = 4, unit = TimeUnit.SECONDS)
  public void readersCouldReadTheFirstPaperIn4Seconds() throws InterruptedException {
    assertThat(reader1.readFirstPaper()).isEqualTo("Cows lose their jobs as milk prices drop");
    assertThat(reader2.readFirstPaper()).isEqualTo("Cows lose their jobs as milk prices drop");
  }

}