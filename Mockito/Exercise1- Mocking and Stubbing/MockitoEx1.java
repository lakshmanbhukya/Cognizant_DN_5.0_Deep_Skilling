package mockito;

import org.example.mockito.MyExternalApi;
import org.example.mockito.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MockitoEx1 {
    @Test
    public void mockito() {
        MyExternalApi api = Mockito.mock(MyExternalApi.class);
        //Arrange
        when(api.getData()).thenReturn("mockito");
        MyService service = new MyService(api);
        //Act
        String result = service.getData();
        //Assert
        assertEquals("mockito", result);
    }
}
