package com.csmastery.other.osherovecalculator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;

public abstract class AbstractNegativeExtractor implements NegativeExtractor {

  private NegativeExtractor next;

  public List<String> extract(String nums) {
    if (this.canExtract(nums)) {
      Matcher matcher = this.getPattern().matcher(nums);
      List<String> negatives = new LinkedList<>();
      while (matcher.find()) {
        for (int j = 0; j <= matcher.groupCount(); j++) {
          negatives.add(matcher.group(j).substring(this.substringIndex()));
        }
      }
      return negatives;
    } else {
      if (next != null) {
        return next.extract(nums);
      }
      return Collections.emptyList();
    }
  }

  public void setNext(NegativeExtractor next) {
    this.next = next;
  }

}