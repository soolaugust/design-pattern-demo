package proxy;

// 代理对象
public class TooLargeObjectProxy {
  private TooLargeObject tooLargeObject; // 可以通过组合或者继承的方式引入，这里采用组合的方式

  public void function(){
    // 使用时才创建，使用完后进行销毁
    tooLargeObject = new TooLargeObject();
    tooLargeObject.method();
    tooLargeObject.destroy();
  }
}
