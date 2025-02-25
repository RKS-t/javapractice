package chapter2.capsulation.v1;

public class DataStore {

    private String store;

    public void setStore(String store) {
        if (store.equals("B")) {
            System.out.println("B입력 제한");
        }else{
            this.store = store;
        }
    }

}
