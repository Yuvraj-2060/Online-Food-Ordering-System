package repository;

import restaurantManagementModule.MenuItem;

public interface CustomerRepository {
    public void addItem(MenuItem item, int quantity);

    public void removeItem(MenuItem item);

    public void reviewCartItem();

    public double cartValue();

    public void order();
}
