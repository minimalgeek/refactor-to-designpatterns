package com.csmastery.observer;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewsPaperPublisher {

  private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
  private Map<String, List<Subscriber<NewsPaper>>> topics = new HashMap<>();

  public NewsPaperPublisher() {}

  public void subscribe(String paperName, Subscriber<NewsPaper> subscriber) {
    if (topics.containsKey(paperName)) {
      topics.get(paperName).add(subscriber);
    }
    else topics.put(paperName, Lists.newArrayList(subscriber));
  }

  public void publish(String paperName, String content) {
//    executorService.scheduleAtFixedRate(() -> {
      NewsPaper publishedPaper = NewsPaper.builder().name(paperName).content(content)
                .build();
      notifyAll(paperName, publishedPaper);
//    }, 1, 2, TimeUnit.SECONDS);
  }

  private void notifyAll(String paperName, NewsPaper newsPaper) {
    topics.get(paperName).forEach((subscriber) -> subscriber.update(newsPaper));
  }

}