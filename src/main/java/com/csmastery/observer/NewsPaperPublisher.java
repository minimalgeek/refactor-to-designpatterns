package com.csmastery.observer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewsPaperPublisher {

  private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
  private NewsPaper publishedPaper;

  public NewsPaperPublisher(String paperName) {
    executorService.scheduleAtFixedRate(() -> {
      publishedPaper = NewsPaper.builder().name(paperName).content("Cows lose their jobs as milk prices drop").build();
    }, 1, 2, TimeUnit.SECONDS);
  }

  public NewsPaper publish() {
    return publishedPaper;
  }

}