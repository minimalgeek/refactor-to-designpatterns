package com.csmastery.chainofresponsibility;

import com.csmastery.chainofresponsibility.handler.NameHandler;
import lombok.NoArgsConstructor;

public class ChainClient implements IChainClient {

    private Handler firstHandler;

    public ChainClient() {
        firstHandler = new NameHandler();
        firstHandler.setNext(new AgeHandler())
                .setNext(new EmailHandler());
    }

    @Override
    public boolean validateUser(User build) {
        return firstHandler.handle(build);
    }
}
