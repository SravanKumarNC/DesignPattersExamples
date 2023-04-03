package ObserverPattern;

import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observable.iphoneObservableImplementation;
import ObserverPattern.Observer.EmailAlertObserverImplementation;
import ObserverPattern.Observer.MobileAlertObserverImplementation;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new iphoneObservableImplementation();

        NotificationAlertObserver observer1 = new EmailAlertObserverImplementation("sravankumarnc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImplementation("sravankumar@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImplementation("sravannckumar@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);


    }
}
