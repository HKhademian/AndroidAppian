package ir.hco.appian.utils

import android.content.Context
import android.content.Intent
import android.net.Uri

abstract class BazaarPublisher : Publisher {
	protected abstract val developerId: String
	protected open val forceMarket: Boolean = false

	override fun createDeveloperPageIntent() =
		Intent(Intent.ACTION_VIEW).apply {
			data = Uri.parse("https://cafebazaar.ir/developer/$developerId")
			if (forceMarket) `package` = MARKET_PACKAGE
		}

	override fun createAppRatePageIntent(context: Context) =
		Intent(Intent.ACTION_VIEW).apply {
			data = Uri.parse("https://cafebazaar.ir/app/${context.packageName}")
			if (forceMarket) `package` = MARKET_PACKAGE
		}

	companion object {
		private const val MARKET_PACKAGE = "com.farsitel.bazaar"
	}
}
