package chain.of.responsibility;

// 处理完后终止传递
public class BlockHandler implements HandlerInterface {
  @Override
  public boolean handle(Object request) {
    System.out.printf("request %s is received, block the chain\n", request.toString());
    return true;
  }
}
