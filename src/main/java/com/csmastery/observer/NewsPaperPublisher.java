package com.csmastery.observer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewsPaperPublisher {

  private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
  private NewsPaper publishedPaper;

  public NewsPaperPublisher(String paperName) {
    executorService.scheduleAtFixedRate(() -> {
      if (paperName.equals("Blikk"))
        publishedPaper = NewsPaper.builder().name(paperName).content("Cows lose their jobs as milk prices drop")
            .build();
      else
        publishedPaper = NewsPaper.builder().name(paperName).content("Safety meeting ends in accident").build();
    }, 1, 2, TimeUnit.SECONDS);
  }

  public NewsPaper publish() {
    return publishedPaper;
  }

}