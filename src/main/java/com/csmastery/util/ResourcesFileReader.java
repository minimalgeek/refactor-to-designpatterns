package com.csmastery.util;

import java.io.File;
import java.net.URL;

public class ResourcesFileReader {

  private ResourcesFileReader() {
  }
  
  private static ResourcesFileReader INSTANCE;

  public static ResourcesFileReader getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new ResourcesFileReader();
    }
    return INSTANCE;
  }

  public File readFile(String fileName) {
    ClassLoader classLoader = getClass().getClassLoader();

    URL resource = classLoader.getResource(fileName);
    if (resource == null) {
      throw new IllegalArgumentException("file is not found!");
    } else {
      return new File(resource.getFile());
    }
  }
}