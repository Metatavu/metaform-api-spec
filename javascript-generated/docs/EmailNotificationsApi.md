# MetaformApiClient.EmailNotificationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmailNotification**](EmailNotificationsApi.md#createEmailNotification) | **POST** /realms/{realmId}/metaforms/{metaformId}/emailNotifications | create new form email notification
[**deleteEmailNotification**](EmailNotificationsApi.md#deleteEmailNotification) | **DELETE** /realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId} | Deletes an email notification
[**findEmailNotification**](EmailNotificationsApi.md#findEmailNotification) | **GET** /realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId} | Find a single emai notification
[**listEmailNotifications**](EmailNotificationsApi.md#listEmailNotifications) | **GET** /realms/{realmId}/metaforms/{metaformId}/emailNotifications | Lists form email notifications
[**updateEmailNotification**](EmailNotificationsApi.md#updateEmailNotification) | **PUT** /realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId} | Updates email notification


<a name="createEmailNotification"></a>
# **createEmailNotification**
> EmailNotification createEmailNotification(realmId, metaformId, payload)

create new form email notification

Creates new form email notification

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.EmailNotificationsApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var payload = new MetaformApiClient.EmailNotification(); // EmailNotification | Payload

apiInstance.createEmailNotification(realmId, metaformId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **payload** | [**EmailNotification**](EmailNotification.md)| Payload | 

### Return type

[**EmailNotification**](EmailNotification.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteEmailNotification"></a>
# **deleteEmailNotification**
> deleteEmailNotification(realmId, metaformId, emailNotificationId)

Deletes an email notification

Deletes an email notification

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.EmailNotificationsApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var emailNotificationId = "emailNotificationId_example"; // String | Email notification id

apiInstance.deleteEmailNotification(realmId, metaformId, emailNotificationId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **emailNotificationId** | **String**| Email notification id | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findEmailNotification"></a>
# **findEmailNotification**
> EmailNotification findEmailNotification(realmId, metaformId, emailNotificationId)

Find a single emai notification

Finds single email notification by id

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.EmailNotificationsApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var emailNotificationId = "emailNotificationId_example"; // String | EmailNotification id

apiInstance.findEmailNotification(realmId, metaformId, emailNotificationId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **emailNotificationId** | **String**| EmailNotification id | 

### Return type

[**EmailNotification**](EmailNotification.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listEmailNotifications"></a>
# **listEmailNotifications**
> [EmailNotification] listEmailNotifications(realmId, metaformId)

Lists form email notifications

Lists email notifications

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.EmailNotificationsApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

apiInstance.listEmailNotifications(realmId, metaformId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 

### Return type

[**[EmailNotification]**](EmailNotification.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateEmailNotification"></a>
# **updateEmailNotification**
> EmailNotification updateEmailNotification(realmId, metaformId, emailNotificationId, payload)

Updates email notification

Updates email notification

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.EmailNotificationsApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var emailNotificationId = "emailNotificationId_example"; // String | EmailNotification id

var payload = new MetaformApiClient.EmailNotification(); // EmailNotification | Payload

apiInstance.updateEmailNotification(realmId, metaformId, emailNotificationId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **emailNotificationId** | **String**| EmailNotification id | 
 **payload** | [**EmailNotification**](EmailNotification.md)| Payload | 

### Return type

[**EmailNotification**](EmailNotification.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

