package chain.of.responsibility;

import java.util.ArrayList;
import java.util.List;

public class Application {
  // 职责链
  private static List<HandlerInterface> mHandlerChain = new ArrayList<>();

  public static void main(String[] args){
    // 处理链条是： * -> x -> *
    // 第三个不会达到
    HandlerInterface passThroughHandler = new PassThroughHandler();
    mHandlerChain.add(passThroughHandler);

    HandlerInterface blockHandler = new BlockHandler();
    mHandlerChain.add(blockHandler);

    HandlerInterface unreachableThroughHandler = new PassThroughHandler();
    mHandlerChain.add(unreachableThroughHandler);

    String request = "mock-request";

    for(HandlerInterface handler : mHandlerChain){
      if (handler.handle(request)){
        return;
      }
    }
  }
}

// 输出:
// request mock-request is received, continue handling
// request mock-request is received, block the chain
