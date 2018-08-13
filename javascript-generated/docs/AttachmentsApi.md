# MetaformApiClient.AttachmentsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAttachment**](AttachmentsApi.md#findAttachment) | **GET** /attachments/{attachmentId} | Find a attachment by id
[**findAttachmentData**](AttachmentsApi.md#findAttachmentData) | **GET** /attachments/{attachmentId}/data | Find a attachment data by id


<a name="findAttachment"></a>
# **findAttachment**
> Attachment findAttachment(attachmentId)

Find a attachment by id

Returns single attachment

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.AttachmentsApi();

var attachmentId = "attachmentId_example"; // String | Attachment id

apiInstance.findAttachment(attachmentId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| Attachment id | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findAttachmentData"></a>
# **findAttachmentData**
> &#39;Blob&#39; findAttachmentData(attachmentId)

Find a attachment data by id

Returns attachment data

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.AttachmentsApi();

var attachmentId = "attachmentId_example"; // String | Attachment id

apiInstance.findAttachmentData(attachmentId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| Attachment id | 

### Return type

**&#39;Blob&#39;**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

