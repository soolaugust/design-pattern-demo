package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher implements PublisherInterface {
  Map<String, List<SubscriberInterface>> subscriberMap = new HashMap();

  @Override
  public boolean subscribe(String eventType, SubscriberInterface subscriber) {
    // 第一次订阅事件，创建订阅列表并加入订阅者
    if(!subscriberMap.containsKey(eventType)){
      List<SubscriberInterface> subscribers = new ArrayList<>();
      subscribers.add(subscriber);
      subscriberMap.put(eventType, subscribers);
    }
    // 已经订阅的，不做任何反应
    if(subscriberMap.get(eventType).contains(subscriber)){
      return true;
    }
    // 将订阅者加入到订阅列表
    subscriberMap.get(eventType).add(subscriber);
    return true;
  }

  @Override
  public boolean unSubscribe(String eventType, SubscriberInterface subscriber) {
    // 如果不存在订阅类型，返回失败
    if (!subscriberMap.containsKey(eventType)){
      return false;
    }
    // 如果之前没有订阅，不做任何反应
    if(!subscriberMap.get(eventType).contains(subscriber)){
      return true;
    }
    subscriberMap.get(eventType).remove(subscriber);
    return true;
  }

  @Override
  public void onEvent(String event){
    // 遍历订阅者列表，并调用接受接口
    for(SubscriberInterface subscriber : subscriberMap.get(event)){
      subscriber.onReceive(event);
    }
  }
}
