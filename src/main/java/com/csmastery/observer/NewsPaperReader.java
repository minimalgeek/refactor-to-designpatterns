package com.csmastery.observer;

import lombok.Builder;

@Builder
public class NewsPaperReader {

  private NewsPaperPublisher publisher;
  private String name;

  public String readFirstPaper() throws InterruptedException {
    while (publisher.publish() == null) {
      System.out.println(this.name + " says: Still no news...");
      Thread.sleep(200);
    }
    System.out.println(this.name + " says: Hooray, content arrived!");
    return publisher.publish().getContent();
  }
}