package chain.of.responsibility;

// 处理者接口
public interface HandlerInterface {
  // 处理函数
  // true表示已处理完，不需要继续处理
  // false表示传递给下一个处理者
  boolean handle(Object request);
}