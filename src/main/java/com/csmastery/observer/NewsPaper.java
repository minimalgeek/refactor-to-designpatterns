package com.csmastery.observer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewsPaper {

  private String name;
  private String content;

}
