# metaform-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>fi.metatavu.metaform</groupId>
    <artifactId>metaform-api-client</artifactId>
    <version>0.0.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "fi.metatavu.metaform:metaform-api-client:0.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/metaform-api-client-0.0.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import fi.metatavu.metaform.*;
import fi.metatavu.metaform.auth.*;
import fi.metatavu.metaform.client.*;
import fi.metatavu.metaform.client.MetaformsApi;

import java.io.File;
import java.util.*;

public class MetaformsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MetaformsApi* | [**createMetaform**](docs/MetaformsApi.md#createMetaform) | **POST** /realms/{realmId}/metaforms | create new Metaform
*MetaformsApi* | [**deleteMetaform**](docs/MetaformsApi.md#deleteMetaform) | **DELETE** /realms/{realmId}/metaforms/{metaformId} | Deletes Metaform
*MetaformsApi* | [**findMetaform**](docs/MetaformsApi.md#findMetaform) | **GET** /realms/{realmId}/metaforms/{metaformId} | Finds single Metaform
*MetaformsApi* | [**listMetaforms**](docs/MetaformsApi.md#listMetaforms) | **GET** /realms/{realmId}/metaforms | Lists Metaforms
*MetaformsApi* | [**updateMetaform**](docs/MetaformsApi.md#updateMetaform) | **PUT** /realms/{realmId}/metaforms/{metaformId} | Updates Metaform
*RepliesApi* | [**createReply**](docs/RepliesApi.md#createReply) | **POST** /realms/{realmId}/metaforms/{metaformId}/replies | create new form reply
*RepliesApi* | [**export**](docs/RepliesApi.md#export) | **GET** /realms/{realmId}/metaforms/{metaformId}/export | Exports metaform data
*RepliesApi* | [**findReply**](docs/RepliesApi.md#findReply) | **GET** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId} | Find a single reply
*RepliesApi* | [**findReplyMeta**](docs/RepliesApi.md#findReplyMeta) | **GET** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId}/meta | Returns reply meta
*RepliesApi* | [**listReplies**](docs/RepliesApi.md#listReplies) | **GET** /realms/{realmId}/metaforms/{metaformId}/replies | Lists form replies
*RepliesApi* | [**updateReply**](docs/RepliesApi.md#updateReply) | **PUT** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId} | Updates reply


## Documentation for Models

 - [BadRequest](docs/BadRequest.md)
 - [Forbidden](docs/Forbidden.md)
 - [InternalServerError](docs/InternalServerError.md)
 - [Metaform](docs/Metaform.md)
 - [MetaformField](docs/MetaformField.md)
 - [MetaformFieldOption](docs/MetaformFieldOption.md)
 - [MetaformFieldType](docs/MetaformFieldType.md)
 - [MetaformSection](docs/MetaformSection.md)
 - [MetaformTableColumn](docs/MetaformTableColumn.md)
 - [MetaformTableColumnType](docs/MetaformTableColumnType.md)
 - [MetaformTableColumnValues](docs/MetaformTableColumnValues.md)
 - [MetaformVisibleIf](docs/MetaformVisibleIf.md)
 - [NotFound](docs/NotFound.md)
 - [NotImplemented](docs/NotImplemented.md)
 - [Reply](docs/Reply.md)
 - [ReplyData](docs/ReplyData.md)
 - [ReplyMeta](docs/ReplyMeta.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



