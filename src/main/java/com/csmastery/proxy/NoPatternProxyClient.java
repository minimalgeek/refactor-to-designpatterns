package com.csmastery.proxy;

public class NoPatternProxyClient implements IProxyClient {

  @Override
  public boolean isPrime(int i) {
    int counter=0;
    for(int num = i; num>=1; num--)
    {
      if(i%num==0)
      {
        counter = counter + 1;
      }
    }
    return counter == 2;
  }
}
