package proxy;

// 代理对象
public class ServiceProxy extends Service { // 和上面不同的是，这里采用继承的方式
  @Override
  public void method(){
    preHandle(); // 前处理
    super.method(); // 使用的服务方法
    postHandle(); // 后处理
  }

  private void preHandle(){}
  private void postHandle(){}
}
