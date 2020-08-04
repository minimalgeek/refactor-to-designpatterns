package com.csmastery.observer;

import lombok.Builder;

@Builder
public class NewsPaperReader implements Subscriber<NewsPaper> {

  private String name;

  @Override
  public void update(NewsPaper content) {
    System.out.println(content.getContent());
  }
}