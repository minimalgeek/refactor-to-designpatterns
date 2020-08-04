package com.csmastery.observer;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class NewsPaperReaderTest {

  private NewsPaperPublisher publisher1;
  private NewsPaperPublisher publisher2;

  private NewsPaperReader reader1;
  private NewsPaperReader reader2;
  private NewsPaperReader reader3;

  @BeforeEach
  public void init() {
    publisher1 = new NewsPaperPublisher("Blikk");
    publisher2 = new NewsPaperPublisher("Nepszava");
    reader1 = NewsPaperReader.builder().publisher(publisher1).name("Emese").build();
    reader2 = NewsPaperReader.builder().publisher(publisher1).name("Zoli").build();
    reader3 = NewsPaperReader.builder().publisher(publisher2).name("Nora").build();
  }

  @Test
  @Timeout(value = 4, unit = TimeUnit.SECONDS)
  public void firstTwoReadersCouldReadTheFirstPaperIn4Seconds() throws InterruptedException {
    assertThat(reader1.readFirstPaper()).isEqualTo("Cows lose their jobs as milk prices drop");
    assertThat(reader2.readFirstPaper()).isEqualTo("Cows lose their jobs as milk prices drop");
  }

  
  @Test
  @Timeout(value = 4, unit = TimeUnit.SECONDS)
  public void thirdReaderCouldReadTheFirstPaperIn4Seconds() throws InterruptedException {
    assertThat(reader3.readFirstPaper()).isEqualTo("Safety meeting ends in accident");
  }

}