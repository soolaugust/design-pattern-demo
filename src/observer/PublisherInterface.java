package observer;

interface PublisherInterface {
  boolean subscribe(String eventType , SubscriberInterface subscriber);
  boolean unSubscribe(String eventType , SubscriberInterface subscriber);
  void onEvent(String event);
}