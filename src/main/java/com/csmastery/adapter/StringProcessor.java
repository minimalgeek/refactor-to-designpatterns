package com.csmastery.adapter;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import com.google.common.collect.Lists;

public class StringProcessor {
  
  public List<String> tokenize(TokenizerData input) {
    StringTokenizer st = new StringTokenizer(input.getData(), input.getSeparator());
    LinkedList<String> retList = Lists.newLinkedList();
    while (st.hasMoreTokens()) {
      retList.add(st.nextToken());
    }
    return retList;
  }

}