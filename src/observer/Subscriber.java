package observer;

public class Subscriber implements SubscriberInterface {
  @Override
  public void onReceive(String event) {
    System.out.printf("receive event: %s\n", event);
  }
}
