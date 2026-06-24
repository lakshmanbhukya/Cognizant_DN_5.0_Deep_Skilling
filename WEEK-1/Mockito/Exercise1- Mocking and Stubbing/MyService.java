package org.example.mockito;


public class MyService {
    private final MyExternalApi api;

    public MyService(MyExternalApi api) {
        this.api = api;
    }

    public String getData() {
        return api.getData();
    }
}
