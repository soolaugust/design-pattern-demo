package proxy;

// 服务对象过于庞大
public class TooLargeObject {
  public TooLargeObject(){} // 初始化
  public boolean destroy(){
    return false;
  } // 销毁
  public void method(){} // 方法
}
