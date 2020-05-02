public class Application {
  private static final String EVENT_1 = "event1";
  private static final String EVENT_2 = "event2";

  public static void main(String[] args){
    // 定义对象
    PublisherInterface publisher = new Publisher();
    SubscriberInterface subscriber1 = new Subscriber();
    SubscriberInterface subscriber2 = new Subscriber();

    // subscriber1订阅事件1，subscriber2订阅事件2
    publisher.subscribe(EVENT_1, subscriber1);
    publisher.subscribe(EVENT_2, subscriber2);

    // 触发事件1， subscriber1响应
    publisher.onEvent(EVENT_1);

    // subscriber1取消订阅事件1
    publisher.unSubscribe(EVENT_1, subscriber1);

    // 触发事件1， 因为没有订阅者，不响应
    publisher.onEvent(EVENT_1);

    // 触发事件2，subscriber2响应
    publisher.onEvent(EVENT_2);
  }
}

// 输出如下
//  receive event: event1
//  receive event: event2
