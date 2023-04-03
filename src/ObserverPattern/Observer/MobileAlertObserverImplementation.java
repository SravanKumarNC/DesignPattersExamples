package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImplementation implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImplementation(String emailId, StocksObservable observable){
        this.observable = observable;
        this.userName = emailId;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String s) {
        System.out.println("msg sent to the end user");
    }
}
