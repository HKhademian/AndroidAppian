package ir.hco.appian.app

import ir.hco.appian.utils.BazaarPublisher

class MarketApp : MainApp() {
	override val publisher = BazaarPublisher(
		developerId = BuildConfig.DEVELOPER_ID,
		forceMarket = false
	)
}
