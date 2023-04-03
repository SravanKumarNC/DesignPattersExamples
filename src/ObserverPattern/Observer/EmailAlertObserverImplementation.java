package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImplementation implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImplementation(String emailId, StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock hurry up!");
    }

    private void sendEmail(String emailId, String massage) {
        System.out.println("Email sent to: " + emailId);
    }
}
