package com.example.mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    // ✅ Exercise 1: Mocking and Stubbing
    @Test
    public void testExternalApiWithMocking() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    // ✅ Exercise 2: Verifying Interactions
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi).getData();
    }

    // ✅ Exercise 3: Argument Matchers (Improved Example)
    @Test
    public void testArgumentMatchers() {
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Matched");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Matched", result);
    }

    // Additional Test: fetchData returns null if API returns null
    @Test
    public void testFetchDataReturnsNullWhenApiReturnsNull() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn(null);

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals(null, result);
    }

    // Additional Test: fetchData returns empty string if API returns empty string
    @Test
    public void testFetchDataReturnsEmptyString() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("", result);
    }

    // Additional Test: verify getData is called only once
    @Test
    public void testGetDataCalledOnce() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Once");

        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi, times(1)).getData();
        verifyNoMoreInteractions(mockApi);
    }
}
