package com.csmastery.other.osherovecalculator;

import java.util.regex.Pattern;

public class DashDashExtractor extends AbstractNegativeExtractor {

  @Override
  public Pattern getPattern() {
    return Pattern.compile("--\\d+");
  }

  @Override
  public boolean canExtract(String nums) {
    return nums.contains("--");
  }

  @Override
  public int substringIndex() {
    return 1;
  }
  
}