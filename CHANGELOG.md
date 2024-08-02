# Changelog

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
