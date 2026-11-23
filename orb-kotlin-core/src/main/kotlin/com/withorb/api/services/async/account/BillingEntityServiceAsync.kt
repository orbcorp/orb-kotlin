// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.account

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.AccountBillingEntityArchiveByExternalIdParams
import com.withorb.api.models.AccountBillingEntityArchiveParams
import com.withorb.api.models.AccountBillingEntityCreateParams
import com.withorb.api.models.AccountBillingEntityFetchByExternalIdParams
import com.withorb.api.models.AccountBillingEntityFetchParams
import com.withorb.api.models.AccountBillingEntityListPageAsync
import com.withorb.api.models.AccountBillingEntityListParams
import com.withorb.api.models.AccountBillingEntityUnarchiveByExternalIdParams
import com.withorb.api.models.AccountBillingEntityUnarchiveParams
import com.withorb.api.models.AccountBillingEntityUpdateByExternalIdParams
import com.withorb.api.models.AccountBillingEntityUpdateParams
import com.withorb.api.models.BillingEntity

/**
 * A billing entity is a legal entity an account invoices from, with its own legal name, address and
 * tax registrations.
 */
interface BillingEntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BillingEntityServiceAsync

    /**
     * This endpoint creates a billing entity: a legal entity the account invoices from, with its
     * own legal name, address, tax registrations, and invoice settings.
     * `external_billing_entity_id` cannot be changed after creation. This endpoint requires an
     * admin API key.
     */
    suspend fun create(
        params: AccountBillingEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /**
     * This endpoint updates a billing entity, including the default one. Omitted fields keep their
     * value. A change to the name, legal name, address, or tax registrations writes a new version
     * of the billing entity; invoices already issued keep the version they were issued with. In
     * `invoice_settings`, null clears a field so it inherits the account's setting; the default
     * billing entity accepts only `memo` and `net_terms`. An archived billing entity cannot be
     * updated until it is unarchived. This endpoint requires an admin API key.
     *
     * `payment_gateway_connections` is the full set of connections the billing entity collects
     * payments through; a connection left out is disconnected from the billing entity. If a payment
     * through a connection left out is still in progress, the whole update is rejected and can be
     * retried once the payment finishes.
     */
    suspend fun update(
        billingEntityId: String,
        params: AccountBillingEntityUpdateParams = AccountBillingEntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity =
        update(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: AccountBillingEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /** @see update */
    suspend fun update(billingEntityId: String, requestOptions: RequestOptions): BillingEntity =
        update(billingEntityId, AccountBillingEntityUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns the account's billing entities, including the default billing entity
     * (`is_default: true`), ordered in descending order by creation time.
     */
    suspend fun list(
        params: AccountBillingEntityListParams = AccountBillingEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountBillingEntityListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AccountBillingEntityListPageAsync =
        list(AccountBillingEntityListParams.none(), requestOptions)

    /**
     * This endpoint archives a billing entity. An archived billing entity cannot be updated;
     * invoices already issued keep it. The default billing entity cannot be archived. Archiving a
     * billing entity that is already archived returns it unchanged. This endpoint requires an admin
     * API key.
     */
    suspend fun archive(
        billingEntityId: String,
        params: AccountBillingEntityArchiveParams = AccountBillingEntityArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity =
        archive(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

    /** @see archive */
    suspend fun archive(
        params: AccountBillingEntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /** @see archive */
    suspend fun archive(billingEntityId: String, requestOptions: RequestOptions): BillingEntity =
        archive(billingEntityId, AccountBillingEntityArchiveParams.none(), requestOptions)

    /**
     * This endpoint archives a billing entity. An archived billing entity cannot be updated;
     * invoices already issued keep it. The default billing entity cannot be archived. Archiving a
     * billing entity that is already archived returns it unchanged. This endpoint requires an admin
     * API key.
     */
    suspend fun archiveByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityArchiveByExternalIdParams =
            AccountBillingEntityArchiveByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity =
        archiveByExternalId(
            params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
            requestOptions,
        )

    /** @see archiveByExternalId */
    suspend fun archiveByExternalId(
        params: AccountBillingEntityArchiveByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /** @see archiveByExternalId */
    suspend fun archiveByExternalId(
        externalBillingEntityId: String,
        requestOptions: RequestOptions,
    ): BillingEntity =
        archiveByExternalId(
            externalBillingEntityId,
            AccountBillingEntityArchiveByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint returns a billing entity identified by its ID, or by the
     * `external_billing_entity_id` set when it was created.
     */
    suspend fun fetch(
        billingEntityId: String,
        params: AccountBillingEntityFetchParams = AccountBillingEntityFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity =
        fetch(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

    /** @see fetch */
    suspend fun fetch(
        params: AccountBillingEntityFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /** @see fetch */
    suspend fun fetch(billingEntityId: String, requestOptions: RequestOptions): BillingEntity =
        fetch(billingEntityId, AccountBillingEntityFetchParams.none(), requestOptions)

    /**
     * This endpoint returns a billing entity identified by its ID, or by the
     * `external_billing_entity_id` set when it was created.
     */
    suspend fun fetchByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityFetchByExternalIdParams =
            AccountBillingEntityFetchByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity =
        fetchByExternalId(
            params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
            requestOptions,
        )

    /** @see fetchByExternalId */
    suspend fun fetchByExternalId(
        params: AccountBillingEntityFetchByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /** @see fetchByExternalId */
    suspend fun fetchByExternalId(
        externalBillingEntityId: String,
        requestOptions: RequestOptions,
    ): BillingEntity =
        fetchByExternalId(
            externalBillingEntityId,
            AccountBillingEntityFetchByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint restores an archived billing entity to active. Unarchiving an active billing
     * entity returns it unchanged. This endpoint requires an admin API key.
     */
    suspend fun unarchive(
        billingEntityId: String,
        params: AccountBillingEntityUnarchiveParams = AccountBillingEntityUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity =
        unarchive(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

    /** @see unarchive */
    suspend fun unarchive(
        params: AccountBillingEntityUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /** @see unarchive */
    suspend fun unarchive(billingEntityId: String, requestOptions: RequestOptions): BillingEntity =
        unarchive(billingEntityId, AccountBillingEntityUnarchiveParams.none(), requestOptions)

    /**
     * This endpoint restores an archived billing entity to active. Unarchiving an active billing
     * entity returns it unchanged. This endpoint requires an admin API key.
     */
    suspend fun unarchiveByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityUnarchiveByExternalIdParams =
            AccountBillingEntityUnarchiveByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity =
        unarchiveByExternalId(
            params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
            requestOptions,
        )

    /** @see unarchiveByExternalId */
    suspend fun unarchiveByExternalId(
        params: AccountBillingEntityUnarchiveByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /** @see unarchiveByExternalId */
    suspend fun unarchiveByExternalId(
        externalBillingEntityId: String,
        requestOptions: RequestOptions,
    ): BillingEntity =
        unarchiveByExternalId(
            externalBillingEntityId,
            AccountBillingEntityUnarchiveByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint updates a billing entity, including the default one. Omitted fields keep their
     * value. A change to the name, legal name, address, or tax registrations writes a new version
     * of the billing entity; invoices already issued keep the version they were issued with. In
     * `invoice_settings`, null clears a field so it inherits the account's setting; the default
     * billing entity accepts only `memo` and `net_terms`. An archived billing entity cannot be
     * updated until it is unarchived. This endpoint requires an admin API key.
     *
     * `payment_gateway_connections` is the full set of connections the billing entity collects
     * payments through; a connection left out is disconnected from the billing entity. If a payment
     * through a connection left out is still in progress, the whole update is rejected and can be
     * retried once the payment finishes.
     */
    suspend fun updateByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityUpdateByExternalIdParams =
            AccountBillingEntityUpdateByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity =
        updateByExternalId(
            params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
            requestOptions,
        )

    /** @see updateByExternalId */
    suspend fun updateByExternalId(
        params: AccountBillingEntityUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingEntity

    /** @see updateByExternalId */
    suspend fun updateByExternalId(
        externalBillingEntityId: String,
        requestOptions: RequestOptions,
    ): BillingEntity =
        updateByExternalId(
            externalBillingEntityId,
            AccountBillingEntityUpdateByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * A view of [BillingEntityServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BillingEntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /account/billing_entities`, but is otherwise the
         * same as [BillingEntityServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AccountBillingEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /**
         * Returns a raw HTTP response for `put /account/billing_entities/{billing_entity_id}`, but
         * is otherwise the same as [BillingEntityServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            billingEntityId: String,
            params: AccountBillingEntityUpdateParams = AccountBillingEntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity> =
            update(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: AccountBillingEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            billingEntityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> =
            update(billingEntityId, AccountBillingEntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account/billing_entities`, but is otherwise the
         * same as [BillingEntityServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountBillingEntityListParams = AccountBillingEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountBillingEntityListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountBillingEntityListPageAsync> =
            list(AccountBillingEntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /account/billing_entities/{billing_entity_id}/archive`, but is otherwise the same as
         * [BillingEntityServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(
            billingEntityId: String,
            params: AccountBillingEntityArchiveParams = AccountBillingEntityArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity> =
            archive(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            params: AccountBillingEntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            billingEntityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> =
            archive(billingEntityId, AccountBillingEntityArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}/archive`,
         * but is otherwise the same as [BillingEntityServiceAsync.archiveByExternalId].
         */
        @MustBeClosed
        suspend fun archiveByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityArchiveByExternalIdParams =
                AccountBillingEntityArchiveByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity> =
            archiveByExternalId(
                params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
                requestOptions,
            )

        /** @see archiveByExternalId */
        @MustBeClosed
        suspend fun archiveByExternalId(
            params: AccountBillingEntityArchiveByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /** @see archiveByExternalId */
        @MustBeClosed
        suspend fun archiveByExternalId(
            externalBillingEntityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> =
            archiveByExternalId(
                externalBillingEntityId,
                AccountBillingEntityArchiveByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /account/billing_entities/{billing_entity_id}`, but
         * is otherwise the same as [BillingEntityServiceAsync.fetch].
         */
        @MustBeClosed
        suspend fun fetch(
            billingEntityId: String,
            params: AccountBillingEntityFetchParams = AccountBillingEntityFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity> =
            fetch(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(
            params: AccountBillingEntityFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /** @see fetch */
        @MustBeClosed
        suspend fun fetch(
            billingEntityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> =
            fetch(billingEntityId, AccountBillingEntityFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}`, but
         * is otherwise the same as [BillingEntityServiceAsync.fetchByExternalId].
         */
        @MustBeClosed
        suspend fun fetchByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityFetchByExternalIdParams =
                AccountBillingEntityFetchByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity> =
            fetchByExternalId(
                params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
                requestOptions,
            )

        /** @see fetchByExternalId */
        @MustBeClosed
        suspend fun fetchByExternalId(
            params: AccountBillingEntityFetchByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /** @see fetchByExternalId */
        @MustBeClosed
        suspend fun fetchByExternalId(
            externalBillingEntityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> =
            fetchByExternalId(
                externalBillingEntityId,
                AccountBillingEntityFetchByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /account/billing_entities/{billing_entity_id}/unarchive`, but is otherwise the same as
         * [BillingEntityServiceAsync.unarchive].
         */
        @MustBeClosed
        suspend fun unarchive(
            billingEntityId: String,
            params: AccountBillingEntityUnarchiveParams =
                AccountBillingEntityUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity> =
            unarchive(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        suspend fun unarchive(
            params: AccountBillingEntityUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /** @see unarchive */
        @MustBeClosed
        suspend fun unarchive(
            billingEntityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> =
            unarchive(billingEntityId, AccountBillingEntityUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}/unarchive`,
         * but is otherwise the same as [BillingEntityServiceAsync.unarchiveByExternalId].
         */
        @MustBeClosed
        suspend fun unarchiveByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityUnarchiveByExternalIdParams =
                AccountBillingEntityUnarchiveByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity> =
            unarchiveByExternalId(
                params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
                requestOptions,
            )

        /** @see unarchiveByExternalId */
        @MustBeClosed
        suspend fun unarchiveByExternalId(
            params: AccountBillingEntityUnarchiveByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /** @see unarchiveByExternalId */
        @MustBeClosed
        suspend fun unarchiveByExternalId(
            externalBillingEntityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> =
            unarchiveByExternalId(
                externalBillingEntityId,
                AccountBillingEntityUnarchiveByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}`, but
         * is otherwise the same as [BillingEntityServiceAsync.updateByExternalId].
         */
        @MustBeClosed
        suspend fun updateByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityUpdateByExternalIdParams =
                AccountBillingEntityUpdateByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity> =
            updateByExternalId(
                params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
                requestOptions,
            )

        /** @see updateByExternalId */
        @MustBeClosed
        suspend fun updateByExternalId(
            params: AccountBillingEntityUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingEntity>

        /** @see updateByExternalId */
        @MustBeClosed
        suspend fun updateByExternalId(
            externalBillingEntityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingEntity> =
            updateByExternalId(
                externalBillingEntityId,
                AccountBillingEntityUpdateByExternalIdParams.none(),
                requestOptions,
            )
    }
}
