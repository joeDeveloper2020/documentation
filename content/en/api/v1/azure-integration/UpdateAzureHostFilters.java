import com.datadog.api.v1.client.api.AzureIntegrationApi;

public class AzureIntegrationApiExample {

    public static void main(String[] args) {
        AzureIntegrationApi apiInstance = new AzureIntegrationApi();
        AzureAccount body = ; // AzureAccount | 
        try {
            Object result = apiInstance.updateAzureHostFilters(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureIntegrationApi#updateAzureHostFilters");
            e.printStackTrace();
        }
    }
}