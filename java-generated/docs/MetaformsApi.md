# MetaformsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMetaform**](MetaformsApi.md#createMetaform) | **POST** /realms/{realmId}/metaforms | create new Metaform
[**deleteMetaform**](MetaformsApi.md#deleteMetaform) | **DELETE** /realms/{realmId}/metaforms/{metaformId} | Deletes Metaform
[**findMetaform**](MetaformsApi.md#findMetaform) | **GET** /realms/{realmId}/metaforms/{metaformId} | Finds single Metaform
[**listMetaforms**](MetaformsApi.md#listMetaforms) | **GET** /realms/{realmId}/metaforms | Lists Metaforms
[**updateMetaform**](MetaformsApi.md#updateMetaform) | **PUT** /realms/{realmId}/metaforms/{metaformId} | Updates Metaform


<a name="createMetaform"></a>
# **createMetaform**
> Metaform createMetaform(realmId, payload)

create new Metaform

Creates new Metaform

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.MetaformsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

MetaformsApi apiInstance = new MetaformsApi();
String realmId = "realmId_example"; // String | realm id
Metaform payload = new Metaform(); // Metaform | Payload
try {
    Metaform result = apiInstance.createMetaform(realmId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaformsApi#createMetaform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **payload** | [**Metaform**](Metaform.md)| Payload |

### Return type

[**Metaform**](Metaform.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteMetaform"></a>
# **deleteMetaform**
> deleteMetaform(realmId, metaformId)

Deletes Metaform

Deletes a Metaform

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.MetaformsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

MetaformsApi apiInstance = new MetaformsApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
try {
    apiInstance.deleteMetaform(realmId, metaformId);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaformsApi#deleteMetaform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findMetaform"></a>
# **findMetaform**
> Metaform findMetaform(realmId, metaformId)

Finds single Metaform

Finds a single Metaform

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.MetaformsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

MetaformsApi apiInstance = new MetaformsApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
try {
    Metaform result = apiInstance.findMetaform(realmId, metaformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaformsApi#findMetaform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |

### Return type

[**Metaform**](Metaform.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listMetaforms"></a>
# **listMetaforms**
> List&lt;Metaform&gt; listMetaforms(realmId)

Lists Metaforms

Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.MetaformsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

MetaformsApi apiInstance = new MetaformsApi();
String realmId = "realmId_example"; // String | realm id
try {
    List<Metaform> result = apiInstance.listMetaforms(realmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaformsApi#listMetaforms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |

### Return type

[**List&lt;Metaform&gt;**](Metaform.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateMetaform"></a>
# **updateMetaform**
> Metaform updateMetaform(realmId, metaformId, payload)

Updates Metaform

Updates a Metaform

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.MetaformsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

MetaformsApi apiInstance = new MetaformsApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
Metaform payload = new Metaform(); // Metaform | Payload
try {
    Metaform result = apiInstance.updateMetaform(realmId, metaformId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaformsApi#updateMetaform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |
 **payload** | [**Metaform**](Metaform.md)| Payload |

### Return type

[**Metaform**](Metaform.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

