package com.csmastery.other.util;

import java.io.File;
import java.net.URL;

public class ResourcesFileReader {

  private ResourcesFileReader() {
  }

  private static ResourcesFileReader instance;

  public static ResourcesFileReader getInstance() {
    if (instance == null) {
      instance = new ResourcesFileReader();
    }
    return instance;
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