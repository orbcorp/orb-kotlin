// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Tax IDs are commonly required to be displayed on customer invoices, which are added to the
 * headers of invoices.
 *
 * ### Supported Tax ID Countries and Types
 * |Country               |Type        |Description                                                                                            |
 * |----------------------|------------|-------------------------------------------------------------------------------------------------------|
 * |Albania               |`al_tin`    |Albania Tax Identification Number                                                                      |
 * |Andorra               |`ad_nrt`    |Andorran NRT Number                                                                                    |
 * |Angola                |`ao_tin`    |Angola Tax Identification Number                                                                       |
 * |Argentina             |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
 * |Armenia               |`am_tin`    |Armenia Tax Identification Number                                                                      |
 * |Aruba                 |`aw_tin`    |Aruba Tax Identification Number                                                                        |
 * |Australia             |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
 * |Australia             |`au_arn`    |Australian Taxation Office Reference Number                                                            |
 * |Austria               |`eu_vat`    |European VAT Number                                                                                    |
 * |Azerbaijan            |`az_tin`    |Azerbaijan Tax Identification Number                                                                   |
 * |Bahamas               |`bs_tin`    |Bahamas Tax Identification Number                                                                      |
 * |Bahrain               |`bh_vat`    |Bahraini VAT Number                                                                                    |
 * |Bangladesh            |`bd_bin`    |Bangladesh Business Identification Number                                                              |
 * |Barbados              |`bb_tin`    |Barbados Tax Identification Number                                                                     |
 * |Belarus               |`by_tin`    |Belarus TIN Number                                                                                     |
 * |Belgium               |`eu_vat`    |European VAT Number                                                                                    |
 * |Benin                 |`bj_ifu`    |Benin Tax Identification Number (Identifiant Fiscal Unique)                                            |
 * |Bolivia               |`bo_tin`    |Bolivian Tax ID                                                                                        |
 * |Bosnia and Herzegovina|`ba_tin`    |Bosnia and Herzegovina Tax Identification Number                                                       |
 * |Brazil                |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
 * |Brazil                |`br_cpf`    |Brazilian CPF Number                                                                                   |
 * |Bulgaria              |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
 * |Bulgaria              |`eu_vat`    |European VAT Number                                                                                    |
 * |Burkina Faso          |`bf_ifu`    |Burkina Faso Tax Identification Number (Numéro d'Identifiant Fiscal Unique)                            |
 * |Cambodia              |`kh_tin`    |Cambodia Tax Identification Number                                                                     |
 * |Cameroon              |`cm_niu`    |Cameroon Tax Identification Number (Numéro d'Identifiant fiscal Unique)                                |
 * |Canada                |`ca_bn`     |Canadian BN                                                                                            |
 * |Canada                |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
 * |Canada                |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
 * |Canada                |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
 * |Canada                |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
 * |Canada                |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
 * |Cape Verde            |`cv_nif`    |Cape Verde Tax Identification Number (Número de Identificação Fiscal)                                  |
 * |Chile                 |`cl_tin`    |Chilean TIN                                                                                            |
 * |China                 |`cn_tin`    |Chinese Tax ID                                                                                         |
 * |Colombia              |`co_nit`    |Colombian NIT Number                                                                                   |
 * |Congo-Kinshasa        |`cd_nif`    |Congo (DR) Tax Identification Number (Número de Identificação Fiscal)                                  |
 * |Costa Rica            |`cr_tin`    |Costa Rican Tax ID                                                                                     |
 * |Croatia               |`eu_vat`    |European VAT Number                                                                                    |
 * |Croatia               |`hr_oib`    |Croatian Personal Identification Number (OIB)                                                          |
 * |Cyprus                |`eu_vat`    |European VAT Number                                                                                    |
 * |Czech Republic        |`eu_vat`    |European VAT Number                                                                                    |
 * |Denmark               |`eu_vat`    |European VAT Number                                                                                    |
 * |Dominican Republic    |`do_rcn`    |Dominican RCN Number                                                                                   |
 * |Ecuador               |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
 * |Egypt                 |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
 * |El Salvador           |`sv_nit`    |El Salvadorian NIT Number                                                                              |
 * |Estonia               |`eu_vat`    |European VAT Number                                                                                    |
 * |Ethiopia              |`et_tin`    |Ethiopia Tax Identification Number                                                                     |
 * |European Union        |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
 * |Finland               |`eu_vat`    |European VAT Number                                                                                    |
 * |France                |`eu_vat`    |European VAT Number                                                                                    |
 * |Georgia               |`ge_vat`    |Georgian VAT                                                                                           |
 * |Germany               |`de_stn`    |German Tax Number (Steuernummer)                                                                       |
 * |Germany               |`eu_vat`    |European VAT Number                                                                                    |
 * |Greece                |`eu_vat`    |European VAT Number                                                                                    |
 * |Guinea                |`gn_nif`    |Guinea Tax Identification Number (Número de Identificação Fiscal)                                      |
 * |Hong Kong             |`hk_br`     |Hong Kong BR Number                                                                                    |
 * |Hungary               |`eu_vat`    |European VAT Number                                                                                    |
 * |Hungary               |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
 * |Iceland               |`is_vat`    |Icelandic VAT                                                                                          |
 * |India                 |`in_gst`    |Indian GST Number                                                                                      |
 * |Indonesia             |`id_npwp`   |Indonesian NPWP Number                                                                                 |
 * |Ireland               |`eu_vat`    |European VAT Number                                                                                    |
 * |Israel                |`il_vat`    |Israel VAT                                                                                             |
 * |Italy                 |`eu_vat`    |European VAT Number                                                                                    |
 * |Japan                 |`jp_cn`     |Japanese Corporate Number (_Hōjin Bangō_)                                                              |
 * |Japan                 |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_)|
 * |Japan                 |`jp_trn`    |Japanese Tax Registration Number (_Tōroku Bangō_)                                                      |
 * |Kazakhstan            |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
 * |Kenya                 |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
 * |Kyrgyzstan            |`kg_tin`    |Kyrgyzstan Tax Identification Number                                                                   |
 * |Laos                  |`la_tin`    |Laos Tax Identification Number                                                                         |
 * |Latvia                |`eu_vat`    |European VAT Number                                                                                    |
 * |Liechtenstein         |`li_uid`    |Liechtensteinian UID Number                                                                            |
 * |Liechtenstein         |`li_vat`    |Liechtenstein VAT Number                                                                               |
 * |Lithuania             |`eu_vat`    |European VAT Number                                                                                    |
 * |Luxembourg            |`eu_vat`    |European VAT Number                                                                                    |
 * |Malaysia              |`my_frp`    |Malaysian FRP Number                                                                                   |
 * |Malaysia              |`my_itn`    |Malaysian ITN                                                                                          |
 * |Malaysia              |`my_sst`    |Malaysian SST Number                                                                                   |
 * |Malta                 |`eu_vat`    |European VAT Number                                                                                    |
 * |Mauritania            |`mr_nif`    |Mauritania Tax Identification Number (Número de Identificação Fiscal)                                  |
 * |Mexico                |`mx_rfc`    |Mexican RFC Number                                                                                     |
 * |Moldova               |`md_vat`    |Moldova VAT Number                                                                                     |
 * |Montenegro            |`me_pib`    |Montenegro PIB Number                                                                                  |
 * |Morocco               |`ma_vat`    |Morocco VAT Number                                                                                     |
 * |Nepal                 |`np_pan`    |Nepal PAN Number                                                                                       |
 * |Netherlands           |`eu_vat`    |European VAT Number                                                                                    |
 * |New Zealand           |`nz_gst`    |New Zealand GST Number                                                                                 |
 * |Nigeria               |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
 * |North Macedonia       |`mk_vat`    |North Macedonia VAT Number                                                                             |
 * |Northern Ireland      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
 * |Norway                |`no_vat`    |Norwegian VAT Number                                                                                   |
 * |Norway                |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
 * |Oman                  |`om_vat`    |Omani VAT Number                                                                                       |
 * |Peru                  |`pe_ruc`    |Peruvian RUC Number                                                                                    |
 * |Philippines           |`ph_tin`    |Philippines Tax Identification Number                                                                  |
 * |Poland                |`eu_vat`    |European VAT Number                                                                                    |
 * |Portugal              |`eu_vat`    |European VAT Number                                                                                    |
 * |Romania               |`eu_vat`    |European VAT Number                                                                                    |
 * |Romania               |`ro_tin`    |Romanian Tax ID Number                                                                                 |
 * |Russia                |`ru_inn`    |Russian INN                                                                                            |
 * |Russia                |`ru_kpp`    |Russian KPP                                                                                            |
 * |Saudi Arabia          |`sa_vat`    |Saudi Arabia VAT                                                                                       |
 * |Senegal               |`sn_ninea`  |Senegal NINEA Number                                                                                   |
 * |Serbia                |`rs_pib`    |Serbian PIB Number                                                                                     |
 * |Singapore             |`sg_gst`    |Singaporean GST                                                                                        |
 * |Singapore             |`sg_uen`    |Singaporean UEN                                                                                        |
 * |Slovakia              |`eu_vat`    |European VAT Number                                                                                    |
 * |Slovenia              |`eu_vat`    |European VAT Number                                                                                    |
 * |Slovenia              |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
 * |South Africa          |`za_vat`    |South African VAT Number                                                                               |
 * |South Korea           |`kr_brn`    |Korean BRN                                                                                             |
 * |Spain                 |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
 * |Spain                 |`eu_vat`    |European VAT Number                                                                                    |
 * |Suriname              |`sr_fin`    |Suriname FIN Number                                                                                    |
 * |Sweden                |`eu_vat`    |European VAT Number                                                                                    |
 * |Switzerland           |`ch_uid`    |Switzerland UID Number                                                                                 |
 * |Switzerland           |`ch_vat`    |Switzerland VAT Number                                                                                 |
 * |Taiwan                |`tw_vat`    |Taiwanese VAT                                                                                          |
 * |Tajikistan            |`tj_tin`    |Tajikistan Tax Identification Number                                                                   |
 * |Tanzania              |`tz_vat`    |Tanzania VAT Number                                                                                    |
 * |Thailand              |`th_vat`    |Thai VAT                                                                                               |
 * |Turkey                |`tr_tin`    |Turkish Tax Identification Number                                                                      |
 * |Uganda                |`ug_tin`    |Uganda Tax Identification Number                                                                       |
 * |Ukraine               |`ua_vat`    |Ukrainian VAT                                                                                          |
 * |United Arab Emirates  |`ae_trn`    |United Arab Emirates TRN                                                                               |
 * |United Kingdom        |`gb_vat`    |United Kingdom VAT Number                                                                              |
 * |United States         |`us_ein`    |United States EIN                                                                                      |
 * |Uruguay               |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
 * |Uzbekistan            |`uz_tin`    |Uzbekistan TIN Number                                                                                  |
 * |Uzbekistan            |`uz_vat`    |Uzbekistan VAT Number                                                                                  |
 * |Venezuela             |`ve_rif`    |Venezuelan RIF Number                                                                                  |
 * |Vietnam               |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
 * |Zambia                |`zm_tin`    |Zambia Tax Identification Number                                                                       |
 * |Zimbabwe              |`zw_tin`    |Zimbabwe Tax Identification Number                                                                     |
 */
class CustomerTaxId
private constructor(
    private val country: JsonField<Country>,
    private val type: JsonField<Type>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("country") @ExcludeMissing country: JsonField<Country> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(country, type, value, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): Country = country.getRequired("country")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<Country> = country

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerTaxId].
         *
         * The following fields are required:
         * ```kotlin
         * .country()
         * .type()
         * .value()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerTaxId]. */
    class Builder internal constructor() {

        private var country: JsonField<Country>? = null
        private var type: JsonField<Type>? = null
        private var value: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerTaxId: CustomerTaxId) = apply {
            country = customerTaxId.country
            type = customerTaxId.type
            value = customerTaxId.value
            additionalProperties = customerTaxId.additionalProperties.toMutableMap()
        }

        fun country(country: Country) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [Country] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<Country>) = apply { this.country = country }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CustomerTaxId].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .country()
         * .type()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerTaxId =
            CustomerTaxId(
                checkRequired("country", country),
                checkRequired("type", type),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerTaxId = apply {
        if (validated) {
            return@apply
        }

        country().validate()
        type().validate()
        value()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (country.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0) +
            (if (value.asKnown() == null) 0 else 1)

    class Country @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AD = of("AD")

            val AE = of("AE")

            val AL = of("AL")

            val AM = of("AM")

            val AO = of("AO")

            val AR = of("AR")

            val AT = of("AT")

            val AU = of("AU")

            val AW = of("AW")

            val AZ = of("AZ")

            val BA = of("BA")

            val BB = of("BB")

            val BD = of("BD")

            val BE = of("BE")

            val BF = of("BF")

            val BG = of("BG")

            val BH = of("BH")

            val BJ = of("BJ")

            val BO = of("BO")

            val BR = of("BR")

            val BS = of("BS")

            val BY = of("BY")

            val CA = of("CA")

            val CD = of("CD")

            val CH = of("CH")

            val CL = of("CL")

            val CM = of("CM")

            val CN = of("CN")

            val CO = of("CO")

            val CR = of("CR")

            val CV = of("CV")

            val DE = of("DE")

            val CY = of("CY")

            val CZ = of("CZ")

            val DK = of("DK")

            val DO = of("DO")

            val EC = of("EC")

            val EE = of("EE")

            val EG = of("EG")

            val ES = of("ES")

            val ET = of("ET")

            val EU = of("EU")

            val FI = of("FI")

            val FR = of("FR")

            val GB = of("GB")

            val GE = of("GE")

            val GN = of("GN")

            val GR = of("GR")

            val HK = of("HK")

            val HR = of("HR")

            val HU = of("HU")

            val ID = of("ID")

            val IE = of("IE")

            val IL = of("IL")

            val IN = of("IN")

            val IS = of("IS")

            val IT = of("IT")

            val JP = of("JP")

            val KE = of("KE")

            val KG = of("KG")

            val KH = of("KH")

            val KR = of("KR")

            val KZ = of("KZ")

            val LA = of("LA")

            val LI = of("LI")

            val LT = of("LT")

            val LU = of("LU")

            val LV = of("LV")

            val MA = of("MA")

            val MD = of("MD")

            val ME = of("ME")

            val MK = of("MK")

            val MR = of("MR")

            val MT = of("MT")

            val MX = of("MX")

            val MY = of("MY")

            val NG = of("NG")

            val NL = of("NL")

            val NO = of("NO")

            val NP = of("NP")

            val NZ = of("NZ")

            val OM = of("OM")

            val PE = of("PE")

            val PH = of("PH")

            val PL = of("PL")

            val PT = of("PT")

            val RO = of("RO")

            val RS = of("RS")

            val RU = of("RU")

            val SA = of("SA")

            val SE = of("SE")

            val SG = of("SG")

            val SI = of("SI")

            val SK = of("SK")

            val SN = of("SN")

            val SR = of("SR")

            val SV = of("SV")

            val TH = of("TH")

            val TJ = of("TJ")

            val TR = of("TR")

            val TW = of("TW")

            val TZ = of("TZ")

            val UA = of("UA")

            val UG = of("UG")

            val US = of("US")

            val UY = of("UY")

            val UZ = of("UZ")

            val VE = of("VE")

            val VN = of("VN")

            val ZA = of("ZA")

            val ZM = of("ZM")

            val ZW = of("ZW")

            fun of(value: String) = Country(JsonField.of(value))
        }

        /** An enum containing [Country]'s known values. */
        enum class Known {
            AD,
            AE,
            AL,
            AM,
            AO,
            AR,
            AT,
            AU,
            AW,
            AZ,
            BA,
            BB,
            BD,
            BE,
            BF,
            BG,
            BH,
            BJ,
            BO,
            BR,
            BS,
            BY,
            CA,
            CD,
            CH,
            CL,
            CM,
            CN,
            CO,
            CR,
            CV,
            DE,
            CY,
            CZ,
            DK,
            DO,
            EC,
            EE,
            EG,
            ES,
            ET,
            EU,
            FI,
            FR,
            GB,
            GE,
            GN,
            GR,
            HK,
            HR,
            HU,
            ID,
            IE,
            IL,
            IN,
            IS,
            IT,
            JP,
            KE,
            KG,
            KH,
            KR,
            KZ,
            LA,
            LI,
            LT,
            LU,
            LV,
            MA,
            MD,
            ME,
            MK,
            MR,
            MT,
            MX,
            MY,
            NG,
            NL,
            NO,
            NP,
            NZ,
            OM,
            PE,
            PH,
            PL,
            PT,
            RO,
            RS,
            RU,
            SA,
            SE,
            SG,
            SI,
            SK,
            SN,
            SR,
            SV,
            TH,
            TJ,
            TR,
            TW,
            TZ,
            UA,
            UG,
            US,
            UY,
            UZ,
            VE,
            VN,
            ZA,
            ZM,
            ZW,
        }

        /**
         * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Country] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AD,
            AE,
            AL,
            AM,
            AO,
            AR,
            AT,
            AU,
            AW,
            AZ,
            BA,
            BB,
            BD,
            BE,
            BF,
            BG,
            BH,
            BJ,
            BO,
            BR,
            BS,
            BY,
            CA,
            CD,
            CH,
            CL,
            CM,
            CN,
            CO,
            CR,
            CV,
            DE,
            CY,
            CZ,
            DK,
            DO,
            EC,
            EE,
            EG,
            ES,
            ET,
            EU,
            FI,
            FR,
            GB,
            GE,
            GN,
            GR,
            HK,
            HR,
            HU,
            ID,
            IE,
            IL,
            IN,
            IS,
            IT,
            JP,
            KE,
            KG,
            KH,
            KR,
            KZ,
            LA,
            LI,
            LT,
            LU,
            LV,
            MA,
            MD,
            ME,
            MK,
            MR,
            MT,
            MX,
            MY,
            NG,
            NL,
            NO,
            NP,
            NZ,
            OM,
            PE,
            PH,
            PL,
            PT,
            RO,
            RS,
            RU,
            SA,
            SE,
            SG,
            SI,
            SK,
            SN,
            SR,
            SV,
            TH,
            TJ,
            TR,
            TW,
            TZ,
            UA,
            UG,
            US,
            UY,
            UZ,
            VE,
            VN,
            ZA,
            ZM,
            ZW,
            /** An enum member indicating that [Country] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AD -> Value.AD
                AE -> Value.AE
                AL -> Value.AL
                AM -> Value.AM
                AO -> Value.AO
                AR -> Value.AR
                AT -> Value.AT
                AU -> Value.AU
                AW -> Value.AW
                AZ -> Value.AZ
                BA -> Value.BA
                BB -> Value.BB
                BD -> Value.BD
                BE -> Value.BE
                BF -> Value.BF
                BG -> Value.BG
                BH -> Value.BH
                BJ -> Value.BJ
                BO -> Value.BO
                BR -> Value.BR
                BS -> Value.BS
                BY -> Value.BY
                CA -> Value.CA
                CD -> Value.CD
                CH -> Value.CH
                CL -> Value.CL
                CM -> Value.CM
                CN -> Value.CN
                CO -> Value.CO
                CR -> Value.CR
                CV -> Value.CV
                DE -> Value.DE
                CY -> Value.CY
                CZ -> Value.CZ
                DK -> Value.DK
                DO -> Value.DO
                EC -> Value.EC
                EE -> Value.EE
                EG -> Value.EG
                ES -> Value.ES
                ET -> Value.ET
                EU -> Value.EU
                FI -> Value.FI
                FR -> Value.FR
                GB -> Value.GB
                GE -> Value.GE
                GN -> Value.GN
                GR -> Value.GR
                HK -> Value.HK
                HR -> Value.HR
                HU -> Value.HU
                ID -> Value.ID
                IE -> Value.IE
                IL -> Value.IL
                IN -> Value.IN
                IS -> Value.IS
                IT -> Value.IT
                JP -> Value.JP
                KE -> Value.KE
                KG -> Value.KG
                KH -> Value.KH
                KR -> Value.KR
                KZ -> Value.KZ
                LA -> Value.LA
                LI -> Value.LI
                LT -> Value.LT
                LU -> Value.LU
                LV -> Value.LV
                MA -> Value.MA
                MD -> Value.MD
                ME -> Value.ME
                MK -> Value.MK
                MR -> Value.MR
                MT -> Value.MT
                MX -> Value.MX
                MY -> Value.MY
                NG -> Value.NG
                NL -> Value.NL
                NO -> Value.NO
                NP -> Value.NP
                NZ -> Value.NZ
                OM -> Value.OM
                PE -> Value.PE
                PH -> Value.PH
                PL -> Value.PL
                PT -> Value.PT
                RO -> Value.RO
                RS -> Value.RS
                RU -> Value.RU
                SA -> Value.SA
                SE -> Value.SE
                SG -> Value.SG
                SI -> Value.SI
                SK -> Value.SK
                SN -> Value.SN
                SR -> Value.SR
                SV -> Value.SV
                TH -> Value.TH
                TJ -> Value.TJ
                TR -> Value.TR
                TW -> Value.TW
                TZ -> Value.TZ
                UA -> Value.UA
                UG -> Value.UG
                US -> Value.US
                UY -> Value.UY
                UZ -> Value.UZ
                VE -> Value.VE
                VN -> Value.VN
                ZA -> Value.ZA
                ZM -> Value.ZM
                ZW -> Value.ZW
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                AD -> Known.AD
                AE -> Known.AE
                AL -> Known.AL
                AM -> Known.AM
                AO -> Known.AO
                AR -> Known.AR
                AT -> Known.AT
                AU -> Known.AU
                AW -> Known.AW
                AZ -> Known.AZ
                BA -> Known.BA
                BB -> Known.BB
                BD -> Known.BD
                BE -> Known.BE
                BF -> Known.BF
                BG -> Known.BG
                BH -> Known.BH
                BJ -> Known.BJ
                BO -> Known.BO
                BR -> Known.BR
                BS -> Known.BS
                BY -> Known.BY
                CA -> Known.CA
                CD -> Known.CD
                CH -> Known.CH
                CL -> Known.CL
                CM -> Known.CM
                CN -> Known.CN
                CO -> Known.CO
                CR -> Known.CR
                CV -> Known.CV
                DE -> Known.DE
                CY -> Known.CY
                CZ -> Known.CZ
                DK -> Known.DK
                DO -> Known.DO
                EC -> Known.EC
                EE -> Known.EE
                EG -> Known.EG
                ES -> Known.ES
                ET -> Known.ET
                EU -> Known.EU
                FI -> Known.FI
                FR -> Known.FR
                GB -> Known.GB
                GE -> Known.GE
                GN -> Known.GN
                GR -> Known.GR
                HK -> Known.HK
                HR -> Known.HR
                HU -> Known.HU
                ID -> Known.ID
                IE -> Known.IE
                IL -> Known.IL
                IN -> Known.IN
                IS -> Known.IS
                IT -> Known.IT
                JP -> Known.JP
                KE -> Known.KE
                KG -> Known.KG
                KH -> Known.KH
                KR -> Known.KR
                KZ -> Known.KZ
                LA -> Known.LA
                LI -> Known.LI
                LT -> Known.LT
                LU -> Known.LU
                LV -> Known.LV
                MA -> Known.MA
                MD -> Known.MD
                ME -> Known.ME
                MK -> Known.MK
                MR -> Known.MR
                MT -> Known.MT
                MX -> Known.MX
                MY -> Known.MY
                NG -> Known.NG
                NL -> Known.NL
                NO -> Known.NO
                NP -> Known.NP
                NZ -> Known.NZ
                OM -> Known.OM
                PE -> Known.PE
                PH -> Known.PH
                PL -> Known.PL
                PT -> Known.PT
                RO -> Known.RO
                RS -> Known.RS
                RU -> Known.RU
                SA -> Known.SA
                SE -> Known.SE
                SG -> Known.SG
                SI -> Known.SI
                SK -> Known.SK
                SN -> Known.SN
                SR -> Known.SR
                SV -> Known.SV
                TH -> Known.TH
                TJ -> Known.TJ
                TR -> Known.TR
                TW -> Known.TW
                TZ -> Known.TZ
                UA -> Known.UA
                UG -> Known.UG
                US -> Known.US
                UY -> Known.UY
                UZ -> Known.UZ
                VE -> Known.VE
                VN -> Known.VN
                ZA -> Known.ZA
                ZM -> Known.ZM
                ZW -> Known.ZW
                else -> throw OrbInvalidDataException("Unknown Country: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Country = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Country && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AD_NRT = of("ad_nrt")

            val AE_TRN = of("ae_trn")

            val AL_TIN = of("al_tin")

            val AM_TIN = of("am_tin")

            val AO_TIN = of("ao_tin")

            val AR_CUIT = of("ar_cuit")

            val EU_VAT = of("eu_vat")

            val AU_ABN = of("au_abn")

            val AU_ARN = of("au_arn")

            val AW_TIN = of("aw_tin")

            val AZ_TIN = of("az_tin")

            val BA_TIN = of("ba_tin")

            val BB_TIN = of("bb_tin")

            val BD_BIN = of("bd_bin")

            val BF_IFU = of("bf_ifu")

            val BG_UIC = of("bg_uic")

            val BH_VAT = of("bh_vat")

            val BJ_IFU = of("bj_ifu")

            val BO_TIN = of("bo_tin")

            val BR_CNPJ = of("br_cnpj")

            val BR_CPF = of("br_cpf")

            val BS_TIN = of("bs_tin")

            val BY_TIN = of("by_tin")

            val CA_BN = of("ca_bn")

            val CA_GST_HST = of("ca_gst_hst")

            val CA_PST_BC = of("ca_pst_bc")

            val CA_PST_MB = of("ca_pst_mb")

            val CA_PST_SK = of("ca_pst_sk")

            val CA_QST = of("ca_qst")

            val CD_NIF = of("cd_nif")

            val CH_UID = of("ch_uid")

            val CH_VAT = of("ch_vat")

            val CL_TIN = of("cl_tin")

            val CM_NIU = of("cm_niu")

            val CN_TIN = of("cn_tin")

            val CO_NIT = of("co_nit")

            val CR_TIN = of("cr_tin")

            val CV_NIF = of("cv_nif")

            val DE_STN = of("de_stn")

            val DO_RCN = of("do_rcn")

            val EC_RUC = of("ec_ruc")

            val EG_TIN = of("eg_tin")

            val ES_CIF = of("es_cif")

            val ET_TIN = of("et_tin")

            val EU_OSS_VAT = of("eu_oss_vat")

            val GB_VAT = of("gb_vat")

            val GE_VAT = of("ge_vat")

            val GN_NIF = of("gn_nif")

            val HK_BR = of("hk_br")

            val HR_OIB = of("hr_oib")

            val HU_TIN = of("hu_tin")

            val ID_NPWP = of("id_npwp")

            val IL_VAT = of("il_vat")

            val IN_GST = of("in_gst")

            val IS_VAT = of("is_vat")

            val JP_CN = of("jp_cn")

            val JP_RN = of("jp_rn")

            val JP_TRN = of("jp_trn")

            val KE_PIN = of("ke_pin")

            val KG_TIN = of("kg_tin")

            val KH_TIN = of("kh_tin")

            val KR_BRN = of("kr_brn")

            val KZ_BIN = of("kz_bin")

            val LA_TIN = of("la_tin")

            val LI_UID = of("li_uid")

            val LI_VAT = of("li_vat")

            val MA_VAT = of("ma_vat")

            val MD_VAT = of("md_vat")

            val ME_PIB = of("me_pib")

            val MK_VAT = of("mk_vat")

            val MR_NIF = of("mr_nif")

            val MX_RFC = of("mx_rfc")

            val MY_FRP = of("my_frp")

            val MY_ITN = of("my_itn")

            val MY_SST = of("my_sst")

            val NG_TIN = of("ng_tin")

            val NO_VAT = of("no_vat")

            val NO_VOEC = of("no_voec")

            val NP_PAN = of("np_pan")

            val NZ_GST = of("nz_gst")

            val OM_VAT = of("om_vat")

            val PE_RUC = of("pe_ruc")

            val PH_TIN = of("ph_tin")

            val RO_TIN = of("ro_tin")

            val RS_PIB = of("rs_pib")

            val RU_INN = of("ru_inn")

            val RU_KPP = of("ru_kpp")

            val SA_VAT = of("sa_vat")

            val SG_GST = of("sg_gst")

            val SG_UEN = of("sg_uen")

            val SI_TIN = of("si_tin")

            val SN_NINEA = of("sn_ninea")

            val SR_FIN = of("sr_fin")

            val SV_NIT = of("sv_nit")

            val TH_VAT = of("th_vat")

            val TJ_TIN = of("tj_tin")

            val TR_TIN = of("tr_tin")

            val TW_VAT = of("tw_vat")

            val TZ_VAT = of("tz_vat")

            val UA_VAT = of("ua_vat")

            val UG_TIN = of("ug_tin")

            val US_EIN = of("us_ein")

            val UY_RUC = of("uy_ruc")

            val UZ_TIN = of("uz_tin")

            val UZ_VAT = of("uz_vat")

            val VE_RIF = of("ve_rif")

            val VN_TIN = of("vn_tin")

            val ZA_VAT = of("za_vat")

            val ZM_TIN = of("zm_tin")

            val ZW_TIN = of("zw_tin")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            AD_NRT,
            AE_TRN,
            AL_TIN,
            AM_TIN,
            AO_TIN,
            AR_CUIT,
            EU_VAT,
            AU_ABN,
            AU_ARN,
            AW_TIN,
            AZ_TIN,
            BA_TIN,
            BB_TIN,
            BD_BIN,
            BF_IFU,
            BG_UIC,
            BH_VAT,
            BJ_IFU,
            BO_TIN,
            BR_CNPJ,
            BR_CPF,
            BS_TIN,
            BY_TIN,
            CA_BN,
            CA_GST_HST,
            CA_PST_BC,
            CA_PST_MB,
            CA_PST_SK,
            CA_QST,
            CD_NIF,
            CH_UID,
            CH_VAT,
            CL_TIN,
            CM_NIU,
            CN_TIN,
            CO_NIT,
            CR_TIN,
            CV_NIF,
            DE_STN,
            DO_RCN,
            EC_RUC,
            EG_TIN,
            ES_CIF,
            ET_TIN,
            EU_OSS_VAT,
            GB_VAT,
            GE_VAT,
            GN_NIF,
            HK_BR,
            HR_OIB,
            HU_TIN,
            ID_NPWP,
            IL_VAT,
            IN_GST,
            IS_VAT,
            JP_CN,
            JP_RN,
            JP_TRN,
            KE_PIN,
            KG_TIN,
            KH_TIN,
            KR_BRN,
            KZ_BIN,
            LA_TIN,
            LI_UID,
            LI_VAT,
            MA_VAT,
            MD_VAT,
            ME_PIB,
            MK_VAT,
            MR_NIF,
            MX_RFC,
            MY_FRP,
            MY_ITN,
            MY_SST,
            NG_TIN,
            NO_VAT,
            NO_VOEC,
            NP_PAN,
            NZ_GST,
            OM_VAT,
            PE_RUC,
            PH_TIN,
            RO_TIN,
            RS_PIB,
            RU_INN,
            RU_KPP,
            SA_VAT,
            SG_GST,
            SG_UEN,
            SI_TIN,
            SN_NINEA,
            SR_FIN,
            SV_NIT,
            TH_VAT,
            TJ_TIN,
            TR_TIN,
            TW_VAT,
            TZ_VAT,
            UA_VAT,
            UG_TIN,
            US_EIN,
            UY_RUC,
            UZ_TIN,
            UZ_VAT,
            VE_RIF,
            VN_TIN,
            ZA_VAT,
            ZM_TIN,
            ZW_TIN,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AD_NRT,
            AE_TRN,
            AL_TIN,
            AM_TIN,
            AO_TIN,
            AR_CUIT,
            EU_VAT,
            AU_ABN,
            AU_ARN,
            AW_TIN,
            AZ_TIN,
            BA_TIN,
            BB_TIN,
            BD_BIN,
            BF_IFU,
            BG_UIC,
            BH_VAT,
            BJ_IFU,
            BO_TIN,
            BR_CNPJ,
            BR_CPF,
            BS_TIN,
            BY_TIN,
            CA_BN,
            CA_GST_HST,
            CA_PST_BC,
            CA_PST_MB,
            CA_PST_SK,
            CA_QST,
            CD_NIF,
            CH_UID,
            CH_VAT,
            CL_TIN,
            CM_NIU,
            CN_TIN,
            CO_NIT,
            CR_TIN,
            CV_NIF,
            DE_STN,
            DO_RCN,
            EC_RUC,
            EG_TIN,
            ES_CIF,
            ET_TIN,
            EU_OSS_VAT,
            GB_VAT,
            GE_VAT,
            GN_NIF,
            HK_BR,
            HR_OIB,
            HU_TIN,
            ID_NPWP,
            IL_VAT,
            IN_GST,
            IS_VAT,
            JP_CN,
            JP_RN,
            JP_TRN,
            KE_PIN,
            KG_TIN,
            KH_TIN,
            KR_BRN,
            KZ_BIN,
            LA_TIN,
            LI_UID,
            LI_VAT,
            MA_VAT,
            MD_VAT,
            ME_PIB,
            MK_VAT,
            MR_NIF,
            MX_RFC,
            MY_FRP,
            MY_ITN,
            MY_SST,
            NG_TIN,
            NO_VAT,
            NO_VOEC,
            NP_PAN,
            NZ_GST,
            OM_VAT,
            PE_RUC,
            PH_TIN,
            RO_TIN,
            RS_PIB,
            RU_INN,
            RU_KPP,
            SA_VAT,
            SG_GST,
            SG_UEN,
            SI_TIN,
            SN_NINEA,
            SR_FIN,
            SV_NIT,
            TH_VAT,
            TJ_TIN,
            TR_TIN,
            TW_VAT,
            TZ_VAT,
            UA_VAT,
            UG_TIN,
            US_EIN,
            UY_RUC,
            UZ_TIN,
            UZ_VAT,
            VE_RIF,
            VN_TIN,
            ZA_VAT,
            ZM_TIN,
            ZW_TIN,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AD_NRT -> Value.AD_NRT
                AE_TRN -> Value.AE_TRN
                AL_TIN -> Value.AL_TIN
                AM_TIN -> Value.AM_TIN
                AO_TIN -> Value.AO_TIN
                AR_CUIT -> Value.AR_CUIT
                EU_VAT -> Value.EU_VAT
                AU_ABN -> Value.AU_ABN
                AU_ARN -> Value.AU_ARN
                AW_TIN -> Value.AW_TIN
                AZ_TIN -> Value.AZ_TIN
                BA_TIN -> Value.BA_TIN
                BB_TIN -> Value.BB_TIN
                BD_BIN -> Value.BD_BIN
                BF_IFU -> Value.BF_IFU
                BG_UIC -> Value.BG_UIC
                BH_VAT -> Value.BH_VAT
                BJ_IFU -> Value.BJ_IFU
                BO_TIN -> Value.BO_TIN
                BR_CNPJ -> Value.BR_CNPJ
                BR_CPF -> Value.BR_CPF
                BS_TIN -> Value.BS_TIN
                BY_TIN -> Value.BY_TIN
                CA_BN -> Value.CA_BN
                CA_GST_HST -> Value.CA_GST_HST
                CA_PST_BC -> Value.CA_PST_BC
                CA_PST_MB -> Value.CA_PST_MB
                CA_PST_SK -> Value.CA_PST_SK
                CA_QST -> Value.CA_QST
                CD_NIF -> Value.CD_NIF
                CH_UID -> Value.CH_UID
                CH_VAT -> Value.CH_VAT
                CL_TIN -> Value.CL_TIN
                CM_NIU -> Value.CM_NIU
                CN_TIN -> Value.CN_TIN
                CO_NIT -> Value.CO_NIT
                CR_TIN -> Value.CR_TIN
                CV_NIF -> Value.CV_NIF
                DE_STN -> Value.DE_STN
                DO_RCN -> Value.DO_RCN
                EC_RUC -> Value.EC_RUC
                EG_TIN -> Value.EG_TIN
                ES_CIF -> Value.ES_CIF
                ET_TIN -> Value.ET_TIN
                EU_OSS_VAT -> Value.EU_OSS_VAT
                GB_VAT -> Value.GB_VAT
                GE_VAT -> Value.GE_VAT
                GN_NIF -> Value.GN_NIF
                HK_BR -> Value.HK_BR
                HR_OIB -> Value.HR_OIB
                HU_TIN -> Value.HU_TIN
                ID_NPWP -> Value.ID_NPWP
                IL_VAT -> Value.IL_VAT
                IN_GST -> Value.IN_GST
                IS_VAT -> Value.IS_VAT
                JP_CN -> Value.JP_CN
                JP_RN -> Value.JP_RN
                JP_TRN -> Value.JP_TRN
                KE_PIN -> Value.KE_PIN
                KG_TIN -> Value.KG_TIN
                KH_TIN -> Value.KH_TIN
                KR_BRN -> Value.KR_BRN
                KZ_BIN -> Value.KZ_BIN
                LA_TIN -> Value.LA_TIN
                LI_UID -> Value.LI_UID
                LI_VAT -> Value.LI_VAT
                MA_VAT -> Value.MA_VAT
                MD_VAT -> Value.MD_VAT
                ME_PIB -> Value.ME_PIB
                MK_VAT -> Value.MK_VAT
                MR_NIF -> Value.MR_NIF
                MX_RFC -> Value.MX_RFC
                MY_FRP -> Value.MY_FRP
                MY_ITN -> Value.MY_ITN
                MY_SST -> Value.MY_SST
                NG_TIN -> Value.NG_TIN
                NO_VAT -> Value.NO_VAT
                NO_VOEC -> Value.NO_VOEC
                NP_PAN -> Value.NP_PAN
                NZ_GST -> Value.NZ_GST
                OM_VAT -> Value.OM_VAT
                PE_RUC -> Value.PE_RUC
                PH_TIN -> Value.PH_TIN
                RO_TIN -> Value.RO_TIN
                RS_PIB -> Value.RS_PIB
                RU_INN -> Value.RU_INN
                RU_KPP -> Value.RU_KPP
                SA_VAT -> Value.SA_VAT
                SG_GST -> Value.SG_GST
                SG_UEN -> Value.SG_UEN
                SI_TIN -> Value.SI_TIN
                SN_NINEA -> Value.SN_NINEA
                SR_FIN -> Value.SR_FIN
                SV_NIT -> Value.SV_NIT
                TH_VAT -> Value.TH_VAT
                TJ_TIN -> Value.TJ_TIN
                TR_TIN -> Value.TR_TIN
                TW_VAT -> Value.TW_VAT
                TZ_VAT -> Value.TZ_VAT
                UA_VAT -> Value.UA_VAT
                UG_TIN -> Value.UG_TIN
                US_EIN -> Value.US_EIN
                UY_RUC -> Value.UY_RUC
                UZ_TIN -> Value.UZ_TIN
                UZ_VAT -> Value.UZ_VAT
                VE_RIF -> Value.VE_RIF
                VN_TIN -> Value.VN_TIN
                ZA_VAT -> Value.ZA_VAT
                ZM_TIN -> Value.ZM_TIN
                ZW_TIN -> Value.ZW_TIN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                AD_NRT -> Known.AD_NRT
                AE_TRN -> Known.AE_TRN
                AL_TIN -> Known.AL_TIN
                AM_TIN -> Known.AM_TIN
                AO_TIN -> Known.AO_TIN
                AR_CUIT -> Known.AR_CUIT
                EU_VAT -> Known.EU_VAT
                AU_ABN -> Known.AU_ABN
                AU_ARN -> Known.AU_ARN
                AW_TIN -> Known.AW_TIN
                AZ_TIN -> Known.AZ_TIN
                BA_TIN -> Known.BA_TIN
                BB_TIN -> Known.BB_TIN
                BD_BIN -> Known.BD_BIN
                BF_IFU -> Known.BF_IFU
                BG_UIC -> Known.BG_UIC
                BH_VAT -> Known.BH_VAT
                BJ_IFU -> Known.BJ_IFU
                BO_TIN -> Known.BO_TIN
                BR_CNPJ -> Known.BR_CNPJ
                BR_CPF -> Known.BR_CPF
                BS_TIN -> Known.BS_TIN
                BY_TIN -> Known.BY_TIN
                CA_BN -> Known.CA_BN
                CA_GST_HST -> Known.CA_GST_HST
                CA_PST_BC -> Known.CA_PST_BC
                CA_PST_MB -> Known.CA_PST_MB
                CA_PST_SK -> Known.CA_PST_SK
                CA_QST -> Known.CA_QST
                CD_NIF -> Known.CD_NIF
                CH_UID -> Known.CH_UID
                CH_VAT -> Known.CH_VAT
                CL_TIN -> Known.CL_TIN
                CM_NIU -> Known.CM_NIU
                CN_TIN -> Known.CN_TIN
                CO_NIT -> Known.CO_NIT
                CR_TIN -> Known.CR_TIN
                CV_NIF -> Known.CV_NIF
                DE_STN -> Known.DE_STN
                DO_RCN -> Known.DO_RCN
                EC_RUC -> Known.EC_RUC
                EG_TIN -> Known.EG_TIN
                ES_CIF -> Known.ES_CIF
                ET_TIN -> Known.ET_TIN
                EU_OSS_VAT -> Known.EU_OSS_VAT
                GB_VAT -> Known.GB_VAT
                GE_VAT -> Known.GE_VAT
                GN_NIF -> Known.GN_NIF
                HK_BR -> Known.HK_BR
                HR_OIB -> Known.HR_OIB
                HU_TIN -> Known.HU_TIN
                ID_NPWP -> Known.ID_NPWP
                IL_VAT -> Known.IL_VAT
                IN_GST -> Known.IN_GST
                IS_VAT -> Known.IS_VAT
                JP_CN -> Known.JP_CN
                JP_RN -> Known.JP_RN
                JP_TRN -> Known.JP_TRN
                KE_PIN -> Known.KE_PIN
                KG_TIN -> Known.KG_TIN
                KH_TIN -> Known.KH_TIN
                KR_BRN -> Known.KR_BRN
                KZ_BIN -> Known.KZ_BIN
                LA_TIN -> Known.LA_TIN
                LI_UID -> Known.LI_UID
                LI_VAT -> Known.LI_VAT
                MA_VAT -> Known.MA_VAT
                MD_VAT -> Known.MD_VAT
                ME_PIB -> Known.ME_PIB
                MK_VAT -> Known.MK_VAT
                MR_NIF -> Known.MR_NIF
                MX_RFC -> Known.MX_RFC
                MY_FRP -> Known.MY_FRP
                MY_ITN -> Known.MY_ITN
                MY_SST -> Known.MY_SST
                NG_TIN -> Known.NG_TIN
                NO_VAT -> Known.NO_VAT
                NO_VOEC -> Known.NO_VOEC
                NP_PAN -> Known.NP_PAN
                NZ_GST -> Known.NZ_GST
                OM_VAT -> Known.OM_VAT
                PE_RUC -> Known.PE_RUC
                PH_TIN -> Known.PH_TIN
                RO_TIN -> Known.RO_TIN
                RS_PIB -> Known.RS_PIB
                RU_INN -> Known.RU_INN
                RU_KPP -> Known.RU_KPP
                SA_VAT -> Known.SA_VAT
                SG_GST -> Known.SG_GST
                SG_UEN -> Known.SG_UEN
                SI_TIN -> Known.SI_TIN
                SN_NINEA -> Known.SN_NINEA
                SR_FIN -> Known.SR_FIN
                SV_NIT -> Known.SV_NIT
                TH_VAT -> Known.TH_VAT
                TJ_TIN -> Known.TJ_TIN
                TR_TIN -> Known.TR_TIN
                TW_VAT -> Known.TW_VAT
                TZ_VAT -> Known.TZ_VAT
                UA_VAT -> Known.UA_VAT
                UG_TIN -> Known.UG_TIN
                US_EIN -> Known.US_EIN
                UY_RUC -> Known.UY_RUC
                UZ_TIN -> Known.UZ_TIN
                UZ_VAT -> Known.UZ_VAT
                VE_RIF -> Known.VE_RIF
                VN_TIN -> Known.VN_TIN
                ZA_VAT -> Known.ZA_VAT
                ZM_TIN -> Known.ZM_TIN
                ZW_TIN -> Known.ZW_TIN
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerTaxId && country == other.country && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(country, type, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerTaxId{country=$country, type=$type, value=$value, additionalProperties=$additionalProperties}"
}
