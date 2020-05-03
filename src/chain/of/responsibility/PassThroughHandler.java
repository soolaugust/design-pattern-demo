package chain.of.responsibility;

// 处理完传递给下一个处理者
public class PassThroughHandler implements HandlerInterface {
  @Override
  public boolean handle(Object request) {
    System.out.printf("request %s is received, continue handling\n", request.toString());
    return false;
  }
}
