package com.shopemaa.client;

import com.apollographql.apollo3.ApolloCall;
import com.apollographql.apollo3.ApolloClient;
import com.apollographql.apollo3.api.ApolloResponse;
import com.apollographql.apollo3.rx2.Rx2Apollo;

import static org.junit.jupiter.api.Assertions.*;

import com.shopemaa.client.graphql.StoreBySecretQuery;
import org.junit.jupiter.api.Test;

public class StoreTest extends BaseTest {

    @Test
    public void testStoreBySecret() {
        ApolloClient c = client(
                headers(defaultAdminStoreKey(), defaultAdminStoreSecret())
        );
        ApolloCall<StoreBySecretQuery.Data> query = c.query(new StoreBySecretQuery());
        ApolloResponse<StoreBySecretQuery.Data> resp = Rx2Apollo.single(query).blockingGet();

        assertFalse(resp.hasErrors());
        assertNotNull(resp.data);

        StoreBySecretQuery.StoreBySecret storeBySecret = resp.data.storeBySecret;
        assertNotNull(storeBySecret.name);
        assertNotNull(storeBySecret.currency);
        assertNotNull(storeBySecret.logo);
    }
}
