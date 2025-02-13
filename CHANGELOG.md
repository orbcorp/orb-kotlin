# Changelog

## 0.1.0-alpha.20 (2025-02-13)

Full Changelog: [v0.1.0-alpha.19...v0.1.0-alpha.20](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.19...v0.1.0-alpha.20)

### Features

* **api:** api update ([#208](https://github.com/orbcorp/orb-kotlin/issues/208)) ([6f4a732](https://github.com/orbcorp/orb-kotlin/commit/6f4a732bedb6bfd177d9a2ccd66e5f892a471d35))


### Documentation

* add more phantom reachability docs ([#206](https://github.com/orbcorp/orb-kotlin/issues/206)) ([124a506](https://github.com/orbcorp/orb-kotlin/commit/124a50600addc5ca825e86c4d232b6b7ff3fa21d))

## 0.1.0-alpha.19 (2025-02-11)

Full Changelog: [v0.1.0-alpha.18...v0.1.0-alpha.19](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.18...v0.1.0-alpha.19)

### Features

* **api:** api update ([#203](https://github.com/orbcorp/orb-kotlin/issues/203)) ([ed75536](https://github.com/orbcorp/orb-kotlin/commit/ed7553625b925e4e84f93feeecdf6836ee1cfa2c))

## 0.1.0-alpha.18 (2025-02-07)

Full Changelog: [v0.1.0-alpha.17...v0.1.0-alpha.18](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.17...v0.1.0-alpha.18)

### Features

* **api:** api update ([#200](https://github.com/orbcorp/orb-kotlin/issues/200)) ([e2af6b5](https://github.com/orbcorp/orb-kotlin/commit/e2af6b5d2aeef8cbb680f0d2fc920c530c661f6a))

## 0.1.0-alpha.17 (2025-02-05)

Full Changelog: [v0.1.0-alpha.16...v0.1.0-alpha.17](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.16...v0.1.0-alpha.17)

### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#197](https://github.com/orbcorp/orb-kotlin/issues/197)) ([e71eae6](https://github.com/orbcorp/orb-kotlin/commit/e71eae61f1035dbf8c295f7c9e561ad72d6d11cb))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([e71eae6](https://github.com/orbcorp/orb-kotlin/commit/e71eae61f1035dbf8c295f7c9e561ad72d6d11cb))
* **client:** add missing validation calls on response ([e71eae6](https://github.com/orbcorp/orb-kotlin/commit/e71eae61f1035dbf8c295f7c9e561ad72d6d11cb))
* **client:** always provide a body for `PATCH` methods ([e71eae6](https://github.com/orbcorp/orb-kotlin/commit/e71eae61f1035dbf8c295f7c9e561ad72d6d11cb))


### Chores

* **internal:** minor formatting/style changes ([e71eae6](https://github.com/orbcorp/orb-kotlin/commit/e71eae61f1035dbf8c295f7c9e561ad72d6d11cb))
* **internal:** rename some tests ([e71eae6](https://github.com/orbcorp/orb-kotlin/commit/e71eae61f1035dbf8c295f7c9e561ad72d6d11cb))

## 0.1.0-alpha.16 (2025-02-04)

Full Changelog: [v0.1.0-alpha.15...v0.1.0-alpha.16](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.15...v0.1.0-alpha.16)

### Features

* **api:** api update ([#195](https://github.com/orbcorp/orb-kotlin/issues/195)) ([a37c06c](https://github.com/orbcorp/orb-kotlin/commit/a37c06cd81b9789c3f340c345314e9d4263c1bf2))
* **client:** send client-side timeout headers ([#194](https://github.com/orbcorp/orb-kotlin/issues/194)) ([8505280](https://github.com/orbcorp/orb-kotlin/commit/8505280ddc6f97bc437231987c807a56b01045f4))


### Documentation

* fix incorrect additional properties info ([#192](https://github.com/orbcorp/orb-kotlin/issues/192)) ([a72c1a0](https://github.com/orbcorp/orb-kotlin/commit/a72c1a0058cfa4404826f8cc715685d18777a926))

## 0.1.0-alpha.15 (2025-01-30)

Full Changelog: [v0.1.0-alpha.14...v0.1.0-alpha.15](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.14...v0.1.0-alpha.15)

### Features

* **api:** api update ([#189](https://github.com/orbcorp/orb-kotlin/issues/189)) ([2363169](https://github.com/orbcorp/orb-kotlin/commit/2363169cfe4c37b9fee88d5e68468c7aab5dd1e0))

## 0.1.0-alpha.14 (2025-01-29)

Full Changelog: [v0.1.0-alpha.13...v0.1.0-alpha.14](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.13...v0.1.0-alpha.14)

### Features

* **client:** add `_queryParams` and `_headers` methods ([#182](https://github.com/orbcorp/orb-kotlin/issues/182)) ([6832bb1](https://github.com/orbcorp/orb-kotlin/commit/6832bb18308557fe3491aa395017ac64543a7e32))
* **client:** helpers for discriminated union variants with one required prop ([#185](https://github.com/orbcorp/orb-kotlin/issues/185)) ([6456e6b](https://github.com/orbcorp/orb-kotlin/commit/6456e6b29d5601031422a7f3cfa101e8acdae5cf))


### Bug Fixes

* **client:** don't leak responses when retrying ([#187](https://github.com/orbcorp/orb-kotlin/issues/187)) ([a69f2f5](https://github.com/orbcorp/orb-kotlin/commit/a69f2f5ada77a0b35362a6a25aba1a2ed0fdc890))


### Chores

* **internal:** improve `RetryingHttpClientTest` ([#184](https://github.com/orbcorp/orb-kotlin/issues/184)) ([c4c047d](https://github.com/orbcorp/orb-kotlin/commit/c4c047d49b7ad8c18730202c968049aeb9158103))
* **internal:** simplify object construction ([#186](https://github.com/orbcorp/orb-kotlin/issues/186)) ([654dcfd](https://github.com/orbcorp/orb-kotlin/commit/654dcfd9952192077dfe100159130e09cabc2c52))


### Refactors

* **internal:** extract request preparation logic ([6832bb1](https://github.com/orbcorp/orb-kotlin/commit/6832bb18308557fe3491aa395017ac64543a7e32))

## 0.1.0-alpha.13 (2025-01-27)

Full Changelog: [v0.1.0-alpha.12...v0.1.0-alpha.13](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.12...v0.1.0-alpha.13)

### Features

* **client:** add `close` method ([#171](https://github.com/orbcorp/orb-kotlin/issues/171)) ([eb8a9ac](https://github.com/orbcorp/orb-kotlin/commit/eb8a9ac6fa5e282a56c760d0d7e8b9502e136454))


### Bug Fixes

* **client:** make some classes and constructors non-public ([#175](https://github.com/orbcorp/orb-kotlin/issues/175)) ([f39254b](https://github.com/orbcorp/orb-kotlin/commit/f39254b214e227e46627b0d11605e51151db1c77))


### Chores

* **internal:** codegen related update ([#180](https://github.com/orbcorp/orb-kotlin/issues/180)) ([aaea37a](https://github.com/orbcorp/orb-kotlin/commit/aaea37acf970b5b4b520426bf8f91fd7709ccc93))
* **internal:** remove some unnecessary `constructor` keywords ([f39254b](https://github.com/orbcorp/orb-kotlin/commit/f39254b214e227e46627b0d11605e51151db1c77))


### Documentation

* `async` and `sync` method comments ([#174](https://github.com/orbcorp/orb-kotlin/issues/174)) ([4f0c1f9](https://github.com/orbcorp/orb-kotlin/commit/4f0c1f93b1734b23db36506d192bb5974cc5fc7f))
* add client documentation ([#173](https://github.com/orbcorp/orb-kotlin/issues/173)) ([d3469f1](https://github.com/orbcorp/orb-kotlin/commit/d3469f140f19383f9a6985d8b76eaab2e58953e8))
* builder, enum, and union comments ([#179](https://github.com/orbcorp/orb-kotlin/issues/179)) ([89b48f2](https://github.com/orbcorp/orb-kotlin/commit/89b48f2b1693180c9e0e07fc5736c4e7c0b3916d))

## 0.1.0-alpha.12 (2025-01-24)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### ⚠ BREAKING CHANGES

* **client:** better union variant method and variable names ([#169](https://github.com/orbcorp/orb-kotlin/issues/169))

### Features

* **api:** api update ([#165](https://github.com/orbcorp/orb-kotlin/issues/165)) ([66c11e1](https://github.com/orbcorp/orb-kotlin/commit/66c11e12be6920982ef0b7c16dd2adcef0bea39b))
* **client:** better union variant method and variable names ([#169](https://github.com/orbcorp/orb-kotlin/issues/169)) ([69086b0](https://github.com/orbcorp/orb-kotlin/commit/69086b034b08d1e5024a19db8e1d1903e19fc8f4))


### Chores

* add max retries to test ([#170](https://github.com/orbcorp/orb-kotlin/issues/170)) ([ee4979d](https://github.com/orbcorp/orb-kotlin/commit/ee4979d427564e441552f5b63cccf65d5b3dc91e))
* **internal:** codegen related update ([#168](https://github.com/orbcorp/orb-kotlin/issues/168)) ([945faf6](https://github.com/orbcorp/orb-kotlin/commit/945faf6051468d64373e262bd3be6441cc3968d3))
* **internal:** swap `checkNotNull` to `checkRequired` ([#167](https://github.com/orbcorp/orb-kotlin/issues/167)) ([2d6ca43](https://github.com/orbcorp/orb-kotlin/commit/2d6ca4331e89fbc666b222d0dc28209c358dad51))

## 0.1.0-alpha.11 (2025-01-22)

Full Changelog: [v0.1.0-alpha.10...v0.1.0-alpha.11](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.10...v0.1.0-alpha.11)

### ⚠ BREAKING CHANGES

* **client:** switch query params objects to use `QueryParams` ([#128](https://github.com/orbcorp/orb-kotlin/issues/128))
* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10))
* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2))

### Features

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2)) ([3f044f5](https://github.com/orbcorp/orb-kotlin/commit/3f044f5b2e67960efb83d7b3cc3ee9bc2f64c7c7))
* **api:** add support for adding allocation price to subscription ([#8](https://github.com/orbcorp/orb-kotlin/issues/8)) ([94987f0](https://github.com/orbcorp/orb-kotlin/commit/94987f0818bd8d1bad183a3d5b9f9797332094d5))
* **api:** add support for query param include_all_blocks ([#11](https://github.com/orbcorp/orb-kotlin/issues/11)) ([ce06e75](https://github.com/orbcorp/orb-kotlin/commit/ce06e75c9ef65f52c9aa9b8289248ee22cc61b38))
* **api:** api update ([#103](https://github.com/orbcorp/orb-kotlin/issues/103)) ([9d315fb](https://github.com/orbcorp/orb-kotlin/commit/9d315fbd70c208abfc89378ed3b0ebd3843faad0))
* **api:** api update ([#105](https://github.com/orbcorp/orb-kotlin/issues/105)) ([3c679a5](https://github.com/orbcorp/orb-kotlin/commit/3c679a5855e53722ed8ec2cc0e30c827ed344026))
* **api:** api update ([#108](https://github.com/orbcorp/orb-kotlin/issues/108)) ([c695980](https://github.com/orbcorp/orb-kotlin/commit/c6959803da1bc346b35bd227f1be480581b6a5bf))
* **api:** api update ([#112](https://github.com/orbcorp/orb-kotlin/issues/112)) ([8af85f6](https://github.com/orbcorp/orb-kotlin/commit/8af85f6705187d1afb67a168ce465a1b6d4030d9))
* **api:** api update ([#113](https://github.com/orbcorp/orb-kotlin/issues/113)) ([9f04ba2](https://github.com/orbcorp/orb-kotlin/commit/9f04ba2f267152c3acb4cae72b7cdb5a0f33ee57))
* **api:** api update ([#118](https://github.com/orbcorp/orb-kotlin/issues/118)) ([a8e9866](https://github.com/orbcorp/orb-kotlin/commit/a8e98666e792e867eadeceadbf234f45ad38cbf9))
* **api:** api update ([#123](https://github.com/orbcorp/orb-kotlin/issues/123)) ([5332927](https://github.com/orbcorp/orb-kotlin/commit/533292780430df40f4bf7cc4e97846cf2d17882f))
* **api:** api update ([#130](https://github.com/orbcorp/orb-kotlin/issues/130)) ([d263c2b](https://github.com/orbcorp/orb-kotlin/commit/d263c2bff2be40e63bf6b2ea16306920ffb1a977))
* **api:** api update ([#131](https://github.com/orbcorp/orb-kotlin/issues/131)) ([16ca41c](https://github.com/orbcorp/orb-kotlin/commit/16ca41cf7b2d4c9b14c8758e3edcfcb885a54b5c))
* **api:** api update ([#136](https://github.com/orbcorp/orb-kotlin/issues/136)) ([6b73f54](https://github.com/orbcorp/orb-kotlin/commit/6b73f54fe8cbcecab1fb278d3ad76ce70ec1f57c))
* **api:** api update ([#137](https://github.com/orbcorp/orb-kotlin/issues/137)) ([c0467b2](https://github.com/orbcorp/orb-kotlin/commit/c0467b29cb7173349d4d6127cde0cbab499b71cc))
* **api:** api update ([#140](https://github.com/orbcorp/orb-kotlin/issues/140)) ([59943a9](https://github.com/orbcorp/orb-kotlin/commit/59943a96b5940a88a83dfc926e580709b0e14c5b))
* **api:** api update ([#154](https://github.com/orbcorp/orb-kotlin/issues/154)) ([4ae06a9](https://github.com/orbcorp/orb-kotlin/commit/4ae06a973ec5a26c409bb1cfc4bc3a01d41d1e7d))
* **api:** api update ([#156](https://github.com/orbcorp/orb-kotlin/issues/156)) ([7396e81](https://github.com/orbcorp/orb-kotlin/commit/7396e818916b73e01d219843b388e2ee83001e77))
* **api:** api update ([#157](https://github.com/orbcorp/orb-kotlin/issues/157)) ([46ae5dd](https://github.com/orbcorp/orb-kotlin/commit/46ae5dd620a3b6c47370d5851acd01ee55a75602))
* **api:** api update ([#161](https://github.com/orbcorp/orb-kotlin/issues/161)) ([665895e](https://github.com/orbcorp/orb-kotlin/commit/665895e298cf3b11cb265c065ce5ce43703a5485))
* **api:** api update ([#75](https://github.com/orbcorp/orb-kotlin/issues/75)) ([408cb08](https://github.com/orbcorp/orb-kotlin/commit/408cb085dca8eea9d139d8fa91d1760f2f79ca80))
* **api:** api update ([#76](https://github.com/orbcorp/orb-kotlin/issues/76)) ([9a6b8c3](https://github.com/orbcorp/orb-kotlin/commit/9a6b8c32c6d0357c2510302821b2a4653c9dd772))
* **api:** api update ([#77](https://github.com/orbcorp/orb-kotlin/issues/77)) ([21ef9ef](https://github.com/orbcorp/orb-kotlin/commit/21ef9ef2e41387213f982a9241bf0daa9fe8b917))
* **api:** api update ([#78](https://github.com/orbcorp/orb-kotlin/issues/78)) ([076913c](https://github.com/orbcorp/orb-kotlin/commit/076913c47f73eab463a1d6a6d4cd4774e8c1a3b6))
* **api:** api update ([#79](https://github.com/orbcorp/orb-kotlin/issues/79)) ([897b6af](https://github.com/orbcorp/orb-kotlin/commit/897b6af3ba118ff9056554b38b4321ade6d1c9c8))
* **api:** api update ([#80](https://github.com/orbcorp/orb-kotlin/issues/80)) ([7b1e076](https://github.com/orbcorp/orb-kotlin/commit/7b1e076553df1ae0591e923a89a4c6996c9d1eb8))
* **api:** api update ([#81](https://github.com/orbcorp/orb-kotlin/issues/81)) ([8c187b4](https://github.com/orbcorp/orb-kotlin/commit/8c187b448e3bcbe175ed823cabfe44397f1f7c0d))
* **api:** api update ([#84](https://github.com/orbcorp/orb-kotlin/issues/84)) ([ae64e17](https://github.com/orbcorp/orb-kotlin/commit/ae64e171977e3d54a14d795d6da4eb42461203e8))
* **api:** api update ([#86](https://github.com/orbcorp/orb-kotlin/issues/86)) ([dadd8e6](https://github.com/orbcorp/orb-kotlin/commit/dadd8e65180869e7661964622880aeed8d93d2aa))
* **api:** api update ([#87](https://github.com/orbcorp/orb-kotlin/issues/87)) ([a6e5e5c](https://github.com/orbcorp/orb-kotlin/commit/a6e5e5c10be5199408535d021fad489962eae79d))
* **api:** api update ([#88](https://github.com/orbcorp/orb-kotlin/issues/88)) ([df0ce63](https://github.com/orbcorp/orb-kotlin/commit/df0ce63d99cc478e95dfd9d3acdf07cea7d24ed0))
* **api:** api update ([#89](https://github.com/orbcorp/orb-kotlin/issues/89)) ([f8bf75e](https://github.com/orbcorp/orb-kotlin/commit/f8bf75e501e00a1abd134808ba6ab8119b746445))
* **api:** api update ([#90](https://github.com/orbcorp/orb-kotlin/issues/90)) ([6747d37](https://github.com/orbcorp/orb-kotlin/commit/6747d37c455690ebfd124731cc216c486bb3c6e9))
* **api:** api update ([#95](https://github.com/orbcorp/orb-kotlin/issues/95)) ([f1af6fb](https://github.com/orbcorp/orb-kotlin/commit/f1af6fb71e26d2b5475a07b3555c8d628c99026a))
* **api:** codegen changes ([#39](https://github.com/orbcorp/orb-kotlin/issues/39)) ([fe78ca9](https://github.com/orbcorp/orb-kotlin/commit/fe78ca9c7802faff94bf9c2852146da8df95604e))
* **api:** codegen changes ([#48](https://github.com/orbcorp/orb-kotlin/issues/48)) ([c761aa7](https://github.com/orbcorp/orb-kotlin/commit/c761aa783b57d19811bfc1444dc3ed9b0d7d9333))
* **api:** external connections made optional when updating items ([#9](https://github.com/orbcorp/orb-kotlin/issues/9)) ([f12c785](https://github.com/orbcorp/orb-kotlin/commit/f12c785d390719ae9505de0b802f1ae07a01c2be))
* **api:** manual updates ([#40](https://github.com/orbcorp/orb-kotlin/issues/40)) ([f48f51d](https://github.com/orbcorp/orb-kotlin/commit/f48f51d447ff991702967ec74856014e86dddead))
* **api:** OpenAPI spec update via Stainless API ([#31](https://github.com/orbcorp/orb-kotlin/issues/31)) ([3a0a24f](https://github.com/orbcorp/orb-kotlin/commit/3a0a24fbaab281d10e61c0ddefa4d3c4af1c7ed3))
* **api:** OpenAPI spec update via Stainless API ([#34](https://github.com/orbcorp/orb-kotlin/issues/34)) ([08810c4](https://github.com/orbcorp/orb-kotlin/commit/08810c4a992b2fc97124ffe48b0c63587e11151a))
* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/orbcorp/orb-kotlin/issues/36)) ([c8f652a](https://github.com/orbcorp/orb-kotlin/commit/c8f652a950a6a891cec8fbab0037003a72bf7c38))
* **api:** OpenAPI spec update via Stainless API ([#37](https://github.com/orbcorp/orb-kotlin/issues/37)) ([4eb6fd3](https://github.com/orbcorp/orb-kotlin/commit/4eb6fd330e75800fbbd0a2de90b566916cec9ee3))
* **api:** OpenAPI spec update via Stainless API ([#38](https://github.com/orbcorp/orb-kotlin/issues/38)) ([757858a](https://github.com/orbcorp/orb-kotlin/commit/757858aab6322b97d8032c50fa9563270a976dce))
* **api:** OpenAPI spec update via Stainless API ([#43](https://github.com/orbcorp/orb-kotlin/issues/43)) ([9dbc27f](https://github.com/orbcorp/orb-kotlin/commit/9dbc27f38ae14c89a924ed5f6b9d770ca7bd857a))
* **api:** OpenAPI spec update via Stainless API ([#45](https://github.com/orbcorp/orb-kotlin/issues/45)) ([3e12982](https://github.com/orbcorp/orb-kotlin/commit/3e12982af6fe3c32a667da98646089fa8bcc04d5))
* **api:** OpenAPI spec update via Stainless API ([#47](https://github.com/orbcorp/orb-kotlin/issues/47)) ([2651152](https://github.com/orbcorp/orb-kotlin/commit/2651152284fb1036ebdc428cd9171fce643ccc56))
* **api:** OpenAPI spec update via Stainless API ([#50](https://github.com/orbcorp/orb-kotlin/issues/50)) ([a297a32](https://github.com/orbcorp/orb-kotlin/commit/a297a32305e286825ec8602d3c5625b0eaaa2886))
* **api:** OpenAPI spec update via Stainless API ([#51](https://github.com/orbcorp/orb-kotlin/issues/51)) ([1165133](https://github.com/orbcorp/orb-kotlin/commit/11651334ba2b9d777ca11dd24fb954c52cb0e8fc))
* **api:** OpenAPI spec update via Stainless API ([#53](https://github.com/orbcorp/orb-kotlin/issues/53)) ([da12578](https://github.com/orbcorp/orb-kotlin/commit/da125787164c40bf43765db67b4b6e58831477bb))
* **api:** OpenAPI spec update via Stainless API ([#54](https://github.com/orbcorp/orb-kotlin/issues/54)) ([8410b5c](https://github.com/orbcorp/orb-kotlin/commit/8410b5c99cddf5948cf2acdc6d31d04edd5bdb76))
* **api:** OpenAPI spec update via Stainless API ([#55](https://github.com/orbcorp/orb-kotlin/issues/55)) ([a9693dd](https://github.com/orbcorp/orb-kotlin/commit/a9693ddfd4950511ebc202d5ced3898b3a19aa3b))
* **api:** OpenAPI spec update via Stainless API ([#56](https://github.com/orbcorp/orb-kotlin/issues/56)) ([d007aaf](https://github.com/orbcorp/orb-kotlin/commit/d007aaf571cc97312b7a13df1cc341d583c7f2fb))
* **api:** OpenAPI spec update via Stainless API ([#57](https://github.com/orbcorp/orb-kotlin/issues/57)) ([13f8644](https://github.com/orbcorp/orb-kotlin/commit/13f8644e4a392f35f266dd396949508176b874a3))
* **api:** OpenAPI spec update via Stainless API ([#59](https://github.com/orbcorp/orb-kotlin/issues/59)) ([e8c47fd](https://github.com/orbcorp/orb-kotlin/commit/e8c47fd6e893f35cd8107e8c1a130fdfdc5278ee))
* **api:** OpenAPI spec update via Stainless API ([#61](https://github.com/orbcorp/orb-kotlin/issues/61)) ([0dd9425](https://github.com/orbcorp/orb-kotlin/commit/0dd9425c3063486582876237f0128d47982501bb))
* **api:** OpenAPI spec update via Stainless API ([#62](https://github.com/orbcorp/orb-kotlin/issues/62)) ([1607065](https://github.com/orbcorp/orb-kotlin/commit/16070655425bce16a25d038c9f550ab1b9ac6349))
* **api:** OpenAPI spec update via Stainless API ([#65](https://github.com/orbcorp/orb-kotlin/issues/65)) ([3266176](https://github.com/orbcorp/orb-kotlin/commit/3266176fa9b5ef23cb1e66494eca59646b8e0144))
* **api:** OpenAPI spec update via Stainless API ([#66](https://github.com/orbcorp/orb-kotlin/issues/66)) ([545f0da](https://github.com/orbcorp/orb-kotlin/commit/545f0da331ddefcf3fe99f7b6c2595a532eaf9a5))
* **api:** OpenAPI spec update via Stainless API ([#67](https://github.com/orbcorp/orb-kotlin/issues/67)) ([7316f84](https://github.com/orbcorp/orb-kotlin/commit/7316f84f6b64ab43ce97060915a239ef1fab4703))
* **api:** OpenAPI spec update via Stainless API ([#72](https://github.com/orbcorp/orb-kotlin/issues/72)) ([849bb2a](https://github.com/orbcorp/orb-kotlin/commit/849bb2a098e2533d156849fcdee89a2a23586bdc))
* **api:** OpenAPI spec update via Stainless API ([#73](https://github.com/orbcorp/orb-kotlin/issues/73)) ([7665415](https://github.com/orbcorp/orb-kotlin/commit/7665415ab15abbe1ea5f5b86d58d3ae96eded1b7))
* **api:** OpenAPI spec update via Stainless API ([#74](https://github.com/orbcorp/orb-kotlin/issues/74)) ([3194456](https://github.com/orbcorp/orb-kotlin/commit/319445610de5397a9a181e275989384046fee7de))
* **api:** updates ([#5](https://github.com/orbcorp/orb-kotlin/issues/5)) ([2c0c8e8](https://github.com/orbcorp/orb-kotlin/commit/2c0c8e8af82300b3caa9f58fd2aa0ba0c60ca388))
* **api:** webhook helpers ([#93](https://github.com/orbcorp/orb-kotlin/issues/93)) ([1a03014](https://github.com/orbcorp/orb-kotlin/commit/1a030149e27880c58fb99b75016181303ad5288a))
* **client:** add more builder convenience methods for lists ([#144](https://github.com/orbcorp/orb-kotlin/issues/144)) ([4cbaae3](https://github.com/orbcorp/orb-kotlin/commit/4cbaae302db7cce1c90b2d62569736476ad96713))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#6](https://github.com/orbcorp/orb-kotlin/issues/6)) ([1d16514](https://github.com/orbcorp/orb-kotlin/commit/1d1651472cb9d475c99e70a95fc922e116139450))
* **client:** add various convenience setters to models ([#142](https://github.com/orbcorp/orb-kotlin/issues/142)) ([a033db6](https://github.com/orbcorp/orb-kotlin/commit/a033db6ca87ad849ea62255bd320ef60bbb60907))
* **client:** added structured fields to errors ([#64](https://github.com/orbcorp/orb-kotlin/issues/64)) ([6fbed34](https://github.com/orbcorp/orb-kotlin/commit/6fbed341cbfe2346250b766002cdcf274afc3489))
* **client:** allow setting arbitrary JSON for top-level body params ([a033db6](https://github.com/orbcorp/orb-kotlin/commit/a033db6ca87ad849ea62255bd320ef60bbb60907))
* **client:** expose getters for `JsonField` of body params ([a033db6](https://github.com/orbcorp/orb-kotlin/commit/a033db6ca87ad849ea62255bd320ef60bbb60907))


### Bug Fixes

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10)) ([8cb42ee](https://github.com/orbcorp/orb-kotlin/commit/8cb42ee21425c2beb88bdaa5cc3094c081bf7f15))
* **client:** allow passing null for nullable fields where missing ([#139](https://github.com/orbcorp/orb-kotlin/issues/139)) ([9049246](https://github.com/orbcorp/orb-kotlin/commit/9049246ddde0649b62ba8f0e2616ef2e0c760dcc))
* **client:** consistently throw on omitting required fields ([a033db6](https://github.com/orbcorp/orb-kotlin/commit/a033db6ca87ad849ea62255bd320ef60bbb60907))
* **client:** convert `JsonField` containing list type to mutable in builder ([a033db6](https://github.com/orbcorp/orb-kotlin/commit/a033db6ca87ad849ea62255bd320ef60bbb60907))
* **client:** make service impl constructors internal ([#160](https://github.com/orbcorp/orb-kotlin/issues/160)) ([f79ba50](https://github.com/orbcorp/orb-kotlin/commit/f79ba5012c3f4cd050f94b844b55ac8f526be94f))
* **docs:** use correct putAdditionalProperty value ([#44](https://github.com/orbcorp/orb-kotlin/issues/44)) ([47731b7](https://github.com/orbcorp/orb-kotlin/commit/47731b7233a36214a42745d4d4a3b0324027b050))
* **unions:** fix namespacing in example types for unions that have models ([3161a77](https://github.com/orbcorp/orb-kotlin/commit/3161a7731236058c2299300c2dbba2b604fb2edf))


### Chores

* consistent string literal escaping ([#49](https://github.com/orbcorp/orb-kotlin/issues/49)) ([22f2365](https://github.com/orbcorp/orb-kotlin/commit/22f23659776f0fb3541d2fbf7ae8789dc4ab417c))
* **docs:** add example project ([#126](https://github.com/orbcorp/orb-kotlin/issues/126)) ([87d21b3](https://github.com/orbcorp/orb-kotlin/commit/87d21b3ddcfb6dc14f97790b35b996daae068032))
* **docs:** fix unused import ([#127](https://github.com/orbcorp/orb-kotlin/issues/127)) ([6dbfb58](https://github.com/orbcorp/orb-kotlin/commit/6dbfb586cc1b25416530ea086124b45a67a98696))
* **docs:** improve Coupon description ([#7](https://github.com/orbcorp/orb-kotlin/issues/7)) ([380b281](https://github.com/orbcorp/orb-kotlin/commit/380b28179cd585f1d114af3e1b53587f1815cd33))
* **docs:** internal update ([#70](https://github.com/orbcorp/orb-kotlin/issues/70)) ([edbf7aa](https://github.com/orbcorp/orb-kotlin/commit/edbf7aa39a26c4573502eb83c99303237f73b46d))
* **docs:** internal update ([#71](https://github.com/orbcorp/orb-kotlin/issues/71)) ([bf80944](https://github.com/orbcorp/orb-kotlin/commit/bf80944259f27763ad97eff1e1fb04936580ba1b))
* **docs:** update readme ([#125](https://github.com/orbcorp/orb-kotlin/issues/125)) ([341bf79](https://github.com/orbcorp/orb-kotlin/commit/341bf79954a929fd3623e12487337300ae67cf6b))
* **docs:** updates price intervals docs ([#12](https://github.com/orbcorp/orb-kotlin/issues/12)) ([1df4524](https://github.com/orbcorp/orb-kotlin/commit/1df45240a285e7a9f866749883aa263b16c65386))
* fix formatting ([89585cf](https://github.com/orbcorp/orb-kotlin/commit/89585cf6c78971b539bfcf675048ab3a99e566e6))
* gitignore test server logs ([#13](https://github.com/orbcorp/orb-kotlin/issues/13)) ([8870a5f](https://github.com/orbcorp/orb-kotlin/commit/8870a5fe483a79c450c73f6fb7d6ee3aa1c0c0bc))
* **internal:** add and tweak check functions ([#151](https://github.com/orbcorp/orb-kotlin/issues/151)) ([2f36f21](https://github.com/orbcorp/orb-kotlin/commit/2f36f215f70a1dfce5cac7e8cedcd8cc69589d36))
* **internal:** codegen related update ([#102](https://github.com/orbcorp/orb-kotlin/issues/102)) ([6556c08](https://github.com/orbcorp/orb-kotlin/commit/6556c0809bde8127e38f7e997c9861b1e7a63386))
* **internal:** codegen related update ([#110](https://github.com/orbcorp/orb-kotlin/issues/110)) ([6f33339](https://github.com/orbcorp/orb-kotlin/commit/6f3333949dea198816821a2f296e5f2e26828b00))
* **internal:** codegen related update ([#133](https://github.com/orbcorp/orb-kotlin/issues/133)) ([6d41811](https://github.com/orbcorp/orb-kotlin/commit/6d41811b3c6275a632c51c8eaf0401411496578d))
* **internal:** codegen related update ([#134](https://github.com/orbcorp/orb-kotlin/issues/134)) ([fc95550](https://github.com/orbcorp/orb-kotlin/commit/fc95550087cf2f8ad1004ccde48f6631d4ddfdd2))
* **internal:** codegen related update ([#143](https://github.com/orbcorp/orb-kotlin/issues/143)) ([e75b8e6](https://github.com/orbcorp/orb-kotlin/commit/e75b8e64cc6734f222c8eb7d021d95233072800d))
* **internal:** codegen related update ([#145](https://github.com/orbcorp/orb-kotlin/issues/145)) ([7713859](https://github.com/orbcorp/orb-kotlin/commit/77138599a46217c225d6d5f8f85ea500665c853c))
* **internal:** codegen related update ([#41](https://github.com/orbcorp/orb-kotlin/issues/41)) ([a235c7e](https://github.com/orbcorp/orb-kotlin/commit/a235c7e01e85de5860fc03a4627b437ebc9f7d01))
* **internal:** codegen related update ([#42](https://github.com/orbcorp/orb-kotlin/issues/42)) ([1c5b7f0](https://github.com/orbcorp/orb-kotlin/commit/1c5b7f0f1ea9d34350ce845c5d0c7147b609b640))
* **internal:** codegen related update ([#52](https://github.com/orbcorp/orb-kotlin/issues/52)) ([590a760](https://github.com/orbcorp/orb-kotlin/commit/590a760c3ef8caa623447ad145903bf40d3a69c4))
* **internal:** codegen related update ([#68](https://github.com/orbcorp/orb-kotlin/issues/68)) ([eeca719](https://github.com/orbcorp/orb-kotlin/commit/eeca71903a8ffaaeade3b731ddb01dff2ecd4b03))
* **internal:** codegen related update ([#69](https://github.com/orbcorp/orb-kotlin/issues/69)) ([857bd1e](https://github.com/orbcorp/orb-kotlin/commit/857bd1e37357dc863d3562e1067c44986b68130c))
* **internal:** extract a `checkRequired` function ([#150](https://github.com/orbcorp/orb-kotlin/issues/150)) ([d7921ef](https://github.com/orbcorp/orb-kotlin/commit/d7921ef876405ed2093cd708938fcc7bf0b927a7))
* **internal:** fix up root `build.gradle.kts` formatting ([#146](https://github.com/orbcorp/orb-kotlin/issues/146)) ([eea3cb0](https://github.com/orbcorp/orb-kotlin/commit/eea3cb04becbf19b728a1667825e4e1cf87b4a84))
* **internal:** remove unused and expand used wildcard imports ([#121](https://github.com/orbcorp/orb-kotlin/issues/121)) ([fc52147](https://github.com/orbcorp/orb-kotlin/commit/fc52147a8ca9f8a75b65274c8b34f21f36b6df19))
* **internal:** remove unused and expand used wildcard imports ([#122](https://github.com/orbcorp/orb-kotlin/issues/122)) ([4049299](https://github.com/orbcorp/orb-kotlin/commit/40492991f173c40375e22a5ec3a4f4e4672362c5))
* **internal:** remove unused Gradle imports ([#147](https://github.com/orbcorp/orb-kotlin/issues/147)) ([9d9647e](https://github.com/orbcorp/orb-kotlin/commit/9d9647e26cd4e15288908806042fb3a035a31a68))
* **internal:** remove unused imports ([#117](https://github.com/orbcorp/orb-kotlin/issues/117)) ([d784083](https://github.com/orbcorp/orb-kotlin/commit/d7840831c52dc36ef7aa7a057d5d306c5152525f))
* **internal:** remove unused or unnecessary Gradle imports ([#148](https://github.com/orbcorp/orb-kotlin/issues/148)) ([5cd4bed](https://github.com/orbcorp/orb-kotlin/commit/5cd4bed2b7683b728bc673642406673cbb519e3e))
* **internal:** tweak client options nullability handling ([2f36f21](https://github.com/orbcorp/orb-kotlin/commit/2f36f215f70a1dfce5cac7e8cedcd8cc69589d36))
* **internal:** update example values ([#104](https://github.com/orbcorp/orb-kotlin/issues/104)) ([96cb62b](https://github.com/orbcorp/orb-kotlin/commit/96cb62b75dabc5428b1044085993a8d773a45976))
* **internal:** update some gradle formatting ([#149](https://github.com/orbcorp/orb-kotlin/issues/149)) ([e77d722](https://github.com/orbcorp/orb-kotlin/commit/e77d72235bb3ecf531e1e2eca22137860c6cc924))
* **internal:** upgrade kotlin compiler and gradle ([#158](https://github.com/orbcorp/orb-kotlin/issues/158)) ([993e74b](https://github.com/orbcorp/orb-kotlin/commit/993e74bbf4b107cc12402b24a5b3e906604efcad))
* **internal:** version bump ([#100](https://github.com/orbcorp/orb-kotlin/issues/100)) ([92fa8af](https://github.com/orbcorp/orb-kotlin/commit/92fa8affc38275df6ac97bd44ee166533453034b))
* **internal:** version bump ([#101](https://github.com/orbcorp/orb-kotlin/issues/101)) ([7aecac4](https://github.com/orbcorp/orb-kotlin/commit/7aecac439e7c3a50fd464a4549acf8e2c70c8540))
* **internal:** version bump ([#83](https://github.com/orbcorp/orb-kotlin/issues/83)) ([a73f398](https://github.com/orbcorp/orb-kotlin/commit/a73f398dab3499444d42366825170bb2b102586c))
* **internal:** version bump ([#99](https://github.com/orbcorp/orb-kotlin/issues/99)) ([d02142b](https://github.com/orbcorp/orb-kotlin/commit/d02142bb4cdffadf26a241cd8a2df2101509f82d))
* rebuild project due to codegen change ([#91](https://github.com/orbcorp/orb-kotlin/issues/91)) ([c0cf2e7](https://github.com/orbcorp/orb-kotlin/commit/c0cf2e7d9a330946dc6d5a55fc6d0698cb9fdf6c))
* rebuild project due to codegen change ([#92](https://github.com/orbcorp/orb-kotlin/issues/92)) ([107691e](https://github.com/orbcorp/orb-kotlin/commit/107691e0bc05f57804a2d1685e764556bf0c5bb3))
* rebuild project due to codegen change ([#94](https://github.com/orbcorp/orb-kotlin/issues/94)) ([a845a3c](https://github.com/orbcorp/orb-kotlin/commit/a845a3c78a5af124477cec26570717d19c1e29ac))
* rebuild project due to codegen change ([#96](https://github.com/orbcorp/orb-kotlin/issues/96)) ([ebaab63](https://github.com/orbcorp/orb-kotlin/commit/ebaab63813297c13de93d53b842c3f73b51fad00))
* simplify examples involving lists ([#152](https://github.com/orbcorp/orb-kotlin/issues/152)) ([68071ec](https://github.com/orbcorp/orb-kotlin/commit/68071ecc4eb62d8ff24942cd292b6f8f61ad96ab))
* simplify examples involving unions ([#153](https://github.com/orbcorp/orb-kotlin/issues/153)) ([2bae431](https://github.com/orbcorp/orb-kotlin/commit/2bae4314e3ab4bdf06cb185385f66144f21a0b54))
* **test:** remove unused imports ([#119](https://github.com/orbcorp/orb-kotlin/issues/119)) ([5842e50](https://github.com/orbcorp/orb-kotlin/commit/5842e50c047f5746caf75e85ebbaadd540fbdddf))
* **test:** use `JsonValue` instead of `JsonString` ([#120](https://github.com/orbcorp/orb-kotlin/issues/120)) ([ac568c6](https://github.com/orbcorp/orb-kotlin/commit/ac568c6c7ea4a2374332be91ed30e6a5ba16fb41))
* update example values in tests and docs ([#114](https://github.com/orbcorp/orb-kotlin/issues/114)) ([3a1f513](https://github.com/orbcorp/orb-kotlin/commit/3a1f51395d4a700ccbab3d3d6636a91ebde3afa0))
* update parameter examples in tests and docs ([#124](https://github.com/orbcorp/orb-kotlin/issues/124)) ([0ba9ac2](https://github.com/orbcorp/orb-kotlin/commit/0ba9ac25a88cc51bbb8a2c1c54801d9506a8a69c))


### Documentation

* add more documentation ([#159](https://github.com/orbcorp/orb-kotlin/issues/159)) ([8be2c7b](https://github.com/orbcorp/orb-kotlin/commit/8be2c7b5135079c5278c22d389fb50d29241df5e))
* add params class javadocs ([#141](https://github.com/orbcorp/orb-kotlin/issues/141)) ([df287bc](https://github.com/orbcorp/orb-kotlin/commit/df287bc037ce37ad5bd97ee9f8b3b481627b54d6))
* add some missing javadocs ([#135](https://github.com/orbcorp/orb-kotlin/issues/135)) ([587bc66](https://github.com/orbcorp/orb-kotlin/commit/587bc66a096f493be1f4aa3f42a39fafd8620361))
* add sonatype readme badge ([#155](https://github.com/orbcorp/orb-kotlin/issues/155)) ([e27346d](https://github.com/orbcorp/orb-kotlin/commit/e27346d9bfe19b8b37578e57f36959ca3cd04020))
* adjust additional properties example ([#63](https://github.com/orbcorp/orb-kotlin/issues/63)) ([d2c3f31](https://github.com/orbcorp/orb-kotlin/commit/d2c3f31aac198e7246572606a39a410a6088033e))
* move up requirements section ([#163](https://github.com/orbcorp/orb-kotlin/issues/163)) ([743274c](https://github.com/orbcorp/orb-kotlin/commit/743274cf0a800268527a160893ed165114e12f54))
* small updates ([#3](https://github.com/orbcorp/orb-kotlin/issues/3)) ([e2bf19e](https://github.com/orbcorp/orb-kotlin/commit/e2bf19e528a6708d95adc698f542987b157da258))
* update readme ([#162](https://github.com/orbcorp/orb-kotlin/issues/162)) ([16929e5](https://github.com/orbcorp/orb-kotlin/commit/16929e5681cda36e0717fdfc9336afc7b771b96c))


### Styles

* **internal:** explicitly add some method return types ([a033db6](https://github.com/orbcorp/orb-kotlin/commit/a033db6ca87ad849ea62255bd320ef60bbb60907))
* **internal:** make enum value definitions less verbose ([#115](https://github.com/orbcorp/orb-kotlin/issues/115)) ([872af16](https://github.com/orbcorp/orb-kotlin/commit/872af16f6581877202ed3cd23c16465b8a28d033))
* **internal:** move enum identity methods to bottom of class ([#116](https://github.com/orbcorp/orb-kotlin/issues/116)) ([74f717e](https://github.com/orbcorp/orb-kotlin/commit/74f717ef3edb6cbf812d7116d2ead094f3941b20))
* **internal:** move headers and query params setters below others ([a033db6](https://github.com/orbcorp/orb-kotlin/commit/a033db6ca87ad849ea62255bd320ef60bbb60907))
* **internal:** simplify existing convenience setters on params ([a033db6](https://github.com/orbcorp/orb-kotlin/commit/a033db6ca87ad849ea62255bd320ef60bbb60907))
* **internal:** sort fields ([#138](https://github.com/orbcorp/orb-kotlin/issues/138)) ([860b461](https://github.com/orbcorp/orb-kotlin/commit/860b4619ff3f4f355c40a864ec597bc5631efee5))


### Refactors

* **client:** switch query params objects to use `QueryParams` ([#128](https://github.com/orbcorp/orb-kotlin/issues/128)) ([394b11d](https://github.com/orbcorp/orb-kotlin/commit/394b11d4e1ef62a751595058ce52c0f9aa71311b))
* **internal:** use constructor to deserialize json ([#129](https://github.com/orbcorp/orb-kotlin/issues/129)) ([91bdb1e](https://github.com/orbcorp/orb-kotlin/commit/91bdb1e64750cbe04ecbc33289ae3950eb622a72))

## 0.1.0-alpha.10 (2024-11-26)

Full Changelog: [v0.1.0-alpha.9...v0.1.0-alpha.10](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.9...v0.1.0-alpha.10)

### ⚠ BREAKING CHANGES

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10))
* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2))

### Features

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2)) ([3f044f5](https://github.com/orbcorp/orb-kotlin/commit/3f044f5b2e67960efb83d7b3cc3ee9bc2f64c7c7))
* **api:** add support for adding allocation price to subscription ([#8](https://github.com/orbcorp/orb-kotlin/issues/8)) ([94987f0](https://github.com/orbcorp/orb-kotlin/commit/94987f0818bd8d1bad183a3d5b9f9797332094d5))
* **api:** add support for query param include_all_blocks ([#11](https://github.com/orbcorp/orb-kotlin/issues/11)) ([ce06e75](https://github.com/orbcorp/orb-kotlin/commit/ce06e75c9ef65f52c9aa9b8289248ee22cc61b38))
* **api:** api update ([#103](https://github.com/orbcorp/orb-kotlin/issues/103)) ([9d315fb](https://github.com/orbcorp/orb-kotlin/commit/9d315fbd70c208abfc89378ed3b0ebd3843faad0))
* **api:** api update ([#105](https://github.com/orbcorp/orb-kotlin/issues/105)) ([3c679a5](https://github.com/orbcorp/orb-kotlin/commit/3c679a5855e53722ed8ec2cc0e30c827ed344026))
* **api:** api update ([#108](https://github.com/orbcorp/orb-kotlin/issues/108)) ([c695980](https://github.com/orbcorp/orb-kotlin/commit/c6959803da1bc346b35bd227f1be480581b6a5bf))
* **api:** api update ([#75](https://github.com/orbcorp/orb-kotlin/issues/75)) ([408cb08](https://github.com/orbcorp/orb-kotlin/commit/408cb085dca8eea9d139d8fa91d1760f2f79ca80))
* **api:** api update ([#76](https://github.com/orbcorp/orb-kotlin/issues/76)) ([9a6b8c3](https://github.com/orbcorp/orb-kotlin/commit/9a6b8c32c6d0357c2510302821b2a4653c9dd772))
* **api:** api update ([#77](https://github.com/orbcorp/orb-kotlin/issues/77)) ([21ef9ef](https://github.com/orbcorp/orb-kotlin/commit/21ef9ef2e41387213f982a9241bf0daa9fe8b917))
* **api:** api update ([#78](https://github.com/orbcorp/orb-kotlin/issues/78)) ([076913c](https://github.com/orbcorp/orb-kotlin/commit/076913c47f73eab463a1d6a6d4cd4774e8c1a3b6))
* **api:** api update ([#79](https://github.com/orbcorp/orb-kotlin/issues/79)) ([897b6af](https://github.com/orbcorp/orb-kotlin/commit/897b6af3ba118ff9056554b38b4321ade6d1c9c8))
* **api:** api update ([#80](https://github.com/orbcorp/orb-kotlin/issues/80)) ([7b1e076](https://github.com/orbcorp/orb-kotlin/commit/7b1e076553df1ae0591e923a89a4c6996c9d1eb8))
* **api:** api update ([#81](https://github.com/orbcorp/orb-kotlin/issues/81)) ([8c187b4](https://github.com/orbcorp/orb-kotlin/commit/8c187b448e3bcbe175ed823cabfe44397f1f7c0d))
* **api:** api update ([#84](https://github.com/orbcorp/orb-kotlin/issues/84)) ([ae64e17](https://github.com/orbcorp/orb-kotlin/commit/ae64e171977e3d54a14d795d6da4eb42461203e8))
* **api:** api update ([#86](https://github.com/orbcorp/orb-kotlin/issues/86)) ([dadd8e6](https://github.com/orbcorp/orb-kotlin/commit/dadd8e65180869e7661964622880aeed8d93d2aa))
* **api:** api update ([#87](https://github.com/orbcorp/orb-kotlin/issues/87)) ([a6e5e5c](https://github.com/orbcorp/orb-kotlin/commit/a6e5e5c10be5199408535d021fad489962eae79d))
* **api:** api update ([#88](https://github.com/orbcorp/orb-kotlin/issues/88)) ([df0ce63](https://github.com/orbcorp/orb-kotlin/commit/df0ce63d99cc478e95dfd9d3acdf07cea7d24ed0))
* **api:** api update ([#89](https://github.com/orbcorp/orb-kotlin/issues/89)) ([f8bf75e](https://github.com/orbcorp/orb-kotlin/commit/f8bf75e501e00a1abd134808ba6ab8119b746445))
* **api:** api update ([#90](https://github.com/orbcorp/orb-kotlin/issues/90)) ([6747d37](https://github.com/orbcorp/orb-kotlin/commit/6747d37c455690ebfd124731cc216c486bb3c6e9))
* **api:** api update ([#95](https://github.com/orbcorp/orb-kotlin/issues/95)) ([f1af6fb](https://github.com/orbcorp/orb-kotlin/commit/f1af6fb71e26d2b5475a07b3555c8d628c99026a))
* **api:** codegen changes ([#39](https://github.com/orbcorp/orb-kotlin/issues/39)) ([fe78ca9](https://github.com/orbcorp/orb-kotlin/commit/fe78ca9c7802faff94bf9c2852146da8df95604e))
* **api:** codegen changes ([#48](https://github.com/orbcorp/orb-kotlin/issues/48)) ([c761aa7](https://github.com/orbcorp/orb-kotlin/commit/c761aa783b57d19811bfc1444dc3ed9b0d7d9333))
* **api:** external connections made optional when updating items ([#9](https://github.com/orbcorp/orb-kotlin/issues/9)) ([f12c785](https://github.com/orbcorp/orb-kotlin/commit/f12c785d390719ae9505de0b802f1ae07a01c2be))
* **api:** manual updates ([#40](https://github.com/orbcorp/orb-kotlin/issues/40)) ([f48f51d](https://github.com/orbcorp/orb-kotlin/commit/f48f51d447ff991702967ec74856014e86dddead))
* **api:** OpenAPI spec update via Stainless API ([#31](https://github.com/orbcorp/orb-kotlin/issues/31)) ([3a0a24f](https://github.com/orbcorp/orb-kotlin/commit/3a0a24fbaab281d10e61c0ddefa4d3c4af1c7ed3))
* **api:** OpenAPI spec update via Stainless API ([#34](https://github.com/orbcorp/orb-kotlin/issues/34)) ([08810c4](https://github.com/orbcorp/orb-kotlin/commit/08810c4a992b2fc97124ffe48b0c63587e11151a))
* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/orbcorp/orb-kotlin/issues/36)) ([c8f652a](https://github.com/orbcorp/orb-kotlin/commit/c8f652a950a6a891cec8fbab0037003a72bf7c38))
* **api:** OpenAPI spec update via Stainless API ([#37](https://github.com/orbcorp/orb-kotlin/issues/37)) ([4eb6fd3](https://github.com/orbcorp/orb-kotlin/commit/4eb6fd330e75800fbbd0a2de90b566916cec9ee3))
* **api:** OpenAPI spec update via Stainless API ([#38](https://github.com/orbcorp/orb-kotlin/issues/38)) ([757858a](https://github.com/orbcorp/orb-kotlin/commit/757858aab6322b97d8032c50fa9563270a976dce))
* **api:** OpenAPI spec update via Stainless API ([#43](https://github.com/orbcorp/orb-kotlin/issues/43)) ([9dbc27f](https://github.com/orbcorp/orb-kotlin/commit/9dbc27f38ae14c89a924ed5f6b9d770ca7bd857a))
* **api:** OpenAPI spec update via Stainless API ([#45](https://github.com/orbcorp/orb-kotlin/issues/45)) ([3e12982](https://github.com/orbcorp/orb-kotlin/commit/3e12982af6fe3c32a667da98646089fa8bcc04d5))
* **api:** OpenAPI spec update via Stainless API ([#47](https://github.com/orbcorp/orb-kotlin/issues/47)) ([2651152](https://github.com/orbcorp/orb-kotlin/commit/2651152284fb1036ebdc428cd9171fce643ccc56))
* **api:** OpenAPI spec update via Stainless API ([#50](https://github.com/orbcorp/orb-kotlin/issues/50)) ([a297a32](https://github.com/orbcorp/orb-kotlin/commit/a297a32305e286825ec8602d3c5625b0eaaa2886))
* **api:** OpenAPI spec update via Stainless API ([#51](https://github.com/orbcorp/orb-kotlin/issues/51)) ([1165133](https://github.com/orbcorp/orb-kotlin/commit/11651334ba2b9d777ca11dd24fb954c52cb0e8fc))
* **api:** OpenAPI spec update via Stainless API ([#53](https://github.com/orbcorp/orb-kotlin/issues/53)) ([da12578](https://github.com/orbcorp/orb-kotlin/commit/da125787164c40bf43765db67b4b6e58831477bb))
* **api:** OpenAPI spec update via Stainless API ([#54](https://github.com/orbcorp/orb-kotlin/issues/54)) ([8410b5c](https://github.com/orbcorp/orb-kotlin/commit/8410b5c99cddf5948cf2acdc6d31d04edd5bdb76))
* **api:** OpenAPI spec update via Stainless API ([#55](https://github.com/orbcorp/orb-kotlin/issues/55)) ([a9693dd](https://github.com/orbcorp/orb-kotlin/commit/a9693ddfd4950511ebc202d5ced3898b3a19aa3b))
* **api:** OpenAPI spec update via Stainless API ([#56](https://github.com/orbcorp/orb-kotlin/issues/56)) ([d007aaf](https://github.com/orbcorp/orb-kotlin/commit/d007aaf571cc97312b7a13df1cc341d583c7f2fb))
* **api:** OpenAPI spec update via Stainless API ([#57](https://github.com/orbcorp/orb-kotlin/issues/57)) ([13f8644](https://github.com/orbcorp/orb-kotlin/commit/13f8644e4a392f35f266dd396949508176b874a3))
* **api:** OpenAPI spec update via Stainless API ([#59](https://github.com/orbcorp/orb-kotlin/issues/59)) ([e8c47fd](https://github.com/orbcorp/orb-kotlin/commit/e8c47fd6e893f35cd8107e8c1a130fdfdc5278ee))
* **api:** OpenAPI spec update via Stainless API ([#61](https://github.com/orbcorp/orb-kotlin/issues/61)) ([0dd9425](https://github.com/orbcorp/orb-kotlin/commit/0dd9425c3063486582876237f0128d47982501bb))
* **api:** OpenAPI spec update via Stainless API ([#62](https://github.com/orbcorp/orb-kotlin/issues/62)) ([1607065](https://github.com/orbcorp/orb-kotlin/commit/16070655425bce16a25d038c9f550ab1b9ac6349))
* **api:** OpenAPI spec update via Stainless API ([#65](https://github.com/orbcorp/orb-kotlin/issues/65)) ([3266176](https://github.com/orbcorp/orb-kotlin/commit/3266176fa9b5ef23cb1e66494eca59646b8e0144))
* **api:** OpenAPI spec update via Stainless API ([#66](https://github.com/orbcorp/orb-kotlin/issues/66)) ([545f0da](https://github.com/orbcorp/orb-kotlin/commit/545f0da331ddefcf3fe99f7b6c2595a532eaf9a5))
* **api:** OpenAPI spec update via Stainless API ([#67](https://github.com/orbcorp/orb-kotlin/issues/67)) ([7316f84](https://github.com/orbcorp/orb-kotlin/commit/7316f84f6b64ab43ce97060915a239ef1fab4703))
* **api:** OpenAPI spec update via Stainless API ([#72](https://github.com/orbcorp/orb-kotlin/issues/72)) ([849bb2a](https://github.com/orbcorp/orb-kotlin/commit/849bb2a098e2533d156849fcdee89a2a23586bdc))
* **api:** OpenAPI spec update via Stainless API ([#73](https://github.com/orbcorp/orb-kotlin/issues/73)) ([7665415](https://github.com/orbcorp/orb-kotlin/commit/7665415ab15abbe1ea5f5b86d58d3ae96eded1b7))
* **api:** OpenAPI spec update via Stainless API ([#74](https://github.com/orbcorp/orb-kotlin/issues/74)) ([3194456](https://github.com/orbcorp/orb-kotlin/commit/319445610de5397a9a181e275989384046fee7de))
* **api:** updates ([#5](https://github.com/orbcorp/orb-kotlin/issues/5)) ([2c0c8e8](https://github.com/orbcorp/orb-kotlin/commit/2c0c8e8af82300b3caa9f58fd2aa0ba0c60ca388))
* **api:** webhook helpers ([#93](https://github.com/orbcorp/orb-kotlin/issues/93)) ([1a03014](https://github.com/orbcorp/orb-kotlin/commit/1a030149e27880c58fb99b75016181303ad5288a))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#6](https://github.com/orbcorp/orb-kotlin/issues/6)) ([1d16514](https://github.com/orbcorp/orb-kotlin/commit/1d1651472cb9d475c99e70a95fc922e116139450))
* **client:** added structured fields to errors ([#64](https://github.com/orbcorp/orb-kotlin/issues/64)) ([6fbed34](https://github.com/orbcorp/orb-kotlin/commit/6fbed341cbfe2346250b766002cdcf274afc3489))


### Bug Fixes

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10)) ([8cb42ee](https://github.com/orbcorp/orb-kotlin/commit/8cb42ee21425c2beb88bdaa5cc3094c081bf7f15))
* **docs:** use correct putAdditionalProperty value ([#44](https://github.com/orbcorp/orb-kotlin/issues/44)) ([47731b7](https://github.com/orbcorp/orb-kotlin/commit/47731b7233a36214a42745d4d4a3b0324027b050))
* **unions:** fix namespacing in example types for unions that have models ([3161a77](https://github.com/orbcorp/orb-kotlin/commit/3161a7731236058c2299300c2dbba2b604fb2edf))


### Chores

* consistent string literal escaping ([#49](https://github.com/orbcorp/orb-kotlin/issues/49)) ([22f2365](https://github.com/orbcorp/orb-kotlin/commit/22f23659776f0fb3541d2fbf7ae8789dc4ab417c))
* **docs:** improve Coupon description ([#7](https://github.com/orbcorp/orb-kotlin/issues/7)) ([380b281](https://github.com/orbcorp/orb-kotlin/commit/380b28179cd585f1d114af3e1b53587f1815cd33))
* **docs:** internal update ([#70](https://github.com/orbcorp/orb-kotlin/issues/70)) ([edbf7aa](https://github.com/orbcorp/orb-kotlin/commit/edbf7aa39a26c4573502eb83c99303237f73b46d))
* **docs:** internal update ([#71](https://github.com/orbcorp/orb-kotlin/issues/71)) ([bf80944](https://github.com/orbcorp/orb-kotlin/commit/bf80944259f27763ad97eff1e1fb04936580ba1b))
* **docs:** updates price intervals docs ([#12](https://github.com/orbcorp/orb-kotlin/issues/12)) ([1df4524](https://github.com/orbcorp/orb-kotlin/commit/1df45240a285e7a9f866749883aa263b16c65386))
* gitignore test server logs ([#13](https://github.com/orbcorp/orb-kotlin/issues/13)) ([8870a5f](https://github.com/orbcorp/orb-kotlin/commit/8870a5fe483a79c450c73f6fb7d6ee3aa1c0c0bc))
* **internal:** codegen related update ([#102](https://github.com/orbcorp/orb-kotlin/issues/102)) ([6556c08](https://github.com/orbcorp/orb-kotlin/commit/6556c0809bde8127e38f7e997c9861b1e7a63386))
* **internal:** codegen related update ([#41](https://github.com/orbcorp/orb-kotlin/issues/41)) ([a235c7e](https://github.com/orbcorp/orb-kotlin/commit/a235c7e01e85de5860fc03a4627b437ebc9f7d01))
* **internal:** codegen related update ([#42](https://github.com/orbcorp/orb-kotlin/issues/42)) ([1c5b7f0](https://github.com/orbcorp/orb-kotlin/commit/1c5b7f0f1ea9d34350ce845c5d0c7147b609b640))
* **internal:** codegen related update ([#52](https://github.com/orbcorp/orb-kotlin/issues/52)) ([590a760](https://github.com/orbcorp/orb-kotlin/commit/590a760c3ef8caa623447ad145903bf40d3a69c4))
* **internal:** codegen related update ([#68](https://github.com/orbcorp/orb-kotlin/issues/68)) ([eeca719](https://github.com/orbcorp/orb-kotlin/commit/eeca71903a8ffaaeade3b731ddb01dff2ecd4b03))
* **internal:** codegen related update ([#69](https://github.com/orbcorp/orb-kotlin/issues/69)) ([857bd1e](https://github.com/orbcorp/orb-kotlin/commit/857bd1e37357dc863d3562e1067c44986b68130c))
* **internal:** update example values ([#104](https://github.com/orbcorp/orb-kotlin/issues/104)) ([96cb62b](https://github.com/orbcorp/orb-kotlin/commit/96cb62b75dabc5428b1044085993a8d773a45976))
* **internal:** version bump ([#100](https://github.com/orbcorp/orb-kotlin/issues/100)) ([92fa8af](https://github.com/orbcorp/orb-kotlin/commit/92fa8affc38275df6ac97bd44ee166533453034b))
* **internal:** version bump ([#101](https://github.com/orbcorp/orb-kotlin/issues/101)) ([7aecac4](https://github.com/orbcorp/orb-kotlin/commit/7aecac439e7c3a50fd464a4549acf8e2c70c8540))
* **internal:** version bump ([#83](https://github.com/orbcorp/orb-kotlin/issues/83)) ([a73f398](https://github.com/orbcorp/orb-kotlin/commit/a73f398dab3499444d42366825170bb2b102586c))
* **internal:** version bump ([#99](https://github.com/orbcorp/orb-kotlin/issues/99)) ([d02142b](https://github.com/orbcorp/orb-kotlin/commit/d02142bb4cdffadf26a241cd8a2df2101509f82d))
* rebuild project due to codegen change ([#91](https://github.com/orbcorp/orb-kotlin/issues/91)) ([c0cf2e7](https://github.com/orbcorp/orb-kotlin/commit/c0cf2e7d9a330946dc6d5a55fc6d0698cb9fdf6c))
* rebuild project due to codegen change ([#92](https://github.com/orbcorp/orb-kotlin/issues/92)) ([107691e](https://github.com/orbcorp/orb-kotlin/commit/107691e0bc05f57804a2d1685e764556bf0c5bb3))
* rebuild project due to codegen change ([#94](https://github.com/orbcorp/orb-kotlin/issues/94)) ([a845a3c](https://github.com/orbcorp/orb-kotlin/commit/a845a3c78a5af124477cec26570717d19c1e29ac))
* rebuild project due to codegen change ([#96](https://github.com/orbcorp/orb-kotlin/issues/96)) ([ebaab63](https://github.com/orbcorp/orb-kotlin/commit/ebaab63813297c13de93d53b842c3f73b51fad00))


### Documentation

* adjust additional properties example ([#63](https://github.com/orbcorp/orb-kotlin/issues/63)) ([d2c3f31](https://github.com/orbcorp/orb-kotlin/commit/d2c3f31aac198e7246572606a39a410a6088033e))
* small updates ([#3](https://github.com/orbcorp/orb-kotlin/issues/3)) ([e2bf19e](https://github.com/orbcorp/orb-kotlin/commit/e2bf19e528a6708d95adc698f542987b157da258))

## 0.1.0-alpha.9 (2024-11-25)

Full Changelog: [v0.1.0-alpha.8...v0.1.0-alpha.9](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.8...v0.1.0-alpha.9)

### ⚠ BREAKING CHANGES

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10))
* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2))

### Features

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2)) ([3f044f5](https://github.com/orbcorp/orb-kotlin/commit/3f044f5b2e67960efb83d7b3cc3ee9bc2f64c7c7))
* **api:** add support for adding allocation price to subscription ([#8](https://github.com/orbcorp/orb-kotlin/issues/8)) ([94987f0](https://github.com/orbcorp/orb-kotlin/commit/94987f0818bd8d1bad183a3d5b9f9797332094d5))
* **api:** add support for query param include_all_blocks ([#11](https://github.com/orbcorp/orb-kotlin/issues/11)) ([ce06e75](https://github.com/orbcorp/orb-kotlin/commit/ce06e75c9ef65f52c9aa9b8289248ee22cc61b38))
* **api:** api update ([#103](https://github.com/orbcorp/orb-kotlin/issues/103)) ([9d315fb](https://github.com/orbcorp/orb-kotlin/commit/9d315fbd70c208abfc89378ed3b0ebd3843faad0))
* **api:** api update ([#105](https://github.com/orbcorp/orb-kotlin/issues/105)) ([3c679a5](https://github.com/orbcorp/orb-kotlin/commit/3c679a5855e53722ed8ec2cc0e30c827ed344026))
* **api:** api update ([#75](https://github.com/orbcorp/orb-kotlin/issues/75)) ([408cb08](https://github.com/orbcorp/orb-kotlin/commit/408cb085dca8eea9d139d8fa91d1760f2f79ca80))
* **api:** api update ([#76](https://github.com/orbcorp/orb-kotlin/issues/76)) ([9a6b8c3](https://github.com/orbcorp/orb-kotlin/commit/9a6b8c32c6d0357c2510302821b2a4653c9dd772))
* **api:** api update ([#77](https://github.com/orbcorp/orb-kotlin/issues/77)) ([21ef9ef](https://github.com/orbcorp/orb-kotlin/commit/21ef9ef2e41387213f982a9241bf0daa9fe8b917))
* **api:** api update ([#78](https://github.com/orbcorp/orb-kotlin/issues/78)) ([076913c](https://github.com/orbcorp/orb-kotlin/commit/076913c47f73eab463a1d6a6d4cd4774e8c1a3b6))
* **api:** api update ([#79](https://github.com/orbcorp/orb-kotlin/issues/79)) ([897b6af](https://github.com/orbcorp/orb-kotlin/commit/897b6af3ba118ff9056554b38b4321ade6d1c9c8))
* **api:** api update ([#80](https://github.com/orbcorp/orb-kotlin/issues/80)) ([7b1e076](https://github.com/orbcorp/orb-kotlin/commit/7b1e076553df1ae0591e923a89a4c6996c9d1eb8))
* **api:** api update ([#81](https://github.com/orbcorp/orb-kotlin/issues/81)) ([8c187b4](https://github.com/orbcorp/orb-kotlin/commit/8c187b448e3bcbe175ed823cabfe44397f1f7c0d))
* **api:** api update ([#84](https://github.com/orbcorp/orb-kotlin/issues/84)) ([ae64e17](https://github.com/orbcorp/orb-kotlin/commit/ae64e171977e3d54a14d795d6da4eb42461203e8))
* **api:** api update ([#86](https://github.com/orbcorp/orb-kotlin/issues/86)) ([dadd8e6](https://github.com/orbcorp/orb-kotlin/commit/dadd8e65180869e7661964622880aeed8d93d2aa))
* **api:** api update ([#87](https://github.com/orbcorp/orb-kotlin/issues/87)) ([a6e5e5c](https://github.com/orbcorp/orb-kotlin/commit/a6e5e5c10be5199408535d021fad489962eae79d))
* **api:** api update ([#88](https://github.com/orbcorp/orb-kotlin/issues/88)) ([df0ce63](https://github.com/orbcorp/orb-kotlin/commit/df0ce63d99cc478e95dfd9d3acdf07cea7d24ed0))
* **api:** api update ([#89](https://github.com/orbcorp/orb-kotlin/issues/89)) ([f8bf75e](https://github.com/orbcorp/orb-kotlin/commit/f8bf75e501e00a1abd134808ba6ab8119b746445))
* **api:** api update ([#90](https://github.com/orbcorp/orb-kotlin/issues/90)) ([6747d37](https://github.com/orbcorp/orb-kotlin/commit/6747d37c455690ebfd124731cc216c486bb3c6e9))
* **api:** api update ([#95](https://github.com/orbcorp/orb-kotlin/issues/95)) ([f1af6fb](https://github.com/orbcorp/orb-kotlin/commit/f1af6fb71e26d2b5475a07b3555c8d628c99026a))
* **api:** codegen changes ([#39](https://github.com/orbcorp/orb-kotlin/issues/39)) ([fe78ca9](https://github.com/orbcorp/orb-kotlin/commit/fe78ca9c7802faff94bf9c2852146da8df95604e))
* **api:** codegen changes ([#48](https://github.com/orbcorp/orb-kotlin/issues/48)) ([c761aa7](https://github.com/orbcorp/orb-kotlin/commit/c761aa783b57d19811bfc1444dc3ed9b0d7d9333))
* **api:** external connections made optional when updating items ([#9](https://github.com/orbcorp/orb-kotlin/issues/9)) ([f12c785](https://github.com/orbcorp/orb-kotlin/commit/f12c785d390719ae9505de0b802f1ae07a01c2be))
* **api:** manual updates ([#40](https://github.com/orbcorp/orb-kotlin/issues/40)) ([f48f51d](https://github.com/orbcorp/orb-kotlin/commit/f48f51d447ff991702967ec74856014e86dddead))
* **api:** OpenAPI spec update via Stainless API ([#31](https://github.com/orbcorp/orb-kotlin/issues/31)) ([3a0a24f](https://github.com/orbcorp/orb-kotlin/commit/3a0a24fbaab281d10e61c0ddefa4d3c4af1c7ed3))
* **api:** OpenAPI spec update via Stainless API ([#34](https://github.com/orbcorp/orb-kotlin/issues/34)) ([08810c4](https://github.com/orbcorp/orb-kotlin/commit/08810c4a992b2fc97124ffe48b0c63587e11151a))
* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/orbcorp/orb-kotlin/issues/36)) ([c8f652a](https://github.com/orbcorp/orb-kotlin/commit/c8f652a950a6a891cec8fbab0037003a72bf7c38))
* **api:** OpenAPI spec update via Stainless API ([#37](https://github.com/orbcorp/orb-kotlin/issues/37)) ([4eb6fd3](https://github.com/orbcorp/orb-kotlin/commit/4eb6fd330e75800fbbd0a2de90b566916cec9ee3))
* **api:** OpenAPI spec update via Stainless API ([#38](https://github.com/orbcorp/orb-kotlin/issues/38)) ([757858a](https://github.com/orbcorp/orb-kotlin/commit/757858aab6322b97d8032c50fa9563270a976dce))
* **api:** OpenAPI spec update via Stainless API ([#43](https://github.com/orbcorp/orb-kotlin/issues/43)) ([9dbc27f](https://github.com/orbcorp/orb-kotlin/commit/9dbc27f38ae14c89a924ed5f6b9d770ca7bd857a))
* **api:** OpenAPI spec update via Stainless API ([#45](https://github.com/orbcorp/orb-kotlin/issues/45)) ([3e12982](https://github.com/orbcorp/orb-kotlin/commit/3e12982af6fe3c32a667da98646089fa8bcc04d5))
* **api:** OpenAPI spec update via Stainless API ([#47](https://github.com/orbcorp/orb-kotlin/issues/47)) ([2651152](https://github.com/orbcorp/orb-kotlin/commit/2651152284fb1036ebdc428cd9171fce643ccc56))
* **api:** OpenAPI spec update via Stainless API ([#50](https://github.com/orbcorp/orb-kotlin/issues/50)) ([a297a32](https://github.com/orbcorp/orb-kotlin/commit/a297a32305e286825ec8602d3c5625b0eaaa2886))
* **api:** OpenAPI spec update via Stainless API ([#51](https://github.com/orbcorp/orb-kotlin/issues/51)) ([1165133](https://github.com/orbcorp/orb-kotlin/commit/11651334ba2b9d777ca11dd24fb954c52cb0e8fc))
* **api:** OpenAPI spec update via Stainless API ([#53](https://github.com/orbcorp/orb-kotlin/issues/53)) ([da12578](https://github.com/orbcorp/orb-kotlin/commit/da125787164c40bf43765db67b4b6e58831477bb))
* **api:** OpenAPI spec update via Stainless API ([#54](https://github.com/orbcorp/orb-kotlin/issues/54)) ([8410b5c](https://github.com/orbcorp/orb-kotlin/commit/8410b5c99cddf5948cf2acdc6d31d04edd5bdb76))
* **api:** OpenAPI spec update via Stainless API ([#55](https://github.com/orbcorp/orb-kotlin/issues/55)) ([a9693dd](https://github.com/orbcorp/orb-kotlin/commit/a9693ddfd4950511ebc202d5ced3898b3a19aa3b))
* **api:** OpenAPI spec update via Stainless API ([#56](https://github.com/orbcorp/orb-kotlin/issues/56)) ([d007aaf](https://github.com/orbcorp/orb-kotlin/commit/d007aaf571cc97312b7a13df1cc341d583c7f2fb))
* **api:** OpenAPI spec update via Stainless API ([#57](https://github.com/orbcorp/orb-kotlin/issues/57)) ([13f8644](https://github.com/orbcorp/orb-kotlin/commit/13f8644e4a392f35f266dd396949508176b874a3))
* **api:** OpenAPI spec update via Stainless API ([#59](https://github.com/orbcorp/orb-kotlin/issues/59)) ([e8c47fd](https://github.com/orbcorp/orb-kotlin/commit/e8c47fd6e893f35cd8107e8c1a130fdfdc5278ee))
* **api:** OpenAPI spec update via Stainless API ([#61](https://github.com/orbcorp/orb-kotlin/issues/61)) ([0dd9425](https://github.com/orbcorp/orb-kotlin/commit/0dd9425c3063486582876237f0128d47982501bb))
* **api:** OpenAPI spec update via Stainless API ([#62](https://github.com/orbcorp/orb-kotlin/issues/62)) ([1607065](https://github.com/orbcorp/orb-kotlin/commit/16070655425bce16a25d038c9f550ab1b9ac6349))
* **api:** OpenAPI spec update via Stainless API ([#65](https://github.com/orbcorp/orb-kotlin/issues/65)) ([3266176](https://github.com/orbcorp/orb-kotlin/commit/3266176fa9b5ef23cb1e66494eca59646b8e0144))
* **api:** OpenAPI spec update via Stainless API ([#66](https://github.com/orbcorp/orb-kotlin/issues/66)) ([545f0da](https://github.com/orbcorp/orb-kotlin/commit/545f0da331ddefcf3fe99f7b6c2595a532eaf9a5))
* **api:** OpenAPI spec update via Stainless API ([#67](https://github.com/orbcorp/orb-kotlin/issues/67)) ([7316f84](https://github.com/orbcorp/orb-kotlin/commit/7316f84f6b64ab43ce97060915a239ef1fab4703))
* **api:** OpenAPI spec update via Stainless API ([#72](https://github.com/orbcorp/orb-kotlin/issues/72)) ([849bb2a](https://github.com/orbcorp/orb-kotlin/commit/849bb2a098e2533d156849fcdee89a2a23586bdc))
* **api:** OpenAPI spec update via Stainless API ([#73](https://github.com/orbcorp/orb-kotlin/issues/73)) ([7665415](https://github.com/orbcorp/orb-kotlin/commit/7665415ab15abbe1ea5f5b86d58d3ae96eded1b7))
* **api:** OpenAPI spec update via Stainless API ([#74](https://github.com/orbcorp/orb-kotlin/issues/74)) ([3194456](https://github.com/orbcorp/orb-kotlin/commit/319445610de5397a9a181e275989384046fee7de))
* **api:** updates ([#5](https://github.com/orbcorp/orb-kotlin/issues/5)) ([2c0c8e8](https://github.com/orbcorp/orb-kotlin/commit/2c0c8e8af82300b3caa9f58fd2aa0ba0c60ca388))
* **api:** webhook helpers ([#93](https://github.com/orbcorp/orb-kotlin/issues/93)) ([1a03014](https://github.com/orbcorp/orb-kotlin/commit/1a030149e27880c58fb99b75016181303ad5288a))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#6](https://github.com/orbcorp/orb-kotlin/issues/6)) ([1d16514](https://github.com/orbcorp/orb-kotlin/commit/1d1651472cb9d475c99e70a95fc922e116139450))
* **client:** added structured fields to errors ([#64](https://github.com/orbcorp/orb-kotlin/issues/64)) ([6fbed34](https://github.com/orbcorp/orb-kotlin/commit/6fbed341cbfe2346250b766002cdcf274afc3489))


### Bug Fixes

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10)) ([8cb42ee](https://github.com/orbcorp/orb-kotlin/commit/8cb42ee21425c2beb88bdaa5cc3094c081bf7f15))
* **docs:** use correct putAdditionalProperty value ([#44](https://github.com/orbcorp/orb-kotlin/issues/44)) ([47731b7](https://github.com/orbcorp/orb-kotlin/commit/47731b7233a36214a42745d4d4a3b0324027b050))
* **unions:** fix namespacing in example types for unions that have models ([3161a77](https://github.com/orbcorp/orb-kotlin/commit/3161a7731236058c2299300c2dbba2b604fb2edf))


### Chores

* consistent string literal escaping ([#49](https://github.com/orbcorp/orb-kotlin/issues/49)) ([22f2365](https://github.com/orbcorp/orb-kotlin/commit/22f23659776f0fb3541d2fbf7ae8789dc4ab417c))
* **docs:** improve Coupon description ([#7](https://github.com/orbcorp/orb-kotlin/issues/7)) ([380b281](https://github.com/orbcorp/orb-kotlin/commit/380b28179cd585f1d114af3e1b53587f1815cd33))
* **docs:** internal update ([#70](https://github.com/orbcorp/orb-kotlin/issues/70)) ([edbf7aa](https://github.com/orbcorp/orb-kotlin/commit/edbf7aa39a26c4573502eb83c99303237f73b46d))
* **docs:** internal update ([#71](https://github.com/orbcorp/orb-kotlin/issues/71)) ([bf80944](https://github.com/orbcorp/orb-kotlin/commit/bf80944259f27763ad97eff1e1fb04936580ba1b))
* **docs:** updates price intervals docs ([#12](https://github.com/orbcorp/orb-kotlin/issues/12)) ([1df4524](https://github.com/orbcorp/orb-kotlin/commit/1df45240a285e7a9f866749883aa263b16c65386))
* gitignore test server logs ([#13](https://github.com/orbcorp/orb-kotlin/issues/13)) ([8870a5f](https://github.com/orbcorp/orb-kotlin/commit/8870a5fe483a79c450c73f6fb7d6ee3aa1c0c0bc))
* **internal:** codegen related update ([#102](https://github.com/orbcorp/orb-kotlin/issues/102)) ([6556c08](https://github.com/orbcorp/orb-kotlin/commit/6556c0809bde8127e38f7e997c9861b1e7a63386))
* **internal:** codegen related update ([#41](https://github.com/orbcorp/orb-kotlin/issues/41)) ([a235c7e](https://github.com/orbcorp/orb-kotlin/commit/a235c7e01e85de5860fc03a4627b437ebc9f7d01))
* **internal:** codegen related update ([#42](https://github.com/orbcorp/orb-kotlin/issues/42)) ([1c5b7f0](https://github.com/orbcorp/orb-kotlin/commit/1c5b7f0f1ea9d34350ce845c5d0c7147b609b640))
* **internal:** codegen related update ([#52](https://github.com/orbcorp/orb-kotlin/issues/52)) ([590a760](https://github.com/orbcorp/orb-kotlin/commit/590a760c3ef8caa623447ad145903bf40d3a69c4))
* **internal:** codegen related update ([#68](https://github.com/orbcorp/orb-kotlin/issues/68)) ([eeca719](https://github.com/orbcorp/orb-kotlin/commit/eeca71903a8ffaaeade3b731ddb01dff2ecd4b03))
* **internal:** codegen related update ([#69](https://github.com/orbcorp/orb-kotlin/issues/69)) ([857bd1e](https://github.com/orbcorp/orb-kotlin/commit/857bd1e37357dc863d3562e1067c44986b68130c))
* **internal:** update example values ([#104](https://github.com/orbcorp/orb-kotlin/issues/104)) ([96cb62b](https://github.com/orbcorp/orb-kotlin/commit/96cb62b75dabc5428b1044085993a8d773a45976))
* **internal:** version bump ([#100](https://github.com/orbcorp/orb-kotlin/issues/100)) ([92fa8af](https://github.com/orbcorp/orb-kotlin/commit/92fa8affc38275df6ac97bd44ee166533453034b))
* **internal:** version bump ([#101](https://github.com/orbcorp/orb-kotlin/issues/101)) ([7aecac4](https://github.com/orbcorp/orb-kotlin/commit/7aecac439e7c3a50fd464a4549acf8e2c70c8540))
* **internal:** version bump ([#83](https://github.com/orbcorp/orb-kotlin/issues/83)) ([a73f398](https://github.com/orbcorp/orb-kotlin/commit/a73f398dab3499444d42366825170bb2b102586c))
* **internal:** version bump ([#99](https://github.com/orbcorp/orb-kotlin/issues/99)) ([d02142b](https://github.com/orbcorp/orb-kotlin/commit/d02142bb4cdffadf26a241cd8a2df2101509f82d))
* rebuild project due to codegen change ([#91](https://github.com/orbcorp/orb-kotlin/issues/91)) ([c0cf2e7](https://github.com/orbcorp/orb-kotlin/commit/c0cf2e7d9a330946dc6d5a55fc6d0698cb9fdf6c))
* rebuild project due to codegen change ([#92](https://github.com/orbcorp/orb-kotlin/issues/92)) ([107691e](https://github.com/orbcorp/orb-kotlin/commit/107691e0bc05f57804a2d1685e764556bf0c5bb3))
* rebuild project due to codegen change ([#94](https://github.com/orbcorp/orb-kotlin/issues/94)) ([a845a3c](https://github.com/orbcorp/orb-kotlin/commit/a845a3c78a5af124477cec26570717d19c1e29ac))
* rebuild project due to codegen change ([#96](https://github.com/orbcorp/orb-kotlin/issues/96)) ([ebaab63](https://github.com/orbcorp/orb-kotlin/commit/ebaab63813297c13de93d53b842c3f73b51fad00))


### Documentation

* adjust additional properties example ([#63](https://github.com/orbcorp/orb-kotlin/issues/63)) ([d2c3f31](https://github.com/orbcorp/orb-kotlin/commit/d2c3f31aac198e7246572606a39a410a6088033e))
* small updates ([#3](https://github.com/orbcorp/orb-kotlin/issues/3)) ([e2bf19e](https://github.com/orbcorp/orb-kotlin/commit/e2bf19e528a6708d95adc698f542987b157da258))

## 0.1.0-alpha.8 (2024-11-19)

Full Changelog: [v0.1.0-alpha.7...v0.1.0-alpha.8](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.7...v0.1.0-alpha.8)

### ⚠ BREAKING CHANGES

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10))
* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2))

### Features

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2)) ([3f044f5](https://github.com/orbcorp/orb-kotlin/commit/3f044f5b2e67960efb83d7b3cc3ee9bc2f64c7c7))
* **api:** add support for adding allocation price to subscription ([#8](https://github.com/orbcorp/orb-kotlin/issues/8)) ([94987f0](https://github.com/orbcorp/orb-kotlin/commit/94987f0818bd8d1bad183a3d5b9f9797332094d5))
* **api:** add support for query param include_all_blocks ([#11](https://github.com/orbcorp/orb-kotlin/issues/11)) ([ce06e75](https://github.com/orbcorp/orb-kotlin/commit/ce06e75c9ef65f52c9aa9b8289248ee22cc61b38))
* **api:** api update ([#75](https://github.com/orbcorp/orb-kotlin/issues/75)) ([408cb08](https://github.com/orbcorp/orb-kotlin/commit/408cb085dca8eea9d139d8fa91d1760f2f79ca80))
* **api:** api update ([#76](https://github.com/orbcorp/orb-kotlin/issues/76)) ([9a6b8c3](https://github.com/orbcorp/orb-kotlin/commit/9a6b8c32c6d0357c2510302821b2a4653c9dd772))
* **api:** api update ([#77](https://github.com/orbcorp/orb-kotlin/issues/77)) ([21ef9ef](https://github.com/orbcorp/orb-kotlin/commit/21ef9ef2e41387213f982a9241bf0daa9fe8b917))
* **api:** api update ([#78](https://github.com/orbcorp/orb-kotlin/issues/78)) ([076913c](https://github.com/orbcorp/orb-kotlin/commit/076913c47f73eab463a1d6a6d4cd4774e8c1a3b6))
* **api:** api update ([#79](https://github.com/orbcorp/orb-kotlin/issues/79)) ([897b6af](https://github.com/orbcorp/orb-kotlin/commit/897b6af3ba118ff9056554b38b4321ade6d1c9c8))
* **api:** api update ([#80](https://github.com/orbcorp/orb-kotlin/issues/80)) ([7b1e076](https://github.com/orbcorp/orb-kotlin/commit/7b1e076553df1ae0591e923a89a4c6996c9d1eb8))
* **api:** api update ([#81](https://github.com/orbcorp/orb-kotlin/issues/81)) ([8c187b4](https://github.com/orbcorp/orb-kotlin/commit/8c187b448e3bcbe175ed823cabfe44397f1f7c0d))
* **api:** api update ([#84](https://github.com/orbcorp/orb-kotlin/issues/84)) ([ae64e17](https://github.com/orbcorp/orb-kotlin/commit/ae64e171977e3d54a14d795d6da4eb42461203e8))
* **api:** api update ([#86](https://github.com/orbcorp/orb-kotlin/issues/86)) ([dadd8e6](https://github.com/orbcorp/orb-kotlin/commit/dadd8e65180869e7661964622880aeed8d93d2aa))
* **api:** api update ([#87](https://github.com/orbcorp/orb-kotlin/issues/87)) ([a6e5e5c](https://github.com/orbcorp/orb-kotlin/commit/a6e5e5c10be5199408535d021fad489962eae79d))
* **api:** api update ([#88](https://github.com/orbcorp/orb-kotlin/issues/88)) ([df0ce63](https://github.com/orbcorp/orb-kotlin/commit/df0ce63d99cc478e95dfd9d3acdf07cea7d24ed0))
* **api:** api update ([#89](https://github.com/orbcorp/orb-kotlin/issues/89)) ([f8bf75e](https://github.com/orbcorp/orb-kotlin/commit/f8bf75e501e00a1abd134808ba6ab8119b746445))
* **api:** api update ([#90](https://github.com/orbcorp/orb-kotlin/issues/90)) ([6747d37](https://github.com/orbcorp/orb-kotlin/commit/6747d37c455690ebfd124731cc216c486bb3c6e9))
* **api:** api update ([#95](https://github.com/orbcorp/orb-kotlin/issues/95)) ([f1af6fb](https://github.com/orbcorp/orb-kotlin/commit/f1af6fb71e26d2b5475a07b3555c8d628c99026a))
* **api:** codegen changes ([#39](https://github.com/orbcorp/orb-kotlin/issues/39)) ([fe78ca9](https://github.com/orbcorp/orb-kotlin/commit/fe78ca9c7802faff94bf9c2852146da8df95604e))
* **api:** codegen changes ([#48](https://github.com/orbcorp/orb-kotlin/issues/48)) ([c761aa7](https://github.com/orbcorp/orb-kotlin/commit/c761aa783b57d19811bfc1444dc3ed9b0d7d9333))
* **api:** external connections made optional when updating items ([#9](https://github.com/orbcorp/orb-kotlin/issues/9)) ([f12c785](https://github.com/orbcorp/orb-kotlin/commit/f12c785d390719ae9505de0b802f1ae07a01c2be))
* **api:** manual updates ([#40](https://github.com/orbcorp/orb-kotlin/issues/40)) ([f48f51d](https://github.com/orbcorp/orb-kotlin/commit/f48f51d447ff991702967ec74856014e86dddead))
* **api:** OpenAPI spec update via Stainless API ([#31](https://github.com/orbcorp/orb-kotlin/issues/31)) ([3a0a24f](https://github.com/orbcorp/orb-kotlin/commit/3a0a24fbaab281d10e61c0ddefa4d3c4af1c7ed3))
* **api:** OpenAPI spec update via Stainless API ([#34](https://github.com/orbcorp/orb-kotlin/issues/34)) ([08810c4](https://github.com/orbcorp/orb-kotlin/commit/08810c4a992b2fc97124ffe48b0c63587e11151a))
* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/orbcorp/orb-kotlin/issues/36)) ([c8f652a](https://github.com/orbcorp/orb-kotlin/commit/c8f652a950a6a891cec8fbab0037003a72bf7c38))
* **api:** OpenAPI spec update via Stainless API ([#37](https://github.com/orbcorp/orb-kotlin/issues/37)) ([4eb6fd3](https://github.com/orbcorp/orb-kotlin/commit/4eb6fd330e75800fbbd0a2de90b566916cec9ee3))
* **api:** OpenAPI spec update via Stainless API ([#38](https://github.com/orbcorp/orb-kotlin/issues/38)) ([757858a](https://github.com/orbcorp/orb-kotlin/commit/757858aab6322b97d8032c50fa9563270a976dce))
* **api:** OpenAPI spec update via Stainless API ([#43](https://github.com/orbcorp/orb-kotlin/issues/43)) ([9dbc27f](https://github.com/orbcorp/orb-kotlin/commit/9dbc27f38ae14c89a924ed5f6b9d770ca7bd857a))
* **api:** OpenAPI spec update via Stainless API ([#45](https://github.com/orbcorp/orb-kotlin/issues/45)) ([3e12982](https://github.com/orbcorp/orb-kotlin/commit/3e12982af6fe3c32a667da98646089fa8bcc04d5))
* **api:** OpenAPI spec update via Stainless API ([#47](https://github.com/orbcorp/orb-kotlin/issues/47)) ([2651152](https://github.com/orbcorp/orb-kotlin/commit/2651152284fb1036ebdc428cd9171fce643ccc56))
* **api:** OpenAPI spec update via Stainless API ([#50](https://github.com/orbcorp/orb-kotlin/issues/50)) ([a297a32](https://github.com/orbcorp/orb-kotlin/commit/a297a32305e286825ec8602d3c5625b0eaaa2886))
* **api:** OpenAPI spec update via Stainless API ([#51](https://github.com/orbcorp/orb-kotlin/issues/51)) ([1165133](https://github.com/orbcorp/orb-kotlin/commit/11651334ba2b9d777ca11dd24fb954c52cb0e8fc))
* **api:** OpenAPI spec update via Stainless API ([#53](https://github.com/orbcorp/orb-kotlin/issues/53)) ([da12578](https://github.com/orbcorp/orb-kotlin/commit/da125787164c40bf43765db67b4b6e58831477bb))
* **api:** OpenAPI spec update via Stainless API ([#54](https://github.com/orbcorp/orb-kotlin/issues/54)) ([8410b5c](https://github.com/orbcorp/orb-kotlin/commit/8410b5c99cddf5948cf2acdc6d31d04edd5bdb76))
* **api:** OpenAPI spec update via Stainless API ([#55](https://github.com/orbcorp/orb-kotlin/issues/55)) ([a9693dd](https://github.com/orbcorp/orb-kotlin/commit/a9693ddfd4950511ebc202d5ced3898b3a19aa3b))
* **api:** OpenAPI spec update via Stainless API ([#56](https://github.com/orbcorp/orb-kotlin/issues/56)) ([d007aaf](https://github.com/orbcorp/orb-kotlin/commit/d007aaf571cc97312b7a13df1cc341d583c7f2fb))
* **api:** OpenAPI spec update via Stainless API ([#57](https://github.com/orbcorp/orb-kotlin/issues/57)) ([13f8644](https://github.com/orbcorp/orb-kotlin/commit/13f8644e4a392f35f266dd396949508176b874a3))
* **api:** OpenAPI spec update via Stainless API ([#59](https://github.com/orbcorp/orb-kotlin/issues/59)) ([e8c47fd](https://github.com/orbcorp/orb-kotlin/commit/e8c47fd6e893f35cd8107e8c1a130fdfdc5278ee))
* **api:** OpenAPI spec update via Stainless API ([#61](https://github.com/orbcorp/orb-kotlin/issues/61)) ([0dd9425](https://github.com/orbcorp/orb-kotlin/commit/0dd9425c3063486582876237f0128d47982501bb))
* **api:** OpenAPI spec update via Stainless API ([#62](https://github.com/orbcorp/orb-kotlin/issues/62)) ([1607065](https://github.com/orbcorp/orb-kotlin/commit/16070655425bce16a25d038c9f550ab1b9ac6349))
* **api:** OpenAPI spec update via Stainless API ([#65](https://github.com/orbcorp/orb-kotlin/issues/65)) ([3266176](https://github.com/orbcorp/orb-kotlin/commit/3266176fa9b5ef23cb1e66494eca59646b8e0144))
* **api:** OpenAPI spec update via Stainless API ([#66](https://github.com/orbcorp/orb-kotlin/issues/66)) ([545f0da](https://github.com/orbcorp/orb-kotlin/commit/545f0da331ddefcf3fe99f7b6c2595a532eaf9a5))
* **api:** OpenAPI spec update via Stainless API ([#67](https://github.com/orbcorp/orb-kotlin/issues/67)) ([7316f84](https://github.com/orbcorp/orb-kotlin/commit/7316f84f6b64ab43ce97060915a239ef1fab4703))
* **api:** OpenAPI spec update via Stainless API ([#72](https://github.com/orbcorp/orb-kotlin/issues/72)) ([849bb2a](https://github.com/orbcorp/orb-kotlin/commit/849bb2a098e2533d156849fcdee89a2a23586bdc))
* **api:** OpenAPI spec update via Stainless API ([#73](https://github.com/orbcorp/orb-kotlin/issues/73)) ([7665415](https://github.com/orbcorp/orb-kotlin/commit/7665415ab15abbe1ea5f5b86d58d3ae96eded1b7))
* **api:** OpenAPI spec update via Stainless API ([#74](https://github.com/orbcorp/orb-kotlin/issues/74)) ([3194456](https://github.com/orbcorp/orb-kotlin/commit/319445610de5397a9a181e275989384046fee7de))
* **api:** updates ([#5](https://github.com/orbcorp/orb-kotlin/issues/5)) ([2c0c8e8](https://github.com/orbcorp/orb-kotlin/commit/2c0c8e8af82300b3caa9f58fd2aa0ba0c60ca388))
* **api:** webhook helpers ([#93](https://github.com/orbcorp/orb-kotlin/issues/93)) ([1a03014](https://github.com/orbcorp/orb-kotlin/commit/1a030149e27880c58fb99b75016181303ad5288a))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#6](https://github.com/orbcorp/orb-kotlin/issues/6)) ([1d16514](https://github.com/orbcorp/orb-kotlin/commit/1d1651472cb9d475c99e70a95fc922e116139450))
* **client:** added structured fields to errors ([#64](https://github.com/orbcorp/orb-kotlin/issues/64)) ([6fbed34](https://github.com/orbcorp/orb-kotlin/commit/6fbed341cbfe2346250b766002cdcf274afc3489))


### Bug Fixes

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10)) ([8cb42ee](https://github.com/orbcorp/orb-kotlin/commit/8cb42ee21425c2beb88bdaa5cc3094c081bf7f15))
* **docs:** use correct putAdditionalProperty value ([#44](https://github.com/orbcorp/orb-kotlin/issues/44)) ([47731b7](https://github.com/orbcorp/orb-kotlin/commit/47731b7233a36214a42745d4d4a3b0324027b050))
* **unions:** fix namespacing in example types for unions that have models ([3161a77](https://github.com/orbcorp/orb-kotlin/commit/3161a7731236058c2299300c2dbba2b604fb2edf))


### Chores

* consistent string literal escaping ([#49](https://github.com/orbcorp/orb-kotlin/issues/49)) ([22f2365](https://github.com/orbcorp/orb-kotlin/commit/22f23659776f0fb3541d2fbf7ae8789dc4ab417c))
* **docs:** improve Coupon description ([#7](https://github.com/orbcorp/orb-kotlin/issues/7)) ([380b281](https://github.com/orbcorp/orb-kotlin/commit/380b28179cd585f1d114af3e1b53587f1815cd33))
* **docs:** internal update ([#70](https://github.com/orbcorp/orb-kotlin/issues/70)) ([edbf7aa](https://github.com/orbcorp/orb-kotlin/commit/edbf7aa39a26c4573502eb83c99303237f73b46d))
* **docs:** internal update ([#71](https://github.com/orbcorp/orb-kotlin/issues/71)) ([bf80944](https://github.com/orbcorp/orb-kotlin/commit/bf80944259f27763ad97eff1e1fb04936580ba1b))
* **docs:** updates price intervals docs ([#12](https://github.com/orbcorp/orb-kotlin/issues/12)) ([1df4524](https://github.com/orbcorp/orb-kotlin/commit/1df45240a285e7a9f866749883aa263b16c65386))
* gitignore test server logs ([#13](https://github.com/orbcorp/orb-kotlin/issues/13)) ([8870a5f](https://github.com/orbcorp/orb-kotlin/commit/8870a5fe483a79c450c73f6fb7d6ee3aa1c0c0bc))
* **internal:** codegen related update ([#41](https://github.com/orbcorp/orb-kotlin/issues/41)) ([a235c7e](https://github.com/orbcorp/orb-kotlin/commit/a235c7e01e85de5860fc03a4627b437ebc9f7d01))
* **internal:** codegen related update ([#42](https://github.com/orbcorp/orb-kotlin/issues/42)) ([1c5b7f0](https://github.com/orbcorp/orb-kotlin/commit/1c5b7f0f1ea9d34350ce845c5d0c7147b609b640))
* **internal:** codegen related update ([#52](https://github.com/orbcorp/orb-kotlin/issues/52)) ([590a760](https://github.com/orbcorp/orb-kotlin/commit/590a760c3ef8caa623447ad145903bf40d3a69c4))
* **internal:** codegen related update ([#68](https://github.com/orbcorp/orb-kotlin/issues/68)) ([eeca719](https://github.com/orbcorp/orb-kotlin/commit/eeca71903a8ffaaeade3b731ddb01dff2ecd4b03))
* **internal:** codegen related update ([#69](https://github.com/orbcorp/orb-kotlin/issues/69)) ([857bd1e](https://github.com/orbcorp/orb-kotlin/commit/857bd1e37357dc863d3562e1067c44986b68130c))
* **internal:** version bump ([#83](https://github.com/orbcorp/orb-kotlin/issues/83)) ([a73f398](https://github.com/orbcorp/orb-kotlin/commit/a73f398dab3499444d42366825170bb2b102586c))
* rebuild project due to codegen change ([#91](https://github.com/orbcorp/orb-kotlin/issues/91)) ([c0cf2e7](https://github.com/orbcorp/orb-kotlin/commit/c0cf2e7d9a330946dc6d5a55fc6d0698cb9fdf6c))
* rebuild project due to codegen change ([#92](https://github.com/orbcorp/orb-kotlin/issues/92)) ([107691e](https://github.com/orbcorp/orb-kotlin/commit/107691e0bc05f57804a2d1685e764556bf0c5bb3))
* rebuild project due to codegen change ([#94](https://github.com/orbcorp/orb-kotlin/issues/94)) ([a845a3c](https://github.com/orbcorp/orb-kotlin/commit/a845a3c78a5af124477cec26570717d19c1e29ac))
* rebuild project due to codegen change ([#96](https://github.com/orbcorp/orb-kotlin/issues/96)) ([ebaab63](https://github.com/orbcorp/orb-kotlin/commit/ebaab63813297c13de93d53b842c3f73b51fad00))


### Documentation

* adjust additional properties example ([#63](https://github.com/orbcorp/orb-kotlin/issues/63)) ([d2c3f31](https://github.com/orbcorp/orb-kotlin/commit/d2c3f31aac198e7246572606a39a410a6088033e))
* small updates ([#3](https://github.com/orbcorp/orb-kotlin/issues/3)) ([e2bf19e](https://github.com/orbcorp/orb-kotlin/commit/e2bf19e528a6708d95adc698f542987b157da258))

## 0.1.0-alpha.7 (2024-10-25)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Features

* **api:** api update ([#75](https://github.com/orbcorp/orb-kotlin/issues/75)) ([408cb08](https://github.com/orbcorp/orb-kotlin/commit/408cb085dca8eea9d139d8fa91d1760f2f79ca80))
* **api:** api update ([#76](https://github.com/orbcorp/orb-kotlin/issues/76)) ([9a6b8c3](https://github.com/orbcorp/orb-kotlin/commit/9a6b8c32c6d0357c2510302821b2a4653c9dd772))
* **api:** api update ([#77](https://github.com/orbcorp/orb-kotlin/issues/77)) ([21ef9ef](https://github.com/orbcorp/orb-kotlin/commit/21ef9ef2e41387213f982a9241bf0daa9fe8b917))
* **api:** api update ([#78](https://github.com/orbcorp/orb-kotlin/issues/78)) ([076913c](https://github.com/orbcorp/orb-kotlin/commit/076913c47f73eab463a1d6a6d4cd4774e8c1a3b6))
* **api:** api update ([#79](https://github.com/orbcorp/orb-kotlin/issues/79)) ([897b6af](https://github.com/orbcorp/orb-kotlin/commit/897b6af3ba118ff9056554b38b4321ade6d1c9c8))
* **api:** api update ([#80](https://github.com/orbcorp/orb-kotlin/issues/80)) ([7b1e076](https://github.com/orbcorp/orb-kotlin/commit/7b1e076553df1ae0591e923a89a4c6996c9d1eb8))
* **api:** api update ([#81](https://github.com/orbcorp/orb-kotlin/issues/81)) ([8c187b4](https://github.com/orbcorp/orb-kotlin/commit/8c187b448e3bcbe175ed823cabfe44397f1f7c0d))
* **api:** OpenAPI spec update via Stainless API ([#59](https://github.com/orbcorp/orb-kotlin/issues/59)) ([e8c47fd](https://github.com/orbcorp/orb-kotlin/commit/e8c47fd6e893f35cd8107e8c1a130fdfdc5278ee))
* **api:** OpenAPI spec update via Stainless API ([#61](https://github.com/orbcorp/orb-kotlin/issues/61)) ([0dd9425](https://github.com/orbcorp/orb-kotlin/commit/0dd9425c3063486582876237f0128d47982501bb))
* **api:** OpenAPI spec update via Stainless API ([#62](https://github.com/orbcorp/orb-kotlin/issues/62)) ([1607065](https://github.com/orbcorp/orb-kotlin/commit/16070655425bce16a25d038c9f550ab1b9ac6349))
* **api:** OpenAPI spec update via Stainless API ([#65](https://github.com/orbcorp/orb-kotlin/issues/65)) ([3266176](https://github.com/orbcorp/orb-kotlin/commit/3266176fa9b5ef23cb1e66494eca59646b8e0144))
* **api:** OpenAPI spec update via Stainless API ([#66](https://github.com/orbcorp/orb-kotlin/issues/66)) ([545f0da](https://github.com/orbcorp/orb-kotlin/commit/545f0da331ddefcf3fe99f7b6c2595a532eaf9a5))
* **api:** OpenAPI spec update via Stainless API ([#67](https://github.com/orbcorp/orb-kotlin/issues/67)) ([7316f84](https://github.com/orbcorp/orb-kotlin/commit/7316f84f6b64ab43ce97060915a239ef1fab4703))
* **api:** OpenAPI spec update via Stainless API ([#72](https://github.com/orbcorp/orb-kotlin/issues/72)) ([849bb2a](https://github.com/orbcorp/orb-kotlin/commit/849bb2a098e2533d156849fcdee89a2a23586bdc))
* **api:** OpenAPI spec update via Stainless API ([#73](https://github.com/orbcorp/orb-kotlin/issues/73)) ([7665415](https://github.com/orbcorp/orb-kotlin/commit/7665415ab15abbe1ea5f5b86d58d3ae96eded1b7))
* **api:** OpenAPI spec update via Stainless API ([#74](https://github.com/orbcorp/orb-kotlin/issues/74)) ([3194456](https://github.com/orbcorp/orb-kotlin/commit/319445610de5397a9a181e275989384046fee7de))
* **client:** added structured fields to errors ([#64](https://github.com/orbcorp/orb-kotlin/issues/64)) ([6fbed34](https://github.com/orbcorp/orb-kotlin/commit/6fbed341cbfe2346250b766002cdcf274afc3489))


### Chores

* **docs:** internal update ([#70](https://github.com/orbcorp/orb-kotlin/issues/70)) ([edbf7aa](https://github.com/orbcorp/orb-kotlin/commit/edbf7aa39a26c4573502eb83c99303237f73b46d))
* **docs:** internal update ([#71](https://github.com/orbcorp/orb-kotlin/issues/71)) ([bf80944](https://github.com/orbcorp/orb-kotlin/commit/bf80944259f27763ad97eff1e1fb04936580ba1b))
* **internal:** codegen related update ([#68](https://github.com/orbcorp/orb-kotlin/issues/68)) ([eeca719](https://github.com/orbcorp/orb-kotlin/commit/eeca71903a8ffaaeade3b731ddb01dff2ecd4b03))
* **internal:** codegen related update ([#69](https://github.com/orbcorp/orb-kotlin/issues/69)) ([857bd1e](https://github.com/orbcorp/orb-kotlin/commit/857bd1e37357dc863d3562e1067c44986b68130c))


### Documentation

* adjust additional properties example ([#63](https://github.com/orbcorp/orb-kotlin/issues/63)) ([d2c3f31](https://github.com/orbcorp/orb-kotlin/commit/d2c3f31aac198e7246572606a39a410a6088033e))

## 0.1.0-alpha.6 (2024-09-06)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* **api:** codegen changes ([#48](https://github.com/orbcorp/orb-kotlin/issues/48)) ([c761aa7](https://github.com/orbcorp/orb-kotlin/commit/c761aa783b57d19811bfc1444dc3ed9b0d7d9333))
* **api:** OpenAPI spec update via Stainless API ([#45](https://github.com/orbcorp/orb-kotlin/issues/45)) ([3e12982](https://github.com/orbcorp/orb-kotlin/commit/3e12982af6fe3c32a667da98646089fa8bcc04d5))
* **api:** OpenAPI spec update via Stainless API ([#47](https://github.com/orbcorp/orb-kotlin/issues/47)) ([2651152](https://github.com/orbcorp/orb-kotlin/commit/2651152284fb1036ebdc428cd9171fce643ccc56))
* **api:** OpenAPI spec update via Stainless API ([#50](https://github.com/orbcorp/orb-kotlin/issues/50)) ([a297a32](https://github.com/orbcorp/orb-kotlin/commit/a297a32305e286825ec8602d3c5625b0eaaa2886))
* **api:** OpenAPI spec update via Stainless API ([#51](https://github.com/orbcorp/orb-kotlin/issues/51)) ([1165133](https://github.com/orbcorp/orb-kotlin/commit/11651334ba2b9d777ca11dd24fb954c52cb0e8fc))
* **api:** OpenAPI spec update via Stainless API ([#53](https://github.com/orbcorp/orb-kotlin/issues/53)) ([da12578](https://github.com/orbcorp/orb-kotlin/commit/da125787164c40bf43765db67b4b6e58831477bb))
* **api:** OpenAPI spec update via Stainless API ([#54](https://github.com/orbcorp/orb-kotlin/issues/54)) ([8410b5c](https://github.com/orbcorp/orb-kotlin/commit/8410b5c99cddf5948cf2acdc6d31d04edd5bdb76))
* **api:** OpenAPI spec update via Stainless API ([#55](https://github.com/orbcorp/orb-kotlin/issues/55)) ([a9693dd](https://github.com/orbcorp/orb-kotlin/commit/a9693ddfd4950511ebc202d5ced3898b3a19aa3b))
* **api:** OpenAPI spec update via Stainless API ([#56](https://github.com/orbcorp/orb-kotlin/issues/56)) ([d007aaf](https://github.com/orbcorp/orb-kotlin/commit/d007aaf571cc97312b7a13df1cc341d583c7f2fb))
* **api:** OpenAPI spec update via Stainless API ([#57](https://github.com/orbcorp/orb-kotlin/issues/57)) ([13f8644](https://github.com/orbcorp/orb-kotlin/commit/13f8644e4a392f35f266dd396949508176b874a3))


### Chores

* consistent string literal escaping ([#49](https://github.com/orbcorp/orb-kotlin/issues/49)) ([22f2365](https://github.com/orbcorp/orb-kotlin/commit/22f23659776f0fb3541d2fbf7ae8789dc4ab417c))
* **internal:** codegen related update ([#52](https://github.com/orbcorp/orb-kotlin/issues/52)) ([590a760](https://github.com/orbcorp/orb-kotlin/commit/590a760c3ef8caa623447ad145903bf40d3a69c4))

## 0.1.0-alpha.5 (2024-08-22)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* **api:** codegen changes ([#39](https://github.com/orbcorp/orb-kotlin/issues/39)) ([fe78ca9](https://github.com/orbcorp/orb-kotlin/commit/fe78ca9c7802faff94bf9c2852146da8df95604e))
* **api:** manual updates ([#40](https://github.com/orbcorp/orb-kotlin/issues/40)) ([f48f51d](https://github.com/orbcorp/orb-kotlin/commit/f48f51d447ff991702967ec74856014e86dddead))
* **api:** OpenAPI spec update via Stainless API ([#34](https://github.com/orbcorp/orb-kotlin/issues/34)) ([08810c4](https://github.com/orbcorp/orb-kotlin/commit/08810c4a992b2fc97124ffe48b0c63587e11151a))
* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/orbcorp/orb-kotlin/issues/36)) ([c8f652a](https://github.com/orbcorp/orb-kotlin/commit/c8f652a950a6a891cec8fbab0037003a72bf7c38))
* **api:** OpenAPI spec update via Stainless API ([#37](https://github.com/orbcorp/orb-kotlin/issues/37)) ([4eb6fd3](https://github.com/orbcorp/orb-kotlin/commit/4eb6fd330e75800fbbd0a2de90b566916cec9ee3))
* **api:** OpenAPI spec update via Stainless API ([#38](https://github.com/orbcorp/orb-kotlin/issues/38)) ([757858a](https://github.com/orbcorp/orb-kotlin/commit/757858aab6322b97d8032c50fa9563270a976dce))
* **api:** OpenAPI spec update via Stainless API ([#43](https://github.com/orbcorp/orb-kotlin/issues/43)) ([9dbc27f](https://github.com/orbcorp/orb-kotlin/commit/9dbc27f38ae14c89a924ed5f6b9d770ca7bd857a))


### Bug Fixes

* **docs:** use correct putAdditionalProperty value ([#44](https://github.com/orbcorp/orb-kotlin/issues/44)) ([47731b7](https://github.com/orbcorp/orb-kotlin/commit/47731b7233a36214a42745d4d4a3b0324027b050))


### Chores

* **internal:** codegen related update ([#41](https://github.com/orbcorp/orb-kotlin/issues/41)) ([a235c7e](https://github.com/orbcorp/orb-kotlin/commit/a235c7e01e85de5860fc03a4627b437ebc9f7d01))
* **internal:** codegen related update ([#42](https://github.com/orbcorp/orb-kotlin/issues/42)) ([1c5b7f0](https://github.com/orbcorp/orb-kotlin/commit/1c5b7f0f1ea9d34350ce845c5d0c7147b609b640))

## 0.1.0-alpha.4 (2024-08-14)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **api:** OpenAPI spec update via Stainless API ([#31](https://github.com/orbcorp/orb-kotlin/issues/31)) ([3a0a24f](https://github.com/orbcorp/orb-kotlin/commit/3a0a24fbaab281d10e61c0ddefa4d3c4af1c7ed3))

## 0.1.0-alpha.3 (2024-08-02)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### ⚠ BREAKING CHANGES

* **api:** remove methods 'customers.usage.create' and 'customers.usage.update_by_external_id' ([#30](https://github.com/orbcorp/orb-kotlin/issues/30))

### Features

* **api:** add 'status' to plan creation params ([#14](https://github.com/orbcorp/orb-kotlin/issues/14)) ([125924a](https://github.com/orbcorp/orb-kotlin/commit/125924ab4496c72408a55a199562984c4becc9c8))
* **api:** add cadence enum value 'custom' ([#25](https://github.com/orbcorp/orb-kotlin/issues/25)) ([847e046](https://github.com/orbcorp/orb-kotlin/commit/847e0462d2585ac32a83e8ea48d0e0e1dfc89d61))
* **api:** add methods to prices and invoices ([#21](https://github.com/orbcorp/orb-kotlin/issues/21)) ([e4169ae](https://github.com/orbcorp/orb-kotlin/commit/e4169aee3d2ca6e8773c55e2aa9b7beb9aa7baa9))
* **api:** deprecate methods 'customers.usage.create' and 'customers.usage.update_by_external_id' ([#29](https://github.com/orbcorp/orb-kotlin/issues/29)) ([41ff2f7](https://github.com/orbcorp/orb-kotlin/commit/41ff2f76b8b125177ad906ec04b10081fdb12524))
* **api:** remove methods 'customers.usage.create' and 'customers.usage.update_by_external_id' ([#30](https://github.com/orbcorp/orb-kotlin/issues/30)) ([9c9f653](https://github.com/orbcorp/orb-kotlin/commit/9c9f65361fe9d35df7d244f826446b466049f746))
* **client:** improve binary return values ([#27](https://github.com/orbcorp/orb-kotlin/issues/27)) ([e6fc27a](https://github.com/orbcorp/orb-kotlin/commit/e6fc27a603cdf21e1226d5ab90983c70b8bda82f))


### Chores

* **ci:** also run workflows for PRs targeting `next` ([#17](https://github.com/orbcorp/orb-kotlin/issues/17)) ([446a7ab](https://github.com/orbcorp/orb-kotlin/commit/446a7ab4ad8c246225c717057b334e6b01cbcf11))
* **ci:** limit release doctor target branches ([#22](https://github.com/orbcorp/orb-kotlin/issues/22)) ([25a2792](https://github.com/orbcorp/orb-kotlin/commit/25a2792c1dbcfe6ebf3ad2547f5fb111a1e99b9a))
* **ci:** run tests in CI ([#28](https://github.com/orbcorp/orb-kotlin/issues/28)) ([83b1878](https://github.com/orbcorp/orb-kotlin/commit/83b187890337ea30cf114d849d954b32d84921d3))
* **docs:** document minimum Java version (Java 8) in README ([#16](https://github.com/orbcorp/orb-kotlin/issues/16)) ([b4ac601](https://github.com/orbcorp/orb-kotlin/commit/b4ac601069f6856114810b2cada345830455a0f5))
* **docs:** minor update to formatting of API link in README ([#19](https://github.com/orbcorp/orb-kotlin/issues/19)) ([8d9dbcd](https://github.com/orbcorp/orb-kotlin/commit/8d9dbcda98ee75b604dafc027c10b33443e1577c))
* **internal:** refactor release doctor script ([#23](https://github.com/orbcorp/orb-kotlin/issues/23)) ([bc19329](https://github.com/orbcorp/orb-kotlin/commit/bc1932991380f98d1473f24d82323c2a594b7e07))
* **internal:** remove unused test file ([#26](https://github.com/orbcorp/orb-kotlin/issues/26)) ([908c31a](https://github.com/orbcorp/orb-kotlin/commit/908c31a03f64fc5a466f9e00aab3c5099542140a))
* minor updates ([#20](https://github.com/orbcorp/orb-kotlin/issues/20)) ([fe32256](https://github.com/orbcorp/orb-kotlin/commit/fe32256d5e3c345eb14d635e4e3a2f2bf0817aca))
* **tests:** update prism version ([#24](https://github.com/orbcorp/orb-kotlin/issues/24)) ([8c504c5](https://github.com/orbcorp/orb-kotlin/commit/8c504c57ede34c81004ba1f120669b03d35805a7))


### Documentation

* **examples:** update example values ([#18](https://github.com/orbcorp/orb-kotlin/issues/18)) ([e203681](https://github.com/orbcorp/orb-kotlin/commit/e203681e57de68b99012ee0a7e391b5bd5d929e2))

## 0.1.0-alpha.2 (2024-06-28)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/orbcorp/orb-kotlin/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### ⚠ BREAKING CHANGES

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10))

### Features

* **api:** add support for adding allocation price to subscription ([#8](https://github.com/orbcorp/orb-kotlin/issues/8)) ([94987f0](https://github.com/orbcorp/orb-kotlin/commit/94987f0818bd8d1bad183a3d5b9f9797332094d5))
* **api:** add support for query param include_all_blocks ([#11](https://github.com/orbcorp/orb-kotlin/issues/11)) ([ce06e75](https://github.com/orbcorp/orb-kotlin/commit/ce06e75c9ef65f52c9aa9b8289248ee22cc61b38))
* **api:** external connections made optional when updating items ([#9](https://github.com/orbcorp/orb-kotlin/issues/9)) ([f12c785](https://github.com/orbcorp/orb-kotlin/commit/f12c785d390719ae9505de0b802f1ae07a01c2be))
* **api:** updates ([#5](https://github.com/orbcorp/orb-kotlin/issues/5)) ([2c0c8e8](https://github.com/orbcorp/orb-kotlin/commit/2c0c8e8af82300b3caa9f58fd2aa0ba0c60ca388))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#6](https://github.com/orbcorp/orb-kotlin/issues/6)) ([1d16514](https://github.com/orbcorp/orb-kotlin/commit/1d1651472cb9d475c99e70a95fc922e116139450))


### Bug Fixes

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-kotlin/issues/10)) ([8cb42ee](https://github.com/orbcorp/orb-kotlin/commit/8cb42ee21425c2beb88bdaa5cc3094c081bf7f15))


### Chores

* **docs:** improve Coupon description ([#7](https://github.com/orbcorp/orb-kotlin/issues/7)) ([380b281](https://github.com/orbcorp/orb-kotlin/commit/380b28179cd585f1d114af3e1b53587f1815cd33))
* **docs:** updates price intervals docs ([#12](https://github.com/orbcorp/orb-kotlin/issues/12)) ([1df4524](https://github.com/orbcorp/orb-kotlin/commit/1df45240a285e7a9f866749883aa263b16c65386))
* gitignore test server logs ([#13](https://github.com/orbcorp/orb-kotlin/issues/13)) ([8870a5f](https://github.com/orbcorp/orb-kotlin/commit/8870a5fe483a79c450c73f6fb7d6ee3aa1c0c0bc))


### Documentation

* small updates ([#3](https://github.com/orbcorp/orb-kotlin/issues/3)) ([e2bf19e](https://github.com/orbcorp/orb-kotlin/commit/e2bf19e528a6708d95adc698f542987b157da258))

## 0.1.0-alpha.1 (2024-06-06)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/orbcorp/orb-kotlin/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### ⚠ BREAKING CHANGES

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2))

### Features

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-kotlin/issues/2)) ([afec5f5](https://github.com/orbcorp/orb-kotlin/commit/afec5f5381075e78fb8ad2d80e8c64a42cfadbbf))


### Bug Fixes

* **unions:** fix namespacing in example types for unions that have models ([3161a77](https://github.com/orbcorp/orb-kotlin/commit/3161a7731236058c2299300c2dbba2b604fb2edf))
