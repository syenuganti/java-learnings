package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<NewsSubscriber> subscribers;
    private String latestNews;

    public NewsAgency() {
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(NewsSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(NewsSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (NewsSubscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
}
