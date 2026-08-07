# Changelog

## [1.26.0](https://github.com/orbcorp/orb-kotlin/compare/v1.25.0...v1.26.0) (2026-08-07)


### Features

* **api:** api update ([75a940c](https://github.com/orbcorp/orb-kotlin/commit/75a940c2ed4663fb96f0266a943d18d632ad0866))

## [1.25.0](https://github.com/orbcorp/orb-kotlin/compare/v1.24.0...v1.25.0) (2026-08-05)


### Features

* **api:** add `grouped_tiered_matrix` price model for per-dimension tiered rates ([9e6fd9b](https://github.com/orbcorp/orb-kotlin/commit/9e6fd9b0ebf586fe398f9784e9a5152a1298d99c))

## [1.24.0](https://github.com/orbcorp/orb-kotlin/compare/v1.23.0...v1.24.0) (2026-08-04)


### Features

* **api:** api update ([3c5ad8b](https://github.com/orbcorp/orb-kotlin/commit/3c5ad8b052e25a0f5788cc2fee4d39be1b8254dd))
* **api:** api update ([3c5ad8b](https://github.com/orbcorp/orb-kotlin/commit/3c5ad8b052e25a0f5788cc2fee4d39be1b8254dd))
* **api:** api update ([3c5ad8b](https://github.com/orbcorp/orb-kotlin/commit/3c5ad8b052e25a0f5788cc2fee4d39be1b8254dd))


### Bug Fixes

* **api:** correct next_attempt_at accuracy in invoice auto-collection response ([3c5ad8b](https://github.com/orbcorp/orb-kotlin/commit/3c5ad8b052e25a0f5788cc2fee4d39be1b8254dd))

## [1.23.0](https://github.com/orbcorp/orb-kotlin/compare/v1.22.0...v1.23.0) (2026-08-01)


### Features

* **api:** api update ([2728b9f](https://github.com/orbcorp/orb-kotlin/commit/2728b9f632f5513e690c05f2510e067573fda246))

## [1.22.0](https://github.com/orbcorp/orb-kotlin/compare/v1.21.0...v1.22.0) (2026-07-31)


### Features

* **api:** add endpoint to create plan-level alerts ([2ac20b0](https://github.com/orbcorp/orb-kotlin/commit/2ac20b0d02c96d82fe39b3da3cb7c26df87bb352))
* **api:** add endpoint to create plan-level alerts and allow PUT updates for plan usage alert thresholds ([2ac20b0](https://github.com/orbcorp/orb-kotlin/commit/2ac20b0d02c96d82fe39b3da3cb7c26df87bb352))

## [1.21.0](https://github.com/orbcorp/orb-kotlin/compare/v1.20.0...v1.21.0) (2026-07-26)


### Features

* **api:** add `spend_exceeded` alert type for subscription-level alerts ([467d162](https://github.com/orbcorp/orb-kotlin/commit/467d162b7fc1d773248090765501f06a0ad2c662))

## [1.20.0](https://github.com/orbcorp/orb-kotlin/compare/v1.19.0...v1.20.0) (2026-07-25)


### Features

* **api:** rename "trash alert" endpoint to "delete alert" ([7cdc47f](https://github.com/orbcorp/orb-kotlin/commit/7cdc47f9155a2e97ce30c9155d6b16c798f42a14))


### Bug Fixes

* **api:** rename "trash alert" endpoint to "delete alert" ([7cdc47f](https://github.com/orbcorp/orb-kotlin/commit/7cdc47f9155a2e97ce30c9155d6b16c798f42a14))

## [1.19.0](https://github.com/orbcorp/orb-kotlin/compare/v1.18.0...v1.19.0) (2026-07-24)


### Features

* **api:** increase max page limit for credit ledger endpoints from 500 to 1000 ([0b20869](https://github.com/orbcorp/orb-kotlin/commit/0b20869dc6bb5fd2766c489927f2cebb7bc787ef))
* **api:** support decimal quantities for fixed fee quantity transitions ([6a38d22](https://github.com/orbcorp/orb-kotlin/commit/6a38d22f9c80afe536ddb7de12f7a7610c6809da))

## [1.18.0](https://github.com/orbcorp/orb-kotlin/compare/v1.17.0...v1.18.0) (2026-07-22)


### Features

* **api:** support `end_of_invoice` effective time for plan version migrations ([2080eae](https://github.com/orbcorp/orb-kotlin/commit/2080eaeb922752f4aff44fb5f9bcb248caadd73d))

## [1.17.0](https://github.com/orbcorp/orb-kotlin/compare/v1.16.0...v1.17.0) (2026-07-17)


### Features

* **api:** allow future invoice dates (up to one year) for one-off invoice creation ([0796519](https://github.com/orbcorp/orb-kotlin/commit/0796519bf9fa985c4527076c25587034a9c82cb3))

## [1.16.0](https://github.com/orbcorp/orb-kotlin/compare/v1.15.0...v1.16.0) (2026-07-16)


### Features

* **api:** add alert deletion, customer portal session, and invoice PDF regeneration endpoints ([b0f5241](https://github.com/orbcorp/orb-kotlin/commit/b0f5241218b58be36c637f36e076ec6c258e25b9))
* **api:** remove deprecated debug field from events backfill endpoints ([a0a45d0](https://github.com/orbcorp/orb-kotlin/commit/a0a45d020776f87cc2017aef44ae44bd797343b9))
* **api:** remove deprecated debug parameter and field from backfill endpoints ([a0a45d0](https://github.com/orbcorp/orb-kotlin/commit/a0a45d020776f87cc2017aef44ae44bd797343b9))
* **api:** remove deprecated debug query parameter and field from events API ([a0a45d0](https://github.com/orbcorp/orb-kotlin/commit/a0a45d020776f87cc2017aef44ae44bd797343b9))

## [1.15.0](https://github.com/orbcorp/orb-kotlin/compare/v1.14.0...v1.15.0) (2026-07-15)


### Features

* **api:** deprecate debug mode ingestion response field ([9a77cdc](https://github.com/orbcorp/orb-kotlin/commit/9a77cdcebfb26c4cdfcdff4f7dd6849a148a7fe3))

## [1.14.0](https://github.com/orbcorp/orb-kotlin/compare/v1.13.0...v1.14.0) (2026-07-14)


### Features

* **api:** add `commitment` credit block source and `credit_commitment` field ([4e8ad78](https://github.com/orbcorp/orb-kotlin/commit/4e8ad78d0b8c5dc55e3e2743feca4e4f88ca1063))
* **api:** api update ([4d832ea](https://github.com/orbcorp/orb-kotlin/commit/4d832ea572469885867c9ff6a582994789250ce1))

## [1.13.0](https://github.com/orbcorp/orb-kotlin/compare/v1.12.0...v1.13.0) (2026-07-10)


### Features

* **api:** update SDK to the current API surface ([9dbefbe](https://github.com/orbcorp/orb-kotlin/commit/9dbefbe1992160b526b615415a9c5c2b69d97447))
