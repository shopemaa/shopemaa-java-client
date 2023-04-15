package com.shopemaa.client;

import com.apollographql.apollo3.ApolloClient;
import com.apollographql.apollo3.api.http.HttpHeader;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {

    public ApolloClient client(List<HttpHeader> headers) {
        return new ApolloClient
                .Builder()
                .serverUrl("https://api.shopemaa.com/query")
                .httpHeaders(headers)
                .build();
    }

    public ApolloClient client(String serverUrl, List<HttpHeader> headers) {
        return new ApolloClient
                .Builder()
                .serverUrl(serverUrl)
                .httpHeaders(headers)
                .build();
    }

    public List<HttpHeader> headers(String storeKey, String storeSecret) {
        List<HttpHeader> headers = new ArrayList<>();

        headers.add(new HttpHeader("store-key", storeKey));
        headers.add(new HttpHeader("store-secret", storeSecret));

        return headers;
    }

    public String defaultStoreKey() {
        return System.getenv("store-key");
    }

    public String defaultStoreSecret() {
        return System.getenv("store-secret");
    }

    public String defaultAdminStoreKey() {
        return System.getenv("store-admin-key");
    }

    public String defaultAdminStoreSecret() {
        return System.getenv("store-admin-secret");
    }
}
