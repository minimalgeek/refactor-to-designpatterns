package com.csmastery.other.osherovecalculator;

import java.util.List;
import java.util.regex.Pattern;

public interface NegativeExtractor {
  Pattern getPattern();

  boolean canExtract(String nums);

  int substringIndex();

  void setNext(NegativeExtractor next);

  List<String> extract(String nums);
}