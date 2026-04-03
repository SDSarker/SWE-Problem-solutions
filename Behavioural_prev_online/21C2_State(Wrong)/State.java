public interface State {
    public void confirmOrder();
    public void shipParcel();
    public void deliverParcel();
    public void cancelOrder();
    public void show();
}
